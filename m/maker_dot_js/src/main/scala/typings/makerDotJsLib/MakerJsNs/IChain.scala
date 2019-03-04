package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A chain of paths which connect end to end.
  */
trait IChain extends js.Object {
  /**
    * Flag if this chain forms a loop end to end.
    */
  var endless: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The links in this chain.
    */
  var links: js.Array[IChainLink]
  /**
    * Total length of all paths in the chain.
    */
  var pathLength: scala.Double
}

object IChain {
  @scala.inline
  def apply(
    links: js.Array[IChainLink],
    pathLength: scala.Double,
    endless: js.UndefOr[scala.Boolean] = js.undefined
  ): IChain = {
    val __obj = js.Dynamic.literal(links = links, pathLength = pathLength)
    if (!js.isUndefined(endless)) __obj.updateDynamic("endless")(endless)
    __obj.asInstanceOf[IChain]
  }
}

