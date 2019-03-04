package typings
package jestDashCliLib.jestDashCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotSummary extends js.Object {
  var added: scala.Double
  var didUpdate: scala.Boolean
  var failure: scala.Boolean
  var filesAdded: scala.Double
  var filesRemoved: scala.Double
  var filesUnmatched: scala.Double
  var filesUpdated: scala.Double
  var matched: scala.Double
  var total: scala.Double
  var unchecked: scala.Double
  var uncheckedKeysByFile: js.Array[UncheckedSnapshot]
  var unmatched: scala.Double
  var updated: scala.Double
}

object SnapshotSummary {
  @scala.inline
  def apply(
    added: scala.Double,
    didUpdate: scala.Boolean,
    failure: scala.Boolean,
    filesAdded: scala.Double,
    filesRemoved: scala.Double,
    filesUnmatched: scala.Double,
    filesUpdated: scala.Double,
    matched: scala.Double,
    total: scala.Double,
    unchecked: scala.Double,
    uncheckedKeysByFile: js.Array[UncheckedSnapshot],
    unmatched: scala.Double,
    updated: scala.Double
  ): SnapshotSummary = {
    val __obj = js.Dynamic.literal(added = added, didUpdate = didUpdate, failure = failure, filesAdded = filesAdded, filesRemoved = filesRemoved, filesUnmatched = filesUnmatched, filesUpdated = filesUpdated, matched = matched, total = total, unchecked = unchecked, uncheckedKeysByFile = uncheckedKeysByFile, unmatched = unmatched, updated = updated)
  
    __obj.asInstanceOf[SnapshotSummary]
  }
}

