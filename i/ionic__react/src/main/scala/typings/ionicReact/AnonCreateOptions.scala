package typings.ionicReact

import typings.ionicReact.createOverlayComponentMod.OverlayElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreateOptions[OverlayType /* <: OverlayElement */] extends js.Object {
  def create(options: js.Any): js.Promise[OverlayType]
}

object AnonCreateOptions {
  @scala.inline
  def apply[OverlayType /* <: OverlayElement */](create: js.Any => js.Promise[OverlayType]): AnonCreateOptions[OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[AnonCreateOptions[OverlayType]]
  }
}

