package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Note holding the version of the provider&#39;s builder and the signature of
  * the provenance message in linked BuildDetails.
  */
trait SchemaBuildType extends StObject {
  
  /**
    * Version of the builder which produced this Note.
    */
  var builderVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Signature of the build in Occurrences pointing to the Note containing
    * this `BuilderDetails`.
    */
  var signature: js.UndefOr[SchemaBuildSignature] = js.undefined
}
object SchemaBuildType {
  
  inline def apply(): SchemaBuildType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildType]
  }
  
  extension [Self <: SchemaBuildType](x: Self) {
    
    inline def setBuilderVersion(value: String): Self = StObject.set(x, "builderVersion", value.asInstanceOf[js.Any])
    
    inline def setBuilderVersionUndefined: Self = StObject.set(x, "builderVersion", js.undefined)
    
    inline def setSignature(value: SchemaBuildSignature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
