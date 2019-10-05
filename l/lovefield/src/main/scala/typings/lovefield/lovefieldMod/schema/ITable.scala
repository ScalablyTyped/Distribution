package typings.lovefield.lovefieldMod.schema

import typings.lovefield.lovefieldMod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITable extends js.Object {
  def as(name: String): Table
  def createRow(value: js.Object): Row
  def getName(): String
}

object ITable {
  @scala.inline
  def apply(as: String => Table, createRow: js.Object => Row, getName: () => String): ITable = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), createRow = js.Any.fromFunction1(createRow), getName = js.Any.fromFunction0(getName))
  
    __obj.asInstanceOf[ITable]
  }
}

