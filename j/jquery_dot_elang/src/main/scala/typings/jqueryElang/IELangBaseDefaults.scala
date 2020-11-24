package typings.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ELangBase
@js.native
trait IELangBaseDefaults extends js.Object {
  
  var contentCSS: String = js.native
  
  var contentInnerCSS: String = js.native
  
  var contentInnerHtml: String = js.native
  
  var fluidRowHtml: String = js.native
  
  var headLabel: String = js.native
  
  var headLabelHtml: String = js.native
  
  var radioButtonHtml: String = js.native
  
  var radioGroupHtml: String = js.native
  
  var resultCSS: String = js.native
  
  var resultHeadCSS: String = js.native
  
  var resultHeadLabel: String = js.native
  
  var resultHeadLabelHtml: String = js.native
  
  var resultHtml: String = js.native
  
  var submitButtonHtml: String = js.native
}
object IELangBaseDefaults {
  
  @scala.inline
  def apply(
    contentCSS: String,
    contentInnerCSS: String,
    contentInnerHtml: String,
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
  ): IELangBaseDefaults = {
    val __obj = js.Dynamic.literal(contentCSS = contentCSS.asInstanceOf[js.Any], contentInnerCSS = contentInnerCSS.asInstanceOf[js.Any], contentInnerHtml = contentInnerHtml.asInstanceOf[js.Any], fluidRowHtml = fluidRowHtml.asInstanceOf[js.Any], headLabel = headLabel.asInstanceOf[js.Any], headLabelHtml = headLabelHtml.asInstanceOf[js.Any], radioButtonHtml = radioButtonHtml.asInstanceOf[js.Any], radioGroupHtml = radioGroupHtml.asInstanceOf[js.Any], resultCSS = resultCSS.asInstanceOf[js.Any], resultHeadCSS = resultHeadCSS.asInstanceOf[js.Any], resultHeadLabel = resultHeadLabel.asInstanceOf[js.Any], resultHeadLabelHtml = resultHeadLabelHtml.asInstanceOf[js.Any], resultHtml = resultHtml.asInstanceOf[js.Any], submitButtonHtml = submitButtonHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangBaseDefaults]
  }
  
  @scala.inline
  implicit class IELangBaseDefaultsOps[Self <: IELangBaseDefaults] (val x: Self) extends AnyVal {
    
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
    def setContentCSS(value: String): Self = this.set("contentCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentInnerCSS(value: String): Self = this.set("contentInnerCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentInnerHtml(value: String): Self = this.set("contentInnerHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFluidRowHtml(value: String): Self = this.set("fluidRowHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadLabel(value: String): Self = this.set("headLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadLabelHtml(value: String): Self = this.set("headLabelHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioButtonHtml(value: String): Self = this.set("radioButtonHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadioGroupHtml(value: String): Self = this.set("radioGroupHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCSS(value: String): Self = this.set("resultCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultHeadCSS(value: String): Self = this.set("resultHeadCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultHeadLabel(value: String): Self = this.set("resultHeadLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultHeadLabelHtml(value: String): Self = this.set("resultHeadLabelHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultHtml(value: String): Self = this.set("resultHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitButtonHtml(value: String): Self = this.set("submitButtonHtml", value.asInstanceOf[js.Any])
  }
}
