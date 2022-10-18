package typings.inferno.distCoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Event because Already inherited
- typings.std.TransitionEvent because var conflicts: cancelBubble, currentTarget, returnValue. Inlined pseudoElement, propertyName, elapsedTime */ @js.native
trait InfernoTransitionEvent[T]
  extends StObject
     with SemiSyntheticEvent[T] {
  
  /* standard dom */
  val elapsedTime: Double = js.native
  
  /* standard dom */
  val propertyName: String = js.native
  
  /* standard dom */
  val pseudoElement: String = js.native
}
