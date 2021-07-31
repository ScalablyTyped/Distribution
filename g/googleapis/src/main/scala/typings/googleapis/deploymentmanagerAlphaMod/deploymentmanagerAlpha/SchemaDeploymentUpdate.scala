package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeploymentUpdate extends StObject {
  
  /**
    * Output only. The user-provided default credential to use when deploying
    * this preview.
    */
  var credential: js.UndefOr[SchemaCredential] = js.undefined
  
  /**
    * Output only. An optional user-provided description of the deployment
    * after the current update has been applied.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Map of labels; provided by the client when the resource is
    * created or updated. Specifically: Label keys must be between 1 and 63
    * characters long and must conform to the following regular expression:
    * [a-z]([-a-z0-9]*[a-z0-9])? Label values must be between 0 and 63
    * characters long and must conform to the regular expression
    * ([a-z]([-a-z0-9]*[a-z0-9])?)?
    */
  var labels: js.UndefOr[js.Array[SchemaDeploymentUpdateLabelEntry]] = js.undefined
  
  /**
    * Output only. URL of the manifest representing the update configuration of
    * this deployment.
    */
  var manifest: js.UndefOr[String] = js.undefined
}
object SchemaDeploymentUpdate {
  
  @scala.inline
  def apply(): SchemaDeploymentUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeploymentUpdate]
  }
  
  @scala.inline
  implicit class SchemaDeploymentUpdateMutableBuilder[Self <: SchemaDeploymentUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredential(value: SchemaCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Array[SchemaDeploymentUpdateLabelEntry]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: SchemaDeploymentUpdateLabelEntry*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    @scala.inline
    def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
  }
}
