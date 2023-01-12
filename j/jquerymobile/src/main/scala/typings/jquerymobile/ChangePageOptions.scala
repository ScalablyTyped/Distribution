package typings.jquerymobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangePageOptions extends StObject {
  
  var allowSamePageTransition: js.UndefOr[Boolean] = js.undefined
  
  var changeHash: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var dataUrl: js.UndefOr[String] = js.undefined
  
  var pageContainer: js.UndefOr[JQuery] = js.undefined
  
  var reloadPage: js.UndefOr[Boolean] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var showLoadMsg: js.UndefOr[Boolean] = js.undefined
  
  var transition: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ChangePageOptions {
  
  inline def apply(): ChangePageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangePageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangePageOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowSamePageTransition(value: Boolean): Self = StObject.set(x, "allowSamePageTransition", value.asInstanceOf[js.Any])
    
    inline def setAllowSamePageTransitionUndefined: Self = StObject.set(x, "allowSamePageTransition", js.undefined)
    
    inline def setChangeHash(value: Boolean): Self = StObject.set(x, "changeHash", value.asInstanceOf[js.Any])
    
    inline def setChangeHashUndefined: Self = StObject.set(x, "changeHash", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
    
    inline def setDataUrlUndefined: Self = StObject.set(x, "dataUrl", js.undefined)
    
    inline def setPageContainer(value: JQuery): Self = StObject.set(x, "pageContainer", value.asInstanceOf[js.Any])
    
    inline def setPageContainerUndefined: Self = StObject.set(x, "pageContainer", js.undefined)
    
    inline def setReloadPage(value: Boolean): Self = StObject.set(x, "reloadPage", value.asInstanceOf[js.Any])
    
    inline def setReloadPageUndefined: Self = StObject.set(x, "reloadPage", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setShowLoadMsg(value: Boolean): Self = StObject.set(x, "showLoadMsg", value.asInstanceOf[js.Any])
    
    inline def setShowLoadMsgUndefined: Self = StObject.set(x, "showLoadMsg", js.undefined)
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
