package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SankeyNodeObject extends Point {
  
  /**
    * The color index of the auto generated node, especially for use in styled
    * mode.
    */
  @JSName("colorIndex")
  var colorIndex_SankeyNodeObject: Double = js.native
  
  /**
    * The color of the auto generated node.
    */
  @JSName("color")
  var color_SankeyNodeObject: ColorString | GradientColorObject | PatternObject = js.native
  
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
    * This option is deprecated, use
    * Highcharts.SankeyNodeObject#offsetHorizontal and
    * Highcharts.SankeyNodeObject#offsetVertical instead.
    *
    * The vertical offset of a node in terms of weight. Positive values shift
    * the node downwards, negative shift it upwards.
    *
    * If a percantage string is given, the node is offset by the percentage of
    * the node size plus `nodePadding`.
    */
  var offset: Double | String = js.native
  
  /**
    * The horizontal offset of a node. Positive values shift the node right,
    * negative shift it left.
    *
    * If a percantage string is given, the node is offset by the percentage of
    * the node size.
    */
  var offsetHorizontal: Double | String = js.native
  
  /**
    * The vertical offset of a node. Positive values shift the node down,
    * negative shift it up.
    *
    * If a percantage string is given, the node is offset by the percentage of
    * the node size.
    */
  var offsetVertical: Double | String = js.native
}
