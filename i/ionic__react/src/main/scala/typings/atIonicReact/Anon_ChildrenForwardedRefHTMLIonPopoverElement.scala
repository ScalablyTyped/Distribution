package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPopoverElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenForwardedRefHTMLIonPopoverElement extends js.Object {
  var children: ReactNode
  var forwardedRef: js.UndefOr[RefObject[HTMLIonPopoverElement]] = js.undefined
}

object Anon_ChildrenForwardedRefHTMLIonPopoverElement {
  @scala.inline
  def apply(children: ReactNode = null, forwardedRef: RefObject[HTMLIonPopoverElement] = null): Anon_ChildrenForwardedRefHTMLIonPopoverElement = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenForwardedRefHTMLIonPopoverElement]
  }
}

