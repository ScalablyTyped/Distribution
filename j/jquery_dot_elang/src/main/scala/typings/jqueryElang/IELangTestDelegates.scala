package typings.jqueryElang

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
    val __obj = js.Dynamic.literal(rdoModeClickHandler = rdoModeClickHandler.asInstanceOf[js.Any], rdoModeHandler = rdoModeHandler.asInstanceOf[js.Any], rdoQuestionClickHandler = rdoQuestionClickHandler.asInstanceOf[js.Any], rdoQuestionHandler = rdoQuestionHandler.asInstanceOf[js.Any], rdoVariantClickHandler = rdoVariantClickHandler.asInstanceOf[js.Any], rdoVariantHandler = rdoVariantHandler.asInstanceOf[js.Any], startStopHandler = startStopHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangTestDelegates]
  }
}

