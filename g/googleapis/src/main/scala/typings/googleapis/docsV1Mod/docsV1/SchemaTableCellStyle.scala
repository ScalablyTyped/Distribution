package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The style of a TableCell.  Inherited table cell styles are represented as
  * unset fields in this message. A table cell style can inherit from the
  * table&#39;s style.
  */
@js.native
trait SchemaTableCellStyle extends js.Object {
  /**
    * The background color of the cell.
    */
  var backgroundColor: js.UndefOr[SchemaOptionalColor] = js.native
  /**
    * The bottom border of the cell.
    */
  var borderBottom: js.UndefOr[SchemaTableCellBorder] = js.native
  /**
    * The left border of the cell.
    */
  var borderLeft: js.UndefOr[SchemaTableCellBorder] = js.native
  /**
    * The right border of the cell.
    */
  var borderRight: js.UndefOr[SchemaTableCellBorder] = js.native
  /**
    * The top border of the cell.
    */
  var borderTop: js.UndefOr[SchemaTableCellBorder] = js.native
  /**
    * The column span of the cell. This property is read-only.
    */
  var columnSpan: js.UndefOr[Double] = js.native
  /**
    * The alignment of the content in the table cell. The default alignment
    * matches the alignment for newly created table cells in the Docs editor.
    */
  var contentAlignment: js.UndefOr[String] = js.native
  /**
    * The bottom padding of the cell.
    */
  var paddingBottom: js.UndefOr[SchemaDimension] = js.native
  /**
    * The left padding of the cell.
    */
  var paddingLeft: js.UndefOr[SchemaDimension] = js.native
  /**
    * The right padding of the cell.
    */
  var paddingRight: js.UndefOr[SchemaDimension] = js.native
  /**
    * The top padding of the cell.
    */
  var paddingTop: js.UndefOr[SchemaDimension] = js.native
  /**
    * The row span of the cell. This property is read-only.
    */
  var rowSpan: js.UndefOr[Double] = js.native
}

object SchemaTableCellStyle {
  @scala.inline
  def apply(): SchemaTableCellStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCellStyle]
  }
  @scala.inline
  implicit class SchemaTableCellStyleOps[Self <: SchemaTableCellStyle] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: SchemaOptionalColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderBottom(value: SchemaTableCellBorder): Self = this.set("borderBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottom: Self = this.set("borderBottom", js.undefined)
    @scala.inline
    def setBorderLeft(value: SchemaTableCellBorder): Self = this.set("borderLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeft: Self = this.set("borderLeft", js.undefined)
    @scala.inline
    def setBorderRight(value: SchemaTableCellBorder): Self = this.set("borderRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRight: Self = this.set("borderRight", js.undefined)
    @scala.inline
    def setBorderTop(value: SchemaTableCellBorder): Self = this.set("borderTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTop: Self = this.set("borderTop", js.undefined)
    @scala.inline
    def setColumnSpan(value: Double): Self = this.set("columnSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSpan: Self = this.set("columnSpan", js.undefined)
    @scala.inline
    def setContentAlignment(value: String): Self = this.set("contentAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentAlignment: Self = this.set("contentAlignment", js.undefined)
    @scala.inline
    def setPaddingBottom(value: SchemaDimension): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    @scala.inline
    def setPaddingLeft(value: SchemaDimension): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    @scala.inline
    def setPaddingRight(value: SchemaDimension): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    @scala.inline
    def setPaddingTop(value: SchemaDimension): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
  }
  
}

