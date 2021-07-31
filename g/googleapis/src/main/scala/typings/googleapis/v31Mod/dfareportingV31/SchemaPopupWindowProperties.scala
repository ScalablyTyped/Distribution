package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Popup Window Properties.
  */
trait SchemaPopupWindowProperties extends StObject {
  
  /**
    * Popup dimension for a creative. This is a read-only field. Applicable to
    * the following creative types: all RICH_MEDIA and all VPAID
    */
  var dimension: js.UndefOr[SchemaSize] = js.undefined
  
  /**
    * Upper-left corner coordinates of the popup window. Applicable if
    * positionType is COORDINATES.
    */
  var offset: js.UndefOr[SchemaOffsetPosition] = js.undefined
  
  /**
    * Popup window position either centered or at specific coordinate.
    */
  var positionType: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to display the browser address bar.
    */
  var showAddressBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to display the browser menu bar.
    */
  var showMenuBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to display the browser scroll bar.
    */
  var showScrollBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to display the browser status bar.
    */
  var showStatusBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to display the browser tool bar.
    */
  var showToolBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Title of popup window.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaPopupWindowProperties {
  
  @scala.inline
  def apply(): SchemaPopupWindowProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPopupWindowProperties]
  }
  
  @scala.inline
  implicit class SchemaPopupWindowPropertiesMutableBuilder[Self <: SchemaPopupWindowProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimension(value: SchemaSize): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    @scala.inline
    def setOffset(value: SchemaOffsetPosition): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPositionType(value: String): Self = StObject.set(x, "positionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionTypeUndefined: Self = StObject.set(x, "positionType", js.undefined)
    
    @scala.inline
    def setShowAddressBar(value: Boolean): Self = StObject.set(x, "showAddressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAddressBarUndefined: Self = StObject.set(x, "showAddressBar", js.undefined)
    
    @scala.inline
    def setShowMenuBar(value: Boolean): Self = StObject.set(x, "showMenuBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMenuBarUndefined: Self = StObject.set(x, "showMenuBar", js.undefined)
    
    @scala.inline
    def setShowScrollBar(value: Boolean): Self = StObject.set(x, "showScrollBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowScrollBarUndefined: Self = StObject.set(x, "showScrollBar", js.undefined)
    
    @scala.inline
    def setShowStatusBar(value: Boolean): Self = StObject.set(x, "showStatusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowStatusBarUndefined: Self = StObject.set(x, "showStatusBar", js.undefined)
    
    @scala.inline
    def setShowToolBar(value: Boolean): Self = StObject.set(x, "showToolBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowToolBarUndefined: Self = StObject.set(x, "showToolBar", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
