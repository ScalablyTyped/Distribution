package typings.html2canvas

import typings.html2canvas.html2canvasInts.`0`
import typings.html2canvas.html2canvasInts.`1`
import typings.html2canvas.html2canvasInts.`2`
import typings.html2canvas.html2canvasInts.`3`
import typings.html2canvas.itypedescriptorMod.ITypeDescriptor
import typings.html2canvas.lengthPercentageMod.LengthPercentage
import typings.html2canvas.parserMod.CSSValue
import typings.html2canvas.typesColorMod.Color_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("html2canvas/dist/types/css/types/image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/css/types/image", "image")
  @js.native
  val image: ITypeDescriptor[ICSSImage] = js.native
  
  inline def isLinearGradient(background: ICSSImage): /* is html2canvas.html2canvas/dist/types/css/types/image.CSSLinearGradientImage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinearGradient")(background.asInstanceOf[js.Any]).asInstanceOf[/* is html2canvas.html2canvas/dist/types/css/types/image.CSSLinearGradientImage */ Boolean]
  
  inline def isRadialGradient(background: ICSSImage): /* is html2canvas.html2canvas/dist/types/css/types/image.CSSRadialGradientImage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRadialGradient")(background.asInstanceOf[js.Any]).asInstanceOf[/* is html2canvas.html2canvas/dist/types/css/types/image.CSSRadialGradientImage */ Boolean]
  
  inline def isSupportedImage(value: CSSValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedImage")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.html2canvasInts.`0`
    - typings.html2canvas.html2canvasInts.`1`
    - typings.html2canvas.html2canvasInts.`2`
  */
  trait CSSImageType extends StObject
  object CSSImageType {
    
    inline def LINEAR_GRADIENT: `1` = 1.asInstanceOf[`1`]
    
    inline def RADIAL_GRADIENT: `2` = 2.asInstanceOf[`2`]
    
    inline def URL: `0` = 0.asInstanceOf[`0`]
  }
  
  trait CSSLinearGradientImage
    extends StObject
       with ICSSGradientImage {
    
    var angle: Double | GradientCorner
    
    @JSName("type")
    var type_CSSLinearGradientImage: `1`
  }
  object CSSLinearGradientImage {
    
    inline def apply(angle: Double | GradientCorner, stops: js.Array[UnprocessedGradientColorStop]): CSSLinearGradientImage = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(1)
      __obj.asInstanceOf[CSSLinearGradientImage]
    }
    
    extension [Self <: CSSLinearGradientImage](x: Self) {
      
      inline def setAngle(value: Double | GradientCorner): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setType(value: `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.html2canvasInts.`0`
    - typings.html2canvas.html2canvasInts.`1`
    - typings.html2canvas.html2canvasInts.`2`
    - typings.html2canvas.html2canvasInts.`3`
  */
  trait CSSRadialExtent extends StObject
  object CSSRadialExtent {
    
    inline def CLOSEST_CORNER: `2` = 2.asInstanceOf[`2`]
    
    inline def CLOSEST_SIDE: `0` = 0.asInstanceOf[`0`]
    
    inline def FARTHEST_CORNER: `3` = 3.asInstanceOf[`3`]
    
    inline def FARTHEST_SIDE: `1` = 1.asInstanceOf[`1`]
  }
  
  trait CSSRadialGradientImage
    extends StObject
       with ICSSGradientImage {
    
    var position: js.Array[LengthPercentage]
    
    var shape: CSSRadialShape
    
    var size: CSSRadialSize
    
    @JSName("type")
    var type_CSSRadialGradientImage: `2`
  }
  object CSSRadialGradientImage {
    
    inline def apply(
      position: js.Array[LengthPercentage],
      shape: CSSRadialShape,
      size: CSSRadialSize,
      stops: js.Array[UnprocessedGradientColorStop]
    ): CSSRadialGradientImage = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(2)
      __obj.asInstanceOf[CSSRadialGradientImage]
    }
    
    extension [Self <: CSSRadialGradientImage](x: Self) {
      
      inline def setPosition(value: js.Array[LengthPercentage]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionVarargs(value: LengthPercentage*): Self = StObject.set(x, "position", js.Array(value*))
      
      inline def setShape(value: CSSRadialShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setSize(value: CSSRadialSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeVarargs(value: LengthPercentage*): Self = StObject.set(x, "size", js.Array(value*))
      
      inline def setType(value: `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.html2canvasInts.`0`
    - typings.html2canvas.html2canvasInts.`1`
  */
  trait CSSRadialShape extends StObject
  object CSSRadialShape {
    
    inline def CIRCLE: `0` = 0.asInstanceOf[`0`]
    
    inline def ELLIPSE: `1` = 1.asInstanceOf[`1`]
  }
  
  type CSSRadialSize = CSSRadialExtent | js.Array[LengthPercentage]
  
  trait CSSURLImage
    extends StObject
       with ICSSImage {
    
    @JSName("type")
    var type_CSSURLImage: `0`
    
    var url: String
  }
  object CSSURLImage {
    
    inline def apply(url: String): CSSURLImage = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(0)
      __obj.asInstanceOf[CSSURLImage]
    }
    
    extension [Self <: CSSURLImage](x: Self) {
      
      inline def setType(value: `0`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait GradientColorStop extends StObject {
    
    var color: Color_
    
    var stop: Double
  }
  object GradientColorStop {
    
    inline def apply(color: Color_, stop: Double): GradientColorStop = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
      __obj.asInstanceOf[GradientColorStop]
    }
    
    extension [Self <: GradientColorStop](x: Self) {
      
      inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    }
  }
  
  type GradientCorner = js.Tuple2[LengthPercentage, LengthPercentage]
  
  trait ICSSGradientImage
    extends StObject
       with ICSSImage {
    
    var stops: js.Array[UnprocessedGradientColorStop]
  }
  object ICSSGradientImage {
    
    inline def apply(stops: js.Array[UnprocessedGradientColorStop], `type`: CSSImageType): ICSSGradientImage = {
      val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICSSGradientImage]
    }
    
    extension [Self <: ICSSGradientImage](x: Self) {
      
      inline def setStops(value: js.Array[UnprocessedGradientColorStop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
      
      inline def setStopsVarargs(value: UnprocessedGradientColorStop*): Self = StObject.set(x, "stops", js.Array(value*))
    }
  }
  
  trait ICSSImage extends StObject {
    
    var `type`: CSSImageType
  }
  object ICSSImage {
    
    inline def apply(`type`: CSSImageType): ICSSImage = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICSSImage]
    }
    
    extension [Self <: ICSSImage](x: Self) {
      
      inline def setType(value: CSSImageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnprocessedGradientColorStop extends StObject {
    
    var color: Color_
    
    var stop: LengthPercentage | Null
  }
  object UnprocessedGradientColorStop {
    
    inline def apply(color: Color_): UnprocessedGradientColorStop = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], stop = null)
      __obj.asInstanceOf[UnprocessedGradientColorStop]
    }
    
    extension [Self <: UnprocessedGradientColorStop](x: Self) {
      
      inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setStop(value: LengthPercentage): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
      
      inline def setStopNull: Self = StObject.set(x, "stop", null)
    }
  }
}
