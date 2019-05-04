package typings
package atJupyterlabRendermimeLib.libWidgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedCommon")
@js.native
abstract class RenderedCommon protected ()
  extends atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRenderer {
  /**
    * Construct a new rendered common widget.
    *
    * @param options - The options for initializing the widget.
    */
  def this(options: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererOptions) = this()
  /**
    * The latexTypesetter.
    */
  val latexTypesetter: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter = js.native
  /**
    * The link handler.
    */
  val linkHandler: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILinkHandler | scala.Null = js.native
  /**
    * The mimetype being rendered.
    */
  val mimeType: java.lang.String = js.native
  /**
    * The resolver object.
    */
  val resolver: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver | scala.Null = js.native
  /**
    * The sanitizer used to sanitize untrusted html inputs.
    */
  val sanitizer: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ISanitizer = js.native
  /**
    * Render the mime model.
    *
    * @param model - The mime model to render.
    *
    * @returns A promise which resolves when rendering is complete.
    */
  def render(
    model: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModel
  ): js.Promise[scala.Unit] = js.native
}

