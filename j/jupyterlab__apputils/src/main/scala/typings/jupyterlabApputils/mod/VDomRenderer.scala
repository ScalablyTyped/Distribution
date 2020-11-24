package typings.jupyterlabApputils.mod

import typings.jupyterlabApputils.vdomMod.VDomRenderer.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/apputils", "VDomRenderer")
@js.native
abstract class VDomRenderer[T /* <: IModel | Null */] protected ()
  extends typings.jupyterlabApputils.vdomMod.VDomRenderer[T] {
  /**
    * Create a new VDomRenderer
    */
  def this(model: T | Unit) = this()
}
