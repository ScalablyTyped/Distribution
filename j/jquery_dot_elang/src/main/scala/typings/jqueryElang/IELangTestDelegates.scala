package typings.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IELangTestDelegates extends js.Object {
  
  var rdoModeClickHandler: js.Function = js.native
  
  var rdoModeHandler: js.Function = js.native
  
  var rdoQuestionClickHandler: js.Function = js.native
  
  var rdoQuestionHandler: js.Function = js.native
  
  var rdoVariantClickHandler: js.Function = js.native
  
  var rdoVariantHandler: js.Function = js.native
  
  var startStopHandler: js.Function = js.native
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
  implicit class IELangTestDelegatesOps[Self <: IELangTestDelegates] (val x: Self) extends AnyVal {
    
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
    def setRdoModeClickHandler(value: js.Function): Self = this.set("rdoModeClickHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdoModeHandler(value: js.Function): Self = this.set("rdoModeHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdoQuestionClickHandler(value: js.Function): Self = this.set("rdoQuestionClickHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdoQuestionHandler(value: js.Function): Self = this.set("rdoQuestionHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdoVariantClickHandler(value: js.Function): Self = this.set("rdoVariantClickHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdoVariantHandler(value: js.Function): Self = this.set("rdoVariantHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartStopHandler(value: js.Function): Self = this.set("startStopHandler", value.asInstanceOf[js.Any])
  }
}
