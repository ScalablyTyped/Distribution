package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonLoadingElement
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForwardedRefHTMLIonLoadingElement extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[HTMLIonLoadingElement]] = js.undefined
}

object Anon_ForwardedRefHTMLIonLoadingElement {
  @scala.inline
  def apply(forwardedRef: RefObject[HTMLIonLoadingElement] = null): Anon_ForwardedRefHTMLIonLoadingElement = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ForwardedRefHTMLIonLoadingElement]
  }
}

