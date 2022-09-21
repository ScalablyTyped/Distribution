package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTreeGridMultiColumnHeaders
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Event fired after the group collapsing has been executed and results are rendered.
    */
  var groupCollapsed: js.UndefOr[GroupCollapsedEvent] = js.undefined
  
  /**
    * Event fired before a group collapsing operation is executed.
    */
  var groupCollapsing: js.UndefOr[GroupCollapsingEvent] = js.undefined
  
  /**
    * Event fired after the group expanding has been executed and results are rendered.
    */
  var groupExpanded: js.UndefOr[GroupExpandedEvent] = js.undefined
  
  /**
    * Event fired before a group expanding operation is executed.
    */
  var groupExpanding: js.UndefOr[GroupExpandingEvent] = js.undefined
  
  /**
    * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
}
object IgTreeGridMultiColumnHeaders {
  
  inline def apply(): IgTreeGridMultiColumnHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridMultiColumnHeaders]
  }
  
  extension [Self <: IgTreeGridMultiColumnHeaders](x: Self) {
    
    inline def setGroupCollapsed(value: (/* event */ Event, /* ui */ GroupCollapsedEventUIParam) => Unit): Self = StObject.set(x, "groupCollapsed", js.Any.fromFunction2(value))
    
    inline def setGroupCollapsedUndefined: Self = StObject.set(x, "groupCollapsed", js.undefined)
    
    inline def setGroupCollapsing(value: (/* event */ Event, /* ui */ GroupCollapsingEventUIParam) => Unit): Self = StObject.set(x, "groupCollapsing", js.Any.fromFunction2(value))
    
    inline def setGroupCollapsingUndefined: Self = StObject.set(x, "groupCollapsing", js.undefined)
    
    inline def setGroupExpanded(value: (/* event */ Event, /* ui */ GroupExpandedEventUIParam) => Unit): Self = StObject.set(x, "groupExpanded", js.Any.fromFunction2(value))
    
    inline def setGroupExpandedUndefined: Self = StObject.set(x, "groupExpanded", js.undefined)
    
    inline def setGroupExpanding(value: (/* event */ Event, /* ui */ GroupExpandingEventUIParam) => Unit): Self = StObject.set(x, "groupExpanding", js.Any.fromFunction2(value))
    
    inline def setGroupExpandingUndefined: Self = StObject.set(x, "groupExpanding", js.undefined)
    
    inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
  }
}
