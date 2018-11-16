package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WordCloudChart extends BarChart {
  /**
           * For some series, there is a limit that shuts down initial animation by default when the total number of points
           * in the chart is too high. For example, for a column chart and its derivatives, animation doesn't run if there
           * is more than 250 points totally. To disable this cap, set animationLimit to Infinity.
           * @default undefined
           * @since 6.0.0
           */
  var animationLimit: js.UndefOr[scala.Double] = js.undefined
  /**
           * By default, series are exposed to screen readers as regions. By enabling this option, the series element itself
           * will be exposed in the same way as the data points. This is useful if the series is not used as a grouping entity
           * in the chart, but you still want to attach a description to the series.
           * Requires the Accessibility module.
           * @default undefined
           * @since 5.0.12
           */
  var exposeElementToA11y: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * This option decides which algorithm is used for placement, and rotation of a word. The choice of algorith is
           * therefore a crucial part of the resulting layout of the wordcloud. It is possible for users to add their own
           * custom placement strategies for use in word cloud. Read more about it in our documentation
           * @default center
           * @since 6.0.0
           */
  var placementStrategy: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Same as accessibility.pointDescriptionFormatter, but for an individual series. Overrides the chart wide
           * configuration.
           * @default undefined
           * @since 5.0.12
           */
  var pointDescriptionFormatter: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /**
           * Rotation options for the words in the wordcloud.
           * @since 6.0.0
           */
  var rotation: js.UndefOr[highchartsLib.Anon_From] = js.undefined
  /**
           * If set to True, the accessibility module will skip past the points in this series for keyboard navigation.
           * @default undefined
           * @since 5.0.12
           */
  var skipKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Spiral used for placing a word after the inital position experienced a collision with either another word or the
           * borders. It is possible for users to add their own custom spiralling algorithms for use in word cloud. Read more
           * about it in our documentation
           * @default rectangular
           * @since 6.0.0
           */
  var spiral: js.UndefOr[java.lang.String] = js.undefined
  /**
           * CSS styles for the words.
           * @since 6.0.0
           */
  var style: js.UndefOr[highchartsLib.Anon_FontWeight] = js.undefined
}

