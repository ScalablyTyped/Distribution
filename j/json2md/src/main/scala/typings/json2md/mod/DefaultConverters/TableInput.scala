package typings.json2md.mod.DefaultConverters

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableInput extends js.Object {
  var headers: js.Array[String] = js.native
  var rows: js.Array[js.Array[String] | StringDictionary[String]] = js.native
}

object TableInput {
  @scala.inline
  def apply(headers: js.Array[String], rows: js.Array[js.Array[String] | StringDictionary[String]]): TableInput = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableInput]
  }
  @scala.inline
  implicit class TableInputOps[Self <: TableInput] (val x: Self) extends AnyVal {
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
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowsVarargs(value: (js.Array[String] | StringDictionary[String])*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[js.Array[String] | StringDictionary[String]]): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

