package typings.luminoWidgets.dockpanelMod.DockPanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for creating a dock panel.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The sizes of the edge drop zones, in pixels.
    * If not given, default values will be used.
    */
  var edges: js.UndefOr[IEdges] = js.native
  
  /**
    * The mode for the dock panel.
    *
    * The deafult is `'multiple-document'`.
    */
  var mode: js.UndefOr[Mode] = js.native
  
  /**
    * The overlay to use with the dock panel.
    *
    * The default is a new `Overlay` instance.
    */
  var overlay: js.UndefOr[IOverlay] = js.native
  
  /**
    * The renderer to use for the dock panel.
    *
    * The default is a shared renderer instance.
    */
  var renderer: js.UndefOr[IRenderer] = js.native
  
  /**
    * The spacing between the items in the panel.
    *
    * The default is `4`.
    */
  var spacing: js.UndefOr[Double] = js.native
  
  /**
    * Allow tabs to be draggable / movable by user.
    *
    * The default is `'true'`.
    */
  var tabsMovable: js.UndefOr[Boolean] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setEdges(value: IEdges): Self = this.set("edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdges: Self = this.set("edges", js.undefined)
    
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOverlay(value: IOverlay): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setRenderer(value: IRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    
    @scala.inline
    def setTabsMovable(value: Boolean): Self = this.set("tabsMovable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabsMovable: Self = this.set("tabsMovable", js.undefined)
  }
}
