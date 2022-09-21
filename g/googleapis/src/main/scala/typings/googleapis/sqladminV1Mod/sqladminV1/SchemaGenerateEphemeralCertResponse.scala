package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateEphemeralCertResponse extends StObject {
  
  /**
    * Generated cert
    */
  var ephemeralCert: js.UndefOr[SchemaSslCert] = js.undefined
}
object SchemaGenerateEphemeralCertResponse {
  
  inline def apply(): SchemaGenerateEphemeralCertResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateEphemeralCertResponse]
  }
  
  extension [Self <: SchemaGenerateEphemeralCertResponse](x: Self) {
    
    inline def setEphemeralCert(value: SchemaSslCert): Self = StObject.set(x, "ephemeralCert", value.asInstanceOf[js.Any])
    
    inline def setEphemeralCertUndefined: Self = StObject.set(x, "ephemeralCert", js.undefined)
  }
}
