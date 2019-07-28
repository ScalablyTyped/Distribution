package typings.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Added extends js.Object {
  var added: Double
  var fileDeleted: Boolean
  var matched: Double
  var unchecked: Double
  var unmatched: Double
  var updated: Double
}

object Anon_Added {
  @scala.inline
  def apply(
    added: Double,
    fileDeleted: Boolean,
    matched: Double,
    unchecked: Double,
    unmatched: Double,
    updated: Double
  ): Anon_Added = {
    val __obj = js.Dynamic.literal(added = added, fileDeleted = fileDeleted, matched = matched, unchecked = unchecked, unmatched = unmatched, updated = updated)
  
    __obj.asInstanceOf[Anon_Added]
  }
}

