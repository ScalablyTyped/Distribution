package typings.jqueryElang

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IELangTestDelegates extends StObject {
  
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
  
  @scala.inline
  implicit class IELangTestDelegatesMutableBuilder[Self <: IELangTestDelegates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRdoModeClickHandler(value: js.Function): Self = StObject.set(x, "rdoModeClickHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdoModeHandler(value: js.Function): Self = StObject.set(x, "rdoModeHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdoQuestionClickHandler(value: js.Function): Self = StObject.set(x, "rdoQuestionClickHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdoQuestionHandler(value: js.Function): Self = StObject.set(x, "rdoQuestionHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdoVariantClickHandler(value: js.Function): Self = StObject.set(x, "rdoVariantClickHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdoVariantHandler(value: js.Function): Self = StObject.set(x, "rdoVariantHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartStopHandler(value: js.Function): Self = StObject.set(x, "startStopHandler", value.asInstanceOf[js.Any])
  }
}
