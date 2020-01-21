package typings.ionicReact

import typings.ionicCore.componentsMod._Global_.HTMLIonAlertElement
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForwardedRefHTMLIonAlertElement extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[HTMLIonAlertElement]] = js.undefined
}

object AnonForwardedRefHTMLIonAlertElement {
  @scala.inline
  def apply(forwardedRef: RefObject[HTMLIonAlertElement] = null): AnonForwardedRefHTMLIonAlertElement = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForwardedRefHTMLIonAlertElement]
  }
}

