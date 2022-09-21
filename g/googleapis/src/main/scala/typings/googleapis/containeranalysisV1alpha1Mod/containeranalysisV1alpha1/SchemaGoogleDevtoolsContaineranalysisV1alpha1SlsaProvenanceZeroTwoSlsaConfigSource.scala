package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSource extends StObject {
  
  /**
    * Collection of cryptographic digests for the contents of the artifact specified by invocation.configSource.uri.
    */
  var digest: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * String identifying the entry point into the build.
    */
  var entryPoint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI indicating the identity of the source of the config.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSource {
  
  inline def apply(): SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSource]
  }
  
  extension [Self <: SchemaGoogleDevtoolsContaineranalysisV1alpha1SlsaProvenanceZeroTwoSlsaConfigSource](x: Self) {
    
    inline def setDigest(value: StringDictionary[String]): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestNull: Self = StObject.set(x, "digest", null)
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointNull: Self = StObject.set(x, "entryPoint", null)
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
