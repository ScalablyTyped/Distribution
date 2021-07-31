package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The inspectTemplate contains a configuration (set of types of sensitive
  * data to be detected) to be used anywhere you otherwise would normally
  * specify InspectConfig. See
  * https://cloud.google.com/dlp/docs/concepts-templates to learn more.
  */
trait SchemaGooglePrivacyDlpV2InspectTemplate extends StObject {
  
  /**
    * The creation timestamp of a inspectTemplate, output only field.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Short description (max 256 chars).
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Display name (max 256 chars).
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The core content of the template. Configuration of the scanning process.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.undefined
  
  /**
    * The template name. Output only.  The template will have one of the
    * following formats: `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR
    * `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The last update timestamp of a inspectTemplate, output only field.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2InspectTemplate {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectTemplate]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectTemplateMutableBuilder[Self <: SchemaGooglePrivacyDlpV2InspectTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setInspectConfig(value: SchemaGooglePrivacyDlpV2InspectConfig): Self = StObject.set(x, "inspectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectConfigUndefined: Self = StObject.set(x, "inspectConfig", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
