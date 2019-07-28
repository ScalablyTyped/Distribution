package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonFabListElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenRefHTMLIonFabListElement extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var ref: js.UndefOr[RefObject[HTMLIonFabListElement]] = js.undefined
}

object Anon_ChildrenRefHTMLIonFabListElement {
  @scala.inline
  def apply(children: ReactNode = null, ref: RefObject[HTMLIonFabListElement] = null): Anon_ChildrenRefHTMLIonFabListElement = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_ChildrenRefHTMLIonFabListElement]
  }
}

