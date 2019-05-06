package typings
package atIonicReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ref extends js.Object {
  var ref: js.UndefOr[reactLib.reactMod.RefObject[stdLib.HTMLDivElement]] = js.undefined
}

object Anon_Ref {
  @scala.inline
  def apply(ref: reactLib.reactMod.RefObject[stdLib.HTMLDivElement] = null): Anon_Ref = {
    val __obj = js.Dynamic.literal()
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_Ref]
  }
}

