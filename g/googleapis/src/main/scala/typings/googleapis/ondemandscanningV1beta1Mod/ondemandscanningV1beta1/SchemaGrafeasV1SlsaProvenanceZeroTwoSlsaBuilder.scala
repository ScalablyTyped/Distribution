package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaBuilder extends StObject {
  
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaBuilder {
  
  inline def apply(): SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaBuilder]
  }
  
  extension [Self <: SchemaGrafeasV1SlsaProvenanceZeroTwoSlsaBuilder](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
