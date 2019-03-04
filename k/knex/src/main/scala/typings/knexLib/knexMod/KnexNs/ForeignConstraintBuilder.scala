package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForeignConstraintBuilder extends js.Object {
  def references(columnName: java.lang.String): ReferencingColumnBuilder
}

object ForeignConstraintBuilder {
  @scala.inline
  def apply(references: js.Function1[java.lang.String, ReferencingColumnBuilder]): ForeignConstraintBuilder = {
    val __obj = js.Dynamic.literal(references = references)
  
    __obj.asInstanceOf[ForeignConstraintBuilder]
  }
}

