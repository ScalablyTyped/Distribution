package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod.Global.HTMLIonInfiniteScrollElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenRefHTMLIonInfiniteScrollElement extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var ref: js.UndefOr[RefObject[HTMLIonInfiniteScrollElement]] = js.undefined
}

object Anon_ChildrenRefHTMLIonInfiniteScrollElement {
  @scala.inline
  def apply(children: ReactNode = null, ref: RefObject[HTMLIonInfiniteScrollElement] = null): Anon_ChildrenRefHTMLIonInfiniteScrollElement = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_ChildrenRefHTMLIonInfiniteScrollElement]
  }
}

