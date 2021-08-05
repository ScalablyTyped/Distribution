package typings.lobibox.LobiboxModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptOptions
  extends StObject
     with MessageBoxesOptions
     with PromptMethods {
  
  var attrs: js.UndefOr[js.Any] = js.undefined
  
  // Prompt type. Available types (text|number|color)
  var label: js.UndefOr[String] = js.undefined
  
  // Set this true for multiline prompt
  var lines: js.UndefOr[Double] = js.undefined
  
  // Value which is given to textfield when messagebox is created
  var multiline: js.UndefOr[Boolean] = js.undefined
  
  // This works only for multiline prompt. Number of lines
  var `type`: js.UndefOr[String] = js.undefined
  
  // Object of any valid attribute of input field
  var value: js.UndefOr[String] = js.undefined
}
object PromptOptions {
  
  inline def apply(): PromptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptOptions]
  }
  
  extension [Self <: PromptOptions](x: Self) {
    
    inline def setAttrs(value: js.Any): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
