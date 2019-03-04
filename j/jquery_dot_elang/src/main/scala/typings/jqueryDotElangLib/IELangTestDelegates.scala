package typings
package jqueryDotElangLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IELangTestDelegates extends js.Object {
  var rdoModeClickHandler: js.Function
  var rdoModeHandler: js.Function
  var rdoQuestionClickHandler: js.Function
  var rdoQuestionHandler: js.Function
  var rdoVariantClickHandler: js.Function
  var rdoVariantHandler: js.Function
  var startStopHandler: js.Function
}

object IELangTestDelegates {
  @scala.inline
  def apply(
    rdoModeClickHandler: js.Function,
    rdoModeHandler: js.Function,
    rdoQuestionClickHandler: js.Function,
    rdoQuestionHandler: js.Function,
    rdoVariantClickHandler: js.Function,
    rdoVariantHandler: js.Function,
    startStopHandler: js.Function
  ): IELangTestDelegates = {
    val __obj = js.Dynamic.literal(rdoModeClickHandler = rdoModeClickHandler, rdoModeHandler = rdoModeHandler, rdoQuestionClickHandler = rdoQuestionClickHandler, rdoQuestionHandler = rdoQuestionHandler, rdoVariantClickHandler = rdoVariantClickHandler, rdoVariantHandler = rdoVariantHandler, startStopHandler = startStopHandler)
  
    __obj.asInstanceOf[IELangTestDelegates]
  }
}

