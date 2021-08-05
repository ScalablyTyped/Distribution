package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrivateData extends StObject {
  
  var referenceId: js.UndefOr[String] = js.undefined
  
  var referencePayload: js.UndefOr[String] = js.undefined
}
object SchemaPrivateData {
  
  inline def apply(): SchemaPrivateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateData]
  }
  
  extension [Self <: SchemaPrivateData](x: Self) {
    
    inline def setReferenceId(value: String): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
    
    inline def setReferenceIdUndefined: Self = StObject.set(x, "referenceId", js.undefined)
    
    inline def setReferencePayload(value: String): Self = StObject.set(x, "referencePayload", value.asInstanceOf[js.Any])
    
    inline def setReferencePayloadUndefined: Self = StObject.set(x, "referencePayload", js.undefined)
  }
}
