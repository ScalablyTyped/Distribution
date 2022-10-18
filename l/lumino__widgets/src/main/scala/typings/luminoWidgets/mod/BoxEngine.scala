package typings.luminoWidgets.mod

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BoxEngine {
  
  @JSImport("@lumino/widgets", "BoxEngine")
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def adjust(sizers: ArrayLike[typings.luminoWidgets.typesBoxengineMod.BoxSizer], index: Double, delta: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("adjust")(sizers.asInstanceOf[js.Any], index.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def calc(sizers: ArrayLike[typings.luminoWidgets.typesBoxengineMod.BoxSizer], space: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calc")(sizers.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Double]
}
