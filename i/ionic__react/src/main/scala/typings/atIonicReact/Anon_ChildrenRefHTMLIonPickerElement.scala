package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonPickerElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenRefHTMLIonPickerElement extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var ref: js.UndefOr[RefObject[HTMLIonPickerElement]] = js.undefined
}

object Anon_ChildrenRefHTMLIonPickerElement {
  @scala.inline
  def apply(children: ReactNode = null, ref: RefObject[HTMLIonPickerElement] = null): Anon_ChildrenRefHTMLIonPickerElement = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_ChildrenRefHTMLIonPickerElement]
  }
}

