package typings.makerDotJs.MakerJsNs

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
  var pathLength: Double
  /**
    * Path flows forwards or reverse.
    */
  var reversed: Boolean
  /**
    * Reference to the path.
    */
  var walkedPath: IWalkPath
}

object IChainLink {
  @scala.inline
  def apply(endPoints: js.Array[IPoint], pathLength: Double, reversed: Boolean, walkedPath: IWalkPath): IChainLink = {
    val __obj = js.Dynamic.literal(endPoints = endPoints, pathLength = pathLength, reversed = reversed, walkedPath = walkedPath)
  
    __obj.asInstanceOf[IChainLink]
  }
}

