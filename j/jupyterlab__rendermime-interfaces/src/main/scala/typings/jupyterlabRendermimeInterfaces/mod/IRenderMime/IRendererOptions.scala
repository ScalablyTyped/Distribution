package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a renderer.
  */
@js.native
trait IRendererOptions extends js.Object {
  /**
    * The LaTeX typesetter.
    */
  var latexTypesetter: ILatexTypesetter | Null = js.native
  /**
    * An optional link handler.
    */
  var linkHandler: ILinkHandler | Null = js.native
  /**
    * The preferred mimeType to render.
    */
  var mimeType: String = js.native
  /**
    * An optional url resolver.
    */
  var resolver: IResolver | Null = js.native
  /**
    * The html sanitizer.
    */
  var sanitizer: ISanitizer = js.native
}

object IRendererOptions {
  @scala.inline
  def apply(mimeType: String, sanitizer: ISanitizer): IRendererOptions = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRendererOptions]
  }
  @scala.inline
  implicit class IRendererOptionsOps[Self <: IRendererOptions] (val x: Self) extends AnyVal {
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
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSanitizer(value: ISanitizer): Self = this.set("sanitizer", value.asInstanceOf[js.Any])
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

