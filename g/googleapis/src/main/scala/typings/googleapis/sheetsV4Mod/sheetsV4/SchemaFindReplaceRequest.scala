package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFindReplaceRequest extends StObject {
  
  /**
    * True to find/replace over all sheets.
    */
  var allSheets: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The value to search.
    */
  var find: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if the search should include cells with formulas. False to skip cells with formulas.
    */
  var includeFormulas: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * True if the search is case sensitive.
    */
  var matchCase: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * True if the find value should match the entire cell.
    */
  var matchEntireCell: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The range to find/replace over.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
  
  /**
    * The value to use as the replacement.
    */
  var replacement: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if the find value is a regex. The regular expression and replacement should follow Java regex rules at https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html. The replacement string is allowed to refer to capturing groups. For example, if one cell has the contents `"Google Sheets"` and another has `"Google Docs"`, then searching for `"o.* (.*)"` with a replacement of `"$1 Rocks"` would change the contents of the cells to `"GSheets Rocks"` and `"GDocs Rocks"` respectively.
    */
  var searchByRegex: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The sheet to find/replace over.
    */
  var sheetId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaFindReplaceRequest {
  
  inline def apply(): SchemaFindReplaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindReplaceRequest]
  }
  
  extension [Self <: SchemaFindReplaceRequest](x: Self) {
    
    inline def setAllSheets(value: Boolean): Self = StObject.set(x, "allSheets", value.asInstanceOf[js.Any])
    
    inline def setAllSheetsNull: Self = StObject.set(x, "allSheets", null)
    
    inline def setAllSheetsUndefined: Self = StObject.set(x, "allSheets", js.undefined)
    
    inline def setFind(value: String): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
    
    inline def setFindNull: Self = StObject.set(x, "find", null)
    
    inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
    
    inline def setIncludeFormulas(value: Boolean): Self = StObject.set(x, "includeFormulas", value.asInstanceOf[js.Any])
    
    inline def setIncludeFormulasNull: Self = StObject.set(x, "includeFormulas", null)
    
    inline def setIncludeFormulasUndefined: Self = StObject.set(x, "includeFormulas", js.undefined)
    
    inline def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
    
    inline def setMatchCaseNull: Self = StObject.set(x, "matchCase", null)
    
    inline def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
    
    inline def setMatchEntireCell(value: Boolean): Self = StObject.set(x, "matchEntireCell", value.asInstanceOf[js.Any])
    
    inline def setMatchEntireCellNull: Self = StObject.set(x, "matchEntireCell", null)
    
    inline def setMatchEntireCellUndefined: Self = StObject.set(x, "matchEntireCell", js.undefined)
    
    inline def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    inline def setReplacementNull: Self = StObject.set(x, "replacement", null)
    
    inline def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    
    inline def setSearchByRegex(value: Boolean): Self = StObject.set(x, "searchByRegex", value.asInstanceOf[js.Any])
    
    inline def setSearchByRegexNull: Self = StObject.set(x, "searchByRegex", null)
    
    inline def setSearchByRegexUndefined: Self = StObject.set(x, "searchByRegex", js.undefined)
    
    inline def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    inline def setSheetIdNull: Self = StObject.set(x, "sheetId", null)
    
    inline def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
