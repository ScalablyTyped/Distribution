package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrafeasV1beta1IntotoArtifact extends StObject {
  
  var hashes: js.UndefOr[SchemaArtifactHashes] = js.undefined
  
  var resourceUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGrafeasV1beta1IntotoArtifact {
  
  inline def apply(): SchemaGrafeasV1beta1IntotoArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1beta1IntotoArtifact]
  }
  
  extension [Self <: SchemaGrafeasV1beta1IntotoArtifact](x: Self) {
    
    inline def setHashes(value: SchemaArtifactHashes): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    inline def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
    
    inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
    
    inline def setResourceUriNull: Self = StObject.set(x, "resourceUri", null)
    
    inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
  }
}
