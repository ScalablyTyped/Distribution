package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1TagTemplate extends StObject {
  
  /**
    * The display name for this template. Defaults to an empty string.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Map of tag template field IDs to the settings for the field. This map is an exhaustive list of the allowed fields. This map must contain at least one field and at most 500 fields. The keys to this map are tag template field IDs. Field IDs can contain letters (both uppercase and lowercase), numbers (0-9) and underscores (_). Field IDs must be at least 1 character long and at most 64 characters long. Field IDs must start with a letter or underscore.
    */
  var fields: js.UndefOr[StringDictionary[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField] | Null] = js.undefined
  
  /**
    * The resource name of the tag template in URL format. Example: * projects/{project_id\}/locations/{location\}/tagTemplates/{tag_template_id\} Note that this TagTemplate and its child resources may not actually be stored in the location in this name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1TagTemplate {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1TagTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1TagTemplate]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1TagTemplate](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFields(value: StringDictionary[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
