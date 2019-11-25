package typings.atJestTestDashResult.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotSummary extends js.Object {
  var added: Double
  var didUpdate: Boolean
  var failure: Boolean
  var filesAdded: Double
  var filesRemoved: Double
  var filesRemovedList: js.Array[String]
  var filesUnmatched: Double
  var filesUpdated: Double
  var matched: Double
  var total: Double
  var unchecked: Double
  var uncheckedKeysByFile: js.Array[UncheckedSnapshot]
  var unmatched: Double
  var updated: Double
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
}

