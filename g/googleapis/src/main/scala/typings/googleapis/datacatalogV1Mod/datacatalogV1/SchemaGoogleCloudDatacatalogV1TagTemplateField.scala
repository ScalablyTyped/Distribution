package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1TagTemplateField extends StObject {
  
  /**
    * The description for this field. Defaults to an empty string.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name for this field. Defaults to an empty string. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can't start or end with spaces. The maximum length is 200 characters.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, this field is required. Defaults to false.
    */
  var isRequired: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The resource name of the tag template field in URL format. Example: `projects/{PROJECT_ID\}/locations/{LOCATION\}/tagTemplates/{TAG_TEMPLATE\}/fields/{FIELD\}` Note: The tag template field itself might not be stored in the location specified in its name. The name must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_), and must start with a letter or underscore. The maximum length is 64 characters.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The order of this field with respect to other fields in this tag template. For example, a higher value can indicate a more important field. The value can be negative. Multiple fields can have the same order and field orders within a tag don't have to be sequential.
    */
  var order: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The type of value this tag field can contain.
    */
  var `type`: js.UndefOr[SchemaGoogleCloudDatacatalogV1FieldType] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1TagTemplateField {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1TagTemplateField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1TagTemplateField]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1TagTemplateField](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    inline def setIsRequiredNull: Self = StObject.set(x, "isRequired", null)
    
    inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setType(value: SchemaGoogleCloudDatacatalogV1FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
