package typings.leafletRoutingMachine.mod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCompleteOptions extends StObject {
  
  var blurTimeout: js.UndefOr[Double] = js.undefined
  
  var noResultsMessage: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object AutoCompleteOptions {
  
  @scala.inline
  def apply(): AutoCompleteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompleteOptions]
  }
  
  @scala.inline
  implicit class AutoCompleteOptionsMutableBuilder[Self <: AutoCompleteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlurTimeout(value: Double): Self = StObject.set(x, "blurTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurTimeoutUndefined: Self = StObject.set(x, "blurTimeout", js.undefined)
    
    @scala.inline
    def setNoResultsMessage(value: String): Self = StObject.set(x, "noResultsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoResultsMessageUndefined: Self = StObject.set(x, "noResultsMessage", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
