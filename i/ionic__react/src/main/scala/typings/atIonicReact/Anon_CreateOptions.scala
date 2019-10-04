package typings.atIonicReact

import typings.atIonicReact.distTypesComponentsCreateOverlayComponentMod.OverlayElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateOptions[OverlayType /* <: OverlayElement */] extends js.Object {
  def create(options: js.Any): js.Promise[OverlayType]
}

object Anon_CreateOptions {
  @scala.inline
  def apply[OverlayType /* <: OverlayElement */](create: js.Any => js.Promise[OverlayType]): Anon_CreateOptions[OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[Anon_CreateOptions[OverlayType]]
  }
}

