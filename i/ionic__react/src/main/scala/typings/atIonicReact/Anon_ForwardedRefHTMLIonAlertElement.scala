package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonAlertElement
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForwardedRefHTMLIonAlertElement extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[HTMLIonAlertElement]] = js.undefined
}

object Anon_ForwardedRefHTMLIonAlertElement {
  @scala.inline
  def apply(forwardedRef: RefObject[HTMLIonAlertElement] = null): Anon_ForwardedRefHTMLIonAlertElement = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ForwardedRefHTMLIonAlertElement]
  }
}

