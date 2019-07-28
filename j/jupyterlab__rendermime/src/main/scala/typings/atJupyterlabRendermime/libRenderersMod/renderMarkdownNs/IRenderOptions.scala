package typings.atJupyterlabRendermime.libRenderersMod.renderMarkdownNs

import typings.atJupyterlabApputils.libSanitizerMod.ISanitizer
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILinkHandler
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver
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
    val __obj = js.Dynamic.literal(host = host, sanitizer = sanitizer, shouldTypeset = shouldTypeset, source = source, trusted = trusted)
    if (latexTypesetter != null) __obj.updateDynamic("latexTypesetter")(latexTypesetter)
    if (linkHandler != null) __obj.updateDynamic("linkHandler")(linkHandler)
    if (resolver != null) __obj.updateDynamic("resolver")(resolver)
    __obj.asInstanceOf[IRenderOptions]
  }
}

