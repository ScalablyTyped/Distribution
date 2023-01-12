package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineSecret extends StObject {
  
  /**
    * Map of environment variable name to its encrypted value. Secret environment variables must be unique across all of a build's secrets, and must be used by at least one build step.
    * Values can be at most 64 KB in size. There can be at most 100 secret values across all of a build's secrets.
    */
  var envMap: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Resource name of Cloud KMS crypto key to decrypt the encrypted value. In format: projects/ *‍/locations/ *‍/keyRings/ *‍/cryptoKeys/ * */
  var kmsKeyName: js.UndefOr[String] = js.undefined
}
object InlineSecret {
  
  inline def apply(): InlineSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineSecret]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineSecret] (val x: Self) extends AnyVal {
    
    inline def setEnvMap(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "envMap", value.asInstanceOf[js.Any])
    
    inline def setEnvMapUndefined: Self = StObject.set(x, "envMap", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
