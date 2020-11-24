package typings.grammarkdown.grammarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompilerOptions extends js.Object {
  
  var diagnostics: js.UndefOr[Boolean] = js.native
  
  var emitLinks: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[EmitFormat] = js.native
  
  var newLine: js.UndefOr[NewLineKind] = js.native
  
  var noChecks: js.UndefOr[Boolean] = js.native
  
  var noEmit: js.UndefOr[Boolean] = js.native
  
  var noEmitOnError: js.UndefOr[Boolean] = js.native
  
  var noStrictParametricProductions: js.UndefOr[Boolean] = js.native
  
  var noUnusedParameters: js.UndefOr[Boolean] = js.native
  
  var out: js.UndefOr[String] = js.native
}
object CompilerOptions {
  
  @scala.inline
  def apply(): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerOptions]
  }
  
  @scala.inline
  implicit class CompilerOptionsOps[Self <: CompilerOptions] (val x: Self) extends AnyVal {
    
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
    def setDiagnostics(value: Boolean): Self = this.set("diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagnostics: Self = this.set("diagnostics", js.undefined)
    
    @scala.inline
    def setEmitLinks(value: Boolean): Self = this.set("emitLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitLinks: Self = this.set("emitLinks", js.undefined)
    
    @scala.inline
    def setFormat(value: EmitFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setNewLine(value: NewLineKind): Self = this.set("newLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewLine: Self = this.set("newLine", js.undefined)
    
    @scala.inline
    def setNoChecks(value: Boolean): Self = this.set("noChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoChecks: Self = this.set("noChecks", js.undefined)
    
    @scala.inline
    def setNoEmit(value: Boolean): Self = this.set("noEmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEmit: Self = this.set("noEmit", js.undefined)
    
    @scala.inline
    def setNoEmitOnError(value: Boolean): Self = this.set("noEmitOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEmitOnError: Self = this.set("noEmitOnError", js.undefined)
    
    @scala.inline
    def setNoStrictParametricProductions(value: Boolean): Self = this.set("noStrictParametricProductions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoStrictParametricProductions: Self = this.set("noStrictParametricProductions", js.undefined)
    
    @scala.inline
    def setNoUnusedParameters(value: Boolean): Self = this.set("noUnusedParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoUnusedParameters: Self = this.set("noUnusedParameters", js.undefined)
    
    @scala.inline
    def setOut(value: String): Self = this.set("out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
  }
}
