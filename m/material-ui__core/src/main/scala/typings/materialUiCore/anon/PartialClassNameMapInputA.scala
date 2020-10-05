package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/InputAdornment/InputAdornment.InputAdornmentClassKey>> */
@js.native
trait PartialClassNameMapInputA extends js.Object {
  var disablePointerEvents: js.UndefOr[String] = js.native
  var filled: js.UndefOr[String] = js.native
  var positionEnd: js.UndefOr[String] = js.native
  var positionStart: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialClassNameMapInputA {
  @scala.inline
  def apply(): PartialClassNameMapInputA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapInputA]
  }
  @scala.inline
  implicit class PartialClassNameMapInputAOps[Self <: PartialClassNameMapInputA] (val x: Self) extends AnyVal {
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
    def setDisablePointerEvents(value: String): Self = this.set("disablePointerEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisablePointerEvents: Self = this.set("disablePointerEvents", js.undefined)
    @scala.inline
    def setFilled(value: String): Self = this.set("filled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilled: Self = this.set("filled", js.undefined)
    @scala.inline
    def setPositionEnd(value: String): Self = this.set("positionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionEnd: Self = this.set("positionEnd", js.undefined)
    @scala.inline
    def setPositionStart(value: String): Self = this.set("positionStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionStart: Self = this.set("positionStart", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

