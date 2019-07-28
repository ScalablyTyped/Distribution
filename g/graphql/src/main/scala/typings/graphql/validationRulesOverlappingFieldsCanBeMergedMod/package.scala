package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validationRulesOverlappingFieldsCanBeMergedMod {
  // Field name and reason.
  type ConflictReason = js.Tuple2[String, String]
  // Reason is a string, or a nested list of conflicts.
  type ConflictReasonMessage = String | js.Array[ConflictReason]
}
