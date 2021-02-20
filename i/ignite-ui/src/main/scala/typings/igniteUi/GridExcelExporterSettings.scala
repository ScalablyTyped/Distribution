package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridExcelExporterSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * An array of strings containing the keys for the columns that will not be exported.
    *
    */
  var columnsToSkip: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Indicates whether all sublevel data will be exported, or only data under expanded rows.
    *
    *
    * Valid values:
    * "allRows" All sublevel data will be exported.
    * "expandedRows" Only data under expanded rows will be exported.
    */
  var dataExportMode: js.UndefOr[String] = js.native
  
  /**
    * Specifies the name of the excel file that will be generated.
    *
    */
  var fileName: js.UndefOr[String] = js.native
  
  /**
    * List of export settings which can be used with Grid Excel exporter
    */
  var gridFeatureOptions: js.UndefOr[GridExcelExporterSettingsGridFeatureOptions] = js.native
  
  /**
    * Indicates whether excel table styles will be the same as grid styles. This is set to applied by default. Custom grid themes are not supported.
    *
    *
    * Valid values:
    * "none" The styles from the grid are not applied to the table region.
    * "applied" The styles from the grid are applied to the table region.
    */
  var gridStyling: js.UndefOr[String] = js.native
  
  /**
    * List of strings containing the keys for the worksheet columns which will not be applied any filtering
    *
    */
  var skipFilteringOn: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Specifies the excel table style region. The following table styles are available:
    * TableStyleMedium[1-28]
    * TableStyleLight[1-21]
    * TableStyleDark[1-11]
    *
    */
  var tableStyle: js.UndefOr[String] = js.native
  
  /**
    * Specifies the worksheet name where the igGrid will be exported.
    *
    */
  var worksheetName: js.UndefOr[String] = js.native
}
object GridExcelExporterSettings {
  
  @scala.inline
  def apply(): GridExcelExporterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridExcelExporterSettings]
  }
  
  @scala.inline
  implicit class GridExcelExporterSettingsMutableBuilder[Self <: GridExcelExporterSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnsToSkip(value: js.Array[_]): Self = StObject.set(x, "columnsToSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsToSkipUndefined: Self = StObject.set(x, "columnsToSkip", js.undefined)
    
    @scala.inline
    def setColumnsToSkipVarargs(value: js.Any*): Self = StObject.set(x, "columnsToSkip", js.Array(value :_*))
    
    @scala.inline
    def setDataExportMode(value: String): Self = StObject.set(x, "dataExportMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataExportModeUndefined: Self = StObject.set(x, "dataExportMode", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setGridFeatureOptions(value: GridExcelExporterSettingsGridFeatureOptions): Self = StObject.set(x, "gridFeatureOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridFeatureOptionsUndefined: Self = StObject.set(x, "gridFeatureOptions", js.undefined)
    
    @scala.inline
    def setGridStyling(value: String): Self = StObject.set(x, "gridStyling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridStylingUndefined: Self = StObject.set(x, "gridStyling", js.undefined)
    
    @scala.inline
    def setSkipFilteringOn(value: js.Array[_]): Self = StObject.set(x, "skipFilteringOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipFilteringOnUndefined: Self = StObject.set(x, "skipFilteringOn", js.undefined)
    
    @scala.inline
    def setSkipFilteringOnVarargs(value: js.Any*): Self = StObject.set(x, "skipFilteringOn", js.Array(value :_*))
    
    @scala.inline
    def setTableStyle(value: String): Self = StObject.set(x, "tableStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableStyleUndefined: Self = StObject.set(x, "tableStyle", js.undefined)
    
    @scala.inline
    def setWorksheetName(value: String): Self = StObject.set(x, "worksheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetNameUndefined: Self = StObject.set(x, "worksheetName", js.undefined)
  }
}
