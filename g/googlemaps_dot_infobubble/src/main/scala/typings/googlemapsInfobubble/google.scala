package typings.googlemapsInfobubble

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.Map
import typings.googlemaps.google.maps.Marker
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object google {
  
  object maps {
    
    /**
      * @name CSS3 InfoBubble with tabs for Google Maps API V3
      * @version 0.8
      * @author Luke Mahe
      * @fileoverview
      * This library is a CSS Infobubble with tabs. It uses css3 rounded corners and
      * drop shadows and animations. It also allows tabs
      */
    /*
    The MIT License
    Copyright (c) 2014 https://github.com/Dashue
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.
    */
    object infobubble {
      
      trait InfoBubble extends StObject {
        
        /**
          * Closes the infobubble
          */
        def close(): Unit
        
        /**
          * Returns the position of the InfoBubble
          */
        def getPosition(): LatLng
        
        /**
          * Checks if the infobubble is currently open
          */
        def isOpen(): Boolean
        
        /**
          * Opens the infobubble
          * @map The google map object
          * @marker The marker used for anchoring the infobubble to
          */
        def open(map: Map[Element], marker: Marker): Unit
      }
      object InfoBubble {
        
        @scala.inline
        def apply(
          close: () => Unit,
          getPosition: () => LatLng,
          isOpen: () => Boolean,
          open: (Map[Element], Marker) => Unit
        ): InfoBubble = {
          val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getPosition = js.Any.fromFunction0(getPosition), isOpen = js.Any.fromFunction0(isOpen), open = js.Any.fromFunction2(open))
          __obj.asInstanceOf[InfoBubble]
        }
        
        @scala.inline
        implicit class InfoBubbleMutableBuilder[Self <: InfoBubble] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
          
          @scala.inline
          def setGetPosition(value: () => LatLng): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
          
          @scala.inline
          def setIsOpen(value: () => Boolean): Self = StObject.set(x, "isOpen", js.Any.fromFunction0(value))
          
          @scala.inline
          def setOpen(value: (Map[Element], Marker) => Unit): Self = StObject.set(x, "open", js.Any.fromFunction2(value))
        }
      }
      
      trait InfoBubbleOptions extends StObject {
        
        /**
          * Percentage from the bottom left corner of the infobubble
          */
        var arrowPosition: js.UndefOr[Double] = js.undefined
        
        var arrowSize: js.UndefOr[Double] = js.undefined
        
        /**
          * 0: Middle, 1: Left, 2: Right
          */
        var arrowStyle: js.UndefOr[Double] = js.undefined
        
        var backgroundColor: js.UndefOr[String] = js.undefined
        
        var borderColor: js.UndefOr[String] = js.undefined
        
        var borderRadius: js.UndefOr[Double] = js.undefined
        
        var borderWidth: js.UndefOr[Double] = js.undefined
        
        var disableAnimation: js.UndefOr[Boolean] = js.undefined
        
        var disableAutoPan: js.UndefOr[Boolean] = js.undefined
        
        var maxHeight: js.UndefOr[Double] = js.undefined
        
        var maxWidth: js.UndefOr[Double] = js.undefined
        
        var minHeight: js.UndefOr[Double] = js.undefined
        
        var minWidth: js.UndefOr[Double] = js.undefined
        
        var padding: js.UndefOr[Double] = js.undefined
        
        /**
          * 0: None, 1: Right, 2: Under
          */
        var shadowStyle: js.UndefOr[Double] = js.undefined
      }
      object InfoBubbleOptions {
        
        @scala.inline
        def apply(): InfoBubbleOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[InfoBubbleOptions]
        }
        
        @scala.inline
        implicit class InfoBubbleOptionsMutableBuilder[Self <: InfoBubbleOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setArrowPosition(value: Double): Self = StObject.set(x, "arrowPosition", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setArrowPositionUndefined: Self = StObject.set(x, "arrowPosition", js.undefined)
          
          @scala.inline
          def setArrowSize(value: Double): Self = StObject.set(x, "arrowSize", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setArrowSizeUndefined: Self = StObject.set(x, "arrowSize", js.undefined)
          
          @scala.inline
          def setArrowStyle(value: Double): Self = StObject.set(x, "arrowStyle", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setArrowStyleUndefined: Self = StObject.set(x, "arrowStyle", js.undefined)
          
          @scala.inline
          def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
          
          @scala.inline
          def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
          
          @scala.inline
          def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
          
          @scala.inline
          def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
          
          @scala.inline
          def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
          
          @scala.inline
          def setDisableAutoPan(value: Boolean): Self = StObject.set(x, "disableAutoPan", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisableAutoPanUndefined: Self = StObject.set(x, "disableAutoPan", js.undefined)
          
          @scala.inline
          def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
          
          @scala.inline
          def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
          
          @scala.inline
          def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
          
          @scala.inline
          def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
          
          @scala.inline
          def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
          
          @scala.inline
          def setShadowStyle(value: Double): Self = StObject.set(x, "shadowStyle", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setShadowStyleUndefined: Self = StObject.set(x, "shadowStyle", js.undefined)
        }
      }
    }
  }
}
