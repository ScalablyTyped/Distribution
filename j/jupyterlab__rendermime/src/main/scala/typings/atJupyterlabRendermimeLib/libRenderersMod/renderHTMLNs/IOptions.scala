package typings
package atJupyterlabRendermimeLib.libRenderersMod.renderHTMLNs

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
  var host: stdLib.HTMLElement
  /**
    * The LaTeX typesetter for the application.
    */
  var latexTypesetter: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter | scala.Null
  /**
    * An optional link handler.
    */
  var linkHandler: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILinkHandler | scala.Null
  /**
    * An optional url resolver.
    */
  var resolver: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver | scala.Null
  /**
    * The html sanitizer for untrusted source.
    */
  var sanitizer: atJupyterlabApputilsLib.libSanitizerMod.ISanitizer
  /**
    * Whether the node should be typeset.
    */
  var shouldTypeset: scala.Boolean
  /**
    * The HTML source to render.
    */
  var source: java.lang.String
  /**
    * Whether the source is trusted.
    */
  var trusted: scala.Boolean
}

object IOptions {
  @scala.inline
  def apply(
    host: stdLib.HTMLElement,
    sanitizer: atJupyterlabApputilsLib.libSanitizerMod.ISanitizer,
    shouldTypeset: scala.Boolean,
    source: java.lang.String,
    trusted: scala.Boolean,
    latexTypesetter: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter = null,
    linkHandler: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILinkHandler = null,
    resolver: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(host = host, sanitizer = sanitizer, shouldTypeset = shouldTypeset, source = source, trusted = trusted)
    if (latexTypesetter != null) __obj.updateDynamic("latexTypesetter")(latexTypesetter)
    if (linkHandler != null) __obj.updateDynamic("linkHandler")(linkHandler)
    if (resolver != null) __obj.updateDynamic("resolver")(resolver)
    __obj.asInstanceOf[IOptions]
  }
}

