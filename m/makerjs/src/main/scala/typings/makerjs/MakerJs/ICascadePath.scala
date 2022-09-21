package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICascadePath
  extends StObject
     with ICascade {
  
  /**
    * Add a path to a model. This is basically equivalent to:
  ```
  parentModel.paths[pathId] = childPath;
  ```
  with additional checks to make it safe for cascading.
    *
    * @param parentModel The model to add to.
    * @param pathId The id of the path.
    * @param overwrite (default false) Optional flag to overwrite any path referenced by pathId. Default is false, which will create an id similar to pathId.
    * @returns this cascade container, this.$result will be The original path (for cascading).
    */
  def addTo(parentModel: IModel, pathId: String): ICascadePath = js.native
  def addTo(parentModel: IModel, pathId: String, overwrite: Boolean): ICascadePath = js.native
  
  /**
    * Alter a path by lengthening or shortening it.
    *
    * @param distance Numeric amount of length to add or remove from the path. Use a positive number to lengthen, negative to shorten. When shortening: this function will not alter the path and will return null if the resulting path length is less than or equal to zero.
    * @param useOrigin (default false) Optional flag to alter from the origin instead of the end of the path.
    * @returns this cascade container, this.$result will be The original path (for cascading), or null if the path could not be altered.
    */
  def alterLength(distance: Double): ICascadePath = js.native
  def alterLength(distance: Double, useOrigin: Boolean): ICascadePath = js.native
  
  /**
    * Breaks a path in two. The supplied path will end at the supplied pointOfBreak,
  a new path is returned which begins at the pointOfBreak and ends at the supplied path's initial end point.
  For Circle, the original path will be converted in place to an Arc, and null is returned.
    *
    * @param pointOfBreak The point at which to break the path.
    * @returns this cascade container, this.$result will be A new path of the same type, when path type is line or arc. Returns null for circle.
    */
  def breakAtPoint(pointOfBreak: IPoint): ICascadePath = js.native
  
  /**
    * Center a path at [0, 0].
    *
    * @returns this cascade container, this.$result will be The original path (for cascading).
    */
  def center(): ICascadePath = js.native
  
  def clone(offset: IPoint): ICascadePath = js.native
  
  /**
    * Copy the schema properties of one path to another.
    *
    * @param destPath The destination path to copy property values to.
    * @returns this cascade container, this.$result will be The source path.
    */
  def copyProps(destPath: IPath): ICascadePath = js.native
  
  /**
    * Set the layer of a path. This is equivalent to:
  ```
  pathContext.layer = layer;
  ```
    *
    * @param layer The layer name.
    * @returns this cascade container, this.$result will be The original path (for cascading).
    */
  def layer(layer: String): ICascadePath = js.native
  
  /**
    * Create a clone of a path, mirrored on either or both x and y axes.
    *
    * @param mirrorX Boolean to mirror on the x axis.
    * @param mirrorY Boolean to mirror on the y axis.
    * @returns this cascade container, this.$result will be Mirrored path.
    */
  def mirror(mirrorX: Boolean, mirrorY: Boolean): ICascadePath = js.native
  
  /**
    * Move a path to an absolute point.
    *
    * @param origin The new origin for the path.
    * @returns this cascade container, this.$result will be The original path (for cascading).
    */
  def move(origin: IPoint): ICascadePath = js.native
  
  /**
    * Move a path's origin by a relative amount.
    *
    * @param delta The x & y adjustments as a point object.
    * @param subtract Optional boolean to subtract instead of add.
    * @returns this cascade container, this.$result will be The original path (for cascading).
    */
  def moveRelative(delta: IPoint): ICascadePath = js.native
  def moveRelative(delta: IPoint, subtract: Boolean): ICascadePath = js.native
  
  /**
    * Rotate a path.
    *
    * @param angleInDegrees The amount of rotation, in degrees.
    * @param rotationOrigin (default [0, 0]) The center point of rotation.
    * @returns this cascade container, this.$result will be The original path (for cascading).
    */
  def rotate(angleInDegrees: Double): ICascadePath = js.native
  def rotate(angleInDegrees: Double, rotationOrigin: IPoint): ICascadePath = js.native
  
  /**
    * Scale a path.
    *
    * @param scaleValue The amount of scaling.
    * @returns this cascade container, this.$result will be The original path (for cascading).
    */
  def scale(scaleValue: Double): ICascadePath = js.native
  
  /**
    * Move a path so its bounding box begins at [0, 0].
    *
    * @returns this cascade container, this.$result will be The original path (for cascading).
    */
  def zero(): ICascadePath = js.native
}
