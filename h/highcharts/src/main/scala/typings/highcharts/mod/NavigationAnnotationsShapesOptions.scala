package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationAnnotationsShapesOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Name of the dash style to use
    * for the shape's stroke.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's fill.
    */
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The height of the shape.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Id of the marker which will be
    * drawn at the final vertex of the path. Custom markers can be defined in
    * defs property.
    */
  var markerEnd: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Id of the marker which will be
    * drawn at the first vertex of the path. Custom markers can be defined in
    * defs property.
    */
  var markerStart: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) This option defines the point to
    * which the shape will be connected. It can be either the point which
    * exists in the series - it is referenced by the point's id - or a new
    * point with defined x, y properties and optionally axes.
    */
  var point: js.UndefOr[String | AnnotationMockPointOptionsObject] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) An array of points for the
    * shape. This option is available for shapes which can use multiple points
    * such as path. A point can be either a point object or a point's id.
    */
  var points: js.UndefOr[js.Array[String | AnnotationMockPointOptionsObject]] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The radius of the shape.
    */
  var r: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Defines additional snapping area
    * around an annotation making this annotation to focus. Defined in pixels.
    */
  var snap: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The URL for an image to use as
    * the annotation shape. Note, type has to be set to `'image'`.
    */
  var src: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the shape's stroke.
    */
  var stroke: js.UndefOr[ColorString] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel stroke width of the
    * shape.
    */
  var strokeWidth: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The type of the shape, e.g.
    * circle or rectangle.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The width of the shape.
    */
  var width: js.UndefOr[Double] = js.native
}
object NavigationAnnotationsShapesOptions {
  
  @scala.inline
  def apply(): NavigationAnnotationsShapesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationAnnotationsShapesOptions]
  }
  
  @scala.inline
  implicit class NavigationAnnotationsShapesOptionsMutableBuilder[Self <: NavigationAnnotationsShapesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashStyle(value: DashStyleValue): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    @scala.inline
    def setFill(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
    
    @scala.inline
    def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
    
    @scala.inline
    def setPoint(value: String | AnnotationMockPointOptionsObject): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[String | AnnotationMockPointOptionsObject]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: (String | AnnotationMockPointOptionsObject)*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setSnap(value: Double): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setStroke(value: ColorString): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
