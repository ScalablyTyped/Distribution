package typings.jexcel.mod

import typings.jexcel.jexcelStrings.autocomplete
import typings.jexcel.jexcelStrings.calendar
import typings.jexcel.jexcelStrings.center
import typings.jexcel.jexcelStrings.checkbox
import typings.jexcel.jexcelStrings.color
import typings.jexcel.jexcelStrings.dropdown
import typings.jexcel.jexcelStrings.hidden
import typings.jexcel.jexcelStrings.html
import typings.jexcel.jexcelStrings.image
import typings.jexcel.jexcelStrings.left
import typings.jexcel.jexcelStrings.numeric
import typings.jexcel.jexcelStrings.radio
import typings.jexcel.jexcelStrings.right
import typings.jexcel.jexcelStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Column extends js.Object {
  /**
    * Default: "center"
    */
  var align: js.UndefOr[center | left | right] = js.native
  var autocomplete: js.UndefOr[Boolean] = js.native
  var decimal: js.UndefOr[String] = js.native
  var editor: js.UndefOr[ColumnEditor] = js.native
  var mask: js.UndefOr[String] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[CellValue] = js.native
  var options: js.UndefOr[CalendarOptions] = js.native
  var primaryKey: js.UndefOr[Boolean] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var render: js.UndefOr[String] = js.native
  var source: js.UndefOr[js.Array[SourceValue]] = js.native
  var title: js.UndefOr[CellValue] = js.native
  /**
    * @see https://bossanova.uk/jexcel/v4/examples/column-types
    */
  var `type`: js.UndefOr[
    autocomplete | calendar | checkbox | color | dropdown | hidden | html | image | numeric | radio | text
  ] = js.native
  var url: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
  var wordWrap: js.UndefOr[Boolean] = js.native
}

object Column {
  @scala.inline
  def apply(): Column = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column]
  }
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
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
    def setAlign(value: center | left | right): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAutocomplete(value: Boolean): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutocomplete: Self = this.set("autocomplete", js.undefined)
    @scala.inline
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    @scala.inline
    def setEditor(value: ColumnEditor): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setName(value: CellValue): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptions(value: CalendarOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPrimaryKey(value: Boolean): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRender(value: String): Self = this.set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setSourceVarargs(value: SourceValue*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSource(value: js.Array[SourceValue]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTitle(value: CellValue): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(
      value: autocomplete | calendar | checkbox | color | dropdown | hidden | html | image | numeric | radio | text
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWordWrap(value: Boolean): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
  }
  
}

