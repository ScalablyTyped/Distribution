package typings.atMaterialDashUiCore.stylesThemeListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MuiContext[S] extends js.Object {
  var __THEMING__ : js.UndefOr[Broadcast[S]] = js.undefined
}

object MuiContext {
  @scala.inline
  def apply[S](__THEMING__ : Broadcast[S] = null): MuiContext[S] = {
    val __obj = js.Dynamic.literal()
    if (__THEMING__ != null) __obj.updateDynamic("__THEMING__")(__THEMING__.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuiContext[S]]
  }
}

