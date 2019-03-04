package typings
package lovefieldLib.lovefieldMod.lfNs.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITable extends js.Object {
  def as(name: java.lang.String): Table
  def createRow(value: js.Object): lovefieldLib.lovefieldMod.lfNs.Row
  def getName(): java.lang.String
}

object ITable {
  @scala.inline
  def apply(
    as: js.Function1[java.lang.String, Table],
    createRow: js.Function1[js.Object, lovefieldLib.lovefieldMod.lfNs.Row],
    getName: js.Function0[java.lang.String]
  ): ITable = {
    val __obj = js.Dynamic.literal(as = as, createRow = createRow, getName = getName)
  
    __obj.asInstanceOf[ITable]
  }
}

