package typings
package atIonicReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenRef extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var ref: js.UndefOr[
    reactLib.reactMod.RefObject[ioniconsLib.distTypesComponentsMod.Global.HTMLIonIconElement]
  ] = js.undefined
}

object Anon_ChildrenRef {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    ref: reactLib.reactMod.RefObject[ioniconsLib.distTypesComponentsMod.Global.HTMLIonIconElement] = null
  ): Anon_ChildrenRef = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_ChildrenRef]
  }
}

