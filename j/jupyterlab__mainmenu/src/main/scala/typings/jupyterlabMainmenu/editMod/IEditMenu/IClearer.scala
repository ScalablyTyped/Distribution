package typings.jupyterlabMainmenu.editMod.IEditMenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.labmenuMod.IMenuExtender
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for an activity that wants to register a 'Clear...' menu item
  */
@js.native
trait IClearer[T /* <: Widget */] extends IMenuExtender[T] {
  
  /**
    * A function to clear all of an activity.
    */
  var clearAll: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
  
  /**
    * A function to clear the currently portion of activity.
    */
  var clearCurrent: js.UndefOr[js.Function1[/* widget */ T, Unit]] = js.native
  
  /**
    * A name for the thing to be cleared, used for labeling `clearCurrent`.
    */
  var noun: js.UndefOr[String] = js.native
  
  /**
    * A plural name for the thing to be cleared, used for labeling `clearAll`.
    */
  var pluralNoun: js.UndefOr[String] = js.native
}
object IClearer {
  
  @scala.inline
  def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): IClearer[T] = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClearer[T]]
  }
  
  @scala.inline
  implicit class IClearerOps[Self <: IClearer[_], T /* <: Widget */] (val x: Self with IClearer[T]) extends AnyVal {
    
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
    def setClearAll(value: /* widget */ T => Unit): Self = this.set("clearAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClearAll: Self = this.set("clearAll", js.undefined)
    
    @scala.inline
    def setClearCurrent(value: /* widget */ T => Unit): Self = this.set("clearCurrent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClearCurrent: Self = this.set("clearCurrent", js.undefined)
    
    @scala.inline
    def setNoun(value: String): Self = this.set("noun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoun: Self = this.set("noun", js.undefined)
    
    @scala.inline
    def setPluralNoun(value: String): Self = this.set("pluralNoun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluralNoun: Self = this.set("pluralNoun", js.undefined)
  }
}
