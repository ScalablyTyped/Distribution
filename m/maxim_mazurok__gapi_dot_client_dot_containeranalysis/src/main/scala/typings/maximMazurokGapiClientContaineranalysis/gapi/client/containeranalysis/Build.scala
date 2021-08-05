package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Build extends StObject {
  
  /** Required. Immutable. Version of the builder which produced this build. */
  var builderVersion: js.UndefOr[String] = js.undefined
  
  /** Signature of the build in occurrences pointing to this build note containing build details. */
  var signature: js.UndefOr[BuildSignature] = js.undefined
}
object Build {
  
  inline def apply(): Build = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Build]
  }
  
  extension [Self <: Build](x: Self) {
    
    inline def setBuilderVersion(value: String): Self = StObject.set(x, "builderVersion", value.asInstanceOf[js.Any])
    
    inline def setBuilderVersionUndefined: Self = StObject.set(x, "builderVersion", js.undefined)
    
    inline def setSignature(value: BuildSignature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
