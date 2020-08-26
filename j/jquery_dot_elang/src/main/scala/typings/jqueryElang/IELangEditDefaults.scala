package typings.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IELangEditDefaults extends IELangBaseDefaults {
  var addButtonHtml: String = js.native
  var addButtonLabel: String = js.native
  var editFieldHtml: String = js.native
  var editFormHtml: String = js.native
  var editKeyLabel: String = js.native
  var editValueLabel: String = js.native
}

object IELangEditDefaults {
  @scala.inline
  def apply(
    addButtonHtml: String,
    addButtonLabel: String,
    contentCSS: String,
    contentInnerCSS: String,
    contentInnerHtml: String,
    editFieldHtml: String,
    editFormHtml: String,
    editKeyLabel: String,
    editValueLabel: String,
    fluidRowHtml: String,
    headLabel: String,
    headLabelHtml: String,
    radioButtonHtml: String,
    radioGroupHtml: String,
    resultCSS: String,
    resultHeadCSS: String,
    resultHeadLabel: String,
    resultHeadLabelHtml: String,
    resultHtml: String,
    submitButtonHtml: String
  ): IELangEditDefaults = {
    val __obj = js.Dynamic.literal(addButtonHtml = addButtonHtml.asInstanceOf[js.Any], addButtonLabel = addButtonLabel.asInstanceOf[js.Any], contentCSS = contentCSS.asInstanceOf[js.Any], contentInnerCSS = contentInnerCSS.asInstanceOf[js.Any], contentInnerHtml = contentInnerHtml.asInstanceOf[js.Any], editFieldHtml = editFieldHtml.asInstanceOf[js.Any], editFormHtml = editFormHtml.asInstanceOf[js.Any], editKeyLabel = editKeyLabel.asInstanceOf[js.Any], editValueLabel = editValueLabel.asInstanceOf[js.Any], fluidRowHtml = fluidRowHtml.asInstanceOf[js.Any], headLabel = headLabel.asInstanceOf[js.Any], headLabelHtml = headLabelHtml.asInstanceOf[js.Any], radioButtonHtml = radioButtonHtml.asInstanceOf[js.Any], radioGroupHtml = radioGroupHtml.asInstanceOf[js.Any], resultCSS = resultCSS.asInstanceOf[js.Any], resultHeadCSS = resultHeadCSS.asInstanceOf[js.Any], resultHeadLabel = resultHeadLabel.asInstanceOf[js.Any], resultHeadLabelHtml = resultHeadLabelHtml.asInstanceOf[js.Any], resultHtml = resultHtml.asInstanceOf[js.Any], submitButtonHtml = submitButtonHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangEditDefaults]
  }
  @scala.inline
  implicit class IELangEditDefaultsOps[Self <: IELangEditDefaults] (val x: Self) extends AnyVal {
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
    def setAddButtonHtml(value: String): Self = this.set("addButtonHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddButtonLabel(value: String): Self = this.set("addButtonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditFieldHtml(value: String): Self = this.set("editFieldHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditFormHtml(value: String): Self = this.set("editFormHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditKeyLabel(value: String): Self = this.set("editKeyLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditValueLabel(value: String): Self = this.set("editValueLabel", value.asInstanceOf[js.Any])
  }
  
}

