package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Properties of a sheet.
  */
@js.native
trait SchemaSheetProperties extends js.Object {
  /**
    * Additional properties of the sheet if this sheet is a grid. (If the sheet
    * is an object sheet, containing a chart or image, then this field will be
    * absent.) When writing it is an error to set any grid properties on
    * non-grid sheets.
    */
  var gridProperties: js.UndefOr[SchemaGridProperties] = js.native
  /**
    * True if the sheet is hidden in the UI, false if it&#39;s visible.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * The index of the sheet within the spreadsheet. When adding or updating
    * sheet properties, if this field is excluded then the sheet is added or
    * moved to the end of the sheet list. When updating sheet indices or
    * inserting sheets, movement is considered in &quot;before the move&quot;
    * indexes. For example, if there were 3 sheets (S1, S2, S3) in order to
    * move S1 ahead of S2 the index would have to be set to 2. A sheet index
    * update request is ignored if the requested index is identical to the
    * sheets current index or if the requested new index is equal to the
    * current sheet index + 1.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * True if the sheet is an RTL sheet instead of an LTR sheet.
    */
  var rightToLeft: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the sheet. Must be non-negative. This field cannot be changed
    * once set.
    */
  var sheetId: js.UndefOr[Double] = js.native
  /**
    * The type of sheet. Defaults to GRID. This field cannot be changed once
    * set.
    */
  var sheetType: js.UndefOr[String] = js.native
  /**
    * The color of the tab in the UI.
    */
  var tabColor: js.UndefOr[SchemaColor] = js.native
  /**
    * The name of the sheet.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaSheetProperties {
  @scala.inline
  def apply(
    gridProperties: SchemaGridProperties = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    rightToLeft: js.UndefOr[Boolean] = js.undefined,
    sheetId: js.UndefOr[Double] = js.undefined,
    sheetType: String = null,
    tabColor: SchemaColor = null,
    title: String = null
  ): SchemaSheetProperties = {
    val __obj = js.Dynamic.literal()
    if (gridProperties != null) __obj.updateDynamic("gridProperties")(gridProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rightToLeft)) __obj.updateDynamic("rightToLeft")(rightToLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    if (sheetType != null) __obj.updateDynamic("sheetType")(sheetType.asInstanceOf[js.Any])
    if (tabColor != null) __obj.updateDynamic("tabColor")(tabColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSheetProperties]
  }
}

