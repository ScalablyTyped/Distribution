package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDatacatalog.anon.Accesstoken
import typings.maximMazurokGapiClientDatacatalog.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogResource extends StObject {
  
  /**
    * Searches Data Catalog for multiple resources like entries and tags that match a query. This is a [Custom Method] (https://cloud.google.com/apis/design/custom_methods) that doesn't
    * return all information on a resource, only its ID and high level fields. To get more information, you can subsequently call specific get methods. Note: Data Catalog search queries
    * don't guarantee full recall. Results that match your query might not be returned, even in subsequent result pages. Additionally, returned (and not returned) results can vary if you
    * repeat search queries. For more information, see [Data Catalog search syntax] (https://cloud.google.com/data-catalog/docs/how-to/search-reference).
    */
  def search(request: Accesstoken): Request[GoogleCloudDatacatalogV1SearchCatalogResponse] = js.native
  def search(request: Alt, body: GoogleCloudDatacatalogV1SearchCatalogRequest): Request[GoogleCloudDatacatalogV1SearchCatalogResponse] = js.native
}
