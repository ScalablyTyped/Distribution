package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("listr2", "TestRenderer")
@js.native
open class TestRenderer protected () extends ListrRenderer {
  def this(tasks: js.Array[ListrTestRendererTask], options: ListrTestRendererOptions) = this()
  
  /* private */ val logger: Any = js.native
  
  /* private */ val options: Any = js.native
  
  /* private */ var renderer: Any = js.native
  
  /* private */ var serializer: Any = js.native
  
  /* private */ val tasks: Any = js.native
}
object TestRenderer {
  
  @JSImport("listr2", "TestRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("listr2", "TestRenderer.nonTTY")
  @js.native
  def nonTTY: Boolean = js.native
  inline def nonTTY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonTTY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("listr2", "TestRenderer.rendererOptions")
  @js.native
  def rendererOptions: ListrTestRendererOptions = js.native
  inline def rendererOptions_=(x: ListrTestRendererOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rendererOptions")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("listr2", "TestRenderer.rendererTaskOptions")
  @js.native
  def rendererTaskOptions: ListrTestRendererTaskOptions = js.native
  inline def rendererTaskOptions_=(x: ListrTestRendererTaskOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rendererTaskOptions")(x.asInstanceOf[js.Any])
}
