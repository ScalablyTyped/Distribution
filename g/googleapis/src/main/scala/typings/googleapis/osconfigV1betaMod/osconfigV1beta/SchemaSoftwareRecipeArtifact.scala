package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSoftwareRecipeArtifact extends StObject {
  
  /**
    * Defaults to false. When false, recipes are subject to validations based on the artifact type: Remote: A checksum must be specified, and only protocols with transport-layer security are permitted. GCS: An object generation number must be specified.
    */
  var allowInsecure: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A Google Cloud Storage artifact.
    */
  var gcs: js.UndefOr[SchemaSoftwareRecipeArtifactGcs] = js.undefined
  
  /**
    * Required. Id of the artifact, which the installation and update steps of this recipe can reference. Artifacts in a recipe cannot have the same id.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A generic remote artifact.
    */
  var remote: js.UndefOr[SchemaSoftwareRecipeArtifactRemote] = js.undefined
}
object SchemaSoftwareRecipeArtifact {
  
  inline def apply(): SchemaSoftwareRecipeArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareRecipeArtifact]
  }
  
  extension [Self <: SchemaSoftwareRecipeArtifact](x: Self) {
    
    inline def setAllowInsecure(value: Boolean): Self = StObject.set(x, "allowInsecure", value.asInstanceOf[js.Any])
    
    inline def setAllowInsecureNull: Self = StObject.set(x, "allowInsecure", null)
    
    inline def setAllowInsecureUndefined: Self = StObject.set(x, "allowInsecure", js.undefined)
    
    inline def setGcs(value: SchemaSoftwareRecipeArtifactGcs): Self = StObject.set(x, "gcs", value.asInstanceOf[js.Any])
    
    inline def setGcsUndefined: Self = StObject.set(x, "gcs", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRemote(value: SchemaSoftwareRecipeArtifactRemote): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    
    inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
  }
}
