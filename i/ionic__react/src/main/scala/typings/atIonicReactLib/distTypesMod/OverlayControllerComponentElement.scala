package typings
package atIonicReactLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait OverlayControllerComponentElement[E /* <: OverlayComponentElement */] extends js.Object {
  def create(opts: js.Any): js.Promise[E]
}

object OverlayControllerComponentElement {
  @scala.inline
  def apply[E /* <: OverlayComponentElement */](create: js.Any => js.Promise[E]): OverlayControllerComponentElement[E] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[OverlayControllerComponentElement[E]]
  }
}

