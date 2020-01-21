package typings.ionicReact

import typings.ionicCore.componentsMod._Global_.HTMLIonPopoverElement
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenForwardedRefHTMLIonPopoverElement extends js.Object {
  var children: ReactNode
  var forwardedRef: js.UndefOr[RefObject[HTMLIonPopoverElement]] = js.undefined
}

object AnonChildrenForwardedRefHTMLIonPopoverElement {
  @scala.inline
  def apply(children: ReactNode = null, forwardedRef: RefObject[HTMLIonPopoverElement] = null): AnonChildrenForwardedRefHTMLIonPopoverElement = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenForwardedRefHTMLIonPopoverElement]
  }
}

