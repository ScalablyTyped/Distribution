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
    as: java.lang.String => Table,
    createRow: js.Object => lovefieldLib.lovefieldMod.lfNs.Row,
    getName: () => java.lang.String
  ): ITable = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), createRow = js.Any.fromFunction1(createRow), getName = js.Any.fromFunction0(getName))
  
    __obj.asInstanceOf[ITable]
  }
}

