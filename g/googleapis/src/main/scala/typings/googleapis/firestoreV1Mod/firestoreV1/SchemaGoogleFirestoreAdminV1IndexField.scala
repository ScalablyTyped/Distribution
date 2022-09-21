package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirestoreAdminV1IndexField extends StObject {
  
  /**
    * Indicates that this field supports operations on `array_value`s.
    */
  var arrayConfig: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Can be __name__. For single field indexes, this must match the name of the field or may be omitted.
    */
  var fieldPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates that this field supports ordering by the specified order or comparing using =, !=, <, <=, \>, \>=.
    */
  var order: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirestoreAdminV1IndexField {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1IndexField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1IndexField]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1IndexField](x: Self) {
    
    inline def setArrayConfig(value: String): Self = StObject.set(x, "arrayConfig", value.asInstanceOf[js.Any])
    
    inline def setArrayConfigNull: Self = StObject.set(x, "arrayConfig", null)
    
    inline def setArrayConfigUndefined: Self = StObject.set(x, "arrayConfig", js.undefined)
    
    inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setFieldPathNull: Self = StObject.set(x, "fieldPath", null)
    
    inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
