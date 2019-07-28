package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonReorderElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenRefHTMLIonReorderElement extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var ref: js.UndefOr[RefObject[HTMLIonReorderElement]] = js.undefined
}

object Anon_ChildrenRefHTMLIonReorderElement {
  @scala.inline
  def apply(children: ReactNode = null, ref: RefObject[HTMLIonReorderElement] = null): Anon_ChildrenRefHTMLIonReorderElement = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_ChildrenRefHTMLIonReorderElement]
  }
}

