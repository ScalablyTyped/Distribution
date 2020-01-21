package typings.jestReporters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdded extends js.Object {
  var added: Double
  var fileDeleted: Boolean
  var matched: Double
  var unchecked: Double
  var uncheckedKeys: js.Array[String]
  var unmatched: Double
  var updated: Double
}

object AnonAdded {
  @scala.inline
  def apply(
    added: Double,
    fileDeleted: Boolean,
    matched: Double,
    unchecked: Double,
    uncheckedKeys: js.Array[String],
    unmatched: Double,
    updated: Double
  ): AnonAdded = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], fileDeleted = fileDeleted.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], unchecked = unchecked.asInstanceOf[js.Any], uncheckedKeys = uncheckedKeys.asInstanceOf[js.Any], unmatched = unmatched.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdded]
  }
}

