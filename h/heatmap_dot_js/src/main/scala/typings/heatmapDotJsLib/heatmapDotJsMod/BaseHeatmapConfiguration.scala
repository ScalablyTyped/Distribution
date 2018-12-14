package typings
package heatmapDotJsLib.heatmapDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseHeatmapConfiguration[V /* <: java.lang.String */] extends js.Object {
  /**
       * A background color string in form of hexcode, color name, or rgb(a)
       */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The blur factor that will be applied to all datapoints. The higher the
       * blur factor is, the smoother the gradients will be
       * Default value: 0.85
       */
  var blur: js.UndefOr[scala.Double] = js.undefined
  /**
       * An object that represents the gradient.
       * Syntax: {[key: number in range [0,1]]: color}
       */
  var gradient: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
       * The maximal opacity the highest value in the heatmap will have. (will be
       * overridden if opacity set)
       * Default value: 0.6
       */
  var maxOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
       * The minimum opacity the lowest value in the heatmap will have (will be
       * overridden if opacity set)
       */
  var minOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
       * Pass a callback to receive extrema change updates. Useful for DOM
       * legends.
       */
  var onExtremaChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * A global opacity for the whole heatmap. This overrides maxOpacity and
       * minOpacity if set
       * Default value: 0.6
       */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
       * The radius each datapoint will have (if not specified on the datapoint
       * itself)
       */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /**
       * Scales the radius based on map zoom.
       */
  var scaleRadius: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Indicate whether the heatmap should use a global extrema or a local
       * extrema (the maximum and minimum of the currently displayed viewport)
       */
  var useLocalExtrema: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The property name of the value/weight in a datapoint
       * Default value: 'value'
       */
  var valueField: js.UndefOr[V] = js.undefined
}

