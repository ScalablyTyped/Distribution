package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The definition of how a value in a pivot table should be calculated.
  */
@js.native
trait SchemaPivotValue extends StObject {
  
  /**
    * If specified, indicates that pivot values should be displayed as the
    * result of a calculation with another pivot value. For example, if
    * calculated_display_type is specified as PERCENT_OF_GRAND_TOTAL, all the
    * pivot values are displayed as the percentage of the grand total. In the
    * Sheets UI, this is referred to as &quot;Show As&quot; in the value
    * section of a pivot table.
    */
  var calculatedDisplayType: js.UndefOr[String] = js.native
  
  /**
    * A custom formula to calculate the value.  The formula must start with an
    * `=` character.
    */
  var formula: js.UndefOr[String] = js.native
  
  /**
    * A name to use for the value.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The column offset of the source range that this value reads from.  For
    * example, if the source was `C10:E15`, a `sourceColumnOffset` of `0` means
    * this value refers to column `C`, whereas the offset `1` would refer to
    * column `D`.
    */
  var sourceColumnOffset: js.UndefOr[Double] = js.native
  
  /**
    * A function to summarize the value. If formula is set, the only supported
    * values are SUM and CUSTOM. If sourceColumnOffset is set, then `CUSTOM` is
    * not supported.
    */
  var summarizeFunction: js.UndefOr[String] = js.native
}
object SchemaPivotValue {
  
  @scala.inline
  def apply(): SchemaPivotValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotValue]
  }
  
  @scala.inline
  implicit class SchemaPivotValueMutableBuilder[Self <: SchemaPivotValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculatedDisplayType(value: String): Self = StObject.set(x, "calculatedDisplayType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedDisplayTypeUndefined: Self = StObject.set(x, "calculatedDisplayType", js.undefined)
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSourceColumnOffset(value: Double): Self = StObject.set(x, "sourceColumnOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceColumnOffsetUndefined: Self = StObject.set(x, "sourceColumnOffset", js.undefined)
    
    @scala.inline
    def setSummarizeFunction(value: String): Self = StObject.set(x, "summarizeFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummarizeFunctionUndefined: Self = StObject.set(x, "summarizeFunction", js.undefined)
  }
}
