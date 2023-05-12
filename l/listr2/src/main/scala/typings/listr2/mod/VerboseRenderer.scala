package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("listr2", "VerboseRenderer")
@js.native
open class VerboseRenderer protected () extends ListrRenderer {
  def this(tasks: js.Array[ListrVerboseRendererTask], options: ListrVerboseRendererOptions) = this()
  
  /* private */ val cache: Any = js.native
  
  /* private */ var calculate: Any = js.native
  
  /* private */ var logger: Any = js.native
  
  /* private */ val options: Any = js.native
  
  /* private */ var renderer: Any = js.native
  
  /* private */ var reset: Any = js.native
  
  /* private */ val tasks: Any = js.native
}
object VerboseRenderer {
  
  @JSImport("listr2", "VerboseRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("listr2", "VerboseRenderer.nonTTY")
  @js.native
  def nonTTY: Boolean = js.native
  inline def nonTTY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonTTY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("listr2", "VerboseRenderer.rendererOptions")
  @js.native
  def rendererOptions: ListrVerboseRendererOptions = js.native
  inline def rendererOptions_=(x: ListrVerboseRendererOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rendererOptions")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("listr2", "VerboseRenderer.rendererTaskOptions")
  @js.native
  def rendererTaskOptions: ListrVerboseRendererTaskOptions = js.native
  inline def rendererTaskOptions_=(x: ListrVerboseRendererTaskOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rendererTaskOptions")(x.asInstanceOf[js.Any])
}
