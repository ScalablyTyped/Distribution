package typings.ionicReact

import typings.ionicCore.componentsMod._Global_.HTMLIonBackButtonElement
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  var icon: js.UndefOr[AnonIos | String] = js.undefined
  var ref: js.UndefOr[RefObject[HTMLIonBackButtonElement]] = js.undefined
}

object AnonIcon {
  @scala.inline
  def apply(icon: AnonIos | String = null, ref: RefObject[HTMLIonBackButtonElement] = null): AnonIcon = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIcon]
  }
}

