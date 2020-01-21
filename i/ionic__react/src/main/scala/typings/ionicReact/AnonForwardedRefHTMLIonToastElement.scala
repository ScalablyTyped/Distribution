package typings.ionicReact

import typings.ionicCore.componentsMod._Global_.HTMLIonToastElement
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForwardedRefHTMLIonToastElement extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[HTMLIonToastElement]] = js.undefined
}

object AnonForwardedRefHTMLIonToastElement {
  @scala.inline
  def apply(forwardedRef: RefObject[HTMLIonToastElement] = null): AnonForwardedRefHTMLIonToastElement = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForwardedRefHTMLIonToastElement]
  }
}

