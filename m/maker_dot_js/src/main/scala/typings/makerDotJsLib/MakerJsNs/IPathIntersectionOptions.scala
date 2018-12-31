package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to path.intersection()
  */
trait IPathIntersectionOptions extends IPathIntersectionBaseOptions {
  /**
    * Optional boolean to only return deep intersections, i.e. not on an end point or tangent.
    */
  var path1Offset: js.UndefOr[IPoint] = js.undefined
  /**
    * Optional output variable which will be set to true if the paths are overlapped.
    */
  var path2Offset: js.UndefOr[IPoint] = js.undefined
}

