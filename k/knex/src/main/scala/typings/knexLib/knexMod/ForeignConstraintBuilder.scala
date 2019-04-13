package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForeignConstraintBuilder extends js.Object {
  def references(columnName: java.lang.String): ReferencingColumnBuilder
}

object ForeignConstraintBuilder {
  @scala.inline
  def apply(references: java.lang.String => ReferencingColumnBuilder): ForeignConstraintBuilder = {
    val __obj = js.Dynamic.literal(references = js.Any.fromFunction1(references))
  
    __obj.asInstanceOf[ForeignConstraintBuilder]
  }
}

