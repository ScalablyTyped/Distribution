package typings.materialUiCore.themeListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuiContext[S] extends js.Object {
  var __THEMING__ : js.UndefOr[Broadcast[S]] = js.native
}

object MuiContext {
  @scala.inline
  def apply[S](__THEMING__ : Broadcast[S] = null): MuiContext[S] = {
    val __obj = js.Dynamic.literal()
    if (__THEMING__ != null) __obj.updateDynamic("__THEMING__")(__THEMING__.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuiContext[S]]
  }
}

