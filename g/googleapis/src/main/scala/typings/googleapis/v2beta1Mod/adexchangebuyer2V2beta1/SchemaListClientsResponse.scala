package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListClientsResponse extends js.Object {
  /**
    * The returned list of clients.
    */
  var clients: js.UndefOr[js.Array[SchemaClient]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListClientsRequest.pageToken field in the subsequent call to the
    * accounts.clients.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListClientsResponse {
  @scala.inline
  def apply(): SchemaListClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClientsResponse]
  }
  @scala.inline
  implicit class SchemaListClientsResponseOps[Self <: SchemaListClientsResponse] (val x: Self) extends AnyVal {
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
    def setClientsVarargs(value: SchemaClient*): Self = this.set("clients", js.Array(value :_*))
    @scala.inline
    def setClients(value: js.Array[SchemaClient]): Self = this.set("clients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClients: Self = this.set("clients", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

