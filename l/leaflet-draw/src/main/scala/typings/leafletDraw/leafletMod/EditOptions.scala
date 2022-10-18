package typings.leafletDraw.leafletMod

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leafletDraw.leafletMod.DrawOptions.DrawErrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditOptions {
  
  trait EditPolyVerticesEditOptions extends StObject {
    
    var drawError: js.UndefOr[DrawErrorOptions] = js.undefined
    
    var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
    
    var touchIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
  }
  object EditPolyVerticesEditOptions {
    
    inline def apply(): EditPolyVerticesEditOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditPolyVerticesEditOptions]
    }
    
    extension [Self <: EditPolyVerticesEditOptions](x: Self) {
      
      inline def setDrawError(value: DrawErrorOptions): Self = StObject.set(x, "drawError", value.asInstanceOf[js.Any])
      
      inline def setDrawErrorUndefined: Self = StObject.set(x, "drawError", js.undefined)
      
      inline def setIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setTouchIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "touchIcon", value.asInstanceOf[js.Any])
      
      inline def setTouchIconUndefined: Self = StObject.set(x, "touchIcon", js.undefined)
    }
  }
  
  trait EditSimpleShapeOptions extends StObject {
    
    var moveIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
    
    var resizeIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
    
    var touchMoveIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
    
    var touchResizeIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
  }
  object EditSimpleShapeOptions {
    
    inline def apply(): EditSimpleShapeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditSimpleShapeOptions]
    }
    
    extension [Self <: EditSimpleShapeOptions](x: Self) {
      
      inline def setMoveIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "moveIcon", value.asInstanceOf[js.Any])
      
      inline def setMoveIconUndefined: Self = StObject.set(x, "moveIcon", js.undefined)
      
      inline def setResizeIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "resizeIcon", value.asInstanceOf[js.Any])
      
      inline def setResizeIconUndefined: Self = StObject.set(x, "resizeIcon", js.undefined)
      
      inline def setTouchMoveIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "touchMoveIcon", value.asInstanceOf[js.Any])
      
      inline def setTouchMoveIconUndefined: Self = StObject.set(x, "touchMoveIcon", js.undefined)
      
      inline def setTouchResizeIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "touchResizeIcon", value.asInstanceOf[js.Any])
      
      inline def setTouchResizeIconUndefined: Self = StObject.set(x, "touchResizeIcon", js.undefined)
    }
  }
}
