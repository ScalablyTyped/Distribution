package typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeploymentUpdate extends StObject {
  
  /**
    * Output only. An optional user-provided description of the deployment after the current update has been applied.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
    */
  var labels: js.UndefOr[js.Array[SchemaDeploymentUpdateLabelEntry]] = js.undefined
  
  /**
    * Output only. URL of the manifest representing the update configuration of this deployment.
    */
  var manifest: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeploymentUpdate {
  
  inline def apply(): SchemaDeploymentUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeploymentUpdate]
  }
  
  extension [Self <: SchemaDeploymentUpdate](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabels(value: js.Array[SchemaDeploymentUpdateLabelEntry]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: SchemaDeploymentUpdateLabelEntry*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestNull: Self = StObject.set(x, "manifest", null)
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
  }
}
