package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Site List Response
  */
@js.native
trait SchemaSitesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#sitesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Site collection.
    */
  var sites: js.UndefOr[js.Array[SchemaSite]] = js.native
}

object SchemaSitesListResponse {
  @scala.inline
  def apply(): SchemaSitesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSitesListResponse]
  }
  @scala.inline
  implicit class SchemaSitesListResponseOps[Self <: SchemaSitesListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setSitesVarargs(value: SchemaSite*): Self = this.set("sites", js.Array(value :_*))
    @scala.inline
    def setSites(value: js.Array[SchemaSite]): Self = this.set("sites", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSites: Self = this.set("sites", js.undefined)
  }
  
}

