package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorPasteOptions extends StObject {
  
  var split: js.UndefOr[Boolean] = js.undefined
}
object EditorPasteOptions {
  
  inline def apply(): EditorPasteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorPasteOptions]
  }
  
  extension [Self <: EditorPasteOptions](x: Self) {
    
    inline def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
  }
}
