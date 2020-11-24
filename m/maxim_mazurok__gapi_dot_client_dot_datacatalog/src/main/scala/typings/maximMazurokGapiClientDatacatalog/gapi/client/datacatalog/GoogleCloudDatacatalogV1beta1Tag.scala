package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1Tag extends js.Object {
  
  /**
    * Resources like Entry can have schemas associated with them. This scope allows users to attach tags to an individual column based on that schema. For attaching a tag to a nested
    * column, use `.` to separate the column names. Example: * `outer_column.inner_column`
    */
  var column: js.UndefOr[String] = js.native
  
  /**
    * Required. This maps the ID of a tag field to the value of and additional information about that field. Valid field IDs are defined by the tag's template. A tag must have at least 1
    * field and at most 500 fields.
    */
  var fields: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.datacatalog.gapi.client.datacatalog.GoogleCloudDatacatalogV1beta1TagField}
    */ typings.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.GoogleCloudDatacatalogV1beta1Tag with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The resource name of the tag in URL format. Example: * projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}/tags/{tag_id} where `tag_id` is a
    * system-generated identifier. Note that this Tag may not actually be stored in the location in this name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Required. The resource name of the tag template that this tag uses. Example: * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id} This field cannot be
    * modified after creation.
    */
  var template: js.UndefOr[String] = js.native
  
  /** Output only. The display name of the tag template. */
  var templateDisplayName: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1Tag {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1Tag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1Tag]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1TagOps[Self <: GoogleCloudDatacatalogV1beta1Tag] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setFields(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.datacatalog.gapi.client.datacatalog.GoogleCloudDatacatalogV1beta1TagField}
      */ typings.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.GoogleCloudDatacatalogV1beta1Tag with TopLevel[js.Any]
    ): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateDisplayName(value: String): Self = this.set("templateDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateDisplayName: Self = this.set("templateDisplayName", js.undefined)
  }
}
