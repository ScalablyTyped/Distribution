package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Secrets extends StObject {
  
  /**
    * Secrets encrypted with KMS key and the associated secret environment variable.
    */
  var `inline`: js.UndefOr[js.Array[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret]] = js.undefined
  
  /**
    * Secrets in Secret Manager and associated secret environment variable.
    */
  var secretManager: js.UndefOr[js.Array[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret]] = js.undefined
}
object SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Secrets {
  
  inline def apply(): SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Secrets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Secrets]
  }
  
  extension [Self <: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1Secrets](x: Self) {
    
    inline def setInline(value: js.Array[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret]): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setInlineVarargs(value: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret*): Self = StObject.set(x, "inline", js.Array(value*))
    
    inline def setSecretManager(value: js.Array[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret]): Self = StObject.set(x, "secretManager", value.asInstanceOf[js.Any])
    
    inline def setSecretManagerUndefined: Self = StObject.set(x, "secretManager", js.undefined)
    
    inline def setSecretManagerVarargs(value: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1SecretManagerSecret*): Self = StObject.set(x, "secretManager", js.Array(value*))
  }
}
