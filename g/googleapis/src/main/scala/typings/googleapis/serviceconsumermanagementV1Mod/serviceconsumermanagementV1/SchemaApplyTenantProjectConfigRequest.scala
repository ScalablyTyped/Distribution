package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to apply configuration to an existing tenant project.
  */
@js.native
trait SchemaApplyTenantProjectConfigRequest extends StObject {
  
  /**
    * Configuration that should be applied to the existing tenant project.
    */
  var projectConfig: js.UndefOr[SchemaTenantProjectConfig] = js.native
  
  /**
    * Tag of the project. Must be less than 128 characters. Required.
    */
  var tag: js.UndefOr[String] = js.native
}
object SchemaApplyTenantProjectConfigRequest {
  
  @scala.inline
  def apply(): SchemaApplyTenantProjectConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplyTenantProjectConfigRequest]
  }
  
  @scala.inline
  implicit class SchemaApplyTenantProjectConfigRequestMutableBuilder[Self <: SchemaApplyTenantProjectConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectConfig(value: SchemaTenantProjectConfig): Self = StObject.set(x, "projectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectConfigUndefined: Self = StObject.set(x, "projectConfig", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
