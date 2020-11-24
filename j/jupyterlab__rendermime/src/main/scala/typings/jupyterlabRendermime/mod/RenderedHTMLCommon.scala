package typings.jupyterlabRendermime.mod

import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/rendermime", "RenderedHTMLCommon")
@js.native
abstract class RenderedHTMLCommon protected ()
  extends typings.jupyterlabRendermime.widgetsMod.RenderedHTMLCommon {
  /**
    * Construct a new rendered HTML common widget.
    *
    * @param options - The options for initializing the widget.
    */
  def this(options: IRendererOptions) = this()
}
