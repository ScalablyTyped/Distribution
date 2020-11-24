package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRowAccessPoliciesResponse extends js.Object {
  
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Row access policies on the requested table. */
  var rowAccessPolicies: js.UndefOr[js.Array[RowAccessPolicy]] = js.native
}
object ListRowAccessPoliciesResponse {
  
  @scala.inline
  def apply(): ListRowAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRowAccessPoliciesResponse]
  }
  
  @scala.inline
  implicit class ListRowAccessPoliciesResponseOps[Self <: ListRowAccessPoliciesResponse] (val x: Self) extends AnyVal {
    
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
    def setRowAccessPoliciesVarargs(value: RowAccessPolicy*): Self = this.set("rowAccessPolicies", js.Array(value :_*))
    
    @scala.inline
    def setRowAccessPolicies(value: js.Array[RowAccessPolicy]): Self = this.set("rowAccessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowAccessPolicies: Self = this.set("rowAccessPolicies", js.undefined)
  }
}
