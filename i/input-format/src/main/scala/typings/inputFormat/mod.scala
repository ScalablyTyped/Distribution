package typings.inputFormat

import typings.react.mod.ChangeEvent
import typings.react.mod.KeyboardEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("input-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(value: String, caretPosition: Double, format: FormatFunction): ExportedFormatFunctionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any], caretPosition.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[ExportedFormatFunctionResult]
  
  inline def onChange(
    event: ChangeEvent[HTMLInputElement],
    input: HTMLInputElement,
    parseCharacter: ParseFunction,
    format: FormatFunction,
    onChangeHandler: js.Function1[/* value */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onChange")(event.asInstanceOf[js.Any], input.asInstanceOf[js.Any], parseCharacter.asInstanceOf[js.Any], format.asInstanceOf[js.Any], onChangeHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def onKeyDown(
    event: KeyboardEvent[HTMLInputElement],
    input: HTMLInputElement,
    parseCharacter: ParseFunction,
    format: FormatFunction,
    onChangeHandler: js.Function1[/* value */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onKeyDown")(event.asInstanceOf[js.Any], input.asInstanceOf[js.Any], parseCharacter.asInstanceOf[js.Any], format.asInstanceOf[js.Any], onChangeHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parse(text: String, caretPosition: Double, parse: ParseFunction): ExportedParseFunctionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], caretPosition.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[ExportedParseFunctionResult]
  
  inline def parseDigit(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDigit")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def templateFormatter(template: String): FormatFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("templateFormatter")(template.asInstanceOf[js.Any]).asInstanceOf[FormatFunction]
  inline def templateFormatter(template: String, placeholder: String): FormatFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("templateFormatter")(template.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any])).asInstanceOf[FormatFunction]
  inline def templateFormatter(template: String, placeholder: String, shouldCloseBraces: Boolean): FormatFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("templateFormatter")(template.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any], shouldCloseBraces.asInstanceOf[js.Any])).asInstanceOf[FormatFunction]
  inline def templateFormatter(template: String, placeholder: Unit, shouldCloseBraces: Boolean): FormatFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("templateFormatter")(template.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any], shouldCloseBraces.asInstanceOf[js.Any])).asInstanceOf[FormatFunction]
  
  inline def templateParser(template: String, parseCharacter: ParseFunction): ParseFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("templateParser")(template.asInstanceOf[js.Any], parseCharacter.asInstanceOf[js.Any])).asInstanceOf[ParseFunction]
  inline def templateParser(template: String, placeholder: String, parseCharacter: ParseFunction): ParseFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("templateParser")(template.asInstanceOf[js.Any], placeholder.asInstanceOf[js.Any], parseCharacter.asInstanceOf[js.Any])).asInstanceOf[ParseFunction]
  
  trait ExportedFormatFunctionResult extends StObject {
    
    var caret: Double
    
    var text: String
  }
  object ExportedFormatFunctionResult {
    
    inline def apply(caret: Double, text: String): ExportedFormatFunctionResult = {
      val __obj = js.Dynamic.literal(caret = caret.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportedFormatFunctionResult]
    }
    
    extension [Self <: ExportedFormatFunctionResult](x: Self) {
      
      inline def setCaret(value: Double): Self = StObject.set(x, "caret", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExportedParseFunctionResult extends StObject {
    
    var caret: Double
    
    var value: String
  }
  object ExportedParseFunctionResult {
    
    inline def apply(caret: Double, value: String): ExportedParseFunctionResult = {
      val __obj = js.Dynamic.literal(caret = caret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportedParseFunctionResult]
    }
    
    extension [Self <: ExportedParseFunctionResult](x: Self) {
      
      inline def setCaret(value: Double): Self = StObject.set(x, "caret", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type FormatFunction = js.Function1[/* value */ js.UndefOr[String], FormatFunctionResult]
  
  trait FormatFunctionResult extends StObject {
    
    var template: String
    
    var text: String
  }
  object FormatFunctionResult {
    
    inline def apply(template: String, text: String): FormatFunctionResult = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatFunctionResult]
    }
    
    extension [Self <: FormatFunctionResult](x: Self) {
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type ParseFunction = js.Function2[/* character */ String, /* value */ String, ParseFunctionResult]
  
  type ParseFunctionResult = String | Unit
}
