package typings.ionicReact

import typings.ionicCore.componentsMod._Global_.HTMLIonLoadingElement
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForwardedRefHTMLIonLoadingElement extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[HTMLIonLoadingElement]] = js.undefined
}

object AnonForwardedRefHTMLIonLoadingElement {
  @scala.inline
  def apply(forwardedRef: RefObject[HTMLIonLoadingElement] = null): AnonForwardedRefHTMLIonLoadingElement = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForwardedRefHTMLIonLoadingElement]
  }
}

