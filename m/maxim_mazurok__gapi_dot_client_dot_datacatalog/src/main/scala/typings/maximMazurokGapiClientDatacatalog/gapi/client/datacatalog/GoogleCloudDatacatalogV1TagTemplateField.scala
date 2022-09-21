package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1TagTemplateField extends StObject {
  
  /** The description for this field. Defaults to an empty string. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The display name for this field. Defaults to an empty string. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can't start or
    * end with spaces. The maximum length is 200 characters.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** If true, this field is required. Defaults to false. */
  var isRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. The resource name of the tag template field in URL format. Example: `projects/{PROJECT_ID}/locations/{LOCATION}/tagTemplates/{TAG_TEMPLATE}/fields/{FIELD}` Note: The
    * tag template field itself might not be stored in the location specified in its name. The name must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_), and must start
    * with a letter or underscore. The maximum length is 64 characters.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The order of this field with respect to other fields in this tag template. For example, a higher value can indicate a more important field. The value can be negative. Multiple
    * fields can have the same order and field orders within a tag don't have to be sequential.
    */
  var order: js.UndefOr[Double] = js.undefined
  
  /** Required. The type of value this tag field can contain. */
  var `type`: js.UndefOr[GoogleCloudDatacatalogV1FieldType] = js.undefined
}
object GoogleCloudDatacatalogV1TagTemplateField {
  
  inline def apply(): GoogleCloudDatacatalogV1TagTemplateField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1TagTemplateField]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1TagTemplateField](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setType(value: GoogleCloudDatacatalogV1FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
