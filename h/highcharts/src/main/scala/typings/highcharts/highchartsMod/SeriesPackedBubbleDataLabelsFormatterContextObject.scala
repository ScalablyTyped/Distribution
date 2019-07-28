package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesPackedBubbleDataLabelsFormatterContextObject extends DataLabelsFormatterContextObject {
  /**
    * The color of the node.
    */
  var color: ColorString = js.native
  /**
    * The ID of the node.
    */
  var key: String = js.native
  /**
    * Callback to format data labels for _parentNodes_. The `parentNodeFormat`
    * option takes precedence over the `parentNodeFormatter`.
    */
  @JSName("parentNodeFormatter")
  var parentNodeFormatter_Original: FormatterCallbackFunction[DataLabelsFormatterContextObject] = js.native
  /**
    * Options for a _parentNode_ label text.
    */
  var parentNodeTextPath: SeriesPackedBubbleDataLabelsTextPath = js.native
  /**
    * Callback to format data labels for _parentNodes_. The `parentNodeFormat`
    * option takes precedence over the `parentNodeFormatter`.
    */
  def parentNodeFormatter(`this`: DataLabelsFormatterContextObject): String = js.native
}

