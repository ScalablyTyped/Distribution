package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Secrets extends StObject {
  
  /** Secrets encrypted with KMS key and the associated secret environment variable. */
  var `inline`: js.UndefOr[js.Array[InlineSecret]] = js.undefined
  
  /** Secrets in Secret Manager and associated secret environment variable. */
  var secretManager: js.UndefOr[js.Array[SecretManagerSecret]] = js.undefined
}
object Secrets {
  
  inline def apply(): Secrets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Secrets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Secrets] (val x: Self) extends AnyVal {
    
    inline def setInline(value: js.Array[InlineSecret]): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setInlineVarargs(value: InlineSecret*): Self = StObject.set(x, "inline", js.Array(value*))
    
    inline def setSecretManager(value: js.Array[SecretManagerSecret]): Self = StObject.set(x, "secretManager", value.asInstanceOf[js.Any])
    
    inline def setSecretManagerUndefined: Self = StObject.set(x, "secretManager", js.undefined)
    
    inline def setSecretManagerVarargs(value: SecretManagerSecret*): Self = StObject.set(x, "secretManager", js.Array(value*))
  }
}
