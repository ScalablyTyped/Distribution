package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource that represents a spreadsheet.
  */
trait SchemaSpreadsheet extends StObject {
  
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
  var spreadsheetId: js.UndefOr[String] = js.undefined
  
  /**
    * The url of the spreadsheet. This field is read-only.
    */
  var spreadsheetUrl: js.UndefOr[String] = js.undefined
}
object SchemaSpreadsheet {
  
  @scala.inline
  def apply(): SchemaSpreadsheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpreadsheet]
  }
  
  @scala.inline
  implicit class SchemaSpreadsheetMutableBuilder[Self <: SchemaSpreadsheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperMetadata(value: js.Array[SchemaDeveloperMetadata]): Self = StObject.set(x, "developerMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperMetadataUndefined: Self = StObject.set(x, "developerMetadata", js.undefined)
    
    @scala.inline
    def setDeveloperMetadataVarargs(value: SchemaDeveloperMetadata*): Self = StObject.set(x, "developerMetadata", js.Array(value :_*))
    
    @scala.inline
    def setNamedRanges(value: js.Array[SchemaNamedRange]): Self = StObject.set(x, "namedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRangesUndefined: Self = StObject.set(x, "namedRanges", js.undefined)
    
    @scala.inline
    def setNamedRangesVarargs(value: SchemaNamedRange*): Self = StObject.set(x, "namedRanges", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: SchemaSpreadsheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setSheets(value: js.Array[SchemaSheet]): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetsUndefined: Self = StObject.set(x, "sheets", js.undefined)
    
    @scala.inline
    def setSheetsVarargs(value: SchemaSheet*): Self = StObject.set(x, "sheets", js.Array(value :_*))
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
    
    @scala.inline
    def setSpreadsheetUrl(value: String): Self = StObject.set(x, "spreadsheetUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetUrlUndefined: Self = StObject.set(x, "spreadsheetUrl", js.undefined)
  }
}
