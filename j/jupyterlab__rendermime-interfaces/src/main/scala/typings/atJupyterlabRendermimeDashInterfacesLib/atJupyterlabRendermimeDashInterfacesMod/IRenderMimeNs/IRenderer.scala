package typings
package atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget which displays the contents of a mime model.
  */
@js.native
trait IRenderer
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Render a mime model.
    *
    * @param model - The mime model to render.
    *
    * @returns A promise which resolves when rendering is complete.
    *
    * #### Notes
    * This method may be called multiple times during the lifetime
    * of the widget to update it if and when new data is available.
    */
  def renderModel(model: IMimeModel): js.Promise[scala.Unit] = js.native
}

