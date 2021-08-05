package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a field, such as `max(messages.time) as max_time`.
  */
trait SchemaFieldReference extends StObject {
  
  var fieldPath: js.UndefOr[String] = js.undefined
}
object SchemaFieldReference {
  
  inline def apply(): SchemaFieldReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldReference]
  }
  
  extension [Self <: SchemaFieldReference](x: Self) {
    
    inline def setFieldPath(value: String): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
  }
}
