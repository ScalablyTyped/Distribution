package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStartActivityIntent extends StObject {
  
  /**
    * Action name. Required for START_ACTIVITY.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Intent categories to set on the intent.
    */
  var categories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * URI for the action.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaStartActivityIntent {
  
  inline def apply(): SchemaStartActivityIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartActivityIntent]
  }
  
  extension [Self <: SchemaStartActivityIntent](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
