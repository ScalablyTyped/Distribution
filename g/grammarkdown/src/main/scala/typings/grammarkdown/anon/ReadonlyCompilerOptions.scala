package typings.grammarkdown.anon

import typings.grammarkdown.optionsMod.EmitFormat
import typings.grammarkdown.optionsMod.NewLineKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<grammarkdown.grammarkdown/dist/options.CompilerOptions> */
@js.native
trait ReadonlyCompilerOptions extends js.Object {
  
  val diagnostics: js.UndefOr[Boolean] = js.native
  
  val emitLinks: js.UndefOr[Boolean] = js.native
  
  val format: js.UndefOr[EmitFormat] = js.native
  
  val newLine: js.UndefOr[NewLineKind] = js.native
  
  val noChecks: js.UndefOr[Boolean] = js.native
  
  val noEmit: js.UndefOr[Boolean] = js.native
  
  val noEmitOnError: js.UndefOr[Boolean] = js.native
  
  val noStrictParametricProductions: js.UndefOr[Boolean] = js.native
  
  val noUnusedParameters: js.UndefOr[Boolean] = js.native
  
  val out: js.UndefOr[String] = js.native
}
object ReadonlyCompilerOptions {
  
  @scala.inline
  def apply(): ReadonlyCompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyCompilerOptions]
  }
  
  @scala.inline
  implicit class ReadonlyCompilerOptionsOps[Self <: ReadonlyCompilerOptions] (val x: Self) extends AnyVal {
    
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
