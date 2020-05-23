package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a renderer.
  */
trait IRendererOptions extends js.Object {
  /**
    * The LaTeX typesetter.
    */
  var latexTypesetter: ILatexTypesetter | Null
  /**
    * An optional link handler.
    */
  var linkHandler: ILinkHandler | Null
  /**
    * The preferred mimeType to render.
    */
  var mimeType: String
  /**
    * An optional url resolver.
    */
  var resolver: IResolver | Null
  /**
    * The html sanitizer.
    */
  var sanitizer: ISanitizer
}

object IRendererOptions {
  @scala.inline
  def apply(
    mimeType: String,
    sanitizer: ISanitizer,
    latexTypesetter: ILatexTypesetter = null,
    linkHandler: ILinkHandler = null,
    resolver: IResolver = null
  ): IRendererOptions = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], latexTypesetter = latexTypesetter.asInstanceOf[js.Any], linkHandler = linkHandler.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRendererOptions]
  }
}

