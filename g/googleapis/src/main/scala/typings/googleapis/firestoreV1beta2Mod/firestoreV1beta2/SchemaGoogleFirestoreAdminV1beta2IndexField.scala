package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A field in an index. The field_path describes which field is indexed, the
  * value_mode describes how the field value is indexed.
  */
trait SchemaGoogleFirestoreAdminV1beta2IndexField extends StObject {
  
  /**
    * Indicates that this field supports operations on `array_value`s.
    */
  var arrayConfig: js.UndefOr[String] = js.undefined
  
  /**
    * Can be __name__. For single field indexes, this must match the name of
    * the field or may be omitted.
    */
  var fieldPath: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that this field supports ordering by the specified order or
    * comparing using =, &lt;, &lt;=, &gt;, &gt;=.
    */
  var order: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFirestoreAdminV1beta2IndexField {
  
  inline def apply(): SchemaGoogleFirestoreAdminV1beta2IndexField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2IndexField]
  }
  
  extension [Self <: SchemaGoogleFirestoreAdminV1beta2IndexField](x: Self) {
    
    inline def setArrayConfig(value: String): Self = StObject.set(x, "arrayConfig", value.asInstanceOf[js.Any])
    
    inline def setArrayConfigUndefined: Self = StObject.set(x, "arrayConfig", js.undefined)
    
    inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
    
    inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
