package typings.gridTemplateParser

import typings.gridTemplateParser.mod.Track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<grid-template-parser.grid-template-parser.Area> */
  trait PartialArea extends StObject {
    
    var column: js.UndefOr[Track] = js.undefined
    
    var row: js.UndefOr[Track] = js.undefined
  }
  object PartialArea {
    
    inline def apply(): PartialArea = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialArea]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialArea] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Track): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setRow(value: Track): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  /* Inlined std.Partial<grid-template-parser.grid-template-parser.Rect> */
  trait PartialRect extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PartialRect {
    
    inline def apply(): PartialRect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRect] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
