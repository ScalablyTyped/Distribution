package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonToastElement
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForwardedRefHTMLIonToastElement extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[HTMLIonToastElement]] = js.undefined
}

object Anon_ForwardedRefHTMLIonToastElement {
  @scala.inline
  def apply(forwardedRef: RefObject[HTMLIonToastElement] = null): Anon_ForwardedRefHTMLIonToastElement = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ForwardedRefHTMLIonToastElement]
  }
}

