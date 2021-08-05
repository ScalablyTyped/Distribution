package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTileManagerSplitterOptions
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets whether the splitter should be initially collapsed.
    *
    */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets whether the splitter can be collapsible.
    *
    */
  var collapsible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets whether the splitter should be enabled.
    *
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets splitter events.
    *
    */
  var events: js.UndefOr[IgTileManagerSplitterOptionsEvents] = js.undefined
}
object IgTileManagerSplitterOptions {
  
  inline def apply(): IgTileManagerSplitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTileManagerSplitterOptions]
  }
  
  extension [Self <: IgTileManagerSplitterOptions](x: Self) {
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEvents(value: IgTileManagerSplitterOptionsEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
  }
}
