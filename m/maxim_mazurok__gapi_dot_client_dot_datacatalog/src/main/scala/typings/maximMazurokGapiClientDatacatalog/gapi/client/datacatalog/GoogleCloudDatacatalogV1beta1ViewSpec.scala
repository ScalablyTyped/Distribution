package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1ViewSpec extends js.Object {
  
  /** Output only. The query that defines the table view. */
  var viewQuery: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1ViewSpec {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1ViewSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1ViewSpec]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1ViewSpecOps[Self <: GoogleCloudDatacatalogV1beta1ViewSpec] (val x: Self) extends AnyVal {
    
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
    def setViewQuery(value: String): Self = this.set("viewQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewQuery: Self = this.set("viewQuery", js.undefined)
  }
}
