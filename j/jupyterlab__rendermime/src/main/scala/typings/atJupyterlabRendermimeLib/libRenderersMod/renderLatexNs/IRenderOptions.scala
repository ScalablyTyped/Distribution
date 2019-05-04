package typings
package atJupyterlabRendermimeLib.libRenderersMod.renderLatexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the `renderLatex` function.
  */
trait IRenderOptions extends js.Object {
  /**
    * The host node for the rendered LaTeX.
    */
  var host: stdLib.HTMLElement
  /**
    * The LaTeX typesetter for the application.
    */
  var latexTypesetter: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter | scala.Null
  /**
    * Whether the node should be typeset.
    */
  var shouldTypeset: scala.Boolean
  /**
    * The LaTeX source to render.
    */
  var source: java.lang.String
}

object IRenderOptions {
  @scala.inline
  def apply(
    host: stdLib.HTMLElement,
    shouldTypeset: scala.Boolean,
    source: java.lang.String,
    latexTypesetter: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter = null
  ): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host, shouldTypeset = shouldTypeset, source = source)
    if (latexTypesetter != null) __obj.updateDynamic("latexTypesetter")(latexTypesetter)
    __obj.asInstanceOf[IRenderOptions]
  }
}

