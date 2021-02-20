package typings.gridTemplateParser

import org.scalablytyped.runtime.StringDictionary
import typings.gridTemplateParser.anon.PartialArea
import typings.gridTemplateParser.anon.PartialRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("grid-template-parser", "area")
  @js.native
  def area(): Area_ = js.native
  @JSImport("grid-template-parser", "area")
  @js.native
  def area(rect: PartialRect): Area_ = js.native
  
  @JSImport("grid-template-parser", "grid")
  @js.native
  def grid(template: String): Grid_ = js.native
  
  @JSImport("grid-template-parser", "maxColumnEnd")
  @js.native
  def maxColumnEnd(grid: Grid_): Double = js.native
  
  @JSImport("grid-template-parser", "maxColumnStart")
  @js.native
  def maxColumnStart(grid: Grid_): Double = js.native
  
  @JSImport("grid-template-parser", "maxRowEnd")
  @js.native
  def maxRowEnd(grid: Grid_): Double = js.native
  
  @JSImport("grid-template-parser", "maxRowStart")
  @js.native
  def maxRowStart(grid: Grid_): Double = js.native
  
  @JSImport("grid-template-parser", "minColumnEnd")
  @js.native
  def minColumnEnd(grid: Grid_): Double = js.native
  
  @JSImport("grid-template-parser", "minColumnStart")
  @js.native
  def minColumnStart(grid: Grid_): Double = js.native
  
  @JSImport("grid-template-parser", "minRowEnd")
  @js.native
  def minRowEnd(grid: Grid_): Double = js.native
  
  @JSImport("grid-template-parser", "minRowStart")
  @js.native
  def minRowStart(grid: Grid_): Double = js.native
  
  @JSImport("grid-template-parser", "rect")
  @js.native
  def rect(): Rect_ = js.native
  @JSImport("grid-template-parser", "rect")
  @js.native
  def rect(area: PartialArea): Rect_ = js.native
  
  @JSImport("grid-template-parser", "template")
  @js.native
  def template(grid: Grid_): String = js.native
  
  @js.native
  trait Area_ extends StObject {
    
    var column: Track = js.native
    
    var row: Track = js.native
  }
  object Area_ {
    
    @scala.inline
    def apply(column: Track, row: Track): Area_ = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[Area_]
    }
    
    @scala.inline
    implicit class Area_MutableBuilder[Self <: Area_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Track): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: Track): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Grid_ extends StObject {
    
    var areas: StringDictionary[Area_] = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Grid_ {
    
    @scala.inline
    def apply(areas: StringDictionary[Area_], height: Double, width: Double): Grid_ = {
      val __obj = js.Dynamic.literal(areas = areas.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Grid_]
    }
    
    @scala.inline
    implicit class Grid_MutableBuilder[Self <: Grid_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAreas(value: StringDictionary[Area_]): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Rect_ extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Rect_ {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): Rect_ = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect_]
    }
    
    @scala.inline
    implicit class Rect_MutableBuilder[Self <: Rect_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Track extends StObject {
    
    var end: Double = js.native
    
    var span: Double = js.native
    
    var start: Double = js.native
  }
  object Track {
    
    @scala.inline
    def apply(end: Double, span: Double, start: Double): Track = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Track]
    }
    
    @scala.inline
    implicit class TrackMutableBuilder[Self <: Track] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
