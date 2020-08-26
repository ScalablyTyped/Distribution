package typings.googleapis.dnsV1Mod.dnsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDnsKeysListResponse extends js.Object {
  var dnsKeys: js.UndefOr[js.Array[SchemaDnsKey]] = js.native
  var header: js.UndefOr[SchemaResponseHeader] = js.native
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaDnsKeysListResponse {
  @scala.inline
  def apply(): SchemaDnsKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDnsKeysListResponse]
  }
  @scala.inline
  implicit class SchemaDnsKeysListResponseOps[Self <: SchemaDnsKeysListResponse] (val x: Self) extends AnyVal {
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
    def setDnsKeysVarargs(value: SchemaDnsKey*): Self = this.set("dnsKeys", js.Array(value :_*))
    @scala.inline
    def setDnsKeys(value: js.Array[SchemaDnsKey]): Self = this.set("dnsKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsKeys: Self = this.set("dnsKeys", js.undefined)
    @scala.inline
    def setHeader(value: SchemaResponseHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

