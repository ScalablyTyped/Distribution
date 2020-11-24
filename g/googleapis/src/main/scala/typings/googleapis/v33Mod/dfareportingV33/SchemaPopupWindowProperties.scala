package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Popup Window Properties.
  */
@js.native
trait SchemaPopupWindowProperties extends js.Object {
  
  /**
    * Popup dimension for a creative. This is a read-only field. Applicable to
    * the following creative types: all RICH_MEDIA and all VPAID
    */
  var dimension: js.UndefOr[SchemaSize] = js.native
  
  /**
    * Upper-left corner coordinates of the popup window. Applicable if
    * positionType is COORDINATES.
    */
  var offset: js.UndefOr[SchemaOffsetPosition] = js.native
  
  /**
    * Popup window position either centered or at specific coordinate.
    */
  var positionType: js.UndefOr[String] = js.native
  
  /**
    * Whether to display the browser address bar.
    */
  var showAddressBar: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display the browser menu bar.
    */
  var showMenuBar: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display the browser scroll bar.
    */
  var showScrollBar: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display the browser status bar.
    */
  var showStatusBar: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to display the browser tool bar.
    */
  var showToolBar: js.UndefOr[Boolean] = js.native
  
  /**
    * Title of popup window.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaPopupWindowProperties {
  
  @scala.inline
  def apply(): SchemaPopupWindowProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPopupWindowProperties]
  }
  
  @scala.inline
  implicit class SchemaPopupWindowPropertiesOps[Self <: SchemaPopupWindowProperties] (val x: Self) extends AnyVal {
    
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
    def setDimension(value: SchemaSize): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    
    @scala.inline
    def setOffset(value: SchemaOffsetPosition): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPositionType(value: String): Self = this.set("positionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionType: Self = this.set("positionType", js.undefined)
    
    @scala.inline
    def setShowAddressBar(value: Boolean): Self = this.set("showAddressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAddressBar: Self = this.set("showAddressBar", js.undefined)
    
    @scala.inline
    def setShowMenuBar(value: Boolean): Self = this.set("showMenuBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMenuBar: Self = this.set("showMenuBar", js.undefined)
    
    @scala.inline
    def setShowScrollBar(value: Boolean): Self = this.set("showScrollBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowScrollBar: Self = this.set("showScrollBar", js.undefined)
    
    @scala.inline
    def setShowStatusBar(value: Boolean): Self = this.set("showStatusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowStatusBar: Self = this.set("showStatusBar", js.undefined)
    
    @scala.inline
    def setShowToolBar(value: Boolean): Self = this.set("showToolBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowToolBar: Self = this.set("showToolBar", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
