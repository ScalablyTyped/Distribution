package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForeignConstraintBuilder extends js.Object {
  def references(columnName: String): ReferencingColumnBuilder
}

object ForeignConstraintBuilder {
  @scala.inline
  def apply(references: String => ReferencingColumnBuilder): ForeignConstraintBuilder = {
    val __obj = js.Dynamic.literal(references = js.Any.fromFunction1(references))
  
    __obj.asInstanceOf[ForeignConstraintBuilder]
  }
}

