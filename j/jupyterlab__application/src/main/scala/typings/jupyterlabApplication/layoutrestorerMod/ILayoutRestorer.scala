package typings.jupyterlabApplication.layoutrestorerMod

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabStatedb.interfacesMod.IRestorable
import typings.jupyterlabStatedb.interfacesMod.IRestorer
import typings.jupyterlabStatedb.interfacesMod.IRestorer.IOptions
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILayoutRestorer
  extends IRestorer[IRestorable[IObservableDisposable, js.Any], IObservableDisposable, js.Any] {
  
  /**
    * Add a widget to be tracked by the layout restorer.
    */
  def add(widget: Widget, name: String): Unit = js.native
  
  /**
    * Restore the widgets of a particular widget tracker.
    *
    * @param tracker - The widget tracker whose widgets will be restored.
    *
    * @param options - The restoration options.
    */
  def restore[T /* <: Widget */](tracker: WidgetTracker[T], options: IOptions[T]): js.Promise[_] = js.native
  
  /**
    * A promise resolved when the layout restorer is ready to receive signals.
    */
  @JSName("restored")
  var restored_ILayoutRestorer: js.Promise[Unit] = js.native
}
@JSImport("@jupyterlab/application/lib/layoutrestorer", "ILayoutRestorer")
@js.native
object ILayoutRestorer extends TopLevel[Token[ILayoutRestorer]]
