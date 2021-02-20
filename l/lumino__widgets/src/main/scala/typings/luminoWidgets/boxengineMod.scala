package typings.luminoWidgets

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxengineMod {
  
  object BoxEngine {
    
    /**
      * Adjust a sizer by a delta and update its neighbors accordingly.
      *
      * @param sizers - The sizers which should be adjusted.
      *
      * @param index - The index of the sizer to grow.
      *
      * @param delta - The amount to adjust the sizer, positive or negative.
      *
      * #### Notes
      * This will adjust the indicated sizer by the specified amount, along
      * with the sizes of the appropriate neighbors, subject to the limits
      * specified by each of the sizers.
      *
      * This is useful when implementing box layouts where the boundaries
      * between the sizers are interactively adjustable by the user.
      */
    @JSImport("@lumino/widgets/types/boxengine", "BoxEngine.adjust")
    @js.native
    def adjust(sizers: ArrayLike[BoxSizer], index: Double, delta: Double): Unit = js.native
    
    /**
      * Calculate the optimal layout sizes for a sequence of box sizers.
      *
      * This distributes the available layout space among the box sizers
      * according to the following algorithm:
      *
      * 1. Initialize the sizers's size to its size hint and compute the
      *    sums for each of size hint, min size, and max size.
      *
      * 2. If the total size hint equals the available space, return.
      *
      * 3. If the available space is less than the total min size, set all
      *    sizers to their min size and return.
      *
      * 4. If the available space is greater than the total max size, set
      *    all sizers to their max size and return.
      *
      * 5. If the layout space is less than the total size hint, distribute
      *    the negative delta as follows:
      *
      *    a. Shrink each sizer with a stretch factor greater than zero by
      *       an amount proportional to the negative space and the sum of
      *       stretch factors. If the sizer reaches its min size, remove
      *       it and its stretch factor from the computation.
      *
      *    b. If after adjusting all stretch sizers there remains negative
      *       space, distribute the space equally among the sizers with a
      *       stretch factor of zero. If a sizer reaches its min size,
      *       remove it from the computation.
      *
      * 6. If the layout space is greater than the total size hint,
      *    distribute the positive delta as follows:
      *
      *    a. Expand each sizer with a stretch factor greater than zero by
      *       an amount proportional to the postive space and the sum of
      *       stretch factors. If the sizer reaches its max size, remove
      *       it and its stretch factor from the computation.
      *
      *    b. If after adjusting all stretch sizers there remains positive
      *       space, distribute the space equally among the sizers with a
      *       stretch factor of zero. If a sizer reaches its max size,
      *       remove it from the computation.
      *
      * 7. return
      *
      * @param sizers - The sizers for a particular layout line.
      *
      * @param space - The available layout space for the sizers.
      *
      * @returns The delta between the provided available space and the
      *   actual consumed space. This value will be zero if the sizers
      *   can be adjusted to fit, negative if the available space is too
      *   small, and positive if the available space is too large.
      *
      * #### Notes
      * The [[size]] of each sizer is updated with the computed size.
      *
      * This function can be called at any time to recompute the layout for
      * an existing sequence of sizers. The previously computed results will
      * have no effect on the new output. It is therefore not necessary to
      * create new sizer objects on each resize event.
      */
    @JSImport("@lumino/widgets/types/boxengine", "BoxEngine.calc")
    @js.native
    def calc(sizers: ArrayLike[BoxSizer], space: Double): Double = js.native
  }
  
  @JSImport("@lumino/widgets/types/boxengine", "BoxSizer")
  @js.native
  class BoxSizer () extends StObject {
    
    /**
      * An internal storage property for the layout algorithm.
      *
      * #### Notes
      * This value is used as temporary storage by the layout algorithm.
      *
      * Changing this value will have no effect.
      */
    var done: Boolean = js.native
    
    /**
      * The maximum size of the sizer.
      *
      * #### Notes
      * The sizer will never be sized greater than this value, even if
      * it means the sizer will underflow the available layout space.
      *
      * It is assumed that this value lies in the range `[0, Infinity]`
      * and that it is `>=` to [[minSize]]. Failure to adhere to this
      * constraint will yield undefined results.
      *
      * The default value is `Infinity`.
      */
    var maxSize: Double = js.native
    
    /**
      * The minimum size of the sizer.
      *
      * #### Notes
      * The sizer will never be sized less than this value, even if
      * it means the sizer will overflow the available layout space.
      *
      * It is assumed that this value lies in the range `[0, Infinity)`
      * and that it is `<=` to [[maxSize]]. Failure to adhere to this
      * constraint will yield undefined results.
      *
      * The default value is `0`.
      */
    var minSize: Double = js.native
    
    /**
      * The computed size of the sizer.
      *
      * #### Notes
      * This value is the output of a call to [[boxCalc]]. It represents
      * the computed size for the object along the layout orientation,
      * and will always lie in the range `[minSize, maxSize]`.
      *
      * This value is output only.
      *
      * Changing this value will have no effect.
      */
    var size: Double = js.native
    
    /**
      * The preferred size for the sizer.
      *
      * #### Notes
      * The sizer will be given this initial size subject to its size
      * bounds. The sizer will not deviate from this size unless such
      * deviation is required to fit into the available layout space.
      *
      * There is no limit to this value, but it will be clamped to the
      * bounds defined by [[minSize]] and [[maxSize]].
      *
      * The default value is `0`.
      */
    var sizeHint: Double = js.native
    
    /**
      * The stretch factor for the sizer.
      *
      * #### Notes
      * This controls how much the sizer stretches relative to its sibling
      * sizers when layout space is distributed. A stretch factor of zero
      * is special and will cause the sizer to only be resized after all
      * other sizers with a stretch factor greater than zero have been
      * resized to their limits.
      *
      * It is assumed that this value is an integer that lies in the range
      * `[0, Infinity)`. Failure to adhere to this constraint will yield
      * undefined results.
      *
      * The default value is `1`.
      */
    var stretch: Double = js.native
  }
}
