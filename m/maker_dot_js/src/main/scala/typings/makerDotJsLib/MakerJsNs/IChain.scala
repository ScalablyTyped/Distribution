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

