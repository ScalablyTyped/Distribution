package typings.intlifyMessageCompiler.mod

import typings.intlifyMessageCompiler.intlifyMessageCompilerStrings.Linefeed
import typings.intlifyMessageCompiler.intlifyMessageCompilerStrings.Semicolon
import typings.intlifyMessageCompiler.intlifyMessageCompilerStrings.arrow
import typings.intlifyMessageCompiler.intlifyMessageCompilerStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeGenOptions extends StObject {
  
  var breakLineCode: js.UndefOr[Linefeed | Semicolon] = js.undefined
  
  var filename: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[normal | arrow] = js.undefined
  
  var needIndent: js.UndefOr[Boolean] = js.undefined
  
  var onError: js.UndefOr[CompileErrorHandler] = js.undefined
  
  var sourceMap: js.UndefOr[Boolean] = js.undefined
}
object CodeGenOptions {
  
  inline def apply(): CodeGenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeGenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeGenOptions] (val x: Self) extends AnyVal {
    
    inline def setBreakLineCode(value: Linefeed | Semicolon): Self = StObject.set(x, "breakLineCode", value.asInstanceOf[js.Any])
    
    inline def setBreakLineCodeUndefined: Self = StObject.set(x, "breakLineCode", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setMode(value: normal | arrow): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNeedIndent(value: Boolean): Self = StObject.set(x, "needIndent", value.asInstanceOf[js.Any])
    
    inline def setNeedIndentUndefined: Self = StObject.set(x, "needIndent", js.undefined)
    
    inline def setOnError(value: /* error */ CompileError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
  }
}
