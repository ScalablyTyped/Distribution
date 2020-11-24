package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTileManagerSplitterOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets whether the splitter should be initially collapsed.
    *
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets whether the splitter can be collapsible.
    *
    */
  var collapsible: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets whether the splitter should be enabled.
    *
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets splitter events.
    *
    */
  var events: js.UndefOr[IgTileManagerSplitterOptionsEvents] = js.native
}
object IgTileManagerSplitterOptions {
  
  @scala.inline
  def apply(): IgTileManagerSplitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTileManagerSplitterOptions]
  }
  
  @scala.inline
  implicit class IgTileManagerSplitterOptionsOps[Self <: IgTileManagerSplitterOptions] (val x: Self) extends AnyVal {
    
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
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = this.set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsible: Self = this.set("collapsible", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setEvents(value: IgTileManagerSplitterOptionsEvents): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
  }
}
