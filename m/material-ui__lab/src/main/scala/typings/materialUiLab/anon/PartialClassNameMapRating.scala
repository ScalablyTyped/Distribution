package typings.materialUiLab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/Rating/Rating.RatingClassKey>> */
@js.native
trait PartialClassNameMapRating extends js.Object {
  var decimal: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var focusVisible: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var iconActive: js.UndefOr[String] = js.native
  var iconEmpty: js.UndefOr[String] = js.native
  var iconFilled: js.UndefOr[String] = js.native
  var iconFocus: js.UndefOr[String] = js.native
  var iconHover: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var pristine: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var sizeLarge: js.UndefOr[String] = js.native
  var sizeSmall: js.UndefOr[String] = js.native
  var visuallyhidden: js.UndefOr[String] = js.native
}

object PartialClassNameMapRating {
  @scala.inline
  def apply(): PartialClassNameMapRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapRating]
  }
  @scala.inline
  implicit class PartialClassNameMapRatingOps[Self <: PartialClassNameMapRating] (val x: Self) extends AnyVal {
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
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFocusVisible(value: String): Self = this.set("focusVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusVisible: Self = this.set("focusVisible", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconActive(value: String): Self = this.set("iconActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconActive: Self = this.set("iconActive", js.undefined)
    @scala.inline
    def setIconEmpty(value: String): Self = this.set("iconEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconEmpty: Self = this.set("iconEmpty", js.undefined)
    @scala.inline
    def setIconFilled(value: String): Self = this.set("iconFilled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconFilled: Self = this.set("iconFilled", js.undefined)
    @scala.inline
    def setIconFocus(value: String): Self = this.set("iconFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconFocus: Self = this.set("iconFocus", js.undefined)
    @scala.inline
    def setIconHover(value: String): Self = this.set("iconHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconHover: Self = this.set("iconHover", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setPristine(value: String): Self = this.set("pristine", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePristine: Self = this.set("pristine", js.undefined)
    @scala.inline
    def setReadOnly(value: String): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setSizeLarge(value: String): Self = this.set("sizeLarge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeLarge: Self = this.set("sizeLarge", js.undefined)
    @scala.inline
    def setSizeSmall(value: String): Self = this.set("sizeSmall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeSmall: Self = this.set("sizeSmall", js.undefined)
    @scala.inline
    def setVisuallyhidden(value: String): Self = this.set("visuallyhidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisuallyhidden: Self = this.set("visuallyhidden", js.undefined)
  }
  
}

