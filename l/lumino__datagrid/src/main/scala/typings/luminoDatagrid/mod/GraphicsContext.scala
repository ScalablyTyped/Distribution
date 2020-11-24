package typings.luminoDatagrid.mod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid", "GraphicsContext")
@js.native
class GraphicsContext protected ()
  extends typings.luminoDatagrid.graphicscontextMod.GraphicsContext {
  /**
    * Create a new graphics context object.
    *
    * @param context - The 2D canvas rendering context to wrap.
    */
  def this(context: CanvasRenderingContext2D) = this()
}
