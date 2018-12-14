package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GridExcelExporterSettings
  extends /**
	 * Option for GridExcelExporterSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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
  var dataExportMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the name of the excel file that will be generated.
  	 *
  	 */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
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
  var gridStyling: js.UndefOr[java.lang.String] = js.undefined
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
  var tableStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the worksheet name where the igGrid will be exported.
  	 *
  	 */
  var worksheetName: js.UndefOr[java.lang.String] = js.undefined
}

