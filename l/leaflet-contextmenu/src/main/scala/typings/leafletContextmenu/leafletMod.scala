package typings.leafletContextmenu

import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Map_
import typings.leaflet.mod.Marker_
import typings.leaflet.mod.Path
import typings.leaflet.mod.Point_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  trait ContextMenuItem extends StObject {
    
    // map is the scope where contextmenu is defined.
    var callback: js.UndefOr[
        js.Function2[/* ev */ ContextMenuItemClickEvent, /* map */ js.UndefOr[Map_], Unit]
      ] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hideOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var iconCls: js.UndefOr[String] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var retinaIcon: js.UndefOr[String] = js.undefined
    
    var retinaIconCls: js.UndefOr[String] = js.undefined
    
    var separator: js.UndefOr[Boolean] = js.undefined
    
    var text: String
  }
  object ContextMenuItem {
    
    inline def apply(text: String): ContextMenuItem = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuItem] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: (/* ev */ ContextMenuItemClickEvent, /* map */ js.UndefOr[Map_]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHideOnSelect(value: Boolean): Self = StObject.set(x, "hideOnSelect", value.asInstanceOf[js.Any])
      
      inline def setHideOnSelectUndefined: Self = StObject.set(x, "hideOnSelect", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconCls(value: String): Self = StObject.set(x, "iconCls", value.asInstanceOf[js.Any])
      
      inline def setIconClsUndefined: Self = StObject.set(x, "iconCls", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setRetinaIcon(value: String): Self = StObject.set(x, "retinaIcon", value.asInstanceOf[js.Any])
      
      inline def setRetinaIconCls(value: String): Self = StObject.set(x, "retinaIconCls", value.asInstanceOf[js.Any])
      
      inline def setRetinaIconClsUndefined: Self = StObject.set(x, "retinaIconCls", js.undefined)
      
      inline def setRetinaIconUndefined: Self = StObject.set(x, "retinaIcon", js.undefined)
      
      inline def setSeparator(value: Boolean): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextMenuItemClickEvent extends StObject {
    
    var containerPoint: Point_
    
    var latlng: LatLng_
    
    var layerPoint: Point_
    
    var relatedTarget: js.UndefOr[Marker_[Any] | Path] = js.undefined
  }
  object ContextMenuItemClickEvent {
    
    inline def apply(containerPoint: Point_, latlng: LatLng_, layerPoint: Point_): ContextMenuItemClickEvent = {
      val __obj = js.Dynamic.literal(containerPoint = containerPoint.asInstanceOf[js.Any], latlng = latlng.asInstanceOf[js.Any], layerPoint = layerPoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuItemClickEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuItemClickEvent] (val x: Self) extends AnyVal {
      
      inline def setContainerPoint(value: Point_): Self = StObject.set(x, "containerPoint", value.asInstanceOf[js.Any])
      
      inline def setLatlng(value: LatLng_): Self = StObject.set(x, "latlng", value.asInstanceOf[js.Any])
      
      inline def setLayerPoint(value: Point_): Self = StObject.set(x, "layerPoint", value.asInstanceOf[js.Any])
      
      inline def setRelatedTarget(value: Marker_[Any] | Path): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
      
      inline def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
    }
  }
  
  trait MapOptions extends StObject {
    
    var contextmenu: Boolean
    
    var contextmenuItems: js.Array[ContextMenuItem]
  }
  object MapOptions {
    
    inline def apply(contextmenu: Boolean, contextmenuItems: js.Array[ContextMenuItem]): MapOptions = {
      val __obj = js.Dynamic.literal(contextmenu = contextmenu.asInstanceOf[js.Any], contextmenuItems = contextmenuItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
      
      inline def setContextmenu(value: Boolean): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      inline def setContextmenuItems(value: js.Array[ContextMenuItem]): Self = StObject.set(x, "contextmenuItems", value.asInstanceOf[js.Any])
      
      inline def setContextmenuItemsVarargs(value: ContextMenuItem*): Self = StObject.set(x, "contextmenuItems", js.Array(value*))
    }
  }
  
  trait MarkerOptions extends StObject {
    
    var contextmenu: Boolean
    
    var contextmenuItems: js.Array[ContextMenuItem]
  }
  object MarkerOptions {
    
    inline def apply(contextmenu: Boolean, contextmenuItems: js.Array[ContextMenuItem]): MarkerOptions = {
      val __obj = js.Dynamic.literal(contextmenu = contextmenu.asInstanceOf[js.Any], contextmenuItems = contextmenuItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkerOptions] (val x: Self) extends AnyVal {
      
      inline def setContextmenu(value: Boolean): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      inline def setContextmenuItems(value: js.Array[ContextMenuItem]): Self = StObject.set(x, "contextmenuItems", value.asInstanceOf[js.Any])
      
      inline def setContextmenuItemsVarargs(value: ContextMenuItem*): Self = StObject.set(x, "contextmenuItems", js.Array(value*))
    }
  }
}
