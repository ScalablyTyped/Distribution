package typings.leafletDraw.mod

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leafletDraw.mod.DrawOptions.DrawErrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditOptions {
  
  @js.native
  trait EditPolyVerticesEditOptions extends StObject {
    
    var drawError: js.UndefOr[DrawErrorOptions] = js.native
    
    var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
    
    var touchIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  }
  object EditPolyVerticesEditOptions {
    
    @scala.inline
    def apply(): EditPolyVerticesEditOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditPolyVerticesEditOptions]
    }
    
    @scala.inline
    implicit class EditPolyVerticesEditOptionsMutableBuilder[Self <: EditPolyVerticesEditOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawError(value: DrawErrorOptions): Self = StObject.set(x, "drawError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawErrorUndefined: Self = StObject.set(x, "drawError", js.undefined)
      
      @scala.inline
      def setIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setTouchIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "touchIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchIconUndefined: Self = StObject.set(x, "touchIcon", js.undefined)
    }
  }
  
  @js.native
  trait EditSimpleShapeOptions extends StObject {
    
    var moveIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
    
    var resizeIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
    
    var touchMoveIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
    
    var touchResizeIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.native
  }
  object EditSimpleShapeOptions {
    
    @scala.inline
    def apply(): EditSimpleShapeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditSimpleShapeOptions]
    }
    
    @scala.inline
    implicit class EditSimpleShapeOptionsMutableBuilder[Self <: EditSimpleShapeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMoveIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "moveIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveIconUndefined: Self = StObject.set(x, "moveIcon", js.undefined)
      
      @scala.inline
      def setResizeIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "resizeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeIconUndefined: Self = StObject.set(x, "resizeIcon", js.undefined)
      
      @scala.inline
      def setTouchMoveIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "touchMoveIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchMoveIconUndefined: Self = StObject.set(x, "touchMoveIcon", js.undefined)
      
      @scala.inline
      def setTouchResizeIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "touchResizeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchResizeIconUndefined: Self = StObject.set(x, "touchResizeIcon", js.undefined)
    }
  }
}
