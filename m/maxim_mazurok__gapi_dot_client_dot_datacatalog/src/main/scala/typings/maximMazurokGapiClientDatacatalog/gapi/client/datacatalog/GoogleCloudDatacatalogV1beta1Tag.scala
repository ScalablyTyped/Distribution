package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1Tag extends StObject {
  
  /**
    * Resources like Entry can have schemas associated with them. This scope allows users to attach tags to an individual column based on that schema. For attaching a tag to a nested
    * column, use `.` to separate the column names. Example: * `outer_column.inner_column`
    */
  var column: js.UndefOr[String] = js.undefined
  
  /**
    * Required. This maps the ID of a tag field to the value of and additional information about that field. Valid field IDs are defined by the tag's template. A tag must have at least 1
    * field and at most 500 fields.
    */
  var fields: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.datacatalog.gapi.client.datacatalog.GoogleCloudDatacatalogV1beta1TagField}
    */ typings.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.GoogleCloudDatacatalogV1beta1Tag & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * The resource name of the tag in URL format. Example: * projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}/tags/{tag_id} where `tag_id` is a
    * system-generated identifier. Note that this Tag may not actually be stored in the location in this name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the tag template that this tag uses. Example: * projects/{project_id}/locations/{location}/tagTemplates/{tag_template_id} This field cannot be
    * modified after creation.
    */
  var template: js.UndefOr[String] = js.undefined
  
  /** Output only. The display name of the tag template. */
  var templateDisplayName: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1beta1Tag {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1Tag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1Tag]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1TagMutableBuilder[Self <: GoogleCloudDatacatalogV1beta1Tag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setFields(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.datacatalog.gapi.client.datacatalog.GoogleCloudDatacatalogV1beta1TagField}
      */ typings.maximMazurokGapiClientDatacatalog.maximMazurokGapiClientDatacatalogStrings.GoogleCloudDatacatalogV1beta1Tag & TopLevel[js.Any]
    ): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateDisplayName(value: String): Self = StObject.set(x, "templateDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateDisplayNameUndefined: Self = StObject.set(x, "templateDisplayName", js.undefined)
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
