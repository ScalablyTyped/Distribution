package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatacatalog.anon.FieldsKey
import typings.maximMazurokGapiClientDatacatalog.anon.Force
import typings.maximMazurokGapiClientDatacatalog.anon.Key
import typings.maximMazurokGapiClientDatacatalog.anon.KeyName
import typings.maximMazurokGapiClientDatacatalog.anon.NameOauthtoken
import typings.maximMazurokGapiClientDatacatalog.anon.TagTemplateFieldId
import typings.maximMazurokGapiClientDatacatalog.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldsResource extends StObject {
  
  def create(request: FieldsKey, body: GoogleCloudDatacatalogV1TagTemplateField): Request[GoogleCloudDatacatalogV1TagTemplateField] = js.native
  /**
    * Creates a field in a tag template. You must enable the Data Catalog API in the project identified by the `parent` parameter. For more information, see [Data Catalog resource
    * project](https://cloud.google.com/data-catalog/docs/concepts/resource-project).
    */
  def create(request: TagTemplateFieldId): Request[GoogleCloudDatacatalogV1TagTemplateField] = js.native
  
  /**
    * Deletes a field in a tag template and all uses of this field from the tags based on this template. You must enable the Data Catalog API in the project identified by the `name`
    * parameter. For more information, see [Data Catalog resource project](https://cloud.google.com/data-catalog/docs/concepts/resource-project).
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Force): Request[js.Object] = js.native
  
  var enumValues: EnumValuesResource = js.native
  
  /**
    * Updates a field in a tag template. You can't update the field type with this method. You must enable the Data Catalog API in the project identified by the `name` parameter. For more
    * information, see [Data Catalog resource project](https://cloud.google.com/data-catalog/docs/concepts/resource-project).
    */
  def patch(request: KeyName): Request[GoogleCloudDatacatalogV1TagTemplateField] = js.native
  def patch(request: UpdateMask, body: GoogleCloudDatacatalogV1TagTemplateField): Request[GoogleCloudDatacatalogV1TagTemplateField] = js.native
  
  def rename(request: Key, body: GoogleCloudDatacatalogV1RenameTagTemplateFieldRequest): Request[GoogleCloudDatacatalogV1TagTemplateField] = js.native
  /**
    * Renames a field in a tag template. You must enable the Data Catalog API in the project identified by the `name` parameter. For more information, see [Data Catalog resource project]
    * (https://cloud.google.com/data-catalog/docs/concepts/resource-project).
    */
  def rename(request: NameOauthtoken): Request[GoogleCloudDatacatalogV1TagTemplateField] = js.native
}
