package typings.lovefield.mod.schema

import org.scalablytyped.runtime.StringDictionary
import typings.lovefield.mod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined lovefield.lovefield.schema.ITable & {[index: string] : lovefield.lovefield.schema.Column} */
trait Table extends /* index */ StringDictionary[Column] {
  def as(name: String): Table
  def createRow(value: js.Object): Row
  def getName(): String
}

object Table {
  @scala.inline
  def apply(
    as: String => Table,
    createRow: js.Object => Row,
    getName: () => String,
    StringDictionary: /* index */ StringDictionary[Column] = null
  ): Table = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), createRow = js.Any.fromFunction1(createRow), getName = js.Any.fromFunction0(getName))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Table]
  }
}

