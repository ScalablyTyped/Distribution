package typings.atJupyterlabRendermime.libRenderersMod.renderHTML

import typings.atJupyterlabApputils.libSanitizerMod.ISanitizer
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.ILatexTypesetter
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.ILinkHandler
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime.IResolver
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the `renderHTML` function.
  */
trait IOptions extends js.Object {
  /**
    * The host node for the rendered HTML.
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
    * The HTML source to render.
    */
  var source: String
  /**
    * Whether the source is trusted.
    */
  var trusted: Boolean
}

object IOptions {
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
  ): IOptions = {
    val __obj = js.Dynamic.literal(host = host, sanitizer = sanitizer, shouldTypeset = shouldTypeset, source = source, trusted = trusted)
    if (latexTypesetter != null) __obj.updateDynamic("latexTypesetter")(latexTypesetter)
    if (linkHandler != null) __obj.updateDynamic("linkHandler")(linkHandler)
    if (resolver != null) __obj.updateDynamic("resolver")(resolver)
    __obj.asInstanceOf[IOptions]
  }
}

