package typings.listr2.mod

import typings.listr2.anon.BottomBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("listr2", "DefaultRenderer")
@js.native
open class DefaultRenderer protected () extends ListrRenderer {
  def this(
    tasks: js.Array[ListrDefaultRendererTask],
    options: ListrDefaultRendererOptions,
    events: ListrEventManager
  ) = this()
  
  /* private */ var activePrompt: Any = js.native
  
  /* private */ var bottom: Any = js.native
  
  /* private */ val cache: Any = js.native
  
  /* private */ var calculate: Any = js.native
  
  def create(): String = js.native
  def create(options: BottomBar): String = js.native
  
  /* private */ var dump: Any = js.native
  
  /* private */ val events: Any = js.native
  
  /* protected */ def format(message: String, icon: String, level: Double): js.Array[String] = js.native
  
  /* private */ var indent: Any = js.native
  
  def isBottomBar(task: ListrDefaultRendererTask): Boolean = js.native
  
  /* private */ val logger: Any = js.native
  
  /* private */ val options: Any = js.native
  
  /* private */ var prompt: Any = js.native
  
  /* private */ var renderBottomBar: Any = js.native
  
  /* private */ var renderPrompt: Any = js.native
  
  /* private */ var renderer: Any = js.native
  
  /* private */ var reset: Any = js.native
  
  /* private */ val spinner: Any = js.native
  
  /* protected */ def style(task: ListrDefaultRendererTask): String = js.native
  /* protected */ def style(task: ListrDefaultRendererTask, output: Boolean): String = js.native
  
  /* private */ val tasks: Any = js.native
  
  /* private */ var truncate: Any = js.native
  
  def update(): Unit = js.native
  
  /* private */ var updater: Any = js.native
  
  /* private */ var wrap: Any = js.native
}
object DefaultRenderer {
  
  @JSImport("listr2", "DefaultRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("listr2", "DefaultRenderer.nonTTY")
  @js.native
  def nonTTY: Boolean = js.native
  inline def nonTTY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonTTY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("listr2", "DefaultRenderer.rendererOptions")
  @js.native
  def rendererOptions: ListrDefaultRendererOptions = js.native
  inline def rendererOptions_=(x: ListrDefaultRendererOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rendererOptions")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("listr2", "DefaultRenderer.rendererTaskOptions")
  @js.native
  def rendererTaskOptions: ListrDefaultRendererTaskOptions = js.native
  inline def rendererTaskOptions_=(x: ListrDefaultRendererTaskOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rendererTaskOptions")(x.asInstanceOf[js.Any])
}
