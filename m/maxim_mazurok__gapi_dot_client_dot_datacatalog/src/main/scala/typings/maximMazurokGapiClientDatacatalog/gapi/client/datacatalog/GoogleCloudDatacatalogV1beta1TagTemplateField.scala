package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1TagTemplateField extends js.Object {
  
  /** The description for this field. Defaults to an empty string. */
  var description: js.UndefOr[String] = js.native
  
  /** The display name for this field. Defaults to an empty string. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Whether this is a required field. Defaults to false. */
  var isRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. The resource name of the tag template field in URL format. Example: * projects/{project_id}/locations/{location}/tagTemplates/{tag_template}/fields/{field} Note that
    * this TagTemplateField may not actually be stored in the location in this name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The order of this field with respect to other fields in this tag template. A higher value indicates a more important field. The value can be negative. Multiple fields can have the
    * same order, and field orders within a tag do not have to be sequential.
    */
  var order: js.UndefOr[Double] = js.native
  
  /** Required. The type of value this tag field can contain. */
  var `type`: js.UndefOr[GoogleCloudDatacatalogV1beta1FieldType] = js.native
}
object GoogleCloudDatacatalogV1beta1TagTemplateField {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1TagTemplateField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1TagTemplateField]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1TagTemplateFieldOps[Self <: GoogleCloudDatacatalogV1beta1TagTemplateField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = this.set("isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRequired: Self = this.set("isRequired", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setType(value: GoogleCloudDatacatalogV1beta1FieldType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
