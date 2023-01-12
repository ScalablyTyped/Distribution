package typings.leafletPattern

import typings.leaflet.mod.Class
import typings.leafletPattern.leafletPatternStrings.butt
import typings.leafletPattern.leafletPatternStrings.evenodd
import typings.leafletPattern.leafletPatternStrings.inherit
import typings.leafletPattern.leafletPatternStrings.nonzero
import typings.leafletPattern.leafletPatternStrings.objectBoundingBox
import typings.leafletPattern.leafletPatternStrings.round
import typings.leafletPattern.leafletPatternStrings.square
import typings.leafletPattern.leafletPatternStrings.userSpaceOnUse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  @JSImport("leaflet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet", "Pattern")
  @js.native
  open class Pattern () extends Class {
    def this(options: PatternOptions) = this()
    
    def addShape(shape: PatternCircle): Unit = js.native
    def addShape(shape: PatternPath): Unit = js.native
    def addShape(shape: PatternRect): Unit = js.native
    def addShape(shape: PatternShape): Unit = js.native
    
    def addTo(map: Map): this.type = js.native
    
    def initialize(options: PatternOptions): Unit = js.native
    
    def onAdd(map: Map): Unit = js.native
    
    def onRemove(): Unit = js.native
    
    def redraw(): this.type = js.native
    
    def remove(): this.type = js.native
    
    def removeFrom(map: Map): this.type = js.native
    
    def setStyle(style: PatternOptions): this.type = js.native
  }
  
  @JSImport("leaflet", "PatternCircle")
  @js.native
  open class PatternCircle () extends PatternShape {
    def this(options: PatternCircleOptions) = this()
    
    def initialize(options: PatternCircleOptions): Unit = js.native
    
    def setStyle(style: PatternCircleOptions): this.type = js.native
  }
  
  @JSImport("leaflet", "PatternPath")
  @js.native
  open class PatternPath () extends PatternShape {
    def this(options: PatternPathOptions) = this()
    
    def initialize(options: PatternPathOptions): Unit = js.native
    
    def setStyle(style: PatternPathOptions): this.type = js.native
  }
  
  @JSImport("leaflet", "PatternRect")
  @js.native
  open class PatternRect () extends PatternShape {
    def this(options: PatternRectOptions) = this()
    
    def initialize(options: PatternRectOptions): Unit = js.native
    
    def setStyle(style: PatternRectOptions): this.type = js.native
  }
  
  @JSImport("leaflet", "PatternShape")
  @js.native
  open class PatternShape () extends Class {
    def this(options: PatternShapeOptions) = this()
    
    def addTo(pattern: Pattern): this.type = js.native
    def addTo(pattern: StripePattern_): this.type = js.native
    
    def initialize(options: PatternShapeOptions): Unit = js.native
    
    def onAdd(pattern: Pattern): Unit = js.native
    def onAdd(pattern: StripePattern_): Unit = js.native
    
    def redraw(): this.type = js.native
    
    def setShape(shape: PatternCircle): Unit = js.native
    def setShape(shape: PatternPath): Unit = js.native
    def setShape(shape: PatternRect): Unit = js.native
    
    def setStyle(style: PatternShapeOptions): this.type = js.native
  }
  
  @JSImport("leaflet", "StripePattern")
  @js.native
  open class StripePattern_ () extends Pattern {
    def this(options: StripePatternOptions) = this()
    
    def initialize(options: StripePatternOptions): Unit = js.native
    
    def setStyle(style: StripePatternOptions): this.type = js.native
  }
  
  inline def stripePattern(options: js.UndefOr[StripePatternOptions]): StripePattern_ = ^.asInstanceOf[js.Dynamic].applyDynamic("stripePattern")(options.asInstanceOf[js.Any]).asInstanceOf[StripePattern_]
  
  @js.native
  trait Map extends StObject {
    
    def addPattern(pattern: Pattern): Map = js.native
    def addPattern(pattern: StripePattern_): Map = js.native
    
    def hasPattern(pattern: Pattern): Boolean = js.native
    def hasPattern(pattern: StripePattern_): Boolean = js.native
    
    def removePattern(pattern: Pattern): Map = js.native
    def removePattern(pattern: StripePattern_): Map = js.native
  }
  
  trait PathOptions extends StObject {
    
    var fillPattern: js.UndefOr[Pattern | StripePattern_] = js.undefined
  }
  object PathOptions {
    
    inline def apply(): PathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathOptions] (val x: Self) extends AnyVal {
      
      inline def setFillPattern(value: Pattern | StripePattern_): Self = StObject.set(x, "fillPattern", value.asInstanceOf[js.Any])
      
      inline def setFillPatternUndefined: Self = StObject.set(x, "fillPattern", js.undefined)
    }
  }
  
  trait PatternCircleOptions
    extends StObject
       with PatternShapeOptions {
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PatternCircleOptions {
    
    inline def apply(): PatternCircleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternCircleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PatternCircleOptions] (val x: Self) extends AnyVal {
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait PatternOptions extends StObject {
    
    var angle: js.UndefOr[Double | Null] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var patternContentUnits: js.UndefOr[userSpaceOnUse | objectBoundingBox] = js.undefined
    
    var patternTransform: js.UndefOr[String | Null] = js.undefined
    
    var patternUnits: js.UndefOr[userSpaceOnUse | objectBoundingBox] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PatternOptions {
    
    inline def apply(): PatternOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PatternOptions] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleNull: Self = StObject.set(x, "angle", null)
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPatternContentUnits(value: userSpaceOnUse | objectBoundingBox): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
      
      inline def setPatternTransform(value: String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
      
      inline def setPatternTransformNull: Self = StObject.set(x, "patternTransform", null)
      
      inline def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
      
      inline def setPatternUnits(value: userSpaceOnUse | objectBoundingBox): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait PatternPathOptions
    extends StObject
       with PatternShapeOptions {
    
    var d: js.UndefOr[String | Null] = js.undefined
  }
  object PatternPathOptions {
    
    inline def apply(): PatternPathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternPathOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PatternPathOptions] (val x: Self) extends AnyVal {
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDNull: Self = StObject.set(x, "d", null)
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    }
  }
  
  trait PatternRectOptions
    extends StObject
       with PatternShapeOptions {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var rx: js.UndefOr[Double | Null] = js.undefined
    
    var ry: js.UndefOr[Double | Null] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PatternRectOptions {
    
    inline def apply(): PatternRectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternRectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PatternRectOptions] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxNull: Self = StObject.set(x, "rx", null)
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyNull: Self = StObject.set(x, "ry", null)
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait PatternShapeOptions extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var dashArray: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    var dashOffset: js.UndefOr[Double | Null] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var fillColor: js.UndefOr[String] = js.undefined
    
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    var fillPattern: js.UndefOr[Pattern | Null] = js.undefined
    
    var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.undefined
    
    var lineCap: js.UndefOr[butt | round | square | inherit] = js.undefined
    
    var lineJoin: js.UndefOr[butt | round | square | inherit] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var stroke: js.UndefOr[Boolean] = js.undefined
    
    var weight: js.UndefOr[Double] = js.undefined
  }
  object PatternShapeOptions {
    
    inline def apply(): PatternShapeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternShapeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PatternShapeOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDashArray(value: js.Array[Double]): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
      
      inline def setDashArrayNull: Self = StObject.set(x, "dashArray", null)
      
      inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
      
      inline def setDashArrayVarargs(value: Double*): Self = StObject.set(x, "dashArray", js.Array(value*))
      
      inline def setDashOffset(value: Double): Self = StObject.set(x, "dashOffset", value.asInstanceOf[js.Any])
      
      inline def setDashOffsetNull: Self = StObject.set(x, "dashOffset", null)
      
      inline def setDashOffsetUndefined: Self = StObject.set(x, "dashOffset", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillPattern(value: Pattern): Self = StObject.set(x, "fillPattern", value.asInstanceOf[js.Any])
      
      inline def setFillPatternNull: Self = StObject.set(x, "fillPattern", null)
      
      inline def setFillPatternUndefined: Self = StObject.set(x, "fillPattern", js.undefined)
      
      inline def setFillRule(value: nonzero | evenodd | inherit): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setLineCap(value: butt | round | square | inherit): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      inline def setLineJoin(value: butt | round | square | inherit): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setStroke(value: Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  trait StripePatternOptions
    extends StObject
       with PatternOptions {
    
    var color: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var spaceColor: js.UndefOr[String] = js.undefined
    
    var spaceOpacity: js.UndefOr[Double] = js.undefined
    
    var spaceWeight: js.UndefOr[Double] = js.undefined
    
    var weight: js.UndefOr[Double] = js.undefined
  }
  object StripePatternOptions {
    
    inline def apply(): StripePatternOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StripePatternOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StripePatternOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSpaceColor(value: String): Self = StObject.set(x, "spaceColor", value.asInstanceOf[js.Any])
      
      inline def setSpaceColorUndefined: Self = StObject.set(x, "spaceColor", js.undefined)
      
      inline def setSpaceOpacity(value: Double): Self = StObject.set(x, "spaceOpacity", value.asInstanceOf[js.Any])
      
      inline def setSpaceOpacityUndefined: Self = StObject.set(x, "spaceOpacity", js.undefined)
      
      inline def setSpaceWeight(value: Double): Self = StObject.set(x, "spaceWeight", value.asInstanceOf[js.Any])
      
      inline def setSpaceWeightUndefined: Self = StObject.set(x, "spaceWeight", js.undefined)
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
}
