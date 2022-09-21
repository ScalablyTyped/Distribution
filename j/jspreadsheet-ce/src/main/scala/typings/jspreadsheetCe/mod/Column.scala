package typings.jspreadsheetCe.mod

import typings.jspreadsheetCe.jspreadsheetCeStrings.autocomplete
import typings.jspreadsheetCe.jspreadsheetCeStrings.calendar
import typings.jspreadsheetCe.jspreadsheetCeStrings.center
import typings.jspreadsheetCe.jspreadsheetCeStrings.checkbox
import typings.jspreadsheetCe.jspreadsheetCeStrings.color
import typings.jspreadsheetCe.jspreadsheetCeStrings.dropdown
import typings.jspreadsheetCe.jspreadsheetCeStrings.hidden
import typings.jspreadsheetCe.jspreadsheetCeStrings.html
import typings.jspreadsheetCe.jspreadsheetCeStrings.image
import typings.jspreadsheetCe.jspreadsheetCeStrings.left
import typings.jspreadsheetCe.jspreadsheetCeStrings.numeric
import typings.jspreadsheetCe.jspreadsheetCeStrings.radio
import typings.jspreadsheetCe.jspreadsheetCeStrings.right
import typings.jspreadsheetCe.jspreadsheetCeStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /**
    * Default: "center"
    */
  var align: js.UndefOr[center | left | right] = js.undefined
  
  var autocomplete: js.UndefOr[Boolean] = js.undefined
  
  var decimal: js.UndefOr[String] = js.undefined
  
  var editor: js.UndefOr[ColumnEditor] = js.undefined
  
  var mask: js.UndefOr[String] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[CellValue] = js.undefined
  
  var options: js.UndefOr[CalendarOptions] = js.undefined
  
  var primaryKey: js.UndefOr[Boolean] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var render: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[js.Array[SourceValue]] = js.undefined
  
  var title: js.UndefOr[CellValue] = js.undefined
  
  /**
    * @see https://bossanova.uk/jexcel/v4/examples/column-types
    */
  var `type`: js.UndefOr[
    autocomplete | calendar | checkbox | color | dropdown | hidden | html | image | numeric | radio | text
  ] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var wordWrap: js.UndefOr[Boolean] = js.undefined
}
object Column {
  
  inline def apply(): Column = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setAlign(value: center | left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAutocomplete(value: Boolean): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
    
    inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    inline def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
    
    inline def setEditor(value: ColumnEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setName(value: CellValue): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: CalendarOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPrimaryKey(value: Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRender(value: String): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setSource(value: js.Array[SourceValue]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: SourceValue*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setTitle(value: CellValue): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(
      value: autocomplete | calendar | checkbox | color | dropdown | hidden | html | image | numeric | radio | text
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
    
    inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
  }
}
