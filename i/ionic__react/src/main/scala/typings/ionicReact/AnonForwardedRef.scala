package typings.ionicReact

import typings.ionicCore.componentsMod._Global_.HTMLIonActionSheetElement
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForwardedRef extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[HTMLIonActionSheetElement]] = js.undefined
}

object AnonForwardedRef {
  @scala.inline
  def apply(forwardedRef: RefObject[HTMLIonActionSheetElement] = null): AnonForwardedRef = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForwardedRef]
  }
}

