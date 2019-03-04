package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultikeyForeignConstraintBuilder extends js.Object {
  def references(columnNames: js.Array[java.lang.String]): ReferencingColumnBuilder
}

object MultikeyForeignConstraintBuilder {
  @scala.inline
  def apply(references: js.Function1[js.Array[java.lang.String], ReferencingColumnBuilder]): MultikeyForeignConstraintBuilder = {
    val __obj = js.Dynamic.literal(references = references)
  
    __obj.asInstanceOf[MultikeyForeignConstraintBuilder]
  }
}

