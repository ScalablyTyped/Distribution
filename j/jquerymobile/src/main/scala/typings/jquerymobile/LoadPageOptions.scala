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
  
  @scala.inline
  def apply(): LoadPageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadPageOptions]
  }
  
  @scala.inline
  implicit class LoadPageOptionsMutableBuilder[Self <: LoadPageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setLoadMsgDelay(value: Double): Self = StObject.set(x, "loadMsgDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadMsgDelayUndefined: Self = StObject.set(x, "loadMsgDelay", js.undefined)
    
    @scala.inline
    def setPageContainer(value: JQuery): Self = StObject.set(x, "pageContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageContainerUndefined: Self = StObject.set(x, "pageContainer", js.undefined)
    
    @scala.inline
    def setReloadPage(value: Boolean): Self = StObject.set(x, "reloadPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReloadPageUndefined: Self = StObject.set(x, "reloadPage", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setShowLoadMsg(value: Boolean): Self = StObject.set(x, "showLoadMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLoadMsgUndefined: Self = StObject.set(x, "showLoadMsg", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
