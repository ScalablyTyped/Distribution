package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpreadsheet extends StObject {
  
  /**
    * Output only. A list of data source refresh schedules.
    */
  var dataSourceSchedules: js.UndefOr[js.Array[SchemaDataSourceRefreshSchedule]] = js.undefined
  
  /**
    * A list of external data sources connected with the spreadsheet.
    */
  var dataSources: js.UndefOr[js.Array[SchemaDataSource]] = js.undefined
  
  /**
    * The developer metadata associated with a spreadsheet.
    */
  var developerMetadata: js.UndefOr[js.Array[SchemaDeveloperMetadata]] = js.undefined
  
  /**
    * The named ranges defined in a spreadsheet.
    */
  var namedRanges: js.UndefOr[js.Array[SchemaNamedRange]] = js.undefined
  
  /**
    * Overall properties of a spreadsheet.
    */
  var properties: js.UndefOr[SchemaSpreadsheetProperties] = js.undefined
  
  /**
    * The sheets that are part of a spreadsheet.
    */
  var sheets: js.UndefOr[js.Array[SchemaSheet]] = js.undefined
  
  /**
    * The ID of the spreadsheet. This field is read-only.
    */
  var spreadsheetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The url of the spreadsheet. This field is read-only.
    */
  var spreadsheetUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaSpreadsheet {
  
  inline def apply(): SchemaSpreadsheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpreadsheet]
  }
  
  extension [Self <: SchemaSpreadsheet](x: Self) {
    
    inline def setDataSourceSchedules(value: js.Array[SchemaDataSourceRefreshSchedule]): Self = StObject.set(x, "dataSourceSchedules", value.asInstanceOf[js.Any])
    
    inline def setDataSourceSchedulesUndefined: Self = StObject.set(x, "dataSourceSchedules", js.undefined)
    
    inline def setDataSourceSchedulesVarargs(value: SchemaDataSourceRefreshSchedule*): Self = StObject.set(x, "dataSourceSchedules", js.Array(value*))
    
    inline def setDataSources(value: js.Array[SchemaDataSource]): Self = StObject.set(x, "dataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "dataSources", js.undefined)
    
    inline def setDataSourcesVarargs(value: SchemaDataSource*): Self = StObject.set(x, "dataSources", js.Array(value*))
    
    inline def setDeveloperMetadata(value: js.Array[SchemaDeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    inline def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
    
    inline def setDeveloperMetadataVarargs(value: SchemaDeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value*))
    
    inline def setNamedRanges(value: js.Array[SchemaNamedRange]): Self = StObject.set(x, "namedRanges", value.asInstanceOf[js.Any])
    
    inline def setNamedRangesUndefined: Self = StObject.set(x, "namedRanges", js.undefined)
    
    inline def setNamedRangesVarargs(value: SchemaNamedRange*): Self = StObject.set(x, "namedRanges", js.Array(value*))
    
    inline def setProperties(value: SchemaSpreadsheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setSheets(value: js.Array[SchemaSheet]): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
    
    inline def setSheetsUndefined: Self = StObject.set(x, "sheets", js.undefined)
    
    inline def setSheetsVarargs(value: SchemaSheet*): Self = StObject.set(x, "sheets", js.Array(value*))
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdNull: Self = StObject.set(x, "spreadsheetId", null)
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    inline def setSpreadsheetUrl(value: String): Self = StObject.set(x, "spreadsheetUrl", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetUrlNull: Self = StObject.set(x, "spreadsheetUrl", null)
    
    inline def setSpreadsheetUrlUndefined: Self = StObject.set(x, "spreadsheetUrl", js.undefined)
  }
}
