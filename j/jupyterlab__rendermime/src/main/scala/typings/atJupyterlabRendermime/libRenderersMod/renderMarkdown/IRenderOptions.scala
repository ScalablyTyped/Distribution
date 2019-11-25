package typings.atJupyterlabRendermime.libRenderersMod.renderMarkdown

import typings.atJupyterlabApputils.libSanitizerMod.ISanitizer
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.ILatexTypesetter
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.ILinkHandler
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IResolver
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
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sanitizer = sanitizer.asInstanceOf[js.Any], shouldTypeset = shouldTypeset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    if (latexTypesetter != null) __obj.updateDynamic("latexTypesetter")(latexTypesetter.asInstanceOf[js.Any])
    if (linkHandler != null) __obj.updateDynamic("linkHandler")(linkHandler.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderOptions]
  }
}

