package typings.kendoUi.global.kendo.dataviz

import typings.kendoUi.kendo.dataviz.geometry.ArcOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.geometry")
@js.native
object geometry extends js.Object {
  @js.native
  class Arc protected ()
    extends typings.kendoUi.kendo.dataviz.geometry.Arc {
    def this(center: js.Any) = this()
    def this(center: typings.kendoUi.kendo.geometry.Point) = this()
    def this(center: js.Any, options: ArcOptions) = this()
    def this(center: typings.kendoUi.kendo.geometry.Point, options: ArcOptions) = this()
  }
  
  @js.native
  class Circle protected ()
    extends typings.kendoUi.kendo.dataviz.geometry.Circle {
    def this(center: js.Any, radius: Double) = this()
    def this(center: typings.kendoUi.kendo.geometry.Point, radius: Double) = this()
  }
  
  @js.native
  class Matrix ()
    extends typings.kendoUi.kendo.dataviz.geometry.Matrix
  
  @js.native
  class Point protected ()
    extends typings.kendoUi.kendo.dataviz.geometry.Point {
    def this(x: Double, y: Double) = this()
  }
  
  @js.native
  class Rect protected ()
    extends typings.kendoUi.kendo.dataviz.geometry.Rect {
    def this(origin: js.Any, size: js.Any) = this()
    def this(origin: js.Any, size: typings.kendoUi.kendo.geometry.Size) = this()
    def this(origin: typings.kendoUi.kendo.geometry.Point, size: js.Any) = this()
    def this(origin: typings.kendoUi.kendo.geometry.Point, size: typings.kendoUi.kendo.geometry.Size) = this()
  }
  
  @js.native
  class Size ()
    extends typings.kendoUi.kendo.dataviz.geometry.Size
  
  @js.native
  class Transformation ()
    extends typings.kendoUi.kendo.dataviz.geometry.Transformation
  
  /* static members */
  @js.native
  object Matrix extends js.Object {
    def rotate(angle: Double, x: Double, y: Double): typings.kendoUi.kendo.geometry.Matrix = js.native
    def scale(scaleX: Double, scaleY: Double): typings.kendoUi.kendo.geometry.Matrix = js.native
    def translate(x: Double, y: Double): typings.kendoUi.kendo.geometry.Matrix = js.native
    def unit(): typings.kendoUi.kendo.geometry.Matrix = js.native
  }
  
  /* static members */
  @js.native
  object Point extends js.Object {
    def create(x: js.Any, y: Double): typings.kendoUi.kendo.geometry.Point = js.native
    def create(x: Double, y: Double): typings.kendoUi.kendo.geometry.Point = js.native
    def create(x: typings.kendoUi.kendo.geometry.Point, y: Double): typings.kendoUi.kendo.geometry.Point = js.native
    def max(): typings.kendoUi.kendo.geometry.Point = js.native
    def maxPoint(): typings.kendoUi.kendo.geometry.Point = js.native
    def min(): typings.kendoUi.kendo.geometry.Point = js.native
    def minPoint(): typings.kendoUi.kendo.geometry.Point = js.native
  }
  
  /* static members */
  @js.native
  object Rect extends js.Object {
    def fromPoints(pointA: typings.kendoUi.kendo.geometry.Point, pointB: typings.kendoUi.kendo.geometry.Point): typings.kendoUi.kendo.geometry.Rect = js.native
    def union(rectA: typings.kendoUi.kendo.geometry.Rect, rectB: typings.kendoUi.kendo.geometry.Rect): typings.kendoUi.kendo.geometry.Rect = js.native
  }
  
  /* static members */
  @js.native
  object Size extends js.Object {
    def create(width: js.Any, height: Double): typings.kendoUi.kendo.geometry.Size = js.native
    def create(width: Double, height: Double): typings.kendoUi.kendo.geometry.Size = js.native
    def create(width: typings.kendoUi.kendo.geometry.Size, height: Double): typings.kendoUi.kendo.geometry.Size = js.native
  }
  
}

