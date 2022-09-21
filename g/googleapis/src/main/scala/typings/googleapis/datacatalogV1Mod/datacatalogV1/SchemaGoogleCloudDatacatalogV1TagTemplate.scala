package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1TagTemplate extends StObject {
  
  /**
    * Display name for this template. Defaults to an empty string. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can't start or end with spaces. The maximum length is 200 characters.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Map of tag template field IDs to the settings for the field. This map is an exhaustive list of the allowed fields. The map must contain at least one field and at most 500 fields. The keys to this map are tag template field IDs. The IDs have the following limitations: * Can contain uppercase and lowercase letters, numbers (0-9) and underscores (_). * Must be at least 1 character and at most 64 characters long. * Must start with a letter or underscore.
    */
  var fields: js.UndefOr[StringDictionary[SchemaGoogleCloudDatacatalogV1TagTemplateField] | Null] = js.undefined
  
  /**
    * Indicates whether tags created with this template are public. Public tags do not require tag template access to appear in ListTags API response. Additionally, you can search for a public tag by value with a simple search query in addition to using a ``tag:`` predicate.
    */
  var isPubliclyReadable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The resource name of the tag template in URL format. Note: The tag template itself and its child resources might not be stored in the location specified in its name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1TagTemplate {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1TagTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1TagTemplate]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1TagTemplate](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFields(value: StringDictionary[SchemaGoogleCloudDatacatalogV1TagTemplateField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setIsPubliclyReadable(value: Boolean): Self = StObject.set(x, "isPubliclyReadable", value.asInstanceOf[js.Any])
    
    inline def setIsPubliclyReadableNull: Self = StObject.set(x, "isPubliclyReadable", null)
    
    inline def setIsPubliclyReadableUndefined: Self = StObject.set(x, "isPubliclyReadable", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
