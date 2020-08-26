package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDatafeedsCustomBatchResponse extends js.Object {
  /**
    * The result of the execution of the batch requests.
    */
  var entries: js.UndefOr[js.Array[SchemaDatafeedsCustomBatchResponseEntry]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#datafeedsCustomBatchResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDatafeedsCustomBatchResponse {
  @scala.inline
  def apply(): SchemaDatafeedsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedsCustomBatchResponse]
  }
  @scala.inline
  implicit class SchemaDatafeedsCustomBatchResponseOps[Self <: SchemaDatafeedsCustomBatchResponse] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: SchemaDatafeedsCustomBatchResponseEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[SchemaDatafeedsCustomBatchResponseEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

