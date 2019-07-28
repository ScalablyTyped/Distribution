package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonToggleElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenRefHTMLIonToggleElement extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var ref: js.UndefOr[RefObject[HTMLIonToggleElement]] = js.undefined
}

object Anon_ChildrenRefHTMLIonToggleElement {
  @scala.inline
  def apply(children: ReactNode = null, ref: RefObject[HTMLIonToggleElement] = null): Anon_ChildrenRefHTMLIonToggleElement = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_ChildrenRefHTMLIonToggleElement]
  }
}

