package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A sheet in a spreadsheet.
  */
@js.native
trait SchemaSheet extends js.Object {
  /**
    * The banded (alternating colors) ranges on this sheet.
    */
  var bandedRanges: js.UndefOr[js.Array[SchemaBandedRange]] = js.native
  /**
    * The filter on this sheet, if any.
    */
  var basicFilter: js.UndefOr[SchemaBasicFilter] = js.native
  /**
    * The specifications of every chart on this sheet.
    */
  var charts: js.UndefOr[js.Array[SchemaEmbeddedChart]] = js.native
  /**
    * All column groups on this sheet, ordered by increasing range start index,
    * then by group depth.
    */
  var columnGroups: js.UndefOr[js.Array[SchemaDimensionGroup]] = js.native
  /**
    * The conditional format rules in this sheet.
    */
  var conditionalFormats: js.UndefOr[js.Array[SchemaConditionalFormatRule]] = js.native
  /**
    * Data in the grid, if this is a grid sheet. The number of GridData objects
    * returned is dependent on the number of ranges requested on this sheet.
    * For example, if this is representing `Sheet1`, and the spreadsheet was
    * requested with ranges `Sheet1!A1:C10` and `Sheet1!D15:E20`, then the
    * first GridData will have a startRow/startColumn of `0`, while the second
    * one will have `startRow 14` (zero-based row 15), and `startColumn 3`
    * (zero-based column D).
    */
  var data: js.UndefOr[js.Array[SchemaGridData]] = js.native
  /**
    * The developer metadata associated with a sheet.
    */
  var developerMetadata: js.UndefOr[js.Array[SchemaDeveloperMetadata]] = js.native
  /**
    * The filter views in this sheet.
    */
  var filterViews: js.UndefOr[js.Array[SchemaFilterView]] = js.native
  /**
    * The ranges that are merged together.
    */
  var merges: js.UndefOr[js.Array[SchemaGridRange]] = js.native
  /**
    * The properties of the sheet.
    */
  var properties: js.UndefOr[SchemaSheetProperties] = js.native
  /**
    * The protected ranges in this sheet.
    */
  var protectedRanges: js.UndefOr[js.Array[SchemaProtectedRange]] = js.native
  /**
    * All row groups on this sheet, ordered by increasing range start index,
    * then by group depth.
    */
  var rowGroups: js.UndefOr[js.Array[SchemaDimensionGroup]] = js.native
}

object SchemaSheet {
  @scala.inline
  def apply(
    bandedRanges: js.Array[SchemaBandedRange] = null,
    basicFilter: SchemaBasicFilter = null,
    charts: js.Array[SchemaEmbeddedChart] = null,
    columnGroups: js.Array[SchemaDimensionGroup] = null,
    conditionalFormats: js.Array[SchemaConditionalFormatRule] = null,
    data: js.Array[SchemaGridData] = null,
    developerMetadata: js.Array[SchemaDeveloperMetadata] = null,
    filterViews: js.Array[SchemaFilterView] = null,
    merges: js.Array[SchemaGridRange] = null,
    properties: SchemaSheetProperties = null,
    protectedRanges: js.Array[SchemaProtectedRange] = null,
    rowGroups: js.Array[SchemaDimensionGroup] = null
  ): SchemaSheet = {
    val __obj = js.Dynamic.literal()
    if (bandedRanges != null) __obj.updateDynamic("bandedRanges")(bandedRanges.asInstanceOf[js.Any])
    if (basicFilter != null) __obj.updateDynamic("basicFilter")(basicFilter.asInstanceOf[js.Any])
    if (charts != null) __obj.updateDynamic("charts")(charts.asInstanceOf[js.Any])
    if (columnGroups != null) __obj.updateDynamic("columnGroups")(columnGroups.asInstanceOf[js.Any])
    if (conditionalFormats != null) __obj.updateDynamic("conditionalFormats")(conditionalFormats.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    if (filterViews != null) __obj.updateDynamic("filterViews")(filterViews.asInstanceOf[js.Any])
    if (merges != null) __obj.updateDynamic("merges")(merges.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (protectedRanges != null) __obj.updateDynamic("protectedRanges")(protectedRanges.asInstanceOf[js.Any])
    if (rowGroups != null) __obj.updateDynamic("rowGroups")(rowGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSheet]
  }
}

