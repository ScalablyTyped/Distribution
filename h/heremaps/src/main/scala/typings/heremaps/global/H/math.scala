package typings.heremaps.global.H

import typings.heremaps.H.math.IPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** math *****/
object math {
  
  /**
    * Class represents a 2-dimensional point, defined by x and y coordinates.
    * x {number} - The point's coordinate on X-axis.
    * y {number} - The point's coordinate on Y-axis.
    */
  @JSGlobal("H.math.Point")
  @js.native
  open class Point protected ()
    extends StObject
       with typings.heremaps.H.math.Point {
    /**
      * Constructor
      * @param x {number} - The point's coordinate on X-axis.
      * @param y {number} - The point's coordinate on Y-axis.
      */
    def this(x: Double, y: Double) = this()
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  object Point {
    
    @JSGlobal("H.math.Point")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This method creates a Point instance from a given IPoint object.
      * @param iPoint {H.math.IPoint} - The IPoint object to use
      * @returns {H.math.Point} - the created Point instance
      */
    /* static member */
    inline def fromIPoint(iPoint: IPoint): typings.heremaps.H.math.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIPoint")(iPoint.asInstanceOf[js.Any]).asInstanceOf[typings.heremaps.H.math.Point]
  }
  
  /**
    * Class defines a rectangle in 2-dimensional geometric space. It is used to represent the area in projected space.
    */
  @JSGlobal("H.math.Rect")
  @js.native
  open class Rect protected ()
    extends StObject
       with typings.heremaps.H.math.Rect {
    /**
      * Constructor
      * @param left {number} - The rectangle's left edge x value
      * @param top {number} - The rectangle's top edge y value
      * @param right {number} - The rectangle's right edge x value
      * @param bottom {number} - The rectangle's bottom edge y value
      */
    def this(left: Double, top: Double, right: Double, bottom: Double) = this()
    
    /**
      * Method checks if provided coordinates lie within rectangle.
      * @param x {number} - x-coordinate to check
      * @param y {number} - y-coordinate to check
      * @returns {boolean} - returns true if coordinates lie within rectangle, if parameters are isNaN returns false
      */
    /* CompleteClass */
    override def containsXY(x: Double, y: Double): Boolean = js.native
    
    /**
      * To get the rectangle's bottom-right vertex
      * @returns {H.math.Point}
      */
    /* CompleteClass */
    override def getBottomRight(): typings.heremaps.H.math.Point = js.native
    
    /**
      * To get the rectangle's top-left vertex
      * @returns {H.math.Point}
      */
    /* CompleteClass */
    override def getTopLeft(): typings.heremaps.H.math.Point = js.native
    
    /**
      * To set all values of the rectangle's edges
      * @param left {number} - The rectangle's left edge x value
      * @param top {number} - The rectangle's top edge y value
      * @param right {number} - The rectangle's right edge x value
      * @param bottom {number} - The rectangle's bottom edge y value
      */
    /* CompleteClass */
    override def set(left: Double, top: Double, right: Double, bottom: Double): Unit = js.native
  }
  object Rect {
    
    @JSGlobal("H.math.Rect")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * To create a rectangle from a top-left and bottom-right point pair.
      * @param topLeft {H.math.IPoint} - the top-left vertex of the rectanle
      * @param bottomRight {H.math.IPoint} - the bottom-right vertex of the rectanle
      * @returns {H.math.Rect} - returns the rectangular area defined by the top-left and bottom-right vertices
      */
    /* static member */
    inline def fromPoints(topLeft: IPoint, bottomRight: IPoint): typings.heremaps.H.math.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(topLeft.asInstanceOf[js.Any], bottomRight.asInstanceOf[js.Any])).asInstanceOf[typings.heremaps.H.math.Rect]
  }
  
  /**
    * Class for representing sizes consisting of a width and height.
    * w {number} - The size's width value
    * h {number} - The size's height value
    */
  @JSGlobal("H.math.Size")
  @js.native
  open class Size protected ()
    extends StObject
       with typings.heremaps.H.math.Size {
    /**
      * Constructor
      * @param width {number} - Width.
      * @param height {number} - Height.
      */
    def this(width: Double, height: Double) = this()
    
    /* CompleteClass */
    var h: Double = js.native
    
    /* CompleteClass */
    var w: Double = js.native
  }
}
