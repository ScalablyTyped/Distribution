package typings.jsplumb

import typings.jsplumb.mod.Connection
import typings.jsplumb.mod.ContinuousAnchorFace
import typings.jsplumb.mod.PerimeterShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AnchorCount extends StObject {
    
    var anchorCount: js.UndefOr[Double] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var shape: js.UndefOr[PerimeterShape] = js.native
  }
  object AnchorCount {
    
    @scala.inline
    def apply(): AnchorCount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorCount]
    }
    
    @scala.inline
    implicit class AnchorCountMutableBuilder[Self <: AnchorCount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorCount(value: Double): Self = StObject.set(x, "anchorCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorCountUndefined: Self = StObject.set(x, "anchorCount", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setShape(value: PerimeterShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    }
  }
  
  @js.native
  trait BorderStyle extends StObject {
    
    var borderStyle: js.UndefOr[String] = js.native
    
    var borderWidth: js.UndefOr[Double] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var fill: js.UndefOr[String] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    // integer
    var padding: js.UndefOr[Double] = js.native
  }
  object BorderStyle {
    
    @scala.inline
    def apply(): BorderStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BorderStyle]
    }
    
    @scala.inline
    implicit class BorderStyleMutableBuilder[Self <: BorderStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  @js.native
  trait Each extends StObject {
    
    def each(fn: js.Function1[/* conn */ Connection, Unit]): Unit = js.native
  }
  object Each {
    
    @scala.inline
    def apply(each: js.Function1[/* conn */ Connection, Unit] => Unit): Each = {
      val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each))
      __obj.asInstanceOf[Each]
    }
    
    @scala.inline
    implicit class EachMutableBuilder[Self <: Each] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEach(value: js.Function1[/* conn */ Connection, Unit] => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Faces extends StObject {
    
    var faces: js.UndefOr[js.Array[ContinuousAnchorFace]] = js.native
  }
  object Faces {
    
    @scala.inline
    def apply(): Faces = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Faces]
    }
    
    @scala.inline
    implicit class FacesMutableBuilder[Self <: Faces] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFaces(value: js.Array[ContinuousAnchorFace]): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacesUndefined: Self = StObject.set(x, "faces", js.undefined)
      
      @scala.inline
      def setFacesVarargs(value: ContinuousAnchorFace*): Self = StObject.set(x, "faces", js.Array(value :_*))
    }
  }
}
