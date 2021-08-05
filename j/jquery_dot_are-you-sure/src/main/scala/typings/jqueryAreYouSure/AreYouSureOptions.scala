package typings.jqueryAreYouSure

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**Options available to control dirty form checking*/
trait AreYouSureOptions extends StObject {
  
  /**Callback when form is found to be dirty - allows control of submit/reset buttons etc*/
  var change: js.UndefOr[js.Function] = js.undefined
  
  /**Class to assign to the form when dirty*/
  var dirtyClass: js.UndefOr[String] = js.undefined
  
  /**Jquery selector to use to find input elements*/
  var fieldSelector: js.UndefOr[String] = js.undefined
  
  /**Message to show when attempting to quit a dirty form without saving*/
  var message: js.UndefOr[String] = js.undefined
  
  /**Make Are-You-Sure "silent" by disabling the warning message*/
  var silent: js.UndefOr[Boolean] = js.undefined
}
object AreYouSureOptions {
  
  inline def apply(): AreYouSureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreYouSureOptions]
  }
  
  extension [Self <: AreYouSureOptions](x: Self) {
    
    inline def setChange(value: js.Function): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setDirtyClass(value: String): Self = StObject.set(x, "dirtyClass", value.asInstanceOf[js.Any])
    
    inline def setDirtyClassUndefined: Self = StObject.set(x, "dirtyClass", js.undefined)
    
    inline def setFieldSelector(value: String): Self = StObject.set(x, "fieldSelector", value.asInstanceOf[js.Any])
    
    inline def setFieldSelectorUndefined: Self = StObject.set(x, "fieldSelector", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
