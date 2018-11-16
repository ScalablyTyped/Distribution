package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The size of the point shape is determined by its value relative to its siblings values. Requires the module
     * heatmap.js as well, if functionality such as the colorAxis is to be used.
     */

trait TreeMapChart extends SeriesChart {
  /**
           * When enabled the user can click on a point which is a parent and zoom in on its children.
           * @default false
           * @since 4.1.0
           */
  var allowDrillToNode: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Enabling this option will make the treemap alternate the drawing direction between vertical and horizontal. The
           * next levels starting direction will always be the opposite of the previous.
           * @default false
           * @since 4.1.0
           */
  var alternateStartingDirection: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The color of the border surrounding each tree map item.
           * @default '#E0E0E0'
           */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
           * The width of the border surrounding each column or bar.
           * @default 1
           */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
           * When using automatic point colors pulled from the options.colors collection, this option determines whether the
           * chart should receive one color per series or one color per point.
           * @default false
           * @since 2.0
           */
  var colorByPoint: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * A series specific or series type specific color set to apply instead of the global colors when colorByPoint is true.
           * @since 3.0
           */
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  /**
           * This option decides if the user can interact with the parent nodes or just the leaf nodes. When this option is
           * undefined, it will be true by default. However when allowDrillToNode is true, then it will be false by default.
           * @since 4.1.2
           */
  var interactByLeaf: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * This option decides which algorithm is used for setting position and dimensions of the points. Can be one of
           * 'sliceAndDice', 'stripes', 'squarified' or 'strip'.
           * @default 'sliceAndDice'
           * @since 4.1.0
           */
  var layoutAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Defines which direction the layout algorithm will start drawing. Possible values are 'vertical' and 'horizontal'.
           * @default 'vertical'
           * @since 4.1.0
           */
  var layoutStartingDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Used together with the levels and allowDrillToNode options. When set to false the first level visible when
           * drilling is considered to be level one. Otherwise the level will be the same as the tree structure.
           * @default true
           * @since 4.1.0
           */
  var levelIsConstant: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Set options on specific levels. Takes precedence over series options, but not point options.
           */
  var levels: js.UndefOr[js.Array[TreeMapLevel]] = js.undefined
  /**
           * The maximum allowed pixel width for a column, translated to the height of a bar in a bar chart. This prevents the
           * columns from becoming too wide when there is a small number of points in the chart.
           * @default null
           * @since 4.1.8
           */
  var maxPointWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
           * The sort index of the point inside the treemap level.
           * @since 4.1.10
           */
  var sortIndex: js.UndefOr[scala.Double] = js.undefined
  /**
           * A wrapper object for all the series options in specific states.
           */
  @JSName("states")
  var states_TreeMapChart: js.UndefOr[highchartsLib.Anon_HoverBarStates] = js.undefined
}

