package typings.makerJs.global.MakerJs

import typings.makerJs.MakerJs.IPathArc
import typings.makerJs.MakerJs.IPathLine
import typings.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MakerJs.paths")
@js.native
object paths extends js.Object {
  
  /**
    * Class for arc path.
    */
  @js.native
  class Arc protected ()
    extends typings.makerJs.MakerJs.paths.Arc {
    /**
      * Class for arc path, created from 2 points and optional boolean flag indicating clockwise.
      *
      * @param pointA First end point of the arc.
      * @param pointB Second end point of the arc.
      * @param clockwise Boolean flag to indicate clockwise direction.
      */
    def this(pointA: IPoint, pointB: IPoint) = this()
    def this(pointA: IPoint, pointB: IPoint, clockwise: Boolean) = this()
    /**
      * Class for arc path, created from 3 points.
      *
      * @param pointA First end point of the arc.
      * @param pointB Middle point on the arc.
      * @param pointC Second end point of the arc.
      */
    def this(pointA: IPoint, pointB: IPoint, pointC: IPoint) = this()
    /**
      * Class for arc path, created from origin point, radius, start angle, and end angle.
      *
      * @param origin The center point of the arc.
      * @param radius The radius of the arc.
      * @param startAngle The start angle of the arc.
      * @param endAngle The end angle of the arc.
      */
    def this(origin: IPoint, radius: Double, startAngle: Double, endAngle: Double) = this()
    /**
      * Class for arc path, created from 2 points, radius, large Arc flag, and clockwise flag.
      *
      * @param pointA First end point of the arc.
      * @param pointB Second end point of the arc.
      * @param radius The radius of the arc.
      * @param largeArc Boolean flag to indicate clockwise direction.
      * @param clockwise Boolean flag to indicate clockwise direction.
      */
    def this(pointA: IPoint, pointB: IPoint, radius: Double, largeArc: Boolean, clockwise: Boolean) = this()
  }
  
  /**
    * Class for chord, which is simply a line path that connects the endpoints of an arc.
    *
    * @param arc Arc to use as the basic for the chord.
    */
  @js.native
  class Chord protected ()
    extends typings.makerJs.MakerJs.paths.Chord {
    def this(arc: IPathArc) = this()
  }
  
  /**
    * Class for circle path.
    */
  @js.native
  class Circle protected ()
    extends typings.makerJs.MakerJs.paths.Circle {
    /**
      * Class for circle path, created from radius. Origin will be [0, 0].
      *
      * Example:
      * ```
      * var c = new makerjs.paths.Circle(7);
      * ```
      *
      * @param radius The radius of the circle.
      */
    def this(radius: Double) = this()
    /**
      * Class for circle path, created from origin point and radius.
      *
      * Example:
      * ```
      * var c = new makerjs.paths.Circle([10, 10], 7);
      * ```
      *
      * @param origin The center point of the circle.
      * @param radius The radius of the circle.
      */
    def this(origin: IPoint, radius: Double) = this()
    /**
      * Class for circle path, created from 2 points.
      *
      * Example:
      * ```
      * var c = new makerjs.paths.Circle([5, 15], [25, 15]);
      * ```
      *
      * @param pointA First point on the circle.
      * @param pointB Second point on the circle.
      */
    def this(pointA: IPoint, pointB: IPoint) = this()
    /**
      * Class for circle path, created from 3 points.
      *
      * Example:
      * ```
      * var c = new makerjs.paths.Circle([0, 0], [0, 10], [20, 0]);
      * ```
      *
      * @param pointA First point on the circle.
      * @param pointB Second point on the circle.
      * @param pointC Third point on the circle.
      */
    def this(pointA: IPoint, pointB: IPoint, pointC: IPoint) = this()
  }
  
  /**
    * Class for line path.
    */
  @js.native
  class Line protected ()
    extends typings.makerJs.MakerJs.paths.Line {
    /**
      * Class for line path, constructed from array of 2 points.
      *
      * @param points Array of 2 points.
      */
    def this(points: js.Array[IPoint]) = this()
    /**
      * Class for line path, constructed from 2 points.
      *
      * @param origin The origin point of the line.
      * @param end The end point of the line.
      */
    def this(origin: IPoint, end: IPoint) = this()
  }
  
  /**
    * Class for a parallel line path.
    *
    * @param toLine A line to be parallel to.
    * @param distance Distance between parallel and original line.
    * @param nearPoint Any point to determine which side of the line to place the parallel.
    */
  @js.native
  class Parallel protected ()
    extends typings.makerJs.MakerJs.paths.Parallel {
    def this(toLine: IPathLine, distance: Double, nearPoint: IPoint) = this()
  }
}
