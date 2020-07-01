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
  def apply(
    backgroundColor: SchemaOptionalColor = null,
    borderBottom: SchemaTableCellBorder = null,
    borderLeft: SchemaTableCellBorder = null,
    borderRight: SchemaTableCellBorder = null,
    borderTop: SchemaTableCellBorder = null,
    columnSpan: js.UndefOr[Double] = js.undefined,
    contentAlignment: String = null,
    paddingBottom: SchemaDimension = null,
    paddingLeft: SchemaDimension = null,
    paddingRight: SchemaDimension = null,
    paddingTop: SchemaDimension = null,
    rowSpan: js.UndefOr[Double] = js.undefined
  ): SchemaTableCellStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom.asInstanceOf[js.Any])
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft.asInstanceOf[js.Any])
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight.asInstanceOf[js.Any])
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop.asInstanceOf[js.Any])
    if (!js.isUndefined(columnSpan)) __obj.updateDynamic("columnSpan")(columnSpan.get.asInstanceOf[js.Any])
    if (contentAlignment != null) __obj.updateDynamic("contentAlignment")(contentAlignment.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableCellStyle]
  }
}

