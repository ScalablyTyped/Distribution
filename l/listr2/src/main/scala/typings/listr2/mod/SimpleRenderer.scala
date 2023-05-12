package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("listr2", "SimpleRenderer")
@js.native
open class SimpleRenderer protected () extends ListrRenderer {
  def this(tasks: js.Array[ListrSimpleRendererTask], options: ListrSimpleRendererOptions) = this()
  
  /* private */ val cache: Any = js.native
  
  /* private */ var calculate: Any = js.native
  
  /* private */ val logger: Any = js.native
  
  /* private */ var options: Any = js.native
  
  /* private */ var renderer: Any = js.native
  
  /* private */ var reset: Any = js.native
  
  /* private */ val tasks: Any = js.native
}
object SimpleRenderer {
  
  @JSImport("listr2", "SimpleRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("listr2", "SimpleRenderer.nonTTY")
  @js.native
  def nonTTY: Boolean = js.native
  inline def nonTTY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonTTY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("listr2", "SimpleRenderer.rendererOptions")
  @js.native
  def rendererOptions: ListrSimpleRendererOptions = js.native
  inline def rendererOptions_=(x: ListrSimpleRendererOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rendererOptions")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("listr2", "SimpleRenderer.rendererTaskOptions")
  @js.native
  def rendererTaskOptions: ListrSimpleRendererTaskOptions = js.native
  inline def rendererTaskOptions_=(x: ListrSimpleRendererTaskOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rendererTaskOptions")(x.asInstanceOf[js.Any])
}
