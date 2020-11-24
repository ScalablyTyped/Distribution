package typings.gulpTypescript.reporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompilationResult extends js.Object {
  
  var declarationErrors: Double = js.native
  
  var emitErrors: Double = js.native
  
  var emitSkipped: Boolean = js.native
  
  var globalErrors: Double = js.native
  
  var noEmit: Boolean = js.native
  
  var optionsErrors: Double = js.native
  
  var semanticErrors: Double = js.native
  
  var syntaxErrors: Double = js.native
  
  /**
    * Only used when using isolatedModules.
    */
  var transpileErrors: Double = js.native
}
object CompilationResult {
  
  @scala.inline
  def apply(
    declarationErrors: Double,
    emitErrors: Double,
    emitSkipped: Boolean,
    globalErrors: Double,
    noEmit: Boolean,
    optionsErrors: Double,
    semanticErrors: Double,
    syntaxErrors: Double,
    transpileErrors: Double
  ): CompilationResult = {
    val __obj = js.Dynamic.literal(declarationErrors = declarationErrors.asInstanceOf[js.Any], emitErrors = emitErrors.asInstanceOf[js.Any], emitSkipped = emitSkipped.asInstanceOf[js.Any], globalErrors = globalErrors.asInstanceOf[js.Any], noEmit = noEmit.asInstanceOf[js.Any], optionsErrors = optionsErrors.asInstanceOf[js.Any], semanticErrors = semanticErrors.asInstanceOf[js.Any], syntaxErrors = syntaxErrors.asInstanceOf[js.Any], transpileErrors = transpileErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationResult]
  }
  
  @scala.inline
  implicit class CompilationResultOps[Self <: CompilationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeclarationErrors(value: Double): Self = this.set("declarationErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitErrors(value: Double): Self = this.set("emitErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitSkipped(value: Boolean): Self = this.set("emitSkipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalErrors(value: Double): Self = this.set("globalErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoEmit(value: Boolean): Self = this.set("noEmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsErrors(value: Double): Self = this.set("optionsErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticErrors(value: Double): Self = this.set("semanticErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxErrors(value: Double): Self = this.set("syntaxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranspileErrors(value: Double): Self = this.set("transpileErrors", value.asInstanceOf[js.Any])
  }
}
