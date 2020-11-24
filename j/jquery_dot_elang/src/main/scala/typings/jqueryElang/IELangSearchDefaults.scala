package typings.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ELangSearch
@js.native
trait IELangSearchDefaults extends IELangBaseDefaults {
  
  var expressionsLabel: String = js.native
  
  var expressionsTooltip: String = js.native
  
  var meaningsLabel: String = js.native
  
  var meaningsTooltip: String = js.native
  
  var searchButtonLabel: String = js.native
  
  var searchFieldHtml: String = js.native
  
  var searchFormHtml: String = js.native
}
object IELangSearchDefaults {
  
  @scala.inline
  def apply(
    contentCSS: String,
    contentInnerCSS: String,
    contentInnerHtml: String,
    expressionsLabel: String,
    expressionsTooltip: String,
    fluidRowHtml: String,
    headLabel: String,
    headLabelHtml: String,
    meaningsLabel: String,
    meaningsTooltip: String,
    radioButtonHtml: String,
    radioGroupHtml: String,
    resultCSS: String,
    resultHeadCSS: String,
    resultHeadLabel: String,
    resultHeadLabelHtml: String,
    resultHtml: String,
    searchButtonLabel: String,
    searchFieldHtml: String,
    searchFormHtml: String,
    submitButtonHtml: String
  ): IELangSearchDefaults = {
    val __obj = js.Dynamic.literal(contentCSS = contentCSS.asInstanceOf[js.Any], contentInnerCSS = contentInnerCSS.asInstanceOf[js.Any], contentInnerHtml = contentInnerHtml.asInstanceOf[js.Any], expressionsLabel = expressionsLabel.asInstanceOf[js.Any], expressionsTooltip = expressionsTooltip.asInstanceOf[js.Any], fluidRowHtml = fluidRowHtml.asInstanceOf[js.Any], headLabel = headLabel.asInstanceOf[js.Any], headLabelHtml = headLabelHtml.asInstanceOf[js.Any], meaningsLabel = meaningsLabel.asInstanceOf[js.Any], meaningsTooltip = meaningsTooltip.asInstanceOf[js.Any], radioButtonHtml = radioButtonHtml.asInstanceOf[js.Any], radioGroupHtml = radioGroupHtml.asInstanceOf[js.Any], resultCSS = resultCSS.asInstanceOf[js.Any], resultHeadCSS = resultHeadCSS.asInstanceOf[js.Any], resultHeadLabel = resultHeadLabel.asInstanceOf[js.Any], resultHeadLabelHtml = resultHeadLabelHtml.asInstanceOf[js.Any], resultHtml = resultHtml.asInstanceOf[js.Any], searchButtonLabel = searchButtonLabel.asInstanceOf[js.Any], searchFieldHtml = searchFieldHtml.asInstanceOf[js.Any], searchFormHtml = searchFormHtml.asInstanceOf[js.Any], submitButtonHtml = submitButtonHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangSearchDefaults]
  }
  
  @scala.inline
  implicit class IELangSearchDefaultsOps[Self <: IELangSearchDefaults] (val x: Self) extends AnyVal {
    
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
    def setExpressionsLabel(value: String): Self = this.set("expressionsLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsTooltip(value: String): Self = this.set("expressionsTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeaningsLabel(value: String): Self = this.set("meaningsLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeaningsTooltip(value: String): Self = this.set("meaningsTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchButtonLabel(value: String): Self = this.set("searchButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFieldHtml(value: String): Self = this.set("searchFieldHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFormHtml(value: String): Self = this.set("searchFormHtml", value.asInstanceOf[js.Any])
  }
}
