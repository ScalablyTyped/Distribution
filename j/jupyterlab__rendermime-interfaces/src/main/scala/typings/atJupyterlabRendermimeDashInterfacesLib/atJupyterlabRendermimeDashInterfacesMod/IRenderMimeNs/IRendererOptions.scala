package typings
package atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs

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
  var latexTypesetter: ILatexTypesetter | scala.Null
  /**
    * An optional link handler.
    */
  var linkHandler: ILinkHandler | scala.Null
  /**
    * The preferred mimeType to render.
    */
  var mimeType: java.lang.String
  /**
    * An optional url resolver.
    */
  var resolver: IResolver | scala.Null
  /**
    * The html sanitizer.
    */
  var sanitizer: ISanitizer
}

object IRendererOptions {
  @scala.inline
  def apply(
    mimeType: java.lang.String,
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

