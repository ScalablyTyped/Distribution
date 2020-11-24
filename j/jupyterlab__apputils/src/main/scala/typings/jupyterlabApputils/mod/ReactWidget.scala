package typings.jupyterlabApputils.mod

import typings.jupyterlabApputils.vdomMod.ReactRenderElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils", "ReactWidget")
@js.native
abstract class ReactWidget ()
  extends typings.jupyterlabApputils.vdomMod.ReactWidget
/* static members */
@JSImport("@jupyterlab/apputils", "ReactWidget")
@js.native
object ReactWidget extends js.Object {
  
  /**
    * Creates a new `ReactWidget` that renders a constant element.
    * @param element React element to render.
    */
  def create(element: ReactRenderElement): typings.jupyterlabApputils.vdomMod.ReactWidget = js.native
}
