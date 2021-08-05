package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Note holding the version of the provider&#39;s builder and the signature of
  * the provenance message in the build details occurrence.
  */
trait SchemaBuild extends StObject {
  
  /**
    * Required. Immutable. Version of the builder which produced this build.
    */
  var builderVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Signature of the build in occurrences pointing to this build note
    * containing build details.
    */
  var signature: js.UndefOr[SchemaBuildSignature] = js.undefined
}
object SchemaBuild {
  
  inline def apply(): SchemaBuild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuild]
  }
  
  extension [Self <: SchemaBuild](x: Self) {
    
    inline def setBuilderVersion(value: String): Self = StObject.set(x, "builderVersion", value.asInstanceOf[js.Any])
    
    inline def setBuilderVersionUndefined: Self = StObject.set(x, "builderVersion", js.undefined)
    
    inline def setSignature(value: SchemaBuildSignature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
