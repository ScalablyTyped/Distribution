package typings.ionicReact

import typings.ionicReact.createControllerComponentMod.OverlayBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreate[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */] extends js.Object {
  def create(options: OptionsType): js.Promise[OverlayType]
}

object AnonCreate {
  @scala.inline
  def apply[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](create: OptionsType => js.Promise[OverlayType]): AnonCreate[OptionsType, OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[AnonCreate[OptionsType, OverlayType]]
  }
}

