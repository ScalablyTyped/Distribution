package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  withTheme :boolean}> */
@js.native
trait PartialwithThemeboolean extends js.Object {
  var withTheme: js.UndefOr[Boolean] = js.native
}

object PartialwithThemeboolean {
  @scala.inline
  def apply(): PartialwithThemeboolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialwithThemeboolean]
  }
  @scala.inline
  implicit class PartialwithThemebooleanOps[Self <: PartialwithThemeboolean] (val x: Self) extends AnyVal {
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
    def setWithTheme(value: Boolean): Self = this.set("withTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithTheme: Self = this.set("withTheme", js.undefined)
  }
  
}

