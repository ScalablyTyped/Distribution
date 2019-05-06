package typings
package atIonicReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenRefHTMLIonButtonElement extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var ref: js.UndefOr[
    reactLib.reactMod.RefObject[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonButtonElement]
  ] = js.undefined
}

object Anon_ChildrenRefHTMLIonButtonElement {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    ref: reactLib.reactMod.RefObject[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonButtonElement] = null
  ): Anon_ChildrenRefHTMLIonButtonElement = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_ChildrenRefHTMLIonButtonElement]
  }
}

