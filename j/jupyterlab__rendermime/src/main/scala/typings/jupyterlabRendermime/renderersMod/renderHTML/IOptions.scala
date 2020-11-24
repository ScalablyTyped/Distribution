package typings.jupyterlabRendermime.renderersMod.renderHTML

import typings.jupyterlabApputils.sanitizerMod.ISanitizer
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILinkHandler
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the `renderHTML` function.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The host node for the rendered HTML.
    */
  var host: HTMLElement = js.native
  
  /**
    * The LaTeX typesetter for the application.
    */
  var latexTypesetter: ILatexTypesetter | Null = js.native
  
  /**
    * An optional link handler.
    */
  var linkHandler: ILinkHandler | Null = js.native
  
  /**
    * An optional url resolver.
    */
  var resolver: IResolver | Null = js.native
  
  /**
    * The html sanitizer for untrusted source.
    */
  var sanitizer: ISanitizer = js.native
  
  /**
    * Whether the node should be typeset.
    */
  var shouldTypeset: Boolean = js.native
  
  /**
    * The HTML source to render.
    */
  var source: String = js.native
  
  /**
    * Whether the source is trusted.
    */
  var trusted: Boolean = js.native
}
object IOptions {
  
  @scala.inline
  def apply(host: HTMLElement, sanitizer: ISanitizer, shouldTypeset: Boolean, source: String, trusted: Boolean): IOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], shouldTypeset = shouldTypeset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setSanitizer(value: ISanitizer): Self = this.set("sanitizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldTypeset(value: Boolean): Self = this.set("shouldTypeset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrusted(value: Boolean): Self = this.set("trusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatexTypesetter(value: ILatexTypesetter): Self = this.set("latexTypesetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatexTypesetterNull: Self = this.set("latexTypesetter", null)
    
    @scala.inline
    def setLinkHandler(value: ILinkHandler): Self = this.set("linkHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkHandlerNull: Self = this.set("linkHandler", null)
    
    @scala.inline
    def setResolver(value: IResolver): Self = this.set("resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverNull: Self = this.set("resolver", null)
  }
}
