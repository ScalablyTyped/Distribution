package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListDomainsResponse extends js.Object {
  /**
    * The list of domains, if any exist.
    */
  var domains: js.UndefOr[js.Array[SchemaDomain]] = js.native
  /**
    * The pagination token, if more results exist.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDomainsResponse {
  @scala.inline
  def apply(): SchemaListDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDomainsResponse]
  }
  @scala.inline
  implicit class SchemaListDomainsResponseOps[Self <: SchemaListDomainsResponse] (val x: Self) extends AnyVal {
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
    def setDomainsVarargs(value: SchemaDomain*): Self = this.set("domains", js.Array(value :_*))
    @scala.inline
    def setDomains(value: js.Array[SchemaDomain]): Self = this.set("domains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomains: Self = this.set("domains", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

