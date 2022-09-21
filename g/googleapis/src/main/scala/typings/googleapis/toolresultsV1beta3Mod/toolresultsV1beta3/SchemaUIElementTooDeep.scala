package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUIElementTooDeep extends StObject {
  
  /**
    * The depth of the screen element
    */
  var depth: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The screen id of the element
    */
  var screenId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The screen state id of the element
    */
  var screenStateId: js.UndefOr[String | Null] = js.undefined
}
object SchemaUIElementTooDeep {
  
  inline def apply(): SchemaUIElementTooDeep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUIElementTooDeep]
  }
  
  extension [Self <: SchemaUIElementTooDeep](x: Self) {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthNull: Self = StObject.set(x, "depth", null)
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setScreenId(value: String): Self = StObject.set(x, "screenId", value.asInstanceOf[js.Any])
    
    inline def setScreenIdNull: Self = StObject.set(x, "screenId", null)
    
    inline def setScreenIdUndefined: Self = StObject.set(x, "screenId", js.undefined)
    
    inline def setScreenStateId(value: String): Self = StObject.set(x, "screenStateId", value.asInstanceOf[js.Any])
    
    inline def setScreenStateIdNull: Self = StObject.set(x, "screenStateId", null)
    
    inline def setScreenStateIdUndefined: Self = StObject.set(x, "screenStateId", js.undefined)
  }
}
