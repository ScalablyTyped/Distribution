package typings.makerjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import typings.danmarshallJscadTypings.typesCsgMod.CSG.ICircleOptions
import typings.danmarshallJscadTypings.typesCsgMod.CSG.Vector2D
import typings.danmarshallJscadTypings.typesMod.CAG
import typings.makerjs.MakerJs.IModel
import typings.makerjs.MakerJs.IPath
import typings.makerjs.MakerJs.IPathLine
import typings.makerjs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Existed extends StObject {
    
    var existed: Boolean
    
    var pointId: Double
  }
  object Existed {
    
    inline def apply(existed: Boolean, pointId: Double): Existed = {
      val __obj = js.Dynamic.literal(existed = existed.asInstanceOf[js.Any], pointId = pointId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Existed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Existed] (val x: Self) extends AnyVal {
      
      inline def setExisted(value: Boolean): Self = StObject.set(x, "existed", value.asInstanceOf[js.Any])
      
      inline def setPointId(value: Double): Self = StObject.set(x, "pointId", value.asInstanceOf[js.Any])
    }
  }
  
  trait HullPoints extends StObject {
    
    var hullPoints: js.UndefOr[js.Array[IPoint]] = js.undefined
    
    var keyPoints: js.UndefOr[js.Array[IPoint]] = js.undefined
  }
  object HullPoints {
    
    inline def apply(): HullPoints = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HullPoints]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HullPoints] (val x: Self) extends AnyVal {
      
      inline def setHullPoints(value: js.Array[IPoint]): Self = StObject.set(x, "hullPoints", value.asInstanceOf[js.Any])
      
      inline def setHullPointsUndefined: Self = StObject.set(x, "hullPoints", js.undefined)
      
      inline def setHullPointsVarargs(value: IPoint*): Self = StObject.set(x, "hullPoints", js.Array(value*))
      
      inline def setKeyPoints(value: js.Array[IPoint]): Self = StObject.set(x, "keyPoints", value.asInstanceOf[js.Any])
      
      inline def setKeyPointsUndefined: Self = StObject.set(x, "keyPoints", js.undefined)
      
      inline def setKeyPointsVarargs(value: IPoint*): Self = StObject.set(x, "keyPoints", js.Array(value*))
    }
  }
  
  /* Inlined makerjs.MakerJs.ICaption & {  layer :string | undefined} */
  trait ICaptionlayerstringundefi extends StObject {
    
    /**
      * Invisible line to which the text is aligned.
      * The text will be horizontally and vertically centered on the center point of this line.
      * The text may be longer or shorter than the line, it is used only for position and angle.
      * The anchor line's endpoints may be omitted, in which the case the text will always remain non-angled, even if the model is rotated.
      */
    var anchor: IPathLine
    
    var layer: js.UndefOr[String] = js.undefined
    
    /**
      * Caption text.
      */
    var text: String
  }
  object ICaptionlayerstringundefi {
    
    inline def apply(anchor: IPathLine, text: String): ICaptionlayerstringundefi = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICaptionlayerstringundefi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICaptionlayerstringundefi] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: IPathLine): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left extends StObject {
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
  }
  object Left {
    
    inline def apply(): Left = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
  
  trait Offset extends StObject {
    
    var offset: IPoint
    
    var result: IPath | IModel
  }
  object Offset {
    
    inline def apply(offset: IPoint, result: IPath | IModel): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: IPoint): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setResult(value: IPath | IModel): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Progress extends StObject {
    
    var progress: js.UndefOr[Double] = js.undefined
  }
  object Progress {
    
    inline def apply(): Progress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Progress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    }
  }
  
  trait ScaleConversion extends StObject {
    
    var scaleConversion: Double
    
    var svgUnitType: String
  }
  object ScaleConversion {
    
    inline def apply(scaleConversion: Double, svgUnitType: String): ScaleConversion = {
      val __obj = js.Dynamic.literal(scaleConversion = scaleConversion.asInstanceOf[js.Any], svgUnitType = svgUnitType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleConversion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScaleConversion] (val x: Self) extends AnyVal {
      
      inline def setScaleConversion(value: Double): Self = StObject.set(x, "scaleConversion", value.asInstanceOf[js.Any])
      
      inline def setSvgUnitType(value: String): Self = StObject.set(x, "svgUnitType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofCAG
    extends StObject
       with Instantiable0[CAG] {
    
    def circle(options: ICircleOptions): typings.danmarshallJscadTypings.typesCsgMod.CAG = js.native
    
    def fromPoints(points: js.Array[NumberDictionary[Double] | Vector2D]): typings.danmarshallJscadTypings.typesCsgMod.CAG = js.native
  }
}
