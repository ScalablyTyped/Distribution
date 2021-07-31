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
  
  @scala.inline
  def apply(): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerOptions]
  }
  
  @scala.inline
  implicit class CompilerOptionsMutableBuilder[Self <: CompilerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiagnostics(value: Boolean): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    @scala.inline
    def setEmitLinks(value: Boolean): Self = StObject.set(x, "emitLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitLinksUndefined: Self = StObject.set(x, "emitLinks", js.undefined)
    
    @scala.inline
    def setFormat(value: EmitFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setNewLine(value: NewLineKind): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
    
    @scala.inline
    def setNoChecks(value: Boolean): Self = StObject.set(x, "noChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoChecksUndefined: Self = StObject.set(x, "noChecks", js.undefined)
    
    @scala.inline
    def setNoEmit(value: Boolean): Self = StObject.set(x, "noEmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoEmitOnError(value: Boolean): Self = StObject.set(x, "noEmitOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoEmitOnErrorUndefined: Self = StObject.set(x, "noEmitOnError", js.undefined)
    
    @scala.inline
    def setNoEmitUndefined: Self = StObject.set(x, "noEmit", js.undefined)
    
    @scala.inline
    def setNoStrictParametricProductions(value: Boolean): Self = StObject.set(x, "noStrictParametricProductions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoStrictParametricProductionsUndefined: Self = StObject.set(x, "noStrictParametricProductions", js.undefined)
    
    @scala.inline
    def setNoUnusedParameters(value: Boolean): Self = StObject.set(x, "noUnusedParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoUnusedParametersUndefined: Self = StObject.set(x, "noUnusedParameters", js.undefined)
    
    @scala.inline
    def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
  }
}
