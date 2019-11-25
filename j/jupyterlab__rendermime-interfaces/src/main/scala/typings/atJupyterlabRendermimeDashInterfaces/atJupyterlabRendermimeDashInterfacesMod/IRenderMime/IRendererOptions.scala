package typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime

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
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any])
    if (latexTypesetter != null) __obj.updateDynamic("latexTypesetter")(latexTypesetter.asInstanceOf[js.Any])
    if (linkHandler != null) __obj.updateDynamic("linkHandler")(linkHandler.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRendererOptions]
  }
}

