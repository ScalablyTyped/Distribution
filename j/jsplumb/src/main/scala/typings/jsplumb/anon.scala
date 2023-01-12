package typings.jsplumb

import typings.jsplumb.mod.Connection
import typings.jsplumb.mod.ContinuousAnchorFace
import typings.jsplumb.mod.PerimeterShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AnchorCount extends StObject {
    
    var anchorCount: js.UndefOr[Double] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var shape: js.UndefOr[PerimeterShape] = js.undefined
  }
  object AnchorCount {
    
    inline def apply(): AnchorCount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorCount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnchorCount] (val x: Self) extends AnyVal {
      
      inline def setAnchorCount(value: Double): Self = StObject.set(x, "anchorCount", value.asInstanceOf[js.Any])
      
      inline def setAnchorCountUndefined: Self = StObject.set(x, "anchorCount", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setShape(value: PerimeterShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    }
  }
  
  trait BorderStyle extends StObject {
    
    var borderStyle: js.UndefOr[String] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    // integer
    var padding: js.UndefOr[Double] = js.undefined
  }
  object BorderStyle {
    
    inline def apply(): BorderStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BorderStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BorderStyle] (val x: Self) extends AnyVal {
      
      inline def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  trait Each extends StObject {
    
    def each(fn: js.Function1[/* conn */ Connection, Unit]): Unit
  }
  object Each {
    
    inline def apply(each: js.Function1[/* conn */ Connection, Unit] => Unit): Each = {
      val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each))
      __obj.asInstanceOf[Each]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Each] (val x: Self) extends AnyVal {
      
      inline def setEach(value: js.Function1[/* conn */ Connection, Unit] => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
    }
  }
  
  trait Faces extends StObject {
    
    var faces: js.UndefOr[js.Array[ContinuousAnchorFace]] = js.undefined
  }
  object Faces {
    
    inline def apply(): Faces = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Faces]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Faces] (val x: Self) extends AnyVal {
      
      inline def setFaces(value: js.Array[ContinuousAnchorFace]): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
      
      inline def setFacesUndefined: Self = StObject.set(x, "faces", js.undefined)
      
      inline def setFacesVarargs(value: ContinuousAnchorFace*): Self = StObject.set(x, "faces", js.Array(value*))
    }
  }
}
