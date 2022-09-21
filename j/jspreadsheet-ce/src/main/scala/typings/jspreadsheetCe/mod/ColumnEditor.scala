package typings.jspreadsheetCe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnEditor extends StObject {
  
  // tslint:disable-next-line ban-types
  var closeEditor: js.UndefOr[js.Function] = js.undefined
  
  // tslint:disable-next-line ban-types
  var getValue: js.UndefOr[js.Function] = js.undefined
  
  // tslint:disable-next-line ban-types
  var openEditor: js.UndefOr[js.Function] = js.undefined
  
  // tslint:disable-next-line ban-types
  var setValue: js.UndefOr[js.Function] = js.undefined
}
object ColumnEditor {
  
  inline def apply(): ColumnEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnEditor]
  }
  
  extension [Self <: ColumnEditor](x: Self) {
    
    inline def setCloseEditor(value: js.Function): Self = StObject.set(x, "closeEditor", value.asInstanceOf[js.Any])
    
    inline def setCloseEditorUndefined: Self = StObject.set(x, "closeEditor", js.undefined)
    
    inline def setGetValue(value: js.Function): Self = StObject.set(x, "getValue", value.asInstanceOf[js.Any])
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setOpenEditor(value: js.Function): Self = StObject.set(x, "openEditor", value.asInstanceOf[js.Any])
    
    inline def setOpenEditorUndefined: Self = StObject.set(x, "openEditor", js.undefined)
    
    inline def setSetValue(value: js.Function): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
  }
}
