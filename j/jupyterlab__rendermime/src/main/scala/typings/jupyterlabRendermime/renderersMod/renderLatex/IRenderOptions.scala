package typings.jupyterlabRendermime.renderersMod.renderLatex

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the `renderLatex` function.
  */
@js.native
trait IRenderOptions extends js.Object {
  
  /**
    * The host node for the rendered LaTeX.
    */
  var host: HTMLElement = js.native
  
  /**
    * The LaTeX typesetter for the application.
    */
  var latexTypesetter: ILatexTypesetter | Null = js.native
  
  /**
    * Whether the node should be typeset.
    */
  var shouldTypeset: Boolean = js.native
  
  /**
    * The LaTeX source to render.
    */
  var source: String = js.native
}
object IRenderOptions {
  
  @scala.inline
  def apply(host: HTMLElement, shouldTypeset: Boolean, source: String): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], shouldTypeset = shouldTypeset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderOptions]
  }
  
  @scala.inline
  implicit class IRenderOptionsOps[Self <: IRenderOptions] (val x: Self) extends AnyVal {
    
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
    def setHost(value: HTMLElement): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldTypeset(value: Boolean): Self = this.set("shouldTypeset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatexTypesetter(value: ILatexTypesetter): Self = this.set("latexTypesetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatexTypesetterNull: Self = this.set("latexTypesetter", null)
  }
}
