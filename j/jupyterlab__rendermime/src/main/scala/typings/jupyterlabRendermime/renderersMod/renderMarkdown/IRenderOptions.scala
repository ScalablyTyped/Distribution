package typings.jupyterlabRendermime.renderersMod.renderMarkdown

import typings.jupyterlabApputils.sanitizerMod.ISanitizer
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILinkHandler
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the `renderMarkdown` function.
  */
trait IRenderOptions extends js.Object {
  /**
    * The host node for the rendered Markdown.
    */
  var host: HTMLElement
  /**
    * The LaTeX typesetter for the application.
    */
  var latexTypesetter: ILatexTypesetter | Null
  /**
    * An optional link handler.
    */
  var linkHandler: ILinkHandler | Null
  /**
    * An optional url resolver.
    */
  var resolver: IResolver | Null
  /**
    * The html sanitizer for untrusted source.
    */
  var sanitizer: ISanitizer
  /**
    * Whether the node should be typeset.
    */
  var shouldTypeset: Boolean
  /**
    * The Markdown source to render.
    */
  var source: String
  /**
    * Whether the source is trusted.
    */
  var trusted: Boolean
}

object IRenderOptions {
  @scala.inline
  def apply(
    host: HTMLElement,
    sanitizer: ISanitizer,
    shouldTypeset: Boolean,
    source: String,
    trusted: Boolean,
    latexTypesetter: ILatexTypesetter = null,
    linkHandler: ILinkHandler = null,
    resolver: IResolver = null
  ): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], shouldTypeset = shouldTypeset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], latexTypesetter = latexTypesetter.asInstanceOf[js.Any], linkHandler = linkHandler.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderOptions]
  }
}

