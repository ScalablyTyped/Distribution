package typings.jqueryDotElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ELangSearch
trait IELangSearchDefaults extends IELangBaseDefaults {
  var expressionsLabel: String
  var expressionsTooltip: String
  var meaningsLabel: String
  var meaningsTooltip: String
  var searchButtonLabel: String
  var searchFieldHtml: String
  var searchFormHtml: String
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
    val __obj = js.Dynamic.literal(contentCSS = contentCSS, contentInnerCSS = contentInnerCSS, contentInnerHtml = contentInnerHtml, expressionsLabel = expressionsLabel, expressionsTooltip = expressionsTooltip, fluidRowHtml = fluidRowHtml, headLabel = headLabel, headLabelHtml = headLabelHtml, meaningsLabel = meaningsLabel, meaningsTooltip = meaningsTooltip, radioButtonHtml = radioButtonHtml, radioGroupHtml = radioGroupHtml, resultCSS = resultCSS, resultHeadCSS = resultHeadCSS, resultHeadLabel = resultHeadLabel, resultHeadLabelHtml = resultHeadLabelHtml, resultHtml = resultHtml, searchButtonLabel = searchButtonLabel, searchFieldHtml = searchFieldHtml, searchFormHtml = searchFormHtml, submitButtonHtml = submitButtonHtml)
  
    __obj.asInstanceOf[IELangSearchDefaults]
  }
}

