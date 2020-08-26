package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Firestore.Commit.
  */
@js.native
trait SchemaCommitResponse extends js.Object {
  /**
    * The time at which the commit occurred.
    */
  var commitTime: js.UndefOr[String] = js.native
  /**
    * The result of applying the writes.  This i-th write result corresponds to
    * the i-th write in the request.
    */
  var writeResults: js.UndefOr[js.Array[SchemaWriteResult]] = js.native
}

object SchemaCommitResponse {
  @scala.inline
  def apply(): SchemaCommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitResponse]
  }
  @scala.inline
  implicit class SchemaCommitResponseOps[Self <: SchemaCommitResponse] (val x: Self) extends AnyVal {
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
    def setCommitTime(value: String): Self = this.set("commitTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitTime: Self = this.set("commitTime", js.undefined)
    @scala.inline
    def setWriteResultsVarargs(value: SchemaWriteResult*): Self = this.set("writeResults", js.Array(value :_*))
    @scala.inline
    def setWriteResults(value: js.Array[SchemaWriteResult]): Self = this.set("writeResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteResults: Self = this.set("writeResults", js.undefined)
  }
  
}

