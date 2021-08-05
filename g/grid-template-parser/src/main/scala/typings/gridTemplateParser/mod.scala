package typings.gridTemplateParser

import org.scalablytyped.runtime.StringDictionary
import typings.gridTemplateParser.anon.PartialArea
import typings.gridTemplateParser.anon.PartialRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("grid-template-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def area(): Area_ = ^.asInstanceOf[js.Dynamic].applyDynamic("area")().asInstanceOf[Area_]
  inline def area(rect: PartialRect): Area_ = ^.asInstanceOf[js.Dynamic].applyDynamic("area")(rect.asInstanceOf[js.Any]).asInstanceOf[Area_]
  
  inline def grid(template: String): Grid_ = ^.asInstanceOf[js.Dynamic].applyDynamic("grid")(template.asInstanceOf[js.Any]).asInstanceOf[Grid_]
  
  inline def maxColumnEnd(grid: Grid_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maxColumnEnd")(grid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def maxColumnStart(grid: Grid_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maxColumnStart")(grid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def maxRowEnd(grid: Grid_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maxRowEnd")(grid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def maxRowStart(grid: Grid_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("maxRowStart")(grid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def minColumnEnd(grid: Grid_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minColumnEnd")(grid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def minColumnStart(grid: Grid_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minColumnStart")(grid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def minRowEnd(grid: Grid_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minRowEnd")(grid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def minRowStart(grid: Grid_): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minRowStart")(grid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def rect(): Rect_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rect")().asInstanceOf[Rect_]
  inline def rect(area: PartialArea): Rect_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rect")(area.asInstanceOf[js.Any]).asInstanceOf[Rect_]
  
  inline def template(grid: Grid_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(grid.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Area_ extends StObject {
    
    var column: Track
    
    var row: Track
  }
  object Area_ {
    
    inline def apply(column: Track, row: Track): Area_ = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[Area_]
    }
    
    extension [Self <: Area_](x: Self) {
      
      inline def setColumn(value: Track): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Track): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  trait Grid_ extends StObject {
    
    var areas: StringDictionary[Area_]
    
    var height: Double
    
    var width: Double
  }
  object Grid_ {
    
    inline def apply(areas: StringDictionary[Area_], height: Double, width: Double): Grid_ = {
      val __obj = js.Dynamic.literal(areas = areas.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Grid_]
    }
    
    extension [Self <: Grid_](x: Self) {
      
      inline def setAreas(value: StringDictionary[Area_]): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rect_ extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Rect_ {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Rect_ = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect_]
    }
    
    extension [Self <: Rect_](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Track extends StObject {
    
    var end: Double
    
    var span: Double
    
    var start: Double
  }
  object Track {
    
    inline def apply(end: Double, span: Double, start: Double): Track = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Track]
    }
    
    extension [Self <: Track](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
