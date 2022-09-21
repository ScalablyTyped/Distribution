package typings.kendoUi.global.kendo

import typings.kendoUi.kendo.geometry.ArcOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometry {
  
  @JSGlobal("kendo.geometry.Arc")
  @js.native
  open class Arc protected ()
    extends StObject
       with typings.kendoUi.kendo.geometry.Arc {
    def this(center: Any) = this()
    def this(center: typings.kendoUi.kendo.geometry.Point) = this()
    def this(center: Any, options: ArcOptions) = this()
    def this(center: typings.kendoUi.kendo.geometry.Point, options: ArcOptions) = this()
  }
  
  @JSGlobal("kendo.geometry.Circle")
  @js.native
  open class Circle protected ()
    extends StObject
       with typings.kendoUi.kendo.geometry.Circle {
    def this(center: Any, radius: Double) = this()
    def this(center: typings.kendoUi.kendo.geometry.Point, radius: Double) = this()
  }
  
  @JSGlobal("kendo.geometry.Matrix")
  @js.native
  open class Matrix ()
    extends StObject
       with typings.kendoUi.kendo.geometry.Matrix
  object Matrix {
    
    @JSGlobal("kendo.geometry.Matrix")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def rotate(angle: Double, x: Double, y: Double): typings.kendoUi.kendo.geometry.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(angle.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.geometry.Matrix]
    
    /* static member */
    inline def scale(scaleX: Double, scaleY: Double): typings.kendoUi.kendo.geometry.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.geometry.Matrix]
    
    /* static member */
    inline def translate(x: Double, y: Double): typings.kendoUi.kendo.geometry.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.geometry.Matrix]
    
    /* static member */
    inline def unit(): typings.kendoUi.kendo.geometry.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("unit")().asInstanceOf[typings.kendoUi.kendo.geometry.Matrix]
  }
  
  @JSGlobal("kendo.geometry.Point")
  @js.native
  open class Point protected ()
    extends StObject
       with typings.kendoUi.kendo.geometry.Point {
    def this(x: Double, y: Double) = this()
  }
  object Point {
    
    @JSGlobal("kendo.geometry.Point")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(x: Any, y: Double): typings.kendoUi.kendo.geometry.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.geometry.Point]
    /* static member */
    inline def create(x: Double, y: Double): typings.kendoUi.kendo.geometry.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.geometry.Point]
    /* static member */
    inline def create(x: typings.kendoUi.kendo.geometry.Point, y: Double): typings.kendoUi.kendo.geometry.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.geometry.Point]
    
    /* static member */
    inline def max(): typings.kendoUi.kendo.geometry.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[typings.kendoUi.kendo.geometry.Point]
    
    /* static member */
    inline def maxPoint(): typings.kendoUi.kendo.geometry.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPoint")().asInstanceOf[typings.kendoUi.kendo.geometry.Point]
    
    /* static member */
    inline def min(): typings.kendoUi.kendo.geometry.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[typings.kendoUi.kendo.geometry.Point]
    
    /* static member */
    inline def minPoint(): typings.kendoUi.kendo.geometry.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("minPoint")().asInstanceOf[typings.kendoUi.kendo.geometry.Point]
  }
  
  @JSGlobal("kendo.geometry.Rect")
  @js.native
  open class Rect protected ()
    extends StObject
       with typings.kendoUi.kendo.geometry.Rect {
    def this(origin: Any, size: Any) = this()
    def this(origin: Any, size: typings.kendoUi.kendo.geometry.Size) = this()
    def this(origin: typings.kendoUi.kendo.geometry.Point, size: Any) = this()
    def this(origin: typings.kendoUi.kendo.geometry.Point, size: typings.kendoUi.kendo.geometry.Size) = this()
  }
  object Rect {
    
    @JSGlobal("kendo.geometry.Rect")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromPoints(pointA: typings.kendoUi.kendo.geometry.Point, pointB: typings.kendoUi.kendo.geometry.Point): typings.kendoUi.kendo.geometry.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.geometry.Rect]
    
    /* static member */
    inline def union(rectA: typings.kendoUi.kendo.geometry.Rect, rectB: typings.kendoUi.kendo.geometry.Rect): typings.kendoUi.kendo.geometry.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(rectA.asInstanceOf[js.Any], rectB.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.geometry.Rect]
  }
  
  @JSGlobal("kendo.geometry.Size")
  @js.native
  open class Size ()
    extends StObject
       with typings.kendoUi.kendo.geometry.Size
  object Size {
    
    @JSGlobal("kendo.geometry.Size")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(width: Any, height: Double): typings.kendoUi.kendo.geometry.Size = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.geometry.Size]
    /* static member */
    inline def create(width: Double, height: Double): typings.kendoUi.kendo.geometry.Size = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.geometry.Size]
    /* static member */
    inline def create(width: typings.kendoUi.kendo.geometry.Size, height: Double): typings.kendoUi.kendo.geometry.Size = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.geometry.Size]
  }
  
  @JSGlobal("kendo.geometry.Transformation")
  @js.native
  open class Transformation ()
    extends StObject
       with typings.kendoUi.kendo.geometry.Transformation
}
