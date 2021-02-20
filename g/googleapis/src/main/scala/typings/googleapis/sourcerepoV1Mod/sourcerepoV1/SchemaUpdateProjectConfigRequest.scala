package typings.googleapis.sourcerepoV1Mod.sourcerepoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for UpdateProjectConfig.
  */
@js.native
trait SchemaUpdateProjectConfigRequest extends StObject {
  
  /**
    * The new configuration for the project.
    */
  var projectConfig: js.UndefOr[SchemaProjectConfig] = js.native
  
  /**
    * A FieldMask specifying which fields of the project_config to modify. Only
    * the fields in the mask will be modified. If no mask is provided, this
    * request is no-op.
    */
  var updateMask: js.UndefOr[String] = js.native
}
object SchemaUpdateProjectConfigRequest {
  
  @scala.inline
  def apply(): SchemaUpdateProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateProjectConfigRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateProjectConfigRequestMutableBuilder[Self <: SchemaUpdateProjectConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectConfig(value: SchemaProjectConfig): Self = StObject.set(x, "projectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectConfigUndefined: Self = StObject.set(x, "projectConfig", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
