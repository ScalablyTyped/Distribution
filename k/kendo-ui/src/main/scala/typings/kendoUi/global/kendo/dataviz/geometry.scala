package typings.kendoUi.global.kendo.dataviz

import typings.kendoUi.kendo.dataviz.geometry.ArcOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometry {
  
  @JSGlobal("kendo.dataviz.geometry.Arc")
  @js.native
  class Arc protected ()
    extends typings.kendoUi.kendo.dataviz.geometry.Arc {
    def this(center: js.Any) = this()
    def this(center: typings.kendoUi.kendo.geometry.Point) = this()
    def this(center: js.Any, options: ArcOptions) = this()
    def this(center: typings.kendoUi.kendo.geometry.Point, options: ArcOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.geometry.Circle")
  @js.native
  class Circle protected ()
    extends typings.kendoUi.kendo.dataviz.geometry.Circle {
    def this(center: js.Any, radius: Double) = this()
    def this(center: typings.kendoUi.kendo.geometry.Point, radius: Double) = this()
  }
  
  @JSGlobal("kendo.dataviz.geometry.Matrix")
  @js.native
  class Matrix ()
    extends typings.kendoUi.kendo.dataviz.geometry.Matrix
  object Matrix {
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Matrix.rotate")
    @js.native
    def rotate(angle: Double, x: Double, y: Double): typings.kendoUi.kendo.geometry.Matrix = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Matrix.scale")
    @js.native
    def scale(scaleX: Double, scaleY: Double): typings.kendoUi.kendo.geometry.Matrix = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Matrix.translate")
    @js.native
    def translate(x: Double, y: Double): typings.kendoUi.kendo.geometry.Matrix = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Matrix.unit")
    @js.native
    def unit(): typings.kendoUi.kendo.geometry.Matrix = js.native
  }
  
  @JSGlobal("kendo.dataviz.geometry.Point")
  @js.native
  class Point protected ()
    extends typings.kendoUi.kendo.dataviz.geometry.Point {
    def this(x: Double, y: Double) = this()
  }
  object Point {
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Point.create")
    @js.native
    def create(x: js.Any, y: Double): typings.kendoUi.kendo.geometry.Point = js.native
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Point.create")
    @js.native
    def create(x: Double, y: Double): typings.kendoUi.kendo.geometry.Point = js.native
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Point.create")
    @js.native
    def create(x: typings.kendoUi.kendo.geometry.Point, y: Double): typings.kendoUi.kendo.geometry.Point = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Point.max")
    @js.native
    def max(): typings.kendoUi.kendo.geometry.Point = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Point.maxPoint")
    @js.native
    def maxPoint(): typings.kendoUi.kendo.geometry.Point = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Point.min")
    @js.native
    def min(): typings.kendoUi.kendo.geometry.Point = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Point.minPoint")
    @js.native
    def minPoint(): typings.kendoUi.kendo.geometry.Point = js.native
  }
  
  @JSGlobal("kendo.dataviz.geometry.Rect")
  @js.native
  class Rect protected ()
    extends typings.kendoUi.kendo.dataviz.geometry.Rect {
    def this(origin: js.Any, size: js.Any) = this()
    def this(origin: js.Any, size: typings.kendoUi.kendo.geometry.Size) = this()
    def this(origin: typings.kendoUi.kendo.geometry.Point, size: js.Any) = this()
    def this(origin: typings.kendoUi.kendo.geometry.Point, size: typings.kendoUi.kendo.geometry.Size) = this()
  }
  object Rect {
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Rect.fromPoints")
    @js.native
    def fromPoints(pointA: typings.kendoUi.kendo.geometry.Point, pointB: typings.kendoUi.kendo.geometry.Point): typings.kendoUi.kendo.geometry.Rect = js.native
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Rect.union")
    @js.native
    def union(rectA: typings.kendoUi.kendo.geometry.Rect, rectB: typings.kendoUi.kendo.geometry.Rect): typings.kendoUi.kendo.geometry.Rect = js.native
  }
  
  @JSGlobal("kendo.dataviz.geometry.Size")
  @js.native
  class Size ()
    extends typings.kendoUi.kendo.dataviz.geometry.Size
  object Size {
    
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Size.create")
    @js.native
    def create(width: js.Any, height: Double): typings.kendoUi.kendo.geometry.Size = js.native
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Size.create")
    @js.native
    def create(width: Double, height: Double): typings.kendoUi.kendo.geometry.Size = js.native
    /* static member */
    @JSGlobal("kendo.dataviz.geometry.Size.create")
    @js.native
    def create(width: typings.kendoUi.kendo.geometry.Size, height: Double): typings.kendoUi.kendo.geometry.Size = js.native
  }
  
  @JSGlobal("kendo.dataviz.geometry.Transformation")
  @js.native
  class Transformation ()
    extends typings.kendoUi.kendo.dataviz.geometry.Transformation
}
