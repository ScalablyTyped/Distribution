package typings.heremaps.H.map

import typings.heremaps.H.map.SpatialStyle.LineCap
import typings.heremaps.H.map.SpatialStyle.LineJoin
import typings.heremaps.H.map.SpatialStyle.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SpatialStyle class represents a style with which spatial objects like polylines and polygons are drawn. A SpatialStyle instance is always treated as immutable to avoid inconstiencies
  * and must not modified.
  * @property strokeColor {string} - The color of the stroke in CSS syntax, default is 'rgba(0, 85, 170, 0.6)'.
  * @property fillColor {string} - The filling color in CSS syntax, default is 'rgba(0, 85, 170, 0.4)'.
  * @property lineWidth {number} - The width of the line in pixels, default is 2.
  * @property lineCap {H.map.SpatialStyle.LineCap} - The style of the end caps for a line, default is 'round'.
  * @property lineJoin {H.map.SpatialStyle.LineJoin} - The type of corner created, when two lines meet, default is 'miter'.
  * @property miterLimit {number} - The miter length is the distance between the inner corner and the outer corner where two lines meet. The default is 10.
  * @property lineDash {Array<number>} - The line dash pattern as an even numbered list of distances to alternately produce a line and a space. The default is [].
  * @property lineDashOffset {number} - The phase offset of the line dash pattern The default is 0.
  * @property MAX_LINE_WIDTH {number} - This constant represents the maximum line width which can be used for rendering.
  * @property DEFAULT_STYLE {H.map.SpatialStyle} - This static member defines the default style for spatial objects on the map. It's value is
  * { strokeColor: '#05A', fillColor: 'rgba(0, 85, 170, 0.4)', lineWidth: 1, lineCap: 'round', lineJoin: 'miter', miterLimit: 10, lineDash: [], lineDashOffset: 0 }
  */
@js.native
trait SpatialStyle extends StObject {
  
  /**
    * This method checks value-equality with another style.
    * @param other {(H.map.SpatialStyle | H.map.SpatialStyle.Options)} - the style to compare with
    * @returns {boolean} - true if the styles are value-equal, otherwise false
    */
  def equals(other: SpatialStyle): Boolean = js.native
  def equals(other: Options): Boolean = js.native
  
  var fillColor: String = js.native
  
  /**
    * Returns a copy of spatial style object and replaces the passed style attributes into it.
    * @param opt_attributes {H.map.SpatialStyle.Options=} - The style attributes to set on the copied style instance
    * @returns {H.map.SpatialStyle}
    */
  def getCopy(): SpatialStyle = js.native
  def getCopy(opt_attributes: Options): SpatialStyle = js.native
  
  var lineCap: LineCap = js.native
  
  var lineDash: js.Array[Double] = js.native
  
  var lineDashOffset: Double = js.native
  
  var lineJoin: LineJoin = js.native
  
  var lineWidth: Double = js.native
  
  var miterLimit: Double = js.native
  
  var strokeColor: String = js.native
}
object SpatialStyle {
  
  /**
    * The style of the end caps for a line, one of 'butt', 'round' or 'square'.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.heremaps.heremapsStrings.butt
    - typings.heremaps.heremapsStrings.round
    - typings.heremaps.heremapsStrings.square
  */
  trait LineCap extends StObject
  object LineCap {
    
    inline def butt: typings.heremaps.heremapsStrings.butt = "butt".asInstanceOf[typings.heremaps.heremapsStrings.butt]
    
    inline def round: typings.heremaps.heremapsStrings.round = "round".asInstanceOf[typings.heremaps.heremapsStrings.round]
    
    inline def square: typings.heremaps.heremapsStrings.square = "square".asInstanceOf[typings.heremaps.heremapsStrings.square]
  }
  
  /**
    * The type of corner created, when two lines meet, one of 'round', 'bevel' or 'miter'.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.heremaps.heremapsStrings.round
    - typings.heremaps.heremapsStrings.bevel
    - typings.heremaps.heremapsStrings.miter
  */
  trait LineJoin extends StObject
  object LineJoin {
    
    inline def bevel: typings.heremaps.heremapsStrings.bevel = "bevel".asInstanceOf[typings.heremaps.heremapsStrings.bevel]
    
    inline def miter: typings.heremaps.heremapsStrings.miter = "miter".asInstanceOf[typings.heremaps.heremapsStrings.miter]
    
    inline def round: typings.heremaps.heremapsStrings.round = "round".asInstanceOf[typings.heremaps.heremapsStrings.round]
  }
  
  /**
    * Options used to initialize a style. If a property is not set, the default value from H.map.SpatialStyle is taken.
    * @property strokeColor {string=} - The color of the stroke in CSS syntax.
    * @property fillColor {string=} - The color of the stroke in CSS syntax.
    * @property lineWidth {number=} - The width of the line in pixels, default is 2. The maximum supported line width is 100.
    * @property lineCap {H.map.SpatialStyle.LineCap=} - The style of the end caps for a line.
    * @property lineJoin {H.map.SpatialStyle.LineJoin=} - The type of corner created, when two lines meet.
    * @property miterLimit {number=} - The miter limit in pixel, default is 10. The maximum supported miter limit is 100
    * @property lineDash {Array<number>} - The line dash pattern as an even numbered list of distances to alternately produce a line and a space. If the browser doesn't support this feature
    * this style property is ignored.
    * @property lineDashOffset {number=} - The phase offset of the line dash pattern
    */
  trait Options extends StObject {
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var lineCap: js.UndefOr[LineCap] = js.undefined
    
    var lineDash: js.UndefOr[js.Array[Double]] = js.undefined
    
    var lineDashOffset: js.UndefOr[Double] = js.undefined
    
    var lineJoin: js.UndefOr[LineJoin] = js.undefined
    
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    var miterLimit: js.UndefOr[Double] = js.undefined
    
    var strokeColor: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setLineCap(value: LineCap): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      inline def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
      
      inline def setLineDashOffsetUndefined: Self = StObject.set(x, "lineDashOffset", js.undefined)
      
      inline def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
      
      inline def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value :_*))
      
      inline def setLineJoin(value: LineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      inline def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    }
  }
}
