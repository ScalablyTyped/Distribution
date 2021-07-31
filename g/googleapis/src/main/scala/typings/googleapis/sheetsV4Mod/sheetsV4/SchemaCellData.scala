package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data about a specific cell.
  */
trait SchemaCellData extends StObject {
  
  /**
    * A data validation rule on the cell, if any.  When writing, the new data
    * validation rule will overwrite any prior rule.
    */
  var dataValidation: js.UndefOr[SchemaDataValidationRule] = js.undefined
  
  /**
    * The effective format being used by the cell. This includes the results of
    * applying any conditional formatting and, if the cell contains a formula,
    * the computed number format. If the effective format is the default
    * format, effective format will not be written. This field is read-only.
    */
  var effectiveFormat: js.UndefOr[SchemaCellFormat] = js.undefined
  
  /**
    * The effective value of the cell. For cells with formulas, this is the
    * calculated value.  For cells with literals, this is the same as the
    * user_entered_value. This field is read-only.
    */
  var effectiveValue: js.UndefOr[SchemaExtendedValue] = js.undefined
  
  /**
    * The formatted value of the cell. This is the value as it&#39;s shown to
    * the user. This field is read-only.
    */
  var formattedValue: js.UndefOr[String] = js.undefined
  
  /**
    * A hyperlink this cell points to, if any. This field is read-only.  (To
    * set it, use a `=HYPERLINK` formula in the userEnteredValue.formulaValue
    * field.)
    */
  var hyperlink: js.UndefOr[String] = js.undefined
  
  /**
    * Any note on the cell.
    */
  var note: js.UndefOr[String] = js.undefined
  
  /**
    * A pivot table anchored at this cell. The size of pivot table itself is
    * computed dynamically based on its data, grouping, filters, values, etc.
    * Only the top-left cell of the pivot table contains the pivot table
    * definition. The other cells will contain the calculated values of the
    * results of the pivot in their effective_value fields.
    */
  var pivotTable: js.UndefOr[SchemaPivotTable] = js.undefined
  
  /**
    * Runs of rich text applied to subsections of the cell.  Runs are only
    * valid on user entered strings, not formulas, bools, or numbers. Runs
    * start at specific indexes in the text and continue until the next run.
    * Properties of a run will continue unless explicitly changed in a
    * subsequent run (and properties of the first run will continue the
    * properties of the cell unless explicitly changed).  When writing, the new
    * runs will overwrite any prior runs.  When writing a new
    * user_entered_value, previous runs are erased.
    */
  var textFormatRuns: js.UndefOr[js.Array[SchemaTextFormatRun]] = js.undefined
  
  /**
    * The format the user entered for the cell.  When writing, the new format
    * will be merged with the existing format.
    */
  var userEnteredFormat: js.UndefOr[SchemaCellFormat] = js.undefined
  
  /**
    * The value the user entered in the cell. e.g, `1234`, `&#39;Hello&#39;`,
    * or `=NOW()` Note: Dates, Times and DateTimes are represented as doubles
    * in serial number format.
    */
  var userEnteredValue: js.UndefOr[SchemaExtendedValue] = js.undefined
}
object SchemaCellData {
  
  @scala.inline
  def apply(): SchemaCellData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCellData]
  }
  
  @scala.inline
  implicit class SchemaCellDataMutableBuilder[Self <: SchemaCellData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataValidation(value: SchemaDataValidationRule): Self = StObject.set(x, "dataValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataValidationUndefined: Self = StObject.set(x, "dataValidation", js.undefined)
    
    @scala.inline
    def setEffectiveFormat(value: SchemaCellFormat): Self = StObject.set(x, "effectiveFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveFormatUndefined: Self = StObject.set(x, "effectiveFormat", js.undefined)
    
    @scala.inline
    def setEffectiveValue(value: SchemaExtendedValue): Self = StObject.set(x, "effectiveValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveValueUndefined: Self = StObject.set(x, "effectiveValue", js.undefined)
    
    @scala.inline
    def setFormattedValue(value: String): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
    @scala.inline
    def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setPivotTable(value: SchemaPivotTable): Self = StObject.set(x, "pivotTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotTableUndefined: Self = StObject.set(x, "pivotTable", js.undefined)
    
    @scala.inline
    def setTextFormatRuns(value: js.Array[SchemaTextFormatRun]): Self = StObject.set(x, "textFormatRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFormatRunsUndefined: Self = StObject.set(x, "textFormatRuns", js.undefined)
    
    @scala.inline
    def setTextFormatRunsVarargs(value: SchemaTextFormatRun*): Self = StObject.set(x, "textFormatRuns", js.Array(value :_*))
    
    @scala.inline
    def setUserEnteredFormat(value: SchemaCellFormat): Self = StObject.set(x, "userEnteredFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEnteredFormatUndefined: Self = StObject.set(x, "userEnteredFormat", js.undefined)
    
    @scala.inline
    def setUserEnteredValue(value: SchemaExtendedValue): Self = StObject.set(x, "userEnteredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEnteredValueUndefined: Self = StObject.set(x, "userEnteredValue", js.undefined)
  }
}
