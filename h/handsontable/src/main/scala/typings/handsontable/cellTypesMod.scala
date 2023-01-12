package typings.handsontable

import typings.handsontable.handsontableStrings.autocomplete
import typings.handsontable.handsontableStrings.checkbox
import typings.handsontable.handsontableStrings.date
import typings.handsontable.handsontableStrings.dropdown
import typings.handsontable.handsontableStrings.numeric
import typings.handsontable.handsontableStrings.password
import typings.handsontable.handsontableStrings.text
import typings.handsontable.handsontableStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellTypesMod {
  
  @JSImport("handsontable/cellTypes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/cellTypes", "AUTOCOMPLETE_TYPE")
  @js.native
  val AUTOCOMPLETE_TYPE: autocomplete = js.native
  
  @JSImport("handsontable/cellTypes", "CHECKBOX_TYPE")
  @js.native
  val CHECKBOX_TYPE: checkbox = js.native
  
  @JSImport("handsontable/cellTypes", "DATE_TYPE")
  @js.native
  val DATE_TYPE: date = js.native
  
  @JSImport("handsontable/cellTypes", "DROPDOWN_TYPE")
  @js.native
  val DROPDOWN_TYPE: dropdown = js.native
  
  @JSImport("handsontable/cellTypes", "HANDSONTABLE_TYPE")
  @js.native
  val HANDSONTABLE_TYPE: typings.handsontable.handsontableStrings.handsontable = js.native
  
  @JSImport("handsontable/cellTypes", "NUMERIC_TYPE")
  @js.native
  val NUMERIC_TYPE: numeric = js.native
  
  @JSImport("handsontable/cellTypes", "PASSWORD_TYPE")
  @js.native
  val PASSWORD_TYPE: password = js.native
  
  @JSImport("handsontable/cellTypes", "TEXT_TYPE")
  @js.native
  val TEXT_TYPE: text = js.native
  
  @JSImport("handsontable/cellTypes", "TIME_TYPE")
  @js.native
  val TIME_TYPE: time = js.native
  
  inline def registerAllCellTypes(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAllCellTypes")().asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.autocomplete
    - typings.handsontable.handsontableStrings.checkbox
    - typings.handsontable.handsontableStrings.date
    - typings.handsontable.handsontableStrings.dropdown
    - typings.handsontable.handsontableStrings.handsontable
    - typings.handsontable.handsontableStrings.numeric
    - typings.handsontable.handsontableStrings.password
    - typings.handsontable.handsontableStrings.text
    - typings.handsontable.handsontableStrings.time
  */
  trait CellType extends StObject
  
  trait CellTypes extends StObject {
    
    var autocomplete: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutocompleteCellType */ Any
    
    var checkbox: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CheckboxCellType */ Any
    
    var date: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DateCellType */ Any
    
    var dropdown: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DropdownCellType */ Any
    
    var handsontable: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HandsontableCellType */ Any
    
    var numeric: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NumericCellType */ Any
    
    var password: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PasswordCellType */ Any
    
    var text: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextCellType */ Any
    
    var time: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TimeCellType */ Any
  }
  object CellTypes {
    
    inline def apply(
      autocomplete: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutocompleteCellType */ Any,
      checkbox: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CheckboxCellType */ Any,
      date: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DateCellType */ Any,
      dropdown: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DropdownCellType */ Any,
      handsontable: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HandsontableCellType */ Any,
      numeric: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NumericCellType */ Any,
      password: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PasswordCellType */ Any,
      text: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextCellType */ Any,
      time: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TimeCellType */ Any
    ): CellTypes = {
      val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any], handsontable = handsontable.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellTypes] (val x: Self) extends AnyVal {
      
      inline def setAutocomplete(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AutocompleteCellType */ Any
      ): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setCheckbox(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CheckboxCellType */ Any
      ): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setDate(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DateCellType */ Any): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDropdown(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DropdownCellType */ Any
      ): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
      
      inline def setHandsontable(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HandsontableCellType */ Any
      ): Self = StObject.set(x, "handsontable", value.asInstanceOf[js.Any])
      
      inline def setNumeric(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NumericCellType */ Any
      ): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setPassword(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PasswordCellType */ Any
      ): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setText(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextCellType */ Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTime(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TimeCellType */ Any): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
