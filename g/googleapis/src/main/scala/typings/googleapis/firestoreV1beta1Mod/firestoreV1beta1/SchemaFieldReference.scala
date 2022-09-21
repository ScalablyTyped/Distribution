package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFieldReference extends StObject {
  
  var fieldPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaFieldReference {
  
  inline def apply(): SchemaFieldReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldReference]
  }
  
  extension [Self <: SchemaFieldReference](x: Self) {
    
    inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setFieldPathNull: Self = StObject.set(x, "fieldPath", null)
    
    inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
  }
}
