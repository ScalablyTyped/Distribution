package typings.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list of all clusters in a project.
  */
@js.native
trait SchemaListClustersResponse extends js.Object {
  /**
    * Output only. The clusters in the project.
    */
  var clusters: js.UndefOr[js.Array[SchemaCluster]] = js.native
  /**
    * Output only. This token is included in the response if there are more
    * results to fetch. To fetch additional results, provide this value as the
    * page_token in a subsequent ListClustersRequest.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListClustersResponse {
  @scala.inline
  def apply(): SchemaListClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClustersResponse]
  }
  @scala.inline
  implicit class SchemaListClustersResponseOps[Self <: SchemaListClustersResponse] (val x: Self) extends AnyVal {
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
    def setClustersVarargs(value: SchemaCluster*): Self = this.set("clusters", js.Array(value :_*))
    @scala.inline
    def setClusters(value: js.Array[SchemaCluster]): Self = this.set("clusters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusters: Self = this.set("clusters", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

