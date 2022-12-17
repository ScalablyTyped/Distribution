package typings.listr2.mod

import typings.rxjs.mod.Subject
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The bones of a listr renderer. */
@JSImport("listr2", "ListrRenderer")
@js.native
open class ListrRenderer protected () extends StObject {
  /** create a new renderer */
  def this(tasks: js.Array[Task[Any, ListrRendererFactory]], options: Record[PropertyKey, Any]) = this()
  def this(
    tasks: js.Array[Task[Any, ListrRendererFactory]],
    options: Record[PropertyKey, Any],
    renderHook$: Subject[Unit]
  ) = this()
  
  /** A function to what to do on end of the render */
  def end(): Unit = js.native
  def end(err: js.Error): Unit = js.native
  
  /** A function to what to do on render */
  def render(): Unit = js.native
}
object ListrRenderer {
  
  @JSImport("listr2", "ListrRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /** designate whether this renderer can work in non-tty environments */
  /* static member */
  @JSImport("listr2", "ListrRenderer.nonTTY")
  @js.native
  def nonTTY: Boolean = js.native
  inline def nonTTY_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nonTTY")(x.asInstanceOf[js.Any])
  
  /** designate renderer global options that is specific to the current renderer */
  /* static member */
  @JSImport("listr2", "ListrRenderer.rendererOptions")
  @js.native
  def rendererOptions: Record[PropertyKey, Any] = js.native
  inline def rendererOptions_=(x: Record[PropertyKey, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rendererOptions")(x.asInstanceOf[js.Any])
  
  /** designate renderer per task options that is specific to the current renderer  */
  /* static member */
  @JSImport("listr2", "ListrRenderer.rendererTaskOptions")
  @js.native
  def rendererTaskOptions: Record[PropertyKey, Any] = js.native
  inline def rendererTaskOptions_=(x: Record[PropertyKey, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rendererTaskOptions")(x.asInstanceOf[js.Any])
}
