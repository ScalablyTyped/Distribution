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
  
  @scala.inline
  def apply(): PromptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptOptions]
  }
  
  @scala.inline
  implicit class PromptOptionsMutableBuilder[Self <: PromptOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: js.Any): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    @scala.inline
    def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
