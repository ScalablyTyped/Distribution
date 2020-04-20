package typings.ionicReact

import typings.ionicReact.createOverlayComponentMod.OverlayElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[OverlayType /* <: OverlayElement */] extends js.Object {
  def create(options: js.Any): js.Promise[OverlayType]
}

object Anon0 {
  @scala.inline
  def apply[OverlayType /* <: OverlayElement */](create: js.Any => js.Promise[OverlayType]): Anon0[OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Anon0[OverlayType]]
  }
}

