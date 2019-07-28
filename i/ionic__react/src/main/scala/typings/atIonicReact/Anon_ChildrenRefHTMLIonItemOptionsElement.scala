package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonItemOptionsElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenRefHTMLIonItemOptionsElement extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var ref: js.UndefOr[RefObject[HTMLIonItemOptionsElement]] = js.undefined
}

object Anon_ChildrenRefHTMLIonItemOptionsElement {
  @scala.inline
  def apply(children: ReactNode = null, ref: RefObject[HTMLIonItemOptionsElement] = null): Anon_ChildrenRefHTMLIonItemOptionsElement = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_ChildrenRefHTMLIonItemOptionsElement]
  }
}

