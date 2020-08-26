package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Styles that apply to a table row.
  */
@js.native
trait SchemaTableRowStyle extends js.Object {
  /**
    * The minimum height of the row. The row will be rendered in the Docs
    * editor at a height equal to or greater than this value in order to show
    * all the content in the row&#39;s cells.
    */
  var minRowHeight: js.UndefOr[SchemaDimension] = js.native
}

object SchemaTableRowStyle {
  @scala.inline
  def apply(): SchemaTableRowStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRowStyle]
  }
  @scala.inline
  implicit class SchemaTableRowStyleOps[Self <: SchemaTableRowStyle] (val x: Self) extends AnyVal {
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
    def setMinRowHeight(value: SchemaDimension): Self = this.set("minRowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRowHeight: Self = this.set("minRowHeight", js.undefined)
  }
  
}

