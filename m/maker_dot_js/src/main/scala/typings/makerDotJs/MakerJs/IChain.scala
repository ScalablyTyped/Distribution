package typings.makerDotJs.MakerJs

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
  var endless: js.UndefOr[Boolean] = js.undefined
  /**
    * The links in this chain.
    */
  var links: js.Array[IChainLink]
  /**
    * Total length of all paths in the chain.
    */
  var pathLength: Double
}

object IChain {
  @scala.inline
  def apply(links: js.Array[IChainLink], pathLength: Double, endless: js.UndefOr[Boolean] = js.undefined): IChain = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], pathLength = pathLength.asInstanceOf[js.Any])
    if (!js.isUndefined(endless)) __obj.updateDynamic("endless")(endless.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChain]
  }
}

