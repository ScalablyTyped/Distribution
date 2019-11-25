package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonBackButtonElement
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Icon extends js.Object {
  var icon: js.UndefOr[Anon_Ios] = js.undefined
  var ref: js.UndefOr[RefObject[HTMLIonBackButtonElement]] = js.undefined
}

object Anon_Icon {
  @scala.inline
  def apply(icon: Anon_Ios = null, ref: RefObject[HTMLIonBackButtonElement] = null): Anon_Icon = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Icon]
  }
}

