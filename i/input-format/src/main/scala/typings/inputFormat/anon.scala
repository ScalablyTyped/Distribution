package typings.inputFormat

import typings.inputFormat.mod.FormatFunction
import typings.inputFormat.mod.FormatFunctionResult
import typings.inputFormat.mod.ParseFunction
import typings.inputFormat.mod.ParseFunctionResult
import typings.inputFormat.reactMod.InputComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Format[InputComponentProps] extends StObject {
    
    var format: FormatFunction
    
    var inputComponent: js.UndefOr[InputComponent[InputComponentProps]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], Unit]] = js.undefined
    
    var parse: ParseFunction
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Format {
    
    inline def apply[InputComponentProps](
      format: /* value */ js.UndefOr[String] => FormatFunctionResult,
      parse: (/* character */ String, /* value */ String) => ParseFunctionResult
    ): Format[InputComponentProps] = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), parse = js.Any.fromFunction2(parse))
      __obj.asInstanceOf[Format[InputComponentProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Format[?], InputComponentProps] (val x: Self & Format[InputComponentProps]) extends AnyVal {
      
      inline def setFormat(value: /* value */ js.UndefOr[String] => FormatFunctionResult): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setInputComponent(value: InputComponentProps => Element): Self = StObject.set(x, "inputComponent", js.Any.fromFunction1(value))
      
      inline def setInputComponentUndefined: Self = StObject.set(x, "inputComponent", js.undefined)
      
      inline def setOnChange(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnKeyDown(value: /* value */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setParse(value: (/* character */ String, /* value */ String) => ParseFunctionResult): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
