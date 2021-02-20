package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Finds and replaces data in cells over a range, sheet, or all sheets.
  */
@js.native
trait SchemaFindReplaceRequest extends StObject {
  
  /**
    * True to find/replace over all sheets.
    */
  var allSheets: js.UndefOr[Boolean] = js.native
  
  /**
    * The value to search.
    */
  var find: js.UndefOr[String] = js.native
  
  /**
    * True if the search should include cells with formulas. False to skip
    * cells with formulas.
    */
  var includeFormulas: js.UndefOr[Boolean] = js.native
  
  /**
    * True if the search is case sensitive.
    */
  var matchCase: js.UndefOr[Boolean] = js.native
  
  /**
    * True if the find value should match the entire cell.
    */
  var matchEntireCell: js.UndefOr[Boolean] = js.native
  
  /**
    * The range to find/replace over.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  
  /**
    * The value to use as the replacement.
    */
  var replacement: js.UndefOr[String] = js.native
  
  /**
    * True if the find value is a regex. The regular expression and replacement
    * should follow Java regex rules at
    * https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html.
    * The replacement string is allowed to refer to capturing groups. For
    * example, if one cell has the contents `&quot;Google Sheets&quot;` and
    * another has `&quot;Google Docs&quot;`, then searching for `&quot;o.*
    * (.*)&quot;` with a replacement of `&quot;$1 Rocks&quot;` would change the
    * contents of the cells to `&quot;GSheets Rocks&quot;` and `&quot;GDocs
    * Rocks&quot;` respectively.
    */
  var searchByRegex: js.UndefOr[Boolean] = js.native
  
  /**
    * The sheet to find/replace over.
    */
  var sheetId: js.UndefOr[Double] = js.native
}
object SchemaFindReplaceRequest {
  
  @scala.inline
  def apply(): SchemaFindReplaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFindReplaceRequest]
  }
  
  @scala.inline
  implicit class SchemaFindReplaceRequestMutableBuilder[Self <: SchemaFindReplaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllSheets(value: Boolean): Self = StObject.set(x, "allSheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllSheetsUndefined: Self = StObject.set(x, "allSheets", js.undefined)
    
    @scala.inline
    def setFind(value: String): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
    
    @scala.inline
    def setIncludeFormulas(value: Boolean): Self = StObject.set(x, "includeFormulas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFormulasUndefined: Self = StObject.set(x, "includeFormulas", js.undefined)
    
    @scala.inline
    def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
    
    @scala.inline
    def setMatchEntireCell(value: Boolean): Self = StObject.set(x, "matchEntireCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchEntireCellUndefined: Self = StObject.set(x, "matchEntireCell", js.undefined)
    
    @scala.inline
    def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    
    @scala.inline
    def setSearchByRegex(value: Boolean): Self = StObject.set(x, "searchByRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchByRegexUndefined: Self = StObject.set(x, "searchByRegex", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = StObject.set(x, "sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetIdUndefined: Self = StObject.set(x, "sheetId", js.undefined)
  }
}
