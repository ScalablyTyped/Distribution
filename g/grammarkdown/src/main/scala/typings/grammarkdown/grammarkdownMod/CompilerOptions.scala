package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerOptions extends StObject {
  
  var diagnostics: js.UndefOr[Boolean] = js.undefined
  
  var emitLinks: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[EmitFormat] = js.undefined
  
  var newLine: js.UndefOr[NewLineKind] = js.undefined
  
  var noChecks: js.UndefOr[Boolean] = js.undefined
  
  var noEmit: js.UndefOr[Boolean] = js.undefined
  
  var noEmitOnError: js.UndefOr[Boolean] = js.undefined
  
  var noStrictParametricProductions: js.UndefOr[Boolean] = js.undefined
  
  var noUnusedParameters: js.UndefOr[Boolean] = js.undefined
  
  var out: js.UndefOr[String] = js.undefined
}
object CompilerOptions {
  
  inline def apply(): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerOptions]
  }
  
  extension [Self <: CompilerOptions](x: Self) {
    
    inline def setDiagnostics(value: Boolean): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setEmitLinks(value: Boolean): Self = StObject.set(x, "emitLinks", value.asInstanceOf[js.Any])
    
    inline def setEmitLinksUndefined: Self = StObject.set(x, "emitLinks", js.undefined)
    
    inline def setFormat(value: EmitFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setNewLine(value: NewLineKind): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
    
    inline def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
    
    inline def setNoChecks(value: Boolean): Self = StObject.set(x, "noChecks", value.asInstanceOf[js.Any])
    
    inline def setNoChecksUndefined: Self = StObject.set(x, "noChecks", js.undefined)
    
    inline def setNoEmit(value: Boolean): Self = StObject.set(x, "noEmit", value.asInstanceOf[js.Any])
    
    inline def setNoEmitOnError(value: Boolean): Self = StObject.set(x, "noEmitOnError", value.asInstanceOf[js.Any])
    
    inline def setNoEmitOnErrorUndefined: Self = StObject.set(x, "noEmitOnError", js.undefined)
    
    inline def setNoEmitUndefined: Self = StObject.set(x, "noEmit", js.undefined)
    
    inline def setNoStrictParametricProductions(value: Boolean): Self = StObject.set(x, "noStrictParametricProductions", value.asInstanceOf[js.Any])
    
    inline def setNoStrictParametricProductionsUndefined: Self = StObject.set(x, "noStrictParametricProductions", js.undefined)
    
    inline def setNoUnusedParameters(value: Boolean): Self = StObject.set(x, "noUnusedParameters", value.asInstanceOf[js.Any])
    
    inline def setNoUnusedParametersUndefined: Self = StObject.set(x, "noUnusedParameters", js.undefined)
    
    inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
  }
}
