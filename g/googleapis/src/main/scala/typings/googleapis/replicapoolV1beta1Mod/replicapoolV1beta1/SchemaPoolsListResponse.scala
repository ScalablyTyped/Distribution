package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPoolsListResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.native
  var resources: js.UndefOr[js.Array[SchemaPool]] = js.native
}

object SchemaPoolsListResponse {
  @scala.inline
  def apply(): SchemaPoolsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoolsListResponse]
  }
  @scala.inline
  implicit class SchemaPoolsListResponseOps[Self <: SchemaPoolsListResponse] (val x: Self) extends AnyVal {
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
    def setResourcesVarargs(value: SchemaPool*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[SchemaPool]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
  }
  
}

