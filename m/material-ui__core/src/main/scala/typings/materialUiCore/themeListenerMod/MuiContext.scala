package typings.materialUiCore.themeListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MuiContext[S] extends js.Object {
  var __THEMING__ : js.UndefOr[Broadcast[S]] = js.native
}

object MuiContext {
  @scala.inline
  def apply[S](): MuiContext[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MuiContext[S]]
  }
  @scala.inline
  implicit class MuiContextOps[Self <: MuiContext[_], S] (val x: Self with MuiContext[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set__THEMING__(value: Broadcast[S]): Self = this.set("__THEMING__", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__THEMING__ : Self = this.set("__THEMING__", js.undefined)
  }
  
}

