package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchWriteRequest extends StObject {
  
  /**
    * Labels associated with this batch write.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The writes to apply. Method does not apply writes atomically and does not guarantee ordering. Each write succeeds or fails independently. You cannot write to the same document more than once per request.
    */
  var writes: js.UndefOr[js.Array[SchemaWrite]] = js.undefined
}
object SchemaBatchWriteRequest {
  
  inline def apply(): SchemaBatchWriteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchWriteRequest]
  }
  
  extension [Self <: SchemaBatchWriteRequest](x: Self) {
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setWrites(value: js.Array[SchemaWrite]): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    
    inline def setWritesUndefined: Self = StObject.set(x, "writes", js.undefined)
    
    inline def setWritesVarargs(value: SchemaWrite*): Self = StObject.set(x, "writes", js.Array(value*))
  }
}
