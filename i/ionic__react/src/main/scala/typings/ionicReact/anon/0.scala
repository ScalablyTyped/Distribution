package typings.ionicReact.anon

import typings.ionicReact.createOverlayComponentMod.OverlayElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[OverlayType /* <: OverlayElement */] extends js.Object {
  def create(options: js.Any): js.Promise[OverlayType]
}

object `0` {
  @scala.inline
  def apply[/* <: typings.ionicReact.createOverlayComponentMod.OverlayElement */ OverlayType](create: js.Any => js.Promise[OverlayType]): `0`[OverlayType] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[`0`[OverlayType]]
  }
}

