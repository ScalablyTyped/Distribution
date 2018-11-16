package typings
package heatmapDotJsLib.heatmapDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HeatmapConfiguration[V /* <: java.lang.String */, X /* <: java.lang.String */, Y /* <: java.lang.String */] extends BaseHeatmapConfiguration[V] {
  /**
       * A DOM node where the heatmap canvas should be appended (heatmap will adapt to
       * the node's size)
       */
  var container: stdLib.HTMLElement
  /**
       * The property name of your x coordinate in a datapoint
       * Default value: 'x'
       */
  var xField: js.UndefOr[X] = js.undefined
  /**
       * The property name of your y coordinate in a datapoint
       * Default value: 'y'
       */
  var yField: js.UndefOr[Y] = js.undefined
}

