package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("listr2", "SilentRenderer")
@js.native
open class SilentRenderer protected () extends ListrRenderer {
  def this(tasks: js.Array[ListrSilentRendererTask], options: ListrSilentRendererOptions) = this()
  
  var options: ListrSilentRendererOptions = js.native
  
  var tasks: js.Array[ListrSilentRendererTask] = js.native
}
object SilentRenderer {
  
  @JSImport("listr2", "SilentRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("listr2", "SilentRenderer.nonTTY")
  @js.native
  def nonTTY: Boolean = js.native
  inline def nonTTY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonTTY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("listr2", "SilentRenderer.rendererOptions")
  @js.native
  def rendererOptions: ListrSilentRendererOptions = js.native
  inline def rendererOptions_=(x: ListrSilentRendererOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rendererOptions")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("listr2", "SilentRenderer.rendererTaskOptions")
  @js.native
  def rendererTaskOptions: ListrSilentRendererTaskOptions = js.native
  inline def rendererTaskOptions_=(x: ListrSilentRendererTaskOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rendererTaskOptions")(x.asInstanceOf[js.Any])
}
