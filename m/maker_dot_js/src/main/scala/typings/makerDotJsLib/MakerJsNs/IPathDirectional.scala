package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A path that may be indicated to "flow" in either direction between its endpoints.
  */
trait IPathDirectional extends IPath {
  /**
    * The endpoints of the path.
    */
  var endPoints: js.Array[IPoint]
  /**
    * Path flows forwards or reverse.
    */
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
}

