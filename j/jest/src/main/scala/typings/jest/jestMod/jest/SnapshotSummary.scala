package typings.jest.jestMod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotSummary extends js.Object {
  var added: Double
  var didUpdate: Boolean
  var failure: Boolean
  var filesAdded: Double
  var filesRemoved: Double
  var filesUnmatched: Double
  var filesUpdated: Double
  var matched: Double
  var total: Double
  var unchecked: Double
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
    filesUnmatched: Double,
    filesUpdated: Double,
    matched: Double,
    total: Double,
    unchecked: Double,
    unmatched: Double,
    updated: Double
  ): SnapshotSummary = {
    val __obj = js.Dynamic.literal(added = added, didUpdate = didUpdate, failure = failure, filesAdded = filesAdded, filesRemoved = filesRemoved, filesUnmatched = filesUnmatched, filesUpdated = filesUpdated, matched = matched, total = total, unchecked = unchecked, unmatched = unmatched, updated = updated)
  
    __obj.asInstanceOf[SnapshotSummary]
  }
}

