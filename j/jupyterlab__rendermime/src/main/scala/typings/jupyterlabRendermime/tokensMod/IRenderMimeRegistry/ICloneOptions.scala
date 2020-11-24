package typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILinkHandler
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ISanitizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to clone a rendermime instance.
  */
@js.native
trait ICloneOptions extends js.Object {
  
  /**
    * The new LaTeX typesetter.
    */
  var latexTypesetter: js.UndefOr[ILatexTypesetter] = js.native
  
  /**
    * The new path handler.
    */
  var linkHandler: js.UndefOr[ILinkHandler] = js.native
  
  /**
    * The new resolver object.
    */
  var resolver: js.UndefOr[IResolver] = js.native
  
  /**
    * The new sanitizer used to sanitize untrusted html inputs.
    */
  var sanitizer: js.UndefOr[ISanitizer] = js.native
}
object ICloneOptions {
  
  @scala.inline
  def apply(): ICloneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICloneOptions]
  }
  
  @scala.inline
  implicit class ICloneOptionsOps[Self <: ICloneOptions] (val x: Self) extends AnyVal {
    
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
