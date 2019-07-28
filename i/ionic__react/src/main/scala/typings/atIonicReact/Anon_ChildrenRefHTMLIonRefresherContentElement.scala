package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonRefresherContentElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenRefHTMLIonRefresherContentElement extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var ref: js.UndefOr[RefObject[HTMLIonRefresherContentElement]] = js.undefined
}

object Anon_ChildrenRefHTMLIonRefresherContentElement {
  @scala.inline
  def apply(children: ReactNode = null, ref: RefObject[HTMLIonRefresherContentElement] = null): Anon_ChildrenRefHTMLIonRefresherContentElement = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_ChildrenRefHTMLIonRefresherContentElement]
  }
}

