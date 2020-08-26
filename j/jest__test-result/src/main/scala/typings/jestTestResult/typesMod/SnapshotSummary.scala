package typings.jestTestResult.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotSummary extends js.Object {
  var added: Double = js.native
  var didUpdate: Boolean = js.native
  var failure: Boolean = js.native
  var filesAdded: Double = js.native
  var filesRemoved: Double = js.native
  var filesRemovedList: js.Array[String] = js.native
  var filesUnmatched: Double = js.native
  var filesUpdated: Double = js.native
  var matched: Double = js.native
  var total: Double = js.native
  var unchecked: Double = js.native
  var uncheckedKeysByFile: js.Array[UncheckedSnapshot] = js.native
  var unmatched: Double = js.native
  var updated: Double = js.native
}

object SnapshotSummary {
  @scala.inline
  def apply(
    added: Double,
    didUpdate: Boolean,
    failure: Boolean,
    filesAdded: Double,
    filesRemoved: Double,
    filesRemovedList: js.Array[String],
    filesUnmatched: Double,
    filesUpdated: Double,
    matched: Double,
    total: Double,
    unchecked: Double,
    uncheckedKeysByFile: js.Array[UncheckedSnapshot],
    unmatched: Double,
    updated: Double
  ): SnapshotSummary = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], didUpdate = didUpdate.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], filesAdded = filesAdded.asInstanceOf[js.Any], filesRemoved = filesRemoved.asInstanceOf[js.Any], filesRemovedList = filesRemovedList.asInstanceOf[js.Any], filesUnmatched = filesUnmatched.asInstanceOf[js.Any], filesUpdated = filesUpdated.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], unchecked = unchecked.asInstanceOf[js.Any], uncheckedKeysByFile = uncheckedKeysByFile.asInstanceOf[js.Any], unmatched = unmatched.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotSummary]
  }
  @scala.inline
  implicit class SnapshotSummaryOps[Self <: SnapshotSummary] (val x: Self) extends AnyVal {
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
    def setAdded(value: Double): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def setDidUpdate(value: Boolean): Self = this.set("didUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailure(value: Boolean): Self = this.set("failure", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesAdded(value: Double): Self = this.set("filesAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesRemoved(value: Double): Self = this.set("filesRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesRemovedListVarargs(value: String*): Self = this.set("filesRemovedList", js.Array(value :_*))
    @scala.inline
    def setFilesRemovedList(value: js.Array[String]): Self = this.set("filesRemovedList", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesUnmatched(value: Double): Self = this.set("filesUnmatched", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesUpdated(value: Double): Self = this.set("filesUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatched(value: Double): Self = this.set("matched", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnchecked(value: Double): Self = this.set("unchecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setUncheckedKeysByFileVarargs(value: UncheckedSnapshot*): Self = this.set("uncheckedKeysByFile", js.Array(value :_*))
    @scala.inline
    def setUncheckedKeysByFile(value: js.Array[UncheckedSnapshot]): Self = this.set("uncheckedKeysByFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnmatched(value: Double): Self = this.set("unmatched", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: Double): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
  
}

