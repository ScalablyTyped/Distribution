package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotationControllable extends StObject {
  
  var annotation: Annotation = js.native
  
  var chart: Chart_ = js.native
  
  var collection: String = js.native
  
  var points: js.Array[Point] = js.native
}
object AnnotationControllable {
  
  @scala.inline
  def apply(annotation: Annotation, chart: Chart_, collection: String, points: js.Array[Point]): AnnotationControllable = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationControllable]
  }
  
  @scala.inline
  implicit class AnnotationControllableMutableBuilder[Self <: AnnotationControllable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation(value: Annotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: Chart_): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Point*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
