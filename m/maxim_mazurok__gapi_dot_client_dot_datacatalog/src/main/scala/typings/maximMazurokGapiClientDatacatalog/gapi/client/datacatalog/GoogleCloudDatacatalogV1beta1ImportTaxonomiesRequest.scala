package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest extends js.Object {
  
  /** Inline source used for taxonomies to be imported. */
  var inlineSource: js.UndefOr[GoogleCloudDatacatalogV1beta1InlineSource] = js.native
}
object GoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1ImportTaxonomiesRequestOps[Self <: GoogleCloudDatacatalogV1beta1ImportTaxonomiesRequest] (val x: Self) extends AnyVal {
    
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
    def setInlineSource(value: GoogleCloudDatacatalogV1beta1InlineSource): Self = this.set("inlineSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineSource: Self = this.set("inlineSource", js.undefined)
  }
}
