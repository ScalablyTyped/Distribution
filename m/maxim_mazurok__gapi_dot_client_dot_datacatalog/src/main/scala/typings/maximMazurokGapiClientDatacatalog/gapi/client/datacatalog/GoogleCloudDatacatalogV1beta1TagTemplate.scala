package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1TagTemplate extends StObject {
  
  /** The display name for this template. Defaults to an empty string. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Map of tag template field IDs to the settings for the field. This map is an exhaustive list of the allowed fields. This map must contain at least one field and at most 500
    * fields. The keys to this map are tag template field IDs. Field IDs can contain letters (both uppercase and lowercase), numbers (0-9) and underscores (_). Field IDs must be at least
    * 1 character long and at most 64 characters long. Field IDs must start with a letter or underscore.
    */
  var fields: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.datacatalog.gapi.client.datacatalog.GoogleCloudDatacatalogV1beta1TagTemplateField}
    */ typings.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.GoogleCloudDatacatalogV1beta1TagTemplate & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * The resource name of the tag template in URL format. Example: * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id} Note that this TagTemplate and its child
    * resources may not actually be stored in the location in this name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1beta1TagTemplate {
  
  inline def apply(): GoogleCloudDatacatalogV1beta1TagTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1TagTemplate]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1beta1TagTemplate](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFields(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.datacatalog.gapi.client.datacatalog.GoogleCloudDatacatalogV1beta1TagTemplateField}
      */ typings.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.GoogleCloudDatacatalogV1beta1TagTemplate & TopLevel[js.Any]
    ): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
