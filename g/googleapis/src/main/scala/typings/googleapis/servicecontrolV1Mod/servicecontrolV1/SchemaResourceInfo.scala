package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a resource associated with this operation.
  */
@js.native
trait SchemaResourceInfo extends StObject {
  
  /**
    * The identifier of the parent of this resource instance. Must be in one of
    * the following formats:     - “projects/&lt;project-id or
    * project-number&gt;”     - “folders/&lt;folder-id&gt;”     -
    * “organizations/&lt;organization-id&gt;”
    */
  var resourceContainer: js.UndefOr[String] = js.native
  
  /**
    * The location of the resource. If not empty, the resource will be checked
    * against location policy. The value must be a valid zone, region or
    * multiregion. For example: &quot;europe-west4&quot; or
    * &quot;northamerica-northeast1-a&quot;
    */
  var resourceLocation: js.UndefOr[String] = js.native
  
  /**
    * Name of the resource. This is used for auditing purposes.
    */
  var resourceName: js.UndefOr[String] = js.native
}
object SchemaResourceInfo {
  
  @scala.inline
  def apply(): SchemaResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceInfo]
  }
  
  @scala.inline
  implicit class SchemaResourceInfoMutableBuilder[Self <: SchemaResourceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceContainer(value: String): Self = StObject.set(x, "resourceContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceContainerUndefined: Self = StObject.set(x, "resourceContainer", js.undefined)
    
    @scala.inline
    def setResourceLocation(value: String): Self = StObject.set(x, "resourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceLocationUndefined: Self = StObject.set(x, "resourceLocation", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
