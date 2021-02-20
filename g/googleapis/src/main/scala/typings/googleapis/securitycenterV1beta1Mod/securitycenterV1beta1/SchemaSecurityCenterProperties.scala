package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud SCC managed properties. These properties are managed by Cloud SCC and
  * cannot be modified by the user.
  */
@js.native
trait SchemaSecurityCenterProperties extends StObject {
  
  /**
    * The full resource name of the GCP resource this asset represents. This
    * field is immutable after create time. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceName: js.UndefOr[String] = js.native
  
  /**
    * Owners of the Google Cloud resource.
    */
  var resourceOwners: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The full resource name of the immediate parent of the resource. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceParent: js.UndefOr[String] = js.native
  
  /**
    * The full resource name of the project the resource belongs to. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceProject: js.UndefOr[String] = js.native
  
  /**
    * The type of the GCP resource. Examples include: APPLICATION, PROJECT, and
    * ORGANIZATION. This is a case insensitive field defined by Cloud SCC
    * and/or the producer of the resource and is immutable after create time.
    */
  var resourceType: js.UndefOr[String] = js.native
}
object SchemaSecurityCenterProperties {
  
  @scala.inline
  def apply(): SchemaSecurityCenterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityCenterProperties]
  }
  
  @scala.inline
  implicit class SchemaSecurityCenterPropertiesMutableBuilder[Self <: SchemaSecurityCenterProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setResourceOwners(value: js.Array[String]): Self = StObject.set(x, "resourceOwners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwnersUndefined: Self = StObject.set(x, "resourceOwners", js.undefined)
    
    @scala.inline
    def setResourceOwnersVarargs(value: String*): Self = StObject.set(x, "resourceOwners", js.Array(value :_*))
    
    @scala.inline
    def setResourceParent(value: String): Self = StObject.set(x, "resourceParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceParentUndefined: Self = StObject.set(x, "resourceParent", js.undefined)
    
    @scala.inline
    def setResourceProject(value: String): Self = StObject.set(x, "resourceProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceProjectUndefined: Self = StObject.set(x, "resourceProject", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
