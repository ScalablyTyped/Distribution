package typings.jupyterlabRendermime.registryMod.RenderMimeRegistry

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILinkHandler
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererFactory
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ISanitizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a rendermime instance.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * Initial factories to add to the rendermime instance.
    */
  var initialFactories: js.UndefOr[js.Array[IRendererFactory]] = js.native
  
  /**
    * An optional LaTeX typesetter.
    */
  var latexTypesetter: js.UndefOr[ILatexTypesetter] = js.native
  
  /**
    * An optional path handler.
    */
  var linkHandler: js.UndefOr[ILinkHandler] = js.native
  
  /**
    * The initial resolver object.
    *
    * The default is `null`.
    */
  var resolver: js.UndefOr[IResolver] = js.native
  
  /**
    * The sanitizer used to sanitize untrusted html inputs.
    *
    * If not given, a default sanitizer will be used.
    */
  var sanitizer: js.UndefOr[ISanitizer] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
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
    def setInitialFactoriesVarargs(value: IRendererFactory*): Self = this.set("initialFactories", js.Array(value :_*))
    
    @scala.inline
    def setInitialFactories(value: js.Array[IRendererFactory]): Self = this.set("initialFactories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialFactories: Self = this.set("initialFactories", js.undefined)
    
    @scala.inline
    def setLatexTypesetter(value: ILatexTypesetter): Self = this.set("latexTypesetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatexTypesetter: Self = this.set("latexTypesetter", js.undefined)
    
    @scala.inline
    def setLinkHandler(value: ILinkHandler): Self = this.set("linkHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkHandler: Self = this.set("linkHandler", js.undefined)
    
    @scala.inline
    def setResolver(value: IResolver): Self = this.set("resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolver: Self = this.set("resolver", js.undefined)
    
    @scala.inline
    def setSanitizer(value: ISanitizer): Self = this.set("sanitizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSanitizer: Self = this.set("sanitizer", js.undefined)
  }
}
