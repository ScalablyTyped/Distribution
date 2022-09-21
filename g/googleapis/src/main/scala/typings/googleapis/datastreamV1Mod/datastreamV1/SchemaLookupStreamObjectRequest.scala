package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLookupStreamObjectRequest extends StObject {
  
  /**
    * Required. The source object identifier which maps to the stream object.
    */
  var sourceObjectIdentifier: js.UndefOr[SchemaSourceObjectIdentifier] = js.undefined
}
object SchemaLookupStreamObjectRequest {
  
  inline def apply(): SchemaLookupStreamObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookupStreamObjectRequest]
  }
  
  extension [Self <: SchemaLookupStreamObjectRequest](x: Self) {
    
    inline def setSourceObjectIdentifier(value: SchemaSourceObjectIdentifier): Self = StObject.set(x, "sourceObjectIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSourceObjectIdentifierUndefined: Self = StObject.set(x, "sourceObjectIdentifier", js.undefined)
  }
}
