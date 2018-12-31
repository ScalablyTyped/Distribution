package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An intersection of two paths.
  */
trait IPathIntersection extends js.Object {
  /**
    * Array of points where the two paths intersected. The length of the array may be either 1 or 2 points.
    */
  var intersectionPoints: js.Array[IPoint]
  /**
    * This Array property will only be defined if the first parameter passed to pathIntersection is either an Arc or a Circle.
    * It contains the angles of intersection relative to the first path parameter.
    * The length of the array may be either 1 or 2.
    */
  var path1Angles: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * This Array property will only be defined if the second parameter passed to pathIntersection is either an Arc or a Circle.
    * It contains the angles of intersection relative to the second path parameter.
    * The length of the array may be either 1 or 2.
    */
  var path2Angles: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

