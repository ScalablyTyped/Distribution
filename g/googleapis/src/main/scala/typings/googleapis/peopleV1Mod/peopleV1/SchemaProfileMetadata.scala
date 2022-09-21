package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProfileMetadata extends StObject {
  
  /**
    * Output only. The profile object type.
    */
  var objectType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The user types.
    */
  var userTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaProfileMetadata {
  
  inline def apply(): SchemaProfileMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfileMetadata]
  }
  
  extension [Self <: SchemaProfileMetadata](x: Self) {
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeNull: Self = StObject.set(x, "objectType", null)
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setUserTypes(value: js.Array[String]): Self = StObject.set(x, "userTypes", value.asInstanceOf[js.Any])
    
    inline def setUserTypesNull: Self = StObject.set(x, "userTypes", null)
    
    inline def setUserTypesUndefined: Self = StObject.set(x, "userTypes", js.undefined)
    
    inline def setUserTypesVarargs(value: String*): Self = StObject.set(x, "userTypes", js.Array(value*))
  }
}
