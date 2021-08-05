package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactHashes extends StObject {
  
  var sha256: js.UndefOr[String] = js.undefined
}
object ArtifactHashes {
  
  inline def apply(): ArtifactHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactHashes]
  }
  
  extension [Self <: ArtifactHashes](x: Self) {
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
