package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1TagTemplateField extends StObject {
  
  /** The description for this field. Defaults to an empty string. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The display name for this field. Defaults to an empty string. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Whether this is a required field. Defaults to false. */
  var isRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. The resource name of the tag template field in URL format. Example: * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field} Note that
    * this TagTemplateField may not actually be stored in the location in this name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The order of this field with respect to other fields in this tag template. A higher value indicates a more important field. The value can be negative. Multiple fields can have the
    * same order, and field orders within a tag do not have to be sequential.
    */
  var order: js.UndefOr[Double] = js.undefined
  
  /** Required. The type of value this tag field can contain. */
  var `type`: js.UndefOr[GoogleCloudDatacatalogV1beta1FieldType] = js.undefined
}
object GoogleCloudDatacatalogV1beta1TagTemplateField {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1TagTemplateField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1TagTemplateField]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1TagTemplateFieldMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1TagTemplateField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setType(value: GoogleCloudDatacatalogV1beta1FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
