package typings.inferno.distCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Event because Already inherited
- typings.std.AnimationEvent because var conflicts: cancelBubble, currentTarget, returnValue. Inlined pseudoElement, animationName, elapsedTime */ @js.native
trait InfernoAnimationEvent[T]
  extends StObject
     with SemiSyntheticEvent[T] {
  
  /* standard dom */
  val animationName: String = js.native
  
  /* standard dom */
  val elapsedTime: Double = js.native
  
  /* standard dom */
  val pseudoElement: String = js.native
}
