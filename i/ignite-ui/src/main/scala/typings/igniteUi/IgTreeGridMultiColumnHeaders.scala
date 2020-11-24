package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeGridMultiColumnHeaders
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Event fired after the group collapsing has been executed and results are rendered.
    */
  var groupCollapsed: js.UndefOr[GroupCollapsedEvent] = js.native
  
  /**
    * Event fired before a group collapsing operation is executed.
    */
  var groupCollapsing: js.UndefOr[GroupCollapsingEvent] = js.native
  
  /**
    * Event fired after the group expanding has been executed and results are rendered.
    */
  var groupExpanded: js.UndefOr[GroupExpandedEvent] = js.native
  
  /**
    * Event fired before a group expanding operation is executed.
    */
  var groupExpanding: js.UndefOr[GroupExpandingEvent] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
}
object IgTreeGridMultiColumnHeaders {
  
  @scala.inline
  def apply(): IgTreeGridMultiColumnHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridMultiColumnHeaders]
  }
  
  @scala.inline
  implicit class IgTreeGridMultiColumnHeadersOps[Self <: IgTreeGridMultiColumnHeaders] (val x: Self) extends AnyVal {
    
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
    def setGroupCollapsed(value: (/* event */ Event, /* ui */ GroupCollapsedEventUIParam) => Unit): Self = this.set("groupCollapsed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroupCollapsed: Self = this.set("groupCollapsed", js.undefined)
    
    @scala.inline
    def setGroupCollapsing(value: (/* event */ Event, /* ui */ GroupCollapsingEventUIParam) => Unit): Self = this.set("groupCollapsing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroupCollapsing: Self = this.set("groupCollapsing", js.undefined)
    
    @scala.inline
    def setGroupExpanded(value: (/* event */ Event, /* ui */ GroupExpandedEventUIParam) => Unit): Self = this.set("groupExpanded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroupExpanded: Self = this.set("groupExpanded", js.undefined)
    
    @scala.inline
    def setGroupExpanding(value: (/* event */ Event, /* ui */ GroupExpandingEventUIParam) => Unit): Self = this.set("groupExpanding", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroupExpanding: Self = this.set("groupExpanding", js.undefined)
    
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
  }
}
