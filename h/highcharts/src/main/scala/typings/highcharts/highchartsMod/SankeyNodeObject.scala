package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SankeyNodeObject extends Point {
  /**
    * An optional column index of where to place the node. The default
    * behaviour is to place it next to the preceding node.
    */
  var column: Double = js.native
  /**
    * The id of the auto-generated node, refering to the `from` or `to` setting
    * of the link.
    */
  var id: String = js.native
  /**
    * The vertical offset of a node in terms of weight. Positive values shift
    * the node downwards, negative shift it upwards.
    */
  var offset: Double = js.native
}

