package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgSplitter
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Fired after collapsing is performed
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    *                 Use ui.index to get an index of collapsed panel.
    */
  var collapsed: js.UndefOr[CollapsedEvent] = js.native
  
  /**
    * Specifies drag delta of the split bar. In order to start dragging "move", the mouse has to be moved specific distance from its original position.
    *
    */
  var dragDelta: js.UndefOr[Double] = js.native
  
  /**
    * Fired after expanding is performed
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    *                 Use ui.index to get an index of expanded panel.
    */
  var expanded: js.UndefOr[ExpandedEvent] = js.native
  
  /**
    * Gets/Sets the height of the container.
    *
    *
    * Valid values:
    * "null" will fit the tree inside its parent container, if no other widths are defined.
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Fired after the panels are refreshed because of browser"s resizing.
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    */
  var layoutRefreshed: js.UndefOr[LayoutRefreshedEvent] = js.native
  
  /**
    * Fired before the panels are refreshed because of browser"s resizing.
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    */
  var layoutRefreshing: js.UndefOr[LayoutRefreshingEvent] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * Specifies the orientation of the splitter.
    *
    *
    * Valid values:
    * "vertical"
    * "horizontal"
    */
  var orientation: js.UndefOr[String] = js.native
  
  /**
    * Array of objects options that specify the panels settings. The panels are no more than two. Settings are specified via enumeration.
    *
    */
  var panels: js.UndefOr[js.Array[IgSplitterPanel]] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Fired after split bar move is performed
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    */
  var resizeEnded: js.UndefOr[ResizeEndedEvent] = js.native
  
  /**
    * Specifies whether the other splitters on the page will be resized as this splitter resizes.
    *
    */
  var resizeOtherSplitters: js.UndefOr[Boolean] = js.native
  
  /**
    * Fired before split bar move is performed
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    */
  var resizeStarted: js.UndefOr[ResizeStartedEvent] = js.native
  
  /**
    * Fired while split bar move is performed
    *
    *                 Function takes arguments evt and ui.
    *                 Use ui.owner to get a reference to the splitter instance.
    */
  var resizing: js.UndefOr[ResizingEvent] = js.native
  
  /**
    * Gets/Sets the width of the container.
    *
    *
    * Valid values:
    * "null" will stretch to fit data, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.native
}
object IgSplitter {
  
  @scala.inline
  def apply(): IgSplitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSplitter]
  }
  
  @scala.inline
  implicit class IgSplitterOps[Self <: IgSplitter] (val x: Self) extends AnyVal {
    
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
    def setCollapsed(value: (/* event */ Event, /* ui */ CollapsedEventUIParam) => Unit): Self = this.set("collapsed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setDragDelta(value: Double): Self = this.set("dragDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragDelta: Self = this.set("dragDelta", js.undefined)
    
    @scala.inline
    def setExpanded(value: (/* event */ Event, /* ui */ ExpandedEventUIParam) => Unit): Self = this.set("expanded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLayoutRefreshed(value: (/* event */ Event, /* ui */ LayoutRefreshedEventUIParam) => Unit): Self = this.set("layoutRefreshed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLayoutRefreshed: Self = this.set("layoutRefreshed", js.undefined)
    
    @scala.inline
    def setLayoutRefreshing(value: (/* event */ Event, /* ui */ LayoutRefreshingEventUIParam) => Unit): Self = this.set("layoutRefreshing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLayoutRefreshing: Self = this.set("layoutRefreshing", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPanelsVarargs(value: IgSplitterPanel*): Self = this.set("panels", js.Array(value :_*))
    
    @scala.inline
    def setPanels(value: js.Array[IgSplitterPanel]): Self = this.set("panels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanels: Self = this.set("panels", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
    
    @scala.inline
    def setResizeEnded(value: (/* event */ Event, /* ui */ ResizeEndedEventUIParam) => Unit): Self = this.set("resizeEnded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteResizeEnded: Self = this.set("resizeEnded", js.undefined)
    
    @scala.inline
    def setResizeOtherSplitters(value: Boolean): Self = this.set("resizeOtherSplitters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeOtherSplitters: Self = this.set("resizeOtherSplitters", js.undefined)
    
    @scala.inline
    def setResizeStarted(value: (/* event */ Event, /* ui */ ResizeStartedEventUIParam) => Unit): Self = this.set("resizeStarted", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteResizeStarted: Self = this.set("resizeStarted", js.undefined)
    
    @scala.inline
    def setResizing(value: (/* event */ Event, /* ui */ ResizingEventUIParam) => Unit): Self = this.set("resizing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteResizing: Self = this.set("resizing", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
