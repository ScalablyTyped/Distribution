package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaResource extends StObject {
  
  /**
    * The Access Control Policy set on this resource.
    */
  var accessControl: js.UndefOr[SchemaResourceAccessControl] = js.native
  
  /**
    * Output only. The evaluated properties of the resource with references
    * expanded. Returned as serialized YAML.
    */
  var finalProperties: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  /**
    * Output only. Creation timestamp in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The last used credential that successfully created/updated
    * the resource.
    */
  var lastUsedCredential: js.UndefOr[SchemaCredential] = js.native
  
  /**
    * Output only. URL of the manifest representing the current configuration
    * of this resource.
    */
  var manifest: js.UndefOr[String] = js.native
  
  /**
    * Output only. The name of the resource as it appears in the YAML config.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The current properties of the resource before any references
    * have been filled in. Returned as serialized YAML.
    */
  var properties: js.UndefOr[String] = js.native
  
  /**
    * Output only. In case this is an action, it will show the runtimePolicies
    * on which this action will run in the deployment
    */
  var runtimePolicies: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Output only. The type of the resource, for example compute.v1.instance,
    * or cloudfunctions.v1beta1.function.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Output only. If Deployment Manager is currently updating or previewing an
    * update to this resource, the updated configuration appears here.
    */
  var update: js.UndefOr[SchemaResourceUpdate] = js.native
  
  /**
    * Output only. Update timestamp in RFC3339 text format.
    */
  var updateTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The URL of the actual resource.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * Output only. If warning messages are generated during processing of this
    * resource, this field will be populated.
    */
  var warnings: js.UndefOr[js.Array[Code]] = js.native
}
object SchemaResource {
  
  @scala.inline
  def apply(): SchemaResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResource]
  }
  
  @scala.inline
  implicit class SchemaResourceMutableBuilder[Self <: SchemaResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControl(value: SchemaResourceAccessControl): Self = StObject.set(x, "accessControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlUndefined: Self = StObject.set(x, "accessControl", js.undefined)
    
    @scala.inline
    def setFinalProperties(value: String): Self = StObject.set(x, "finalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalPropertiesUndefined: Self = StObject.set(x, "finalProperties", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    @scala.inline
    def setLastUsedCredential(value: SchemaCredential): Self = StObject.set(x, "lastUsedCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUsedCredentialUndefined: Self = StObject.set(x, "lastUsedCredential", js.undefined)
    
    @scala.inline
    def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
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
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdate(value: SchemaResourceUpdate): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWarnings(value: js.Array[Code]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: Code*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
