package typings.jupyterlabMainmenu.labmenuMod

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMenuExtender[T /* <: Widget */] extends js.Object {
  
  /**
    * An additional function that determines whether the extender
    * is enabled. By default it is considered enabled if the application
    * active widget is contained in the `tracker`. If this is also
    * provided, the criterion is equivalent to
    * `tracker.has(widget) && extender.isEnabled(widget)`
    */
  var isEnabled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.native
  
  /**
    * A widget tracker for identifying the appropriate extender.
    */
  var tracker: IWidgetTracker[T] = js.native
}
object IMenuExtender {
  
  @scala.inline
  def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): IMenuExtender[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMenuExtender[T]]
  }
  
  @scala.inline
  implicit class IMenuExtenderOps[Self <: IMenuExtender[_], T /* <: Widget */] (val x: Self with IMenuExtender[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTracker(value: IWidgetTracker[T]): Self = this.set("tracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: /* widget */ T => Boolean): Self = this.set("isEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsEnabled: Self = this.set("isEnabled", js.undefined)
  }
}
