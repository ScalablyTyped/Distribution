package typings.jupyterlabRendermime.renderersMod.renderLatex

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.ILatexTypesetter
import typings.std.HTMLElement
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
  var host: HTMLElement
  /**
    * The LaTeX typesetter for the application.
    */
  var latexTypesetter: ILatexTypesetter | Null
  /**
    * Whether the node should be typeset.
    */
  var shouldTypeset: Boolean
  /**
    * The LaTeX source to render.
    */
  var source: String
}

object IRenderOptions {
  @scala.inline
  def apply(
    host: HTMLElement,
    shouldTypeset: Boolean,
    source: String,
    latexTypesetter: ILatexTypesetter = null
  ): IRenderOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], shouldTypeset = shouldTypeset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], latexTypesetter = latexTypesetter.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderOptions]
  }
}

