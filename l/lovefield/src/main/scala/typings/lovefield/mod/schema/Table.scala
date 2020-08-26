package typings.lovefield.mod.schema

import org.scalablytyped.runtime.StringDictionary
import typings.lovefield.mod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined lovefield.lovefield.schema.ITable & {[index: string] : lovefield.lovefield.schema.Column} */
@js.native
trait Table extends /* index */ StringDictionary[Column] {
  def as(name: String): Table = js.native
  def createRow(value: js.Object): Row = js.native
  def getName(): String = js.native
}

object Table {
  @scala.inline
  def apply(as: String => Table, createRow: js.Object => Row, getName: () => String): Table = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), createRow = js.Any.fromFunction1(createRow), getName = js.Any.fromFunction0(getName))
    __obj.asInstanceOf[Table]
  }
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAs(value: String => Table): Self = this.set("as", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateRow(value: js.Object => Row): Self = this.set("createRow", js.Any.fromFunction1(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
  }
  
}

