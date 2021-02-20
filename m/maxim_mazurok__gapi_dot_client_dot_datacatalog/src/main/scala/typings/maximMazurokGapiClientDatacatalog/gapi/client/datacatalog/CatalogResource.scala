package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatacatalog.anon.Accesstoken
import typings.maximMazurokGapiClientDatacatalog.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogResource extends StObject {
  
  /**
    * Searches Data Catalog for multiple resources like entries, tags that match a query. This is a custom method (https://cloud.google.com/apis/design/custom_methods) and does not return
    * the complete resource, only the resource identifier and high level fields. Clients can subsequentally call `Get` methods. Note that Data Catalog search queries do not guarantee full
    * recall. Query results that match your query may not be returned, even in subsequent result pages. Also note that results returned (and not returned) can vary across repeated search
    * queries. See [Data Catalog Search Syntax](https://cloud.google.com/data-catalog/docs/how-to/search-reference) for more information.
    */
  def search(request: Accesstoken): Request[GoogleCloudDatacatalogV1beta1SearchCatalogResponse] = js.native
  def search(request: Alt, body: GoogleCloudDatacatalogV1beta1SearchCatalogRequest): Request[GoogleCloudDatacatalogV1beta1SearchCatalogResponse] = js.native
}
