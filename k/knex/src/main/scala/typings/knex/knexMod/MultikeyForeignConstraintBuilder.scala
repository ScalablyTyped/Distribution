package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultikeyForeignConstraintBuilder extends js.Object {
  def references(columnNames: js.Array[String]): ReferencingColumnBuilder
}

object MultikeyForeignConstraintBuilder {
  @scala.inline
  def apply(references: js.Array[String] => ReferencingColumnBuilder): MultikeyForeignConstraintBuilder = {
    val __obj = js.Dynamic.literal(references = js.Any.fromFunction1(references))
  
    __obj.asInstanceOf[MultikeyForeignConstraintBuilder]
  }
}

