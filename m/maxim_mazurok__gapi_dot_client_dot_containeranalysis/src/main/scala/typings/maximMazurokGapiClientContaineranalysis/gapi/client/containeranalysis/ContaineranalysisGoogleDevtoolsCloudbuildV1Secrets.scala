package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets extends StObject {
  
  /** Secrets encrypted with KMS key and the associated secret environment variable. */
  var `inline`: js.UndefOr[js.Array[ContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret]] = js.undefined
  
  /** Secrets in Secret Manager and associated secret environment variable. */
  var secretManager: js.UndefOr[js.Array[ContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret]] = js.undefined
}
object ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets {
  
  inline def apply(): ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContaineranalysisGoogleDevtoolsCloudbuildV1Secrets] (val x: Self) extends AnyVal {
    
    inline def setInline(value: js.Array[ContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret]): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setInlineVarargs(value: ContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret*): Self = StObject.set(x, "inline", js.Array(value*))
    
    inline def setSecretManager(value: js.Array[ContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret]): Self = StObject.set(x, "secretManager", value.asInstanceOf[js.Any])
    
    inline def setSecretManagerUndefined: Self = StObject.set(x, "secretManager", js.undefined)
    
    inline def setSecretManagerVarargs(value: ContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret*): Self = StObject.set(x, "secretManager", js.Array(value*))
  }
}
