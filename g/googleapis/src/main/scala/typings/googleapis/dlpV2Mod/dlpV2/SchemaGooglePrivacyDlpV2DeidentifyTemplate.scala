package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The DeidentifyTemplates contains instructions on how to deidentify content.
  * See https://cloud.google.com/dlp/docs/concepts-templates to learn more.
  */
trait SchemaGooglePrivacyDlpV2DeidentifyTemplate extends StObject {
  
  /**
    * The creation timestamp of a inspectTemplate, output only field.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * ///////////// // The core content of the template  // ///////////////
    */
  var deidentifyConfig: js.UndefOr[SchemaGooglePrivacyDlpV2DeidentifyConfig] = js.undefined
  
  /**
    * Short description (max 256 chars).
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Display name (max 256 chars).
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The template name. Output only.  The template will have one of the
    * following formats: `projects/PROJECT_ID/deidentifyTemplates/TEMPLATE_ID`
    * OR `organizations/ORGANIZATION_ID/deidentifyTemplates/TEMPLATE_ID`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The last update timestamp of a inspectTemplate, output only field.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2DeidentifyTemplate {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DeidentifyTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeidentifyTemplate]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DeidentifyTemplateMutableBuilder[Self <: SchemaGooglePrivacyDlpV2DeidentifyTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDeidentifyConfig(value: SchemaGooglePrivacyDlpV2DeidentifyConfig): Self = StObject.set(x, "deidentifyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeidentifyConfigUndefined: Self = StObject.set(x, "deidentifyConfig", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
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
