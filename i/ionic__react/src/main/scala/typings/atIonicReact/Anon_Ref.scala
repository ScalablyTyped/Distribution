package typings.atIonicReact

import typings.react.reactMod.RefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ref extends js.Object {
  var ref: js.UndefOr[RefObject[HTMLDivElement]] = js.undefined
}

object Anon_Ref {
  @scala.inline
  def apply(ref: RefObject[HTMLDivElement] = null): Anon_Ref = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_Ref]
  }
}

