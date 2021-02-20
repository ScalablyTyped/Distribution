package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTileManagerSplitterOptionsEvents
  extends /**
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
  var collapsed: js.UndefOr[js.Any] = js.native
  
  /**
    * Event fired after expanding is performed. Not cancellable.
    *
    *                     Function takes arguments evt and ui.
    *                     Use ui.owner to get a reference to the splitter instance.
    *                     Use ui.index to get an index of expanded panel.
    */
  var expanded: js.UndefOr[js.Any] = js.native
}
object IgTileManagerSplitterOptionsEvents {
  
  @scala.inline
  def apply(): IgTileManagerSplitterOptionsEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTileManagerSplitterOptionsEvents]
  }
  
  @scala.inline
  implicit class IgTileManagerSplitterOptionsEventsMutableBuilder[Self <: IgTileManagerSplitterOptionsEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsed(value: js.Any): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    @scala.inline
    def setExpanded(value: js.Any): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
  }
}
