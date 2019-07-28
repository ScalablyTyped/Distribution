package typings.atJupyterlabRendermime.libWidgetsMod

import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILinkHandler
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModel
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRenderer
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRendererOptions
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ISanitizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime/lib/widgets", "RenderedCommon")
@js.native
abstract class RenderedCommon protected () extends IRenderer {
  /**
    * Construct a new rendered common widget.
    *
    * @param options - The options for initializing the widget.
    */
  def this(options: IRendererOptions) = this()
  /**
    * The latexTypesetter.
    */
  val latexTypesetter: ILatexTypesetter = js.native
  /**
    * The link handler.
    */
  val linkHandler: ILinkHandler | Null = js.native
  /**
    * The mimetype being rendered.
    */
  val mimeType: String = js.native
  /**
    * The resolver object.
    */
  val resolver: IResolver | Null = js.native
  /**
    * The sanitizer used to sanitize untrusted html inputs.
    */
  val sanitizer: ISanitizer = js.native
  /**
    * Render the mime model.
    *
    * @param model - The mime model to render.
    *
    * @returns A promise which resolves when rendering is complete.
    */
  def render(model: IMimeModel): js.Promise[Unit] = js.native
  /**
    * Set the URI fragment identifier.
    *
    * @param fragment - The URI fragment identifier.
    */
  /* protected */ def setFragment(fragment: String): Unit = js.native
}

