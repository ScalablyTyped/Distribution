package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOverlappingUIElements extends StObject {
  
  /**
    * Resource names of the overlapping screen elements
    */
  var resourceName: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The screen id of the elements
    */
  var screenId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOverlappingUIElements {
  
  inline def apply(): SchemaOverlappingUIElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOverlappingUIElements]
  }
  
  extension [Self <: SchemaOverlappingUIElements](x: Self) {
    
    inline def setResourceName(value: js.Array[String]): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceNameVarargs(value: String*): Self = StObject.set(x, "resourceName", js.Array(value*))
    
    inline def setScreenId(value: String): Self = StObject.set(x, "screenId", value.asInstanceOf[js.Any])
    
    inline def setScreenIdNull: Self = StObject.set(x, "screenId", null)
    
    inline def setScreenIdUndefined: Self = StObject.set(x, "screenId", js.undefined)
  }
}
