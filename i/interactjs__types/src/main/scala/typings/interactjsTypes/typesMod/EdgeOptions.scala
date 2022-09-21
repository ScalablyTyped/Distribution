package typings.interactjsTypes.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeOptions extends StObject {
  
  var bottom: js.UndefOr[Boolean | String | Element] = js.undefined
  
  var left: js.UndefOr[Boolean | String | Element] = js.undefined
  
  var right: js.UndefOr[Boolean | String | Element] = js.undefined
  
  var top: js.UndefOr[Boolean | String | Element] = js.undefined
}
object EdgeOptions {
  
  inline def apply(): EdgeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeOptions]
  }
  
  extension [Self <: EdgeOptions](x: Self) {
    
    inline def setBottom(value: Boolean | String | Element): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: Boolean | String | Element): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Boolean | String | Element): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Boolean | String | Element): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
