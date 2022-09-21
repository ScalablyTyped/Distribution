package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1TagTemplateField extends StObject {
  
  /**
    * The description for this field. Defaults to an empty string.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name for this field. Defaults to an empty string.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this is a required field. Defaults to false.
    */
  var isRequired: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The resource name of the tag template field in URL format. Example: * projects/{project_id\}/locations/{location\}/tagTemplates/{tag_template\}/fields/{field\} Note that this TagTemplateField may not actually be stored in the location in this name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The order of this field with respect to other fields in this tag template. A higher value indicates a more important field. The value can be negative. Multiple fields can have the same order, and field orders within a tag do not have to be sequential.
    */
  var order: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The type of value this tag field can contain.
    */
  var `type`: js.UndefOr[SchemaGoogleCloudDatacatalogV1beta1FieldType] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1TagTemplateField {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1TagTemplateField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1TagTemplateField]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1TagTemplateField](x: Self) {
    
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
    
    inline def setType(value: SchemaGoogleCloudDatacatalogV1beta1FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
