package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret extends StObject {
  
  /**
    * Map of environment variable name to its encrypted value. Secret environment variables must be unique across all of a build's secrets, and must be used by at least one build step. Values can be at most 64 KB in size. There can be at most 100 secret values across all of a build's secrets.
    */
  var envMap: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Resource name of Cloud KMS crypto key to decrypt the encrypted value. In format: projects/x/locations/x/keyRings/x/cryptoKeys/x
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
}
object SchemaContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret {
  
  inline def apply(): SchemaContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret]
  }
  
  extension [Self <: SchemaContaineranalysisGoogleDevtoolsCloudbuildV1InlineSecret](x: Self) {
    
    inline def setEnvMap(value: StringDictionary[String]): Self = StObject.set(x, "envMap", value.asInstanceOf[js.Any])
    
    inline def setEnvMapNull: Self = StObject.set(x, "envMap", null)
    
    inline def setEnvMapUndefined: Self = StObject.set(x, "envMap", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
  }
}
