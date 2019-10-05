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
    val __obj = js.Dynamic.literal(mimeType = mimeType, sanitizer = sanitizer)
    if (latexTypesetter != null) __obj.updateDynamic("latexTypesetter")(latexTypesetter)
    if (linkHandler != null) __obj.updateDynamic("linkHandler")(linkHandler)
    if (resolver != null) __obj.updateDynamic("resolver")(resolver)
    __obj.asInstanceOf[IRendererOptions]
  }
}

