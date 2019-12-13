package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPickerElement
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForwardedRefHTMLIonPickerElement extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[HTMLIonPickerElement]] = js.undefined
}

object Anon_ForwardedRefHTMLIonPickerElement {
  @scala.inline
  def apply(forwardedRef: RefObject[HTMLIonPickerElement] = null): Anon_ForwardedRefHTMLIonPickerElement = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ForwardedRefHTMLIonPickerElement]
  }
}

