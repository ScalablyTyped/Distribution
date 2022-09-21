package typings.intlifyMessageCompiler.mod

import typings.intlifyMessageCompiler.intlifyMessageCompilerStrings.Linefeed
import typings.intlifyMessageCompiler.intlifyMessageCompilerStrings.Semicolon
import typings.intlifyMessageCompiler.intlifyMessageCompilerStrings.arrow
import typings.intlifyMessageCompiler.intlifyMessageCompilerStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.intlifyMessageCompiler.mod.TokenizeOptions because var conflicts: location, onError. Inlined 
- typings.intlifyMessageCompiler.mod.ParserOptions because var conflicts: onError. Inlined location
- typings.intlifyMessageCompiler.mod.CodeGenOptions because var conflicts: onError. Inlined mode, breakLineCode, needIndent, sourceMap, filename */ trait CompileOptions
  extends StObject
     with TransformOptions {
  
  var breakLineCode: js.UndefOr[Linefeed | Semicolon] = js.undefined
  
  var filename: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[normal | arrow] = js.undefined
  
  var needIndent: js.UndefOr[Boolean] = js.undefined
  
  var onCacheKey: js.UndefOr[CompileCacheKeyHandler] = js.undefined
  
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  
  var warnHtmlMessage: js.UndefOr[Boolean] = js.undefined
}
object CompileOptions {
  
  inline def apply(): CompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileOptions]
  }
  
  extension [Self <: CompileOptions](x: Self) {
    
    inline def setBreakLineCode(value: Linefeed | Semicolon): Self = StObject.set(x, "breakLineCode", value.asInstanceOf[js.Any])
    
    inline def setBreakLineCodeUndefined: Self = StObject.set(x, "breakLineCode", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setLocation(value: Boolean): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMode(value: normal | arrow): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNeedIndent(value: Boolean): Self = StObject.set(x, "needIndent", value.asInstanceOf[js.Any])
    
    inline def setNeedIndentUndefined: Self = StObject.set(x, "needIndent", js.undefined)
    
    inline def setOnCacheKey(value: /* source */ String => String): Self = StObject.set(x, "onCacheKey", js.Any.fromFunction1(value))
    
    inline def setOnCacheKeyUndefined: Self = StObject.set(x, "onCacheKey", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setWarnHtmlMessage(value: Boolean): Self = StObject.set(x, "warnHtmlMessage", value.asInstanceOf[js.Any])
    
    inline def setWarnHtmlMessageUndefined: Self = StObject.set(x, "warnHtmlMessage", js.undefined)
  }
}
