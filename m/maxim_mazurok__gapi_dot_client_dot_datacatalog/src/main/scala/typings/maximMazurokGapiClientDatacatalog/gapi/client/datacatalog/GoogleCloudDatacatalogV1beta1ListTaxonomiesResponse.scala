package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1ListTaxonomiesResponse extends js.Object {
  
  /** Token used to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Taxonomies that the project contains. */
  var taxonomies: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1Taxonomy]] = js.native
}
object GoogleCloudDatacatalogV1beta1ListTaxonomiesResponse {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1ListTaxonomiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1ListTaxonomiesResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1ListTaxonomiesResponseOps[Self <: GoogleCloudDatacatalogV1beta1ListTaxonomiesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTaxonomiesVarargs(value: GoogleCloudDatacatalogV1beta1Taxonomy*): Self = this.set("taxonomies", js.Array(value :_*))
    
    @scala.inline
    def setTaxonomies(value: js.Array[GoogleCloudDatacatalogV1beta1Taxonomy]): Self = this.set("taxonomies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxonomies: Self = this.set("taxonomies", js.undefined)
  }
}
