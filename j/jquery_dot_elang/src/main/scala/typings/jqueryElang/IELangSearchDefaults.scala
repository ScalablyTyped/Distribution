package typings.jqueryElang

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ELangSearch
trait IELangSearchDefaults
  extends StObject
     with IELangBaseDefaults {
  
  var expressionsLabel: String
  
  var expressionsTooltip: String
  
  var meaningsLabel: String
  
  var meaningsTooltip: String
  
  var searchButtonLabel: String
  
  var searchFieldHtml: String
  
  var searchFormHtml: String
}
object IELangSearchDefaults {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IELangSearchDefaults] (val x: Self) extends AnyVal {
    
    inline def setExpressionsLabel(value: String): Self = StObject.set(x, "expressionsLabel", value.asInstanceOf[js.Any])
    
    inline def setExpressionsTooltip(value: String): Self = StObject.set(x, "expressionsTooltip", value.asInstanceOf[js.Any])
    
    inline def setMeaningsLabel(value: String): Self = StObject.set(x, "meaningsLabel", value.asInstanceOf[js.Any])
    
    inline def setMeaningsTooltip(value: String): Self = StObject.set(x, "meaningsTooltip", value.asInstanceOf[js.Any])
    
    inline def setSearchButtonLabel(value: String): Self = StObject.set(x, "searchButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setSearchFieldHtml(value: String): Self = StObject.set(x, "searchFieldHtml", value.asInstanceOf[js.Any])
    
    inline def setSearchFormHtml(value: String): Self = StObject.set(x, "searchFormHtml", value.asInstanceOf[js.Any])
  }
}
