package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridExcelExporterSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * An array of strings containing the keys for the columns that will not be exported.
    *
    */
  var columnsToSkip: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Indicates whether all sublevel data will be exported, or only data under expanded rows.
    *
    *
    * Valid values:
    * "allRows" All sublevel data will be exported.
    * "expandedRows" Only data under expanded rows will be exported.
    */
  var dataExportMode: js.UndefOr[String] = js.undefined
  /**
    * Specifies the name of the excel file that will be generated.
    *
    */
  var fileName: js.UndefOr[String] = js.undefined
  /**
    * List of export settings which can be used with Grid Excel exporter
    */
  var gridFeatureOptions: js.UndefOr[GridExcelExporterSettingsGridFeatureOptions] = js.undefined
  /**
    * Indicates whether excel table styles will be the same as grid styles. This is set to applied by default. Custom grid themes are not supported.
    *
    *
    * Valid values:
    * "none" The styles from the grid are not applied to the table region.
    * "applied" The styles from the grid are applied to the table region.
    */
  var gridStyling: js.UndefOr[String] = js.undefined
  /**
    * List of strings containing the keys for the worksheet columns which will not be applied any filtering
    *
    */
  var skipFilteringOn: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Specifies the excel table style region. The following table styles are available:
    * TableStyleMedium[1-28]
    * TableStyleLight[1-21]
    * TableStyleDark[1-11]
    *
    */
  var tableStyle: js.UndefOr[String] = js.undefined
  /**
    * Specifies the worksheet name where the igGrid will be exported.
    *
    */
  var worksheetName: js.UndefOr[String] = js.undefined
}

object GridExcelExporterSettings {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    columnsToSkip: js.Array[_] = null,
    dataExportMode: String = null,
    fileName: String = null,
    gridFeatureOptions: GridExcelExporterSettingsGridFeatureOptions = null,
    gridStyling: String = null,
    skipFilteringOn: js.Array[_] = null,
    tableStyle: String = null,
    worksheetName: String = null
  ): GridExcelExporterSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columnsToSkip != null) __obj.updateDynamic("columnsToSkip")(columnsToSkip.asInstanceOf[js.Any])
    if (dataExportMode != null) __obj.updateDynamic("dataExportMode")(dataExportMode.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (gridFeatureOptions != null) __obj.updateDynamic("gridFeatureOptions")(gridFeatureOptions.asInstanceOf[js.Any])
    if (gridStyling != null) __obj.updateDynamic("gridStyling")(gridStyling.asInstanceOf[js.Any])
    if (skipFilteringOn != null) __obj.updateDynamic("skipFilteringOn")(skipFilteringOn.asInstanceOf[js.Any])
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle.asInstanceOf[js.Any])
    if (worksheetName != null) __obj.updateDynamic("worksheetName")(worksheetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridExcelExporterSettings]
  }
}

