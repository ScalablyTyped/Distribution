package typings
package atIonicReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenRefHTMLIonSlideElement extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var ref: js.UndefOr[
    reactLib.reactMod.RefObject[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonSlideElement]
  ] = js.undefined
}

object Anon_ChildrenRefHTMLIonSlideElement {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    ref: reactLib.reactMod.RefObject[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonSlideElement] = null
  ): Anon_ChildrenRefHTMLIonSlideElement = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_ChildrenRefHTMLIonSlideElement]
  }
}

