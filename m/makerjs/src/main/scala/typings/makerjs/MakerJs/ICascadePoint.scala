package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICascadePoint
  extends StObject
     with ICascade {
  
  /**
    * Add two points together and return the result as a new point object.
    *
    * @param b Second point.
    * @param subtract Optional boolean to subtract instead of add.
    * @returns this cascade container, this.$result will be A new point object.
    */
  def add(b: IPoint): ICascadePoint = js.native
  def add(b: IPoint, subtract: Boolean): ICascadePoint = js.native
  
  /**
    * Get the average of two points.
    *
    * @param b Second point.
    * @returns this cascade container, this.$result will be New point object which is the average of a and b.
    */
  def average(b: IPoint): ICascadePoint = js.native
  
  /**
    * From an array of points, find the closest point to a given reference point.
    *
    * @param pointOptions Array of points to choose from.
    * @returns this cascade container, this.$result will be The first closest point from the pointOptions.
    */
  def closest(pointOptions: js.Array[IPoint]): ICascadePoint = js.native
  
  /**
    * Distort a point's coordinates.
    *
    * @param scaleX The amount of x scaling.
    * @param scaleY The amount of y scaling.
    * @returns this cascade container, this.$result will be A new point.
    */
  def distort(scaleX: Double, scaleY: Double): ICascadePoint = js.native
  
  /**
    * Create a clone of a point, mirrored on either or both x and y axes.
    *
    * @param mirrorX Boolean to mirror on the x axis.
    * @param mirrorY Boolean to mirror on the y axis.
    * @returns this cascade container, this.$result will be Mirrored point.
    */
  def mirror(mirrorX: Boolean, mirrorY: Boolean): ICascadePoint = js.native
  
  /**
    * Rotate a point.
    *
    * @param angleInDegrees The amount of rotation, in degrees.
    * @param rotationOrigin (default [0, 0]) The center point of rotation.
    * @returns this cascade container, this.$result will be A new point.
    */
  def rotate(angleInDegrees: Double): ICascadePoint = js.native
  def rotate(angleInDegrees: Double, rotationOrigin: IPoint): ICascadePoint = js.native
  
  /**
    * Round the values of a point.
    *
    * @param accuracy Optional exemplar number of decimal places.
    * @returns this cascade container, this.$result will be A new point with the values rounded.
    */
  def rounded(): ICascadePoint = js.native
  def rounded(accuracy: Double): ICascadePoint = js.native
  
  /**
    * Scale a point's coordinates.
    *
    * @param scaleValue The amount of scaling.
    * @returns this cascade container, this.$result will be A new point.
    */
  def scale(scaleValue: Double): ICascadePoint = js.native
  
  /**
    * Subtract a point from another point, and return the result as a new point. Shortcut to Add(a, b, subtract = true).
    *
    * @param b Second point.
    * @returns this cascade container, this.$result will be A new point object.
    */
  def subtract(b: IPoint): ICascadePoint = js.native
}
