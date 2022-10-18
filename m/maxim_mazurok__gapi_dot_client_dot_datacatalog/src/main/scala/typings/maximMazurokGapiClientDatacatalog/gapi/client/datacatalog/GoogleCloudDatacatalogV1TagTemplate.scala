package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1TagTemplate extends StObject {
  
  /**
    * Display name for this template. Defaults to an empty string. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can't start or
    * end with spaces. The maximum length is 200 characters.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Map of tag template field IDs to the settings for the field. This map is an exhaustive list of the allowed fields. The map must contain at least one field and at most 500
    * fields. The keys to this map are tag template field IDs. The IDs have the following limitations: * Can contain uppercase and lowercase letters, numbers (0-9) and underscores (_). *
    * Must be at least 1 character and at most 64 characters long. * Must start with a letter or underscore.
    */
  var fields: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.datacatalog.gapi.client.datacatalog.GoogleCloudDatacatalogV1TagTemplateField} */ js.Any
  ] = js.undefined
  
  /**
    * Indicates whether tags created with this template are public. Public tags do not require tag template access to appear in ListTags API response. Additionally, you can search for a
    * public tag by value with a simple search query in addition to using a ``tag:`` predicate.
    */
  var isPubliclyReadable: js.UndefOr[Boolean] = js.undefined
  
  /** The resource name of the tag template in URL format. Note: The tag template itself and its child resources might not be stored in the location specified in its name. */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1TagTemplate {
  
  inline def apply(): GoogleCloudDatacatalogV1TagTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1TagTemplate]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1TagTemplate](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFields(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.datacatalog.gapi.client.datacatalog.GoogleCloudDatacatalogV1TagTemplateField} */ js.Any
    ): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setIsPubliclyReadable(value: Boolean): Self = StObject.set(x, "isPubliclyReadable", value.asInstanceOf[js.Any])
    
    inline def setIsPubliclyReadableUndefined: Self = StObject.set(x, "isPubliclyReadable", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
