package typings.googleapis.v1p1alpha1Mod.securitycenterV1p1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSecuritycenterV1Resource extends StObject {
  
  /**
    * The full resource name of the resource. See: https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name of resource&#39;s parent.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    *  The human readable name of resource&#39;s parent.
    */
  var parentDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full resource name of project that the resource belongs to.
    */
  var project: js.UndefOr[String | Null] = js.undefined
  
  /**
    *  The human readable name of project that the resource belongs to.
    */
  var projectDisplayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudSecuritycenterV1Resource {
  
  inline def apply(): SchemaGoogleCloudSecuritycenterV1Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSecuritycenterV1Resource]
  }
  
  extension [Self <: SchemaGoogleCloudSecuritycenterV1Resource](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentDisplayName(value: String): Self = StObject.set(x, "parentDisplayName", value.asInstanceOf[js.Any])
    
    inline def setParentDisplayNameNull: Self = StObject.set(x, "parentDisplayName", null)
    
    inline def setParentDisplayNameUndefined: Self = StObject.set(x, "parentDisplayName", js.undefined)
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectDisplayName(value: String): Self = StObject.set(x, "projectDisplayName", value.asInstanceOf[js.Any])
    
    inline def setProjectDisplayNameNull: Self = StObject.set(x, "projectDisplayName", null)
    
    inline def setProjectDisplayNameUndefined: Self = StObject.set(x, "projectDisplayName", js.undefined)
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
