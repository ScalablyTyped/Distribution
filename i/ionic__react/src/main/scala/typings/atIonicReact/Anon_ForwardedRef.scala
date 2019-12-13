package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonActionSheetElement
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForwardedRef extends js.Object {
  var forwardedRef: js.UndefOr[RefObject[HTMLIonActionSheetElement]] = js.undefined
}

object Anon_ForwardedRef {
  @scala.inline
  def apply(forwardedRef: RefObject[HTMLIonActionSheetElement] = null): Anon_ForwardedRef = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ForwardedRef]
  }
}

