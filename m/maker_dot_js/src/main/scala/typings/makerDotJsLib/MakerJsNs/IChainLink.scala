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

object IChainLink {
  @scala.inline
  def apply(
    endPoints: js.Array[IPoint],
    pathLength: scala.Double,
    reversed: scala.Boolean,
    walkedPath: IWalkPath
  ): IChainLink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endPoints")(endPoints)
    __obj.updateDynamic("pathLength")(pathLength)
    __obj.updateDynamic("reversed")(reversed)
    __obj.updateDynamic("walkedPath")(walkedPath)
    __obj.asInstanceOf[IChainLink]
  }
}

