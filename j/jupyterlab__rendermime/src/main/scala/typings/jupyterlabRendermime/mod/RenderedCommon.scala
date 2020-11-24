package typings.jupyterlabRendermime.mod

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/rendermime", "RenderedCommon")
@js.native
abstract class RenderedCommon protected ()
  extends typings.jupyterlabRendermime.widgetsMod.RenderedCommon {
  /**
    * Construct a new rendered common widget.
    *
    * @param options - The options for initializing the widget.
    */
  def this(options: IRendererOptions) = this()
}
