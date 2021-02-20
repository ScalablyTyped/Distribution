package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import typings.googleapis.anon.Code
import typings.googleapis.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaResourceUpdate extends StObject {
  
  /**
    * The Access Control Policy to set on this resource after updating the
    * resource itself.
    */
  var accessControl: js.UndefOr[SchemaResourceAccessControl] = js.native
  
  /**
    * Output only. The credential that will be used creating/updating this
    * resource.
    */
  var credential: js.UndefOr[SchemaCredential] = js.native
  
  /**
    * Output only. If errors are generated during update of the resource, this
    * field will be populated.
    */
  var error: js.UndefOr[`3`] = js.native
  
  /**
    * Output only. The expanded properties of the resource with reference
    * values expanded. Returned as serialized YAML.
    */
  var finalProperties: js.UndefOr[String] = js.native
  
  /**
    * Output only. The intent of the resource: PREVIEW, UPDATE, or CANCEL.
    */
  var intent: js.UndefOr[String] = js.native
  
  /**
    * Output only. URL of the manifest representing the update configuration of
    * this resource.
    */
  var manifest: js.UndefOr[String] = js.native
  
  /**
    * Output only. The set of updated properties for this resource, before
    * references are expanded. Returned as serialized YAML.
    */
  var properties: js.UndefOr[String] = js.native
  
  /**
    * Output only. In case this is an action, it will show the runtimePolicies
    * that this action will have after updating the deployment.
    */
  var runtimePolicies: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Output only. The state of the resource.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Output only. If warning messages are generated during processing of this
    * resource, this field will be populated.
    */
  var warnings: js.UndefOr[js.Array[Code]] = js.native
}
object SchemaResourceUpdate {
  
  @scala.inline
  def apply(): SchemaResourceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceUpdate]
  }
  
  @scala.inline
  implicit class SchemaResourceUpdateMutableBuilder[Self <: SchemaResourceUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControl(value: SchemaResourceAccessControl): Self = StObject.set(x, "accessControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlUndefined: Self = StObject.set(x, "accessControl", js.undefined)
    
    @scala.inline
    def setCredential(value: SchemaCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    @scala.inline
    def setError(value: `3`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFinalProperties(value: String): Self = StObject.set(x, "finalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalPropertiesUndefined: Self = StObject.set(x, "finalProperties", js.undefined)
    
    @scala.inline
    def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    @scala.inline
    def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    @scala.inline
    def setProperties(value: String): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRuntimePolicies(value: js.Array[String]): Self = StObject.set(x, "runtimePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimePoliciesUndefined: Self = StObject.set(x, "runtimePolicies", js.undefined)
    
    @scala.inline
    def setRuntimePoliciesVarargs(value: String*): Self = StObject.set(x, "runtimePolicies", js.Array(value :_*))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setWarnings(value: js.Array[Code]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: Code*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
