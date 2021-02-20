package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridMultiColumnHeaders
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
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.native
}
object IgGridMultiColumnHeaders {
  
  @scala.inline
  def apply(): IgGridMultiColumnHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridMultiColumnHeaders]
  }
  
  @scala.inline
  implicit class IgGridMultiColumnHeadersMutableBuilder[Self <: IgGridMultiColumnHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupCollapsed(value: (/* event */ Event, /* ui */ GroupCollapsedEventUIParam) => Unit): Self = StObject.set(x, "groupCollapsed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGroupCollapsedUndefined: Self = StObject.set(x, "groupCollapsed", js.undefined)
    
    @scala.inline
    def setGroupCollapsing(value: (/* event */ Event, /* ui */ GroupCollapsingEventUIParam) => Unit): Self = StObject.set(x, "groupCollapsing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGroupCollapsingUndefined: Self = StObject.set(x, "groupCollapsing", js.undefined)
    
    @scala.inline
    def setGroupExpanded(value: (/* event */ Event, /* ui */ GroupExpandedEventUIParam) => Unit): Self = StObject.set(x, "groupExpanded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGroupExpandedUndefined: Self = StObject.set(x, "groupExpanded", js.undefined)
    
    @scala.inline
    def setGroupExpanding(value: (/* event */ Event, /* ui */ GroupExpandingEventUIParam) => Unit): Self = StObject.set(x, "groupExpanding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGroupExpandingUndefined: Self = StObject.set(x, "groupExpanding", js.undefined)
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
  }
}
