package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1Tag extends StObject {
  
  /**
    * Resources like entry can have schemas associated with them. This scope allows you to attach tags to an individual column based on that schema. To attach a tag to a nested column, separate column names with a dot (`.`). Example: `column.nested_column`.
    */
  var column: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Maps the ID of a tag field to its value and additional information about that field. Tag template defines valid field IDs. A tag must have at least 1 field and at most 500 fields.
    */
  var fields: js.UndefOr[StringDictionary[SchemaGoogleCloudDatacatalogV1TagField] | Null] = js.undefined
  
  /**
    * The resource name of the tag in URL format where tag ID is a system-generated identifier. Note: The tag itself might not be stored in the location specified in its name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The resource name of the tag template this tag uses. Example: `projects/{PROJECT_ID\}/locations/{LOCATION\}/tagTemplates/{TAG_TEMPLATE_ID\}` This field cannot be modified after creation.
    */
  var template: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The display name of the tag template.
    */
  var templateDisplayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1Tag {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1Tag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1Tag]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1Tag](x: Self) {
    
    inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnNull: Self = StObject.set(x, "column", null)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setFields(value: StringDictionary[SchemaGoogleCloudDatacatalogV1TagField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateDisplayName(value: String): Self = StObject.set(x, "templateDisplayName", value.asInstanceOf[js.Any])
    
    inline def setTemplateDisplayNameNull: Self = StObject.set(x, "templateDisplayName", null)
    
    inline def setTemplateDisplayNameUndefined: Self = StObject.set(x, "templateDisplayName", js.undefined)
    
    inline def setTemplateNull: Self = StObject.set(x, "template", null)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
