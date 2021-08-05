package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadPageOptions extends StObject {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var loadMsgDelay: js.UndefOr[Double] = js.undefined
  
  var pageContainer: js.UndefOr[JQuery] = js.undefined
  
  var reloadPage: js.UndefOr[Boolean] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var showLoadMsg: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object LoadPageOptions {
  
  inline def apply(): LoadPageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPageOptions]
  }
  
  extension [Self <: LoadPageOptions](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLoadMsgDelay(value: Double): Self = StObject.set(x, "loadMsgDelay", value.asInstanceOf[js.Any])
    
    inline def setLoadMsgDelayUndefined: Self = StObject.set(x, "loadMsgDelay", js.undefined)
    
    inline def setPageContainer(value: JQuery): Self = StObject.set(x, "pageContainer", value.asInstanceOf[js.Any])
    
    inline def setPageContainerUndefined: Self = StObject.set(x, "pageContainer", js.undefined)
    
    inline def setReloadPage(value: Boolean): Self = StObject.set(x, "reloadPage", value.asInstanceOf[js.Any])
    
    inline def setReloadPageUndefined: Self = StObject.set(x, "reloadPage", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setShowLoadMsg(value: Boolean): Self = StObject.set(x, "showLoadMsg", value.asInstanceOf[js.Any])
    
    inline def setShowLoadMsgUndefined: Self = StObject.set(x, "showLoadMsg", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
