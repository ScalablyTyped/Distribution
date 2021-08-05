package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTileManagerSplitterOptionsEvents
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Event fired after collapsing is performed. Not cancellable.
    *
    *                     Function takes arguments evt and ui.
    *                     Use ui.owner to get a reference to the splitter instance.
    *                     Use ui.index to get an index of collased panel.
    */
  var collapsed: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Event fired after expanding is performed. Not cancellable.
    *
    *                     Function takes arguments evt and ui.
    *                     Use ui.owner to get a reference to the splitter instance.
    *                     Use ui.index to get an index of expanded panel.
    */
  var expanded: js.UndefOr[js.Any] = js.undefined
}
object IgTileManagerSplitterOptionsEvents {
  
  inline def apply(): IgTileManagerSplitterOptionsEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTileManagerSplitterOptionsEvents]
  }
  
  extension [Self <: IgTileManagerSplitterOptionsEvents](x: Self) {
    
    inline def setCollapsed(value: js.Any): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setExpanded(value: js.Any): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
  }
}
