package typings.atIonicReact

import typings.atIonicReact.distTypesComponentsCreateControllerComponentMod.OverlayBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */] extends js.Object {
  def create(options: OptionsType): js.Promise[OverlayType]
}

object Anon_Create {
  @scala.inline
  def apply[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](create: OptionsType => js.Promise[OverlayType]): Anon_Create[OptionsType, OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[Anon_Create[OptionsType, OverlayType]]
  }
}

