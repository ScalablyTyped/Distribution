package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatacatalog.anon.AccesstokenAlt
import typings.maximMazurokGapiClientDatacatalog.anon.AltCallback
import typings.maximMazurokGapiClientDatacatalog.anon.Force
import typings.maximMazurokGapiClientDatacatalog.anon.Key
import typings.maximMazurokGapiClientDatacatalog.anon.PrettyPrint
import typings.maximMazurokGapiClientDatacatalog.anon.TagTemplateFieldId
import typings.maximMazurokGapiClientDatacatalog.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldsResource extends StObject {
  
  /**
    * Creates a field in a tag template. The user should enable the Data Catalog API in the project identified by the `parent` parameter (see [Data Catalog Resource
    * Project](https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
    */
  def create(request: TagTemplateFieldId): Request[GoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  def create(request: Xgafv, body: GoogleCloudDatacatalogV1beta1TagTemplateField): Request[GoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  
  /**
    * Deletes a field in a tag template and all uses of that field. Users should enable the Data Catalog API in the project identified by the `name` parameter (see [Data Catalog Resource
    * Project] (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Force): Request[js.Object] = js.native
  
  var enumValues: EnumValuesResource = js.native
  
  /**
    * Updates a field in a tag template. This method cannot be used to update the field type. Users should enable the Data Catalog API in the project identified by the `name` parameter
    * (see [Data Catalog Resource Project] (https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
    */
  def patch(request: AccesstokenAlt): Request[GoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  def patch(request: PrettyPrint, body: GoogleCloudDatacatalogV1beta1TagTemplateField): Request[GoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  
  /**
    * Renames a field in a tag template. The user should enable the Data Catalog API in the project identified by the `name` parameter (see [Data Catalog Resource
    * Project](https://cloud.google.com/data-catalog/docs/concepts/resource-project) for more information).
    */
  def rename(request: AltCallback): Request[GoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  def rename(request: Key, body: GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldRequest): Request[GoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
}
