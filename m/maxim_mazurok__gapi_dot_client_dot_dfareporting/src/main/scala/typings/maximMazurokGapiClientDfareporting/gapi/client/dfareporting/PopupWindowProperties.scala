package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupWindowProperties extends StObject {
  
  /** Popup dimension for a creative. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA and all VPAID */
  var dimension: js.UndefOr[Size] = js.undefined
  
  /** Upper-left corner coordinates of the popup window. Applicable if positionType is COORDINATES. */
  var offset: js.UndefOr[OffsetPosition] = js.undefined
  
  /** Popup window position either centered or at specific coordinate. */
  var positionType: js.UndefOr[String] = js.undefined
  
  /** Whether to display the browser address bar. */
  var showAddressBar: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to display the browser menu bar. */
  var showMenuBar: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to display the browser scroll bar. */
  var showScrollBar: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to display the browser status bar. */
  var showStatusBar: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to display the browser tool bar. */
  var showToolBar: js.UndefOr[Boolean] = js.undefined
  
  /** Title of popup window. */
  var title: js.UndefOr[String] = js.undefined
}
object PopupWindowProperties {
  
  inline def apply(): PopupWindowProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupWindowProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupWindowProperties] (val x: Self) extends AnyVal {
    
    inline def setDimension(value: Size): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setOffset(value: OffsetPosition): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPositionType(value: String): Self = StObject.set(x, "positionType", value.asInstanceOf[js.Any])
    
    inline def setPositionTypeUndefined: Self = StObject.set(x, "positionType", js.undefined)
    
    inline def setShowAddressBar(value: Boolean): Self = StObject.set(x, "showAddressBar", value.asInstanceOf[js.Any])
    
    inline def setShowAddressBarUndefined: Self = StObject.set(x, "showAddressBar", js.undefined)
    
    inline def setShowMenuBar(value: Boolean): Self = StObject.set(x, "showMenuBar", value.asInstanceOf[js.Any])
    
    inline def setShowMenuBarUndefined: Self = StObject.set(x, "showMenuBar", js.undefined)
    
    inline def setShowScrollBar(value: Boolean): Self = StObject.set(x, "showScrollBar", value.asInstanceOf[js.Any])
    
    inline def setShowScrollBarUndefined: Self = StObject.set(x, "showScrollBar", js.undefined)
    
    inline def setShowStatusBar(value: Boolean): Self = StObject.set(x, "showStatusBar", value.asInstanceOf[js.Any])
    
    inline def setShowStatusBarUndefined: Self = StObject.set(x, "showStatusBar", js.undefined)
    
    inline def setShowToolBar(value: Boolean): Self = StObject.set(x, "showToolBar", value.asInstanceOf[js.Any])
    
    inline def setShowToolBarUndefined: Self = StObject.set(x, "showToolBar", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
