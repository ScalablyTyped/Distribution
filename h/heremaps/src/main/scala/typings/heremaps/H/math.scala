package typings.heremaps.H

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** math *****/
object math {
  
  /**
    * A signed 32 bit integer (JS restriction) where bit operator can be applied to. The range is [-2,147,483,648 ... 2,147,483,647] or [-2^31 ... 2^31 − 1]
    */
  type BitMask = Double
  
  /**
    * An interface for a 2-dimensional point consisting a x and y coordinate.
    * @property x {number} - The point's coordinate on X-axis.
    * @property y {number} - The point's coordinate on Y-axis.
    */
  trait IPoint extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object IPoint {
    
    inline def apply(x: Double, y: Double): IPoint = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPoint]
    }
    
    extension [Self <: IPoint](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An interface for a 2-dimensional size consisting a with and a height.
    * @property w {number} - The size's width.
    * @property h {number} - The size's height.
    */
  trait ISize extends StObject {
    
    var h: Double
    
    var w: Double
  }
  object ISize {
    
    inline def apply(h: Double, w: Double): ISize = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISize]
    }
    
    extension [Self <: ISize](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Class represents a 2-dimensional point, defined by x and y coordinates.
    * @property x {number} - The point's coordinate on X-axis.
    * @property y {number} - The point's coordinate on Y-axis.
    */
  @js.native
  trait Point
    extends StObject
       with IPoint {
    
    /**
      * This method adds given point coordinates to the current one.
      * @param other {H.math.IPoint} - The point to add
      * @returns {H.math.Point} - the point itself after adding
      */
    def add(other: IPoint): Point = js.native
    
    /**
      * Rounds the x and y coordinates to the next greater integer values.
      * @returns {H.math.Point} - the point itself after ceiling
      */
    def ceil(): Point = js.native
    
    def clone(opt_out: Point): Point = js.native
    
    /**
      * This method calculates the distance to a point supplied by the caller.
      * @param other {H.math.IPoint}
      * @returns {number}
      */
    def distance(other: IPoint): Double = js.native
    
    /**
      * This method compares current point coordinates with the supplied point coordinates.
      * @param other {H.math.IPoint} - The point to compare to.
      * @returns {boolean} - True if the points are equal
      */
    def equals(other: IPoint): Boolean = js.native
    
    /**
      * Rounds the x and y coordinates to the next smaller integer values.
      * @returns {H.math.Point} - the point itself after flooring
      */
    def floor(): Point = js.native
    
    /**
      * Calculates the closest point on a given line
      * @param start {H.math.IPoint} - The start point of the line
      * @param end {H.math.IPoint} - The end point of the line
      * @returns {H.math.IPoint} - the closest point
      */
    def getNearest(start: IPoint, end: IPoint): IPoint = js.native
    
    /**
      * This method rounds the x and y coordinates of the point.
      * @returns {H.math.Point} - the point itself after rounding
      */
    def round(): Point = js.native
    
    /**
      * This method scales the current point coordinates by the given factor(s).
      * @param factor {number} - multiplication factor
      * @param opt_factorY {number=} - If omitted, the factor argument is used
      * @returns {H.math.Point} - the point itself after scaling
      */
    def scale(factor: Double): Point = js.native
    def scale(factor: Double, opt_factorY: Double): Point = js.native
    
    /**
      * Sets the x and y coordinate of this point
      * @param x {number} - The point's coordinate on X-axis.
      * @param y {number} - The point's coordinate on Y-axis.
      */
    def set(x: Double, y: Double): Unit = js.native
    
    /**
      * This method subtracts given point coordinates from the current point.
      * @param other {H.math.IPoint} - The point to subtract
      * @returns {H.math.Point} - the point itself after subtracting
      */
    def sub(other: IPoint): Point = js.native
  }
  
  /**
    * Class defines a rectangle in 2-dimensional geometric space. It is used to represent the area in projected space.
    */
  trait Rect extends StObject {
    
    /**
      * Method checks if provided coordinates lie within rectangle.
      * @param x {number} - x-coordinate to check
      * @param y {number} - y-coordinate to check
      * @returns {boolean} - returns true if coordinates lie within rectangle, if parameters are isNaN returns false
      */
    def containsXY(x: Double, y: Double): Boolean
    
    /**
      * To get the rectangle's bottom-right vertex
      * @returns {H.math.Point}
      */
    def getBottomRight(): Point
    
    /**
      * To get the rectangle's top-left vertex
      * @returns {H.math.Point}
      */
    def getTopLeft(): Point
    
    /**
      * To set all values of the rectangle's edges
      * @param left {number} - The rectangle's left edge x value
      * @param top {number} - The rectangle's top edge y value
      * @param right {number} - The rectangle's right edge x value
      * @param bottom {number} - The rectangle's bottom edge y value
      */
    def set(left: Double, top: Double, right: Double, bottom: Double): Unit
  }
  object Rect {
    
    inline def apply(
      containsXY: (Double, Double) => Boolean,
      getBottomRight: () => Point,
      getTopLeft: () => Point,
      set: (Double, Double, Double, Double) => Unit
    ): Rect = {
      val __obj = js.Dynamic.literal(containsXY = js.Any.fromFunction2(containsXY), getBottomRight = js.Any.fromFunction0(getBottomRight), getTopLeft = js.Any.fromFunction0(getTopLeft), set = js.Any.fromFunction4(set))
      __obj.asInstanceOf[Rect]
    }
    
    extension [Self <: Rect](x: Self) {
      
      inline def setContainsXY(value: (Double, Double) => Boolean): Self = StObject.set(x, "containsXY", js.Any.fromFunction2(value))
      
      inline def setGetBottomRight(value: () => Point): Self = StObject.set(x, "getBottomRight", js.Any.fromFunction0(value))
      
      inline def setGetTopLeft(value: () => Point): Self = StObject.set(x, "getTopLeft", js.Any.fromFunction0(value))
      
      inline def setSet(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
    }
  }
  
  /**
    * Class for representing sizes consisting of a width and height.
    * @property w {number} - The size's width value
    * @property h {number} - The size's height value
    */
  trait Size extends StObject {
    
    var h: Double
    
    var w: Double
  }
  object Size {
    
    inline def apply(h: Double, w: Double): Size = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
}
