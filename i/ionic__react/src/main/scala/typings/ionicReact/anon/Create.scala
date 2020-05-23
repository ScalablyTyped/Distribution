package typings.ionicReact.anon

import typings.ionicReact.createControllerComponentMod.OverlayBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Create[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */] extends js.Object {
  def create(options: OptionsType): js.Promise[OverlayType]
}

object Create {
  @scala.inline
  def apply[OptionsType, OverlayType](create: OptionsType => js.Promise[OverlayType]): Create[OptionsType, OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Create[OptionsType, OverlayType]]
  }
}

