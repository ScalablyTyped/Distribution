package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SslCerts create ephemeral certificate request.
  */
trait SchemaSslCertsCreateEphemeralRequest extends StObject {
  
  /**
    * PEM encoded public key to include in the signed certificate.
    */
  var public_key: js.UndefOr[String] = js.undefined
}
object SchemaSslCertsCreateEphemeralRequest {
  
  @scala.inline
  def apply(): SchemaSslCertsCreateEphemeralRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertsCreateEphemeralRequest]
  }
  
  @scala.inline
  implicit class SchemaSslCertsCreateEphemeralRequestMutableBuilder[Self <: SchemaSslCertsCreateEphemeralRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic_keyUndefined: Self = StObject.set(x, "public_key", js.undefined)
  }
}
