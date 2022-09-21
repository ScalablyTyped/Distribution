package typings.makerjs.global.MakerJs

import typings.makerjs.MakerJs.IPathArc
import typings.makerjs.MakerJs.IPathLine
import typings.makerjs.MakerJs.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paths {
  
  /**
    * Class for arc path.
    */
  @JSGlobal("MakerJs.paths.Arc")
  @js.native
  open class Arc protected ()
    extends StObject
       with typings.makerjs.MakerJs.paths.Arc {
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
    
    /**
      * The angle (in degrees) to end drawing the arc, in polar (counter-clockwise) direction. May be less than start angle if it past 360.
      */
    /* CompleteClass */
    var endAngle: Double = js.native
    
    /**
      * The main point of reference for this path.
      */
    /* CompleteClass */
    var origin: IPoint = js.native
    
    /**
      * The radius of the circle.
      */
    /* CompleteClass */
    var radius: Double = js.native
    
    /**
      * The angle (in degrees) to begin drawing the arc, in polar (counter-clockwise) direction.
      */
    /* CompleteClass */
    var startAngle: Double = js.native
    
    /**
      * The type of the path, e.g. "line", "circle", or "arc". These strings are enumerated in pathType.
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  /**
    * Class for chord, which is simply a line path that connects the endpoints of an arc.
    *
    * @param arc Arc to use as the basic for the chord.
    */
  @JSGlobal("MakerJs.paths.Chord")
  @js.native
  open class Chord protected ()
    extends StObject
       with typings.makerjs.MakerJs.paths.Chord {
    def this(arc: IPathArc) = this()
    
    /**
      * The end point defining the line. The start point is the origin.
      */
    /* CompleteClass */
    var end: IPoint = js.native
    
    /**
      * The main point of reference for this path.
      */
    /* CompleteClass */
    var origin: IPoint = js.native
    
    /**
      * The type of the path, e.g. "line", "circle", or "arc". These strings are enumerated in pathType.
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  /**
    * Class for circle path.
    */
  @JSGlobal("MakerJs.paths.Circle")
  @js.native
  open class Circle protected ()
    extends StObject
       with typings.makerjs.MakerJs.paths.Circle {
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
    
    /**
      * The main point of reference for this path.
      */
    /* CompleteClass */
    var origin: IPoint = js.native
    
    /**
      * The radius of the circle.
      */
    /* CompleteClass */
    var radius: Double = js.native
    
    /**
      * The type of the path, e.g. "line", "circle", or "arc". These strings are enumerated in pathType.
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  /**
    * Class for line path.
    */
  @JSGlobal("MakerJs.paths.Line")
  @js.native
  open class Line protected ()
    extends StObject
       with typings.makerjs.MakerJs.paths.Line {
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
    
    /**
      * The end point defining the line. The start point is the origin.
      */
    /* CompleteClass */
    var end: IPoint = js.native
    
    /**
      * The main point of reference for this path.
      */
    /* CompleteClass */
    var origin: IPoint = js.native
    
    /**
      * The type of the path, e.g. "line", "circle", or "arc". These strings are enumerated in pathType.
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  /**
    * Class for a parallel line path.
    *
    * @param toLine A line to be parallel to.
    * @param distance Distance between parallel and original line.
    * @param nearPoint Any point to determine which side of the line to place the parallel.
    */
  @JSGlobal("MakerJs.paths.Parallel")
  @js.native
  open class Parallel protected ()
    extends StObject
       with typings.makerjs.MakerJs.paths.Parallel {
    def this(toLine: IPathLine, distance: Double, nearPoint: IPoint) = this()
    
    /**
      * The end point defining the line. The start point is the origin.
      */
    /* CompleteClass */
    var end: IPoint = js.native
    
    /**
      * The main point of reference for this path.
      */
    /* CompleteClass */
    var origin: IPoint = js.native
    
    /**
      * The type of the path, e.g. "line", "circle", or "arc". These strings are enumerated in pathType.
      */
    /* CompleteClass */
    var `type`: String = js.native
  }
}
