package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A link in a chain, with direction of flow.
  */
trait IChainLink extends js.Object {
  /**
    * The endpoints of the path, in absolute coords.
    */
  var endPoints: js.Array[IPoint]
  /**
    * Length of the path.
    */
  var pathLength: scala.Double
  /**
    * Path flows forwards or reverse.
    */
  var reversed: scala.Boolean
  /**
    * Reference to the path.
    */
  var walkedPath: IWalkPath
}

