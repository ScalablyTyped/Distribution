package typings.ionicReact

import typings.ionicCore.componentsMod._Global_.HTMLIonPickerElement
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForwardedRefHTMLIonPickerElement extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[HTMLIonPickerElement]] = js.undefined
}

object AnonForwardedRefHTMLIonPickerElement {
  @scala.inline
  def apply(forwardedRef: RefObject[HTMLIonPickerElement] = null): AnonForwardedRefHTMLIonPickerElement = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForwardedRefHTMLIonPickerElement]
  }
}

