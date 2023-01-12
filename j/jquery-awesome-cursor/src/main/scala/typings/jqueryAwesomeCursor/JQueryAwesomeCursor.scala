package typings.jqueryAwesomeCursor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryAwesomeCursor {
  
  trait Font extends StObject {
    
    var cssClass: String | cssHandler
    
    var family: String
  }
  object Font {
    
    inline def apply(cssClass: String | cssHandler, family: String): Font = {
      val __obj = js.Dynamic.literal(cssClass = cssClass.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any])
      __obj.asInstanceOf[Font]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
      
      inline def setCssClass(value: String | cssHandler): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassFunction1(value: /* name */ String => Unit): Self = StObject.set(x, "cssClass", js.Any.fromFunction1(value))
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var flip: js.UndefOr[typings.jqueryAwesomeCursor.JQueryAwesomeCursor.flip] = js.undefined
    
    var font: js.UndefOr[Font] = js.undefined
    
    var hotspot: js.UndefOr[js.Array[Double] | String] = js.undefined
    
    var outline: js.UndefOr[String] = js.undefined
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFlip(value: flip): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setHotspot(value: js.Array[Double] | String): Self = StObject.set(x, "hotspot", value.asInstanceOf[js.Any])
      
      inline def setHotspotUndefined: Self = StObject.set(x, "hotspot", js.undefined)
      
      inline def setHotspotVarargs(value: Double*): Self = StObject.set(x, "hotspot", js.Array(value*))
      
      inline def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type cssHandler = js.Function1[/* name */ String, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.horizontal
    - typings.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.vertical
    - typings.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.both
  */
  trait flip extends StObject
  object flip {
    
    inline def both: typings.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.both = "both".asInstanceOf[typings.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.both]
    
    inline def horizontal: typings.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.horizontal = "horizontal".asInstanceOf[typings.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.horizontal]
    
    inline def vertical: typings.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.vertical = "vertical".asInstanceOf[typings.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.vertical]
  }
}
