package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaArtifactHashes extends StObject {
  
  var sha256: js.UndefOr[String | Null] = js.undefined
}
object SchemaArtifactHashes {
  
  inline def apply(): SchemaArtifactHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaArtifactHashes]
  }
  
  extension [Self <: SchemaArtifactHashes](x: Self) {
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Null: Self = StObject.set(x, "sha256", null)
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
