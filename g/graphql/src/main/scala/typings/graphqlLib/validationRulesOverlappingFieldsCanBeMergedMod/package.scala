package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validationRulesOverlappingFieldsCanBeMergedMod {
  // Field name and reason.
  type ConflictReason = js.Tuple2[java.lang.String, java.lang.String]
  // Reason is a string, or a nested list of conflicts.
  type ConflictReasonMessage = java.lang.String | js.Array[ConflictReason]
}
