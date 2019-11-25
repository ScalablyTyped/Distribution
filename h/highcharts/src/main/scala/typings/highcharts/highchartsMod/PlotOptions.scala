package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotOptions extends js.Object {
  /**
    * (Highstock) Acceleration bands (ABANDS). This series requires the
    * `linkedTo` option to be set and should be loaded after the
    * `stock/indicators/indicators.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `abands` series are defined in plotOptions.abands.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var abands: js.UndefOr[PlotAbandsOptions] = js.undefined
  /**
    * (Highstock) Accumulation Distribution (AD). This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `ad` series are defined in plotOptions.ad.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var ad: js.UndefOr[PlotAdOptions] = js.undefined
  /**
    * (Highstock) Awesome Oscillator. This series requires the `linkedTo`
    * option to be set and should be loaded after the
    * `stock/indicators/indicators.js`
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `ao` series are defined in plotOptions.ao.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var ao: js.UndefOr[PlotAoOptions] = js.undefined
  /**
    * (Highstock) Absolute Price Oscillator. This series requires the
    * `linkedTo` option to be set and should be loaded after the
    * `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `apo` series are defined in plotOptions.apo.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var apo: js.UndefOr[PlotApoOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The area series type.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `area` series are defined in plotOptions.area.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var area: js.UndefOr[PlotAreaOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The area range series is a carteseian series with
    * higher and lower values for each point along an X axis, where the area
    * between the values is shaded.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `arearange` series are defined in
    * plotOptions.arearange.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var arearange: js.UndefOr[PlotArearangeOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The area spline series is an area series where
    * the graph between the points is smoothed into a spline.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `areaspline` series are defined in
    * plotOptions.areaspline.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var areaspline: js.UndefOr[PlotAreasplineOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The area spline range is a cartesian series type
    * with higher and lower Y values along an X axis. The area inside the range
    * is colored, and the graph outlining the area is a smoothed spline.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `areasplinerange` series are defined in
    * plotOptions.areasplinerange.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var areasplinerange: js.UndefOr[PlotAreasplinerangeOptions] = js.undefined
  /**
    * (Highstock) Aroon. This series requires the `linkedTo` option to be set
    * and should be loaded after the `stock/indicators/indicators.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `aroon` series are defined in plotOptions.aroon.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var aroon: js.UndefOr[PlotAroonOptions] = js.undefined
  /**
    * (Highstock) Aroon Oscillator. This series requires the `linkedTo` option
    * to be set and should be loaded after the `stock/indicators/indicators.js`
    * and `stock/indicators/aroon.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `aroonoscillator` series are defined in
    * plotOptions.aroonoscillator.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var aroonoscillator: js.UndefOr[PlotAroonoscillatorOptions] = js.undefined
  /**
    * (Highstock) Average true range indicator (ATR). This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `atr` series are defined in plotOptions.atr.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var atr: js.UndefOr[PlotAtrOptions] = js.undefined
  /**
    * (Highcharts) A bar series is a special type of column series where the
    * columns are horizontal.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `bar` series are defined in plotOptions.bar.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var bar: js.UndefOr[PlotBarOptions] = js.undefined
  /**
    * (Highstock) Bollinger bands (BB). This series requires the `linkedTo`
    * option to be set and should be loaded after the
    * `stock/indicators/indicators.js` file.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `bb` series are defined in plotOptions.bb.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var bb: js.UndefOr[PlotBbOptions] = js.undefined
  /**
    * (Highcharts) A bell curve is an areaspline series which represents the
    * probability density function of the normal distribution. It calculates
    * mean and standard deviation of the base series data and plots the curve
    * according to the calculated parameters.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `bellcurve` series are defined in
    * plotOptions.bellcurve.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var bellcurve: js.UndefOr[PlotBellcurveOptions] = js.undefined
  /**
    * (Highcharts) A box plot is a convenient way of depicting groups of data
    * through their five-number summaries: the smallest observation (sample
    * minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and
    * largest observation (sample maximum).
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `boxplot` series are defined in plotOptions.boxplot.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var boxplot: js.UndefOr[PlotBoxplotOptions] = js.undefined
  /**
    * (Highcharts, Highstock) A bubble series is a three dimensional series
    * type where each point renders an X, Y and Z value. Each points is drawn
    * as a bubble where the position along the X and Y axes mark the X and Y
    * values, and the size of the bubble relates to the Z value.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `bubble` series are defined in plotOptions.bubble.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var bubble: js.UndefOr[PlotBubbleOptions] = js.undefined
  /**
    * (Highcharts) A bullet graph is a variation of a bar graph. The bullet
    * graph features a single measure, compares it to a target, and displays it
    * in the context of qualitative ranges of performance that could be set
    * using plotBands on yAxis.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `bullet` series are defined in plotOptions.bullet.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var bullet: js.UndefOr[PlotBulletOptions] = js.undefined
  /**
    * (Highstock) A candlestick chart is a style of financial chart used to
    * describe price movements over time.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `candlestick` series are defined in
    * plotOptions.candlestick.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var candlestick: js.UndefOr[PlotCandlestickOptions] = js.undefined
  /**
    * (Highstock) Commodity Channel Index (CCI). This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `cci` series are defined in plotOptions.cci.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var cci: js.UndefOr[PlotCciOptions] = js.undefined
  /**
    * (Highstock) Chaikin Oscillator. This series requires the `linkedTo`
    * option to be set and should be loaded after the
    * `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `chaikin` series are defined in plotOptions.chaikin.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var chaikin: js.UndefOr[PlotChaikinOptions] = js.undefined
  /**
    * (Highstock) Chaikin Money Flow indicator (cmf).
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `cmf` series are defined in plotOptions.cmf.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var cmf: js.UndefOr[PlotCmfOptions] = js.undefined
  /**
    * (Highcharts, Highstock) Column series display one column per value along
    * an X axis.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `column` series are defined in plotOptions.column.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var column: js.UndefOr[PlotColumnOptions] = js.undefined
  /**
    * (Highcharts, Highstock) Column pyramid series display one pyramid per
    * value along an X axis. To display horizontal pyramids, set chart.inverted
    * to `true`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `columnpyramid` series are defined in
    * plotOptions.columnpyramid.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var columnpyramid: js.UndefOr[PlotColumnpyramidOptions] = js.undefined
  /**
    * (Highcharts, Highstock) The column range is a cartesian series type with
    * higher and lower Y values along an X axis. To display horizontal bars,
    * set chart.inverted to `true`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `columnrange` series are defined in
    * plotOptions.columnrange.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var columnrange: js.UndefOr[PlotColumnrangeOptions] = js.undefined
  /**
    * (Highcharts) A cylinder graph is a variation of a 3d column graph. The
    * cylinder graph features cylindrical points.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `cylinder` series are defined in plotOptions.cylinder.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var cylinder: js.UndefOr[PlotCylinderOptions] = js.undefined
  /**
    * (Highstock) Double exponential moving average (DEMA) indicator. This
    * series requires `linkedTo` option to be set and should be loaded after
    * the `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `dema` series are defined in plotOptions.dema.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var dema: js.UndefOr[PlotDemaOptions] = js.undefined
  /**
    * (Highcharts) A dependency wheel chart is a type of flow diagram, where
    * all nodes are laid out in a circle, and the flow between the are drawn as
    * link bands.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `dependencywheel` series are defined in
    * plotOptions.dependencywheel.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var dependencywheel: js.UndefOr[PlotDependencywheelOptions] = js.undefined
  /**
    * (Highstock) Detrended Price Oscillator. This series requires the
    * `linkedTo` option to be set and should be loaded after the
    * `stock/indicators/indicators.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `dpo` series are defined in plotOptions.dpo.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var dpo: js.UndefOr[PlotDpoOptions] = js.undefined
  /**
    * (Highstock) Exponential moving average indicator (EMA). This series
    * requires the `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `ema` series are defined in plotOptions.ema.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var ema: js.UndefOr[PlotEmaOptions] = js.undefined
  /**
    * (Highcharts, Highstock) Error bars are a graphical representation of the
    * variability of data and are used on graphs to indicate the error, or
    * uncertainty in a reported measurement.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `errorbar` series are defined in plotOptions.errorbar.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var errorbar: js.UndefOr[PlotErrorbarOptions] = js.undefined
  /**
    * (Highstock) Flags are used to mark events in stock charts. They can be
    * added on the timeline, or attached to a specific series.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `flags` series are defined in plotOptions.flags.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var flags: js.UndefOr[PlotFlagsOptions] = js.undefined
  /**
    * (Highcharts) Funnel charts are a type of chart often used to visualize
    * stages in a sales project, where the top are the initial stages with the
    * most clients. It requires that the modules/funnel.js file is loaded.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `funnel` series are defined in plotOptions.funnel.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var funnel: js.UndefOr[PlotFunnelOptions] = js.undefined
  /**
    * (Highcharts) A funnel3d is a 3d version of funnel series type. Funnel
    * charts are a type of chart often used to visualize stages in a sales
    * project, where the top are the initial stages with the most clients.
    *
    * It requires that the `highcharts-3d.js`, `cylinder.js` and `funnel3d.js`
    * module are loaded.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `funnel3d` series are defined in plotOptions.funnel3d.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var funnel3d: js.UndefOr[PlotFunnel3dOptions] = js.undefined
  /**
    * (Gantt) A `gantt` series. If the type option is not specified, it is
    * inherited from chart.type.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `gantt` series are defined in plotOptions.gantt.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var gantt: js.UndefOr[PlotGanttOptions] = js.undefined
  /**
    * (Highcharts) Gauges are circular plots displaying one or more values with
    * a dial pointing to values along the perimeter.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `gauge` series are defined in plotOptions.gauge.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var gauge: js.UndefOr[PlotGaugeOptions] = js.undefined
  /**
    * (Highcharts, Highmaps) A heatmap is a graphical representation of data
    * where the individual values contained in a matrix are represented as
    * colors.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `heatmap` series are defined in plotOptions.heatmap.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var heatmap: js.UndefOr[PlotHeatmapOptions] = js.undefined
  /**
    * (Highcharts) A histogram is a column series which represents the
    * distribution of the data set in the base series. Histogram splits data
    * into bins and shows their frequencies.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `histogram` series are defined in
    * plotOptions.histogram.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var histogram: js.UndefOr[PlotHistogramOptions] = js.undefined
  /**
    * (Highstock) Ichimoku Kinko Hyo (IKH). This series requires `linkedTo`
    * option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `ikh` series are defined in plotOptions.ikh.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var ikh: js.UndefOr[PlotIkhOptions] = js.undefined
  /**
    * (Highcharts) An item chart is an infographic chart where a number of
    * items are laid out in either a rectangular or circular pattern. It can be
    * used to visualize counts within a group, or for the circular pattern,
    * typically a parliament.
    *
    * The circular layout has much in common with a pie chart. Many of the item
    * series options, like `center`, `size` and data label positioning, are
    * inherited from the pie series and don't apply for rectangular layouts.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `item` series are defined in plotOptions.item.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var item: js.UndefOr[PlotItemOptions] = js.undefined
  /**
    * (Highstock) Keltner Channels. This series requires the `linkedTo` option
    * to be set and should be loaded after the
    * `stock/indicators/indicators.js`, `stock/indicators/atr.js`, and
    * `stock/ema/.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `keltnerchannels` series are defined in
    * plotOptions.keltnerchannels.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var keltnerchannels: js.UndefOr[PlotKeltnerchannelsOptions] = js.undefined
  /**
    * (Highcharts, Highstock) A line series displays information as a series of
    * data points connected by straight line segments.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `line` series are defined in plotOptions.line.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var line: js.UndefOr[PlotLineOptions] = js.undefined
  /**
    * (Highstock) Linear regression indicator. This series requires `linkedTo`
    * option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `linearregression` series are defined in
    * plotOptions.linearregression.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var linearregression: js.UndefOr[PlotLinearregressionOptions] = js.undefined
  /**
    * (Highstock) Linear regression angle indicator. This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `linearregressionangle` series are defined in
    * plotOptions.linearregressionangle.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var linearregressionangle: js.UndefOr[PlotLinearregressionangleOptions] = js.undefined
  /**
    * (Highstock) Linear regression intercept indicator. This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `linearregressionintercept` series are defined in
    * plotOptions.linearregressionintercept.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var linearregressionintercept: js.UndefOr[PlotLinearregressioninterceptOptions] = js.undefined
  /**
    * (Highstock) Linear regression slope indicator. This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `linearregressionslope` series are defined in
    * plotOptions.linearregressionslope.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var linearregressionslope: js.UndefOr[PlotLinearregressionslopeOptions] = js.undefined
  /**
    * (Highstock) Moving Average Convergence Divergence (MACD). This series
    * requires `linkedTo` option to be set and should be loaded after the
    * `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `macd` series are defined in plotOptions.macd.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var macd: js.UndefOr[PlotMacdOptions] = js.undefined
  /**
    * (Highmaps) The map series is used for basic choropleth maps, where each
    * map area has a color based on its value.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `map` series are defined in plotOptions.map.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var map: js.UndefOr[PlotMapOptions] = js.undefined
  /**
    * (Highmaps) A map bubble series is a bubble series laid out on top of a
    * map series, where each bubble is tied to a specific map area.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `mapbubble` series are defined in
    * plotOptions.mapbubble.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var mapbubble: js.UndefOr[PlotMapbubbleOptions] = js.undefined
  /**
    * (Highmaps) A mapline series is a special case of the map series where the
    * value colors are applied to the strokes rather than the fills. It can
    * also be used for freeform drawing, like dividers, in the map.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `mapline` series are defined in plotOptions.mapline.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var mapline: js.UndefOr[PlotMaplineOptions] = js.undefined
  /**
    * (Highmaps) A mappoint series is a special form of scatter series where
    * the points can be laid out in map coordinates on top of a map.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `mappoint` series are defined in plotOptions.mappoint.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var mappoint: js.UndefOr[PlotMappointOptions] = js.undefined
  /**
    * (Highstock) Money Flow Index. This series requires `linkedTo` option to
    * be set and should be loaded after the `stock/indicators/indicators.js`
    * file.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `mfi` series are defined in plotOptions.mfi.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var mfi: js.UndefOr[PlotMfiOptions] = js.undefined
  /**
    * (Highstock) Momentum. This series requires `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `momentum` series are defined in plotOptions.momentum.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var momentum: js.UndefOr[PlotMomentumOptions] = js.undefined
  /**
    * (Highstock) Normalized average true range indicator (NATR). This series
    * requires `linkedTo` option to be set and should be loaded after the
    * `stock/indicators/indicators.js` and `stock/indicators/atr.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `natr` series are defined in plotOptions.natr.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var natr: js.UndefOr[PlotNatrOptions] = js.undefined
  /**
    * (Highcharts) A networkgraph is a type of relationship chart, where
    * connnections (links) attracts nodes (points) and other nodes repulse each
    * other.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `networkgraph` series are defined in
    * plotOptions.networkgraph.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var networkgraph: js.UndefOr[PlotNetworkgraphOptions] = js.undefined
  /**
    * (Highstock) An OHLC chart is a style of financial chart used to describe
    * price movements over time. It displays open, high, low and close values
    * per data point.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `ohlc` series are defined in plotOptions.ohlc.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var ohlc: js.UndefOr[PlotOhlcOptions] = js.undefined
  /**
    * (Highcharts) An organization chart is a diagram that shows the structure
    * of an organization and the relationships and relative ranks of its parts
    * and positions.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `organization` series are defined in
    * plotOptions.organization.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var organization: js.UndefOr[PlotOrganizationOptions] = js.undefined
  /**
    * (Highcharts) A packed bubble series is a two dimensional series type,
    * where each point renders a value in X, Y position. Each point is drawn as
    * a bubble where the bubbles don't overlap with each other and the radius
    * of the bubble relates to the value.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `packedbubble` series are defined in
    * plotOptions.packedbubble.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var packedbubble: js.UndefOr[PlotPackedbubbleOptions] = js.undefined
  /**
    * (Highcharts) A pareto diagram is a type of chart that contains both bars
    * and a line graph, where individual values are represented in descending
    * order by bars, and the cumulative total is represented by the line.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `pareto` series are defined in plotOptions.pareto.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var pareto: js.UndefOr[PlotParetoOptions] = js.undefined
  /**
    * (Highstock) Price channel (PC). This series requires the `linkedTo`
    * option to be set and should be loaded after the
    * `stock/indicators/indicators.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `pc` series are defined in plotOptions.pc.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var pc: js.UndefOr[PlotPcOptions] = js.undefined
  /**
    * (Highcharts) A pie chart is a circular graphic which is divided into
    * slices to illustrate numerical proportion.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `pie` series are defined in plotOptions.pie.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var pie: js.UndefOr[PlotPieOptions] = js.undefined
  /**
    * (Highstock) Pivot points indicator. This series requires the `linkedTo`
    * option to be set and should be loaded after
    * `stock/indicators/indicators.js` file.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `pivotpoints` series are defined in
    * plotOptions.pivotpoints.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var pivotpoints: js.UndefOr[PlotPivotpointsOptions] = js.undefined
  /**
    * (Highcharts, Highstock) A polygon series can be used to draw any freeform
    * shape in the cartesian coordinate system. A fill is applied with the
    * `color` option, and stroke is applied through `lineWidth` and `lineColor`
    * options.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `polygon` series are defined in plotOptions.polygon.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var polygon: js.UndefOr[PlotPolygonOptions] = js.undefined
  /**
    * (Highstock) Percentage Price Oscillator. This series requires the
    * `linkedTo` option to be set and should be loaded after the
    * `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `ppo` series are defined in plotOptions.ppo.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var ppo: js.UndefOr[PlotPpoOptions] = js.undefined
  /**
    * (Highstock) Price envelopes indicator based on SMA calculations. This
    * series requires the `linkedTo` option to be set and should be loaded
    * after the `stock/indicators/indicators.js` file.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `priceenvelopes` series are defined in
    * plotOptions.priceenvelopes.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var priceenvelopes: js.UndefOr[PlotPriceenvelopesOptions] = js.undefined
  /**
    * (Highstock) Parabolic SAR. This series requires `linkedTo` option to be
    * set and should be loaded after `stock/indicators/indicators.js` file.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `psar` series are defined in plotOptions.psar.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var psar: js.UndefOr[PlotPsarOptions] = js.undefined
  /**
    * (Highcharts) A pyramid series is a special type of funnel, without neck
    * and reversed by default.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `pyramid` series are defined in plotOptions.pyramid.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var pyramid: js.UndefOr[PlotPyramidOptions] = js.undefined
  /**
    * (Highcharts) A pyramid3d is a 3d version of pyramid series type. Pyramid
    * charts are a type of chart often used to visualize stages in a sales
    * project, where the top are the initial stages with the most clients.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `pyramid3d` series are defined in
    * plotOptions.pyramid3d.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var pyramid3d: js.UndefOr[PlotPyramid3dOptions] = js.undefined
  /**
    * (Highstock) Rate of change indicator (ROC). The indicator value for each
    * point is defined as:
    *
    * `(C - Cn) / Cn * 100`
    *
    * where: `C` is the close value of the point of the same x in the linked
    * series and `Cn` is the close value of the point `n` periods ago. `n` is
    * set through period.
    *
    * This series requires `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `roc` series are defined in plotOptions.roc.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var roc: js.UndefOr[PlotRocOptions] = js.undefined
  /**
    * (Highstock) Relative strength index (RSI) technical indicator. This
    * series requires the `linkedTo` option to be set and should be loaded
    * after the `stock/indicators/indicators.js` file.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `rsi` series are defined in plotOptions.rsi.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var rsi: js.UndefOr[PlotRsiOptions] = js.undefined
  /**
    * (Highcharts) A sankey diagram is a type of flow diagram, in which the
    * width of the link between two nodes is shown proportionally to the flow
    * quantity.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `sankey` series are defined in plotOptions.sankey.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var sankey: js.UndefOr[PlotSankeyOptions] = js.undefined
  /**
    * (Highcharts, Highstock) A scatter plot uses cartesian coordinates to
    * display values for two variables for a set of data.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `scatter` series are defined in plotOptions.scatter.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var scatter: js.UndefOr[PlotScatterOptions] = js.undefined
  /**
    * (Highcharts) A 3D scatter plot uses x, y and z coordinates to display
    * values for three variables for a set of data.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `scatter3d` series are defined in
    * plotOptions.scatter3d.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var scatter3d: js.UndefOr[PlotScatter3dOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) General options for all series
    * types.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `line` series are defined in plotOptions.line.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var series: js.UndefOr[PlotSeriesOptions] = js.undefined
  /**
    * (Highstock) Simple moving average indicator (SMA). This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `sma` series are defined in plotOptions.sma.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var sma: js.UndefOr[PlotSmaOptions] = js.undefined
  /**
    * (Highcharts) A solid gauge is a circular gauge where the value is
    * indicated by a filled arc, and the color of the arc may variate with the
    * value.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `solidgauge` series are defined in
    * plotOptions.solidgauge.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var solidgauge: js.UndefOr[PlotSolidgaugeOptions] = js.undefined
  /**
    * (Highcharts, Highstock) A spline series is a special type of line series,
    * where the segments between the data points are smoothed.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `spline` series are defined in plotOptions.spline.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var spline: js.UndefOr[PlotSplineOptions] = js.undefined
  /**
    * (Highstock) Stochastic oscillator. This series requires the `linkedTo`
    * option to be set and should be loaded after the
    * `stock/indicators/indicators.js` file.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `stochastic` series are defined in
    * plotOptions.stochastic.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var stochastic: js.UndefOr[PlotStochasticOptions] = js.undefined
  /**
    * (Highcharts, Highstock) A streamgraph is a type of stacked area graph
    * which is displaced around a central axis, resulting in a flowing, organic
    * shape.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `streamgraph` series are defined in
    * plotOptions.streamgraph.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var streamgraph: js.UndefOr[PlotStreamgraphOptions] = js.undefined
  /**
    * (Highcharts) A Sunburst displays hierarchical data, where a level in the
    * hierarchy is represented by a circle. The center represents the root node
    * of the tree. The visualization bears a resemblance to both treemap and
    * pie charts.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `sunburst` series are defined in plotOptions.sunburst.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var sunburst: js.UndefOr[PlotSunburstOptions] = js.undefined
  /**
    * (Highstock) Supertrend indicator. This series requires the `linkedTo`
    * option to be set and should be loaded after the
    * `stock/indicators/indicators.js` and `stock/indicators/sma.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `supertrend` series are defined in
    * plotOptions.supertrend.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var supertrend: js.UndefOr[PlotSupertrendOptions] = js.undefined
  /**
    * (Highstock) Triple exponential moving average (TEMA) indicator. This
    * series requires `linkedTo` option to be set and should be loaded after
    * the `stock/indicators/indicators.js` and `stock/indicators/ema.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `tema` series are defined in plotOptions.tema.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var tema: js.UndefOr[PlotTemaOptions] = js.undefined
  /**
    * (Highcharts, Highmaps) A tilemap series is a type of heatmap where the
    * tile shapes are configurable.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `tilemap` series are defined in plotOptions.tilemap.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var tilemap: js.UndefOr[PlotTilemapOptions] = js.undefined
  /**
    * (Highcharts) The timeline series presents given events along a drawn
    * line.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `timeline` series are defined in plotOptions.timeline.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var timeline: js.UndefOr[PlotTimelineOptions] = js.undefined
  /**
    * (Highcharts) A treemap displays hierarchical data using nested
    * rectangles. The data can be laid out in varying ways depending on
    * options.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `treemap` series are defined in plotOptions.treemap.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var treemap: js.UndefOr[PlotTreemapOptions] = js.undefined
  /**
    * (Highstock) Trendline (linear regression) fits a straight line to the
    * selected data using a method called the Sum Of Least Squares. This series
    * requires the `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `trendline` series are defined in
    * plotOptions.trendline.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var trendline: js.UndefOr[PlotTrendlineOptions] = js.undefined
  /**
    * (Highstock) Triple exponential average (TRIX) oscillator. This series
    * requires `linkedTo` option to be set.
    *
    * Requires https://code.highcharts.com/stock/indicators/ema.js and
    * https://code.highcharts.com/stock/indicators/tema.js.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `trix` series are defined in plotOptions.trix.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var trix: js.UndefOr[PlotTrixOptions] = js.undefined
  /**
    * (Highcharts) A variable pie series is a two dimensional series type,
    * where each point renders an Y and Z value. Each point is drawn as a pie
    * slice where the size (arc) of the slice relates to the Y value and the
    * radius of pie slice relates to the Z value.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `variablepie` series are defined in
    * plotOptions.variablepie.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var variablepie: js.UndefOr[PlotVariablepieOptions] = js.undefined
  /**
    * (Highcharts) A variwide chart (related to marimekko chart) is a column
    * chart with a variable width expressing a third dimension.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `variwide` series are defined in plotOptions.variwide.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var variwide: js.UndefOr[PlotVariwideOptions] = js.undefined
  /**
    * (Highstock) Volume By Price indicator.
    *
    * This series requires `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `vbp` series are defined in plotOptions.vbp.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var vbp: js.UndefOr[PlotVbpOptions] = js.undefined
  /**
    * (Highcharts, Highstock) A vector plot is a type of cartesian chart where
    * each point has an X and Y position, a length and a direction. Vectors are
    * drawn as arrows.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `vector` series are defined in plotOptions.vector.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var vector: js.UndefOr[PlotVectorOptions] = js.undefined
  /**
    * (Highcharts) A Venn diagram displays all possible logical relations
    * between a collection of different sets. The sets are represented by
    * circles, and the relation between the sets are displayed by the overlap
    * or lack of overlap between them. The venn diagram is a special case of
    * Euler diagrams, which can also be displayed by this series type.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `venn` series are defined in plotOptions.venn.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var venn: js.UndefOr[PlotVennOptions] = js.undefined
  /**
    * (Highstock) Volume Weighted Average Price indicator.
    *
    * This series requires `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `vwap` series are defined in plotOptions.vwap.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var vwap: js.UndefOr[PlotVwapOptions] = js.undefined
  /**
    * (Highcharts) A waterfall chart displays sequentially introduced positive
    * or negative values in cumulative columns.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `waterfall` series are defined in
    * plotOptions.waterfall.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var waterfall: js.UndefOr[PlotWaterfallOptions] = js.undefined
  /**
    * (Highstock) Williams %R. This series requires the `linkedTo` option to be
    * set and should be loaded after the `stock/indicators/indicators.js`.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `williamsr` series are defined in
    * plotOptions.williamsr.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var williamsr: js.UndefOr[PlotWilliamsrOptions] = js.undefined
  /**
    * (Highcharts, Highstock) Wind barbs are a convenient way to represent wind
    * speed and direction in one graphical form. Wind direction is given by the
    * stem direction, and wind speed by the number and shape of barbs.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `windbarb` series are defined in plotOptions.windbarb.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var windbarb: js.UndefOr[PlotWindbarbOptions] = js.undefined
  /**
    * (Highstock) Weighted moving average indicator (WMA). This series requires
    * `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `wma` series are defined in plotOptions.wma.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var wma: js.UndefOr[PlotWmaOptions] = js.undefined
  /**
    * (Highcharts) A word cloud is a visualization of a set of words, where the
    * size and placement of a word is determined by how it is weighted.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `wordcloud` series are defined in
    * plotOptions.wordcloud.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var wordcloud: js.UndefOr[PlotWordcloudOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The X-range series displays ranges on the
    * X axis, typically time intervals with a start and end date.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `xrange` series are defined in plotOptions.xrange.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var xrange: js.UndefOr[PlotXrangeOptions] = js.undefined
  /**
    * (Highstock) Zig Zag indicator.
    *
    * This series requires `linkedTo` option to be set.
    *
    * In TypeScript the type option must always be set.
    *
    * Configuration options for the series are given in three levels:
    *
    * 1. Options for all series in a chart are defined in the
    * plotOptions.series object.
    *
    * 2. Options for all `zigzag` series are defined in plotOptions.zigzag.
    *
    * 3. Options for one single series are given in the series instance array.
    * (see online documentation for example)
    */
  var zigzag: js.UndefOr[PlotZigzagOptions] = js.undefined
}

object PlotOptions {
  @scala.inline
  def apply(
    abands: PlotAbandsOptions = null,
    ad: PlotAdOptions = null,
    ao: PlotAoOptions = null,
    apo: PlotApoOptions = null,
    area: PlotAreaOptions = null,
    arearange: PlotArearangeOptions = null,
    areaspline: PlotAreasplineOptions = null,
    areasplinerange: PlotAreasplinerangeOptions = null,
    aroon: PlotAroonOptions = null,
    aroonoscillator: PlotAroonoscillatorOptions = null,
    atr: PlotAtrOptions = null,
    bar: PlotBarOptions = null,
    bb: PlotBbOptions = null,
    bellcurve: PlotBellcurveOptions = null,
    boxplot: PlotBoxplotOptions = null,
    bubble: PlotBubbleOptions = null,
    bullet: PlotBulletOptions = null,
    candlestick: PlotCandlestickOptions = null,
    cci: PlotCciOptions = null,
    chaikin: PlotChaikinOptions = null,
    cmf: PlotCmfOptions = null,
    column: PlotColumnOptions = null,
    columnpyramid: PlotColumnpyramidOptions = null,
    columnrange: PlotColumnrangeOptions = null,
    cylinder: PlotCylinderOptions = null,
    dema: PlotDemaOptions = null,
    dependencywheel: PlotDependencywheelOptions = null,
    dpo: PlotDpoOptions = null,
    ema: PlotEmaOptions = null,
    errorbar: PlotErrorbarOptions = null,
    flags: PlotFlagsOptions = null,
    funnel: PlotFunnelOptions = null,
    funnel3d: PlotFunnel3dOptions = null,
    gantt: PlotGanttOptions = null,
    gauge: PlotGaugeOptions = null,
    heatmap: PlotHeatmapOptions = null,
    histogram: PlotHistogramOptions = null,
    ikh: PlotIkhOptions = null,
    item: PlotItemOptions = null,
    keltnerchannels: PlotKeltnerchannelsOptions = null,
    line: PlotLineOptions = null,
    linearregression: PlotLinearregressionOptions = null,
    linearregressionangle: PlotLinearregressionangleOptions = null,
    linearregressionintercept: PlotLinearregressioninterceptOptions = null,
    linearregressionslope: PlotLinearregressionslopeOptions = null,
    macd: PlotMacdOptions = null,
    map: PlotMapOptions = null,
    mapbubble: PlotMapbubbleOptions = null,
    mapline: PlotMaplineOptions = null,
    mappoint: PlotMappointOptions = null,
    mfi: PlotMfiOptions = null,
    momentum: PlotMomentumOptions = null,
    natr: PlotNatrOptions = null,
    networkgraph: PlotNetworkgraphOptions = null,
    ohlc: PlotOhlcOptions = null,
    organization: PlotOrganizationOptions = null,
    packedbubble: PlotPackedbubbleOptions = null,
    pareto: PlotParetoOptions = null,
    pc: PlotPcOptions = null,
    pie: PlotPieOptions = null,
    pivotpoints: PlotPivotpointsOptions = null,
    polygon: PlotPolygonOptions = null,
    ppo: PlotPpoOptions = null,
    priceenvelopes: PlotPriceenvelopesOptions = null,
    psar: PlotPsarOptions = null,
    pyramid: PlotPyramidOptions = null,
    pyramid3d: PlotPyramid3dOptions = null,
    roc: PlotRocOptions = null,
    rsi: PlotRsiOptions = null,
    sankey: PlotSankeyOptions = null,
    scatter: PlotScatterOptions = null,
    scatter3d: PlotScatter3dOptions = null,
    series: PlotSeriesOptions = null,
    sma: PlotSmaOptions = null,
    solidgauge: PlotSolidgaugeOptions = null,
    spline: PlotSplineOptions = null,
    stochastic: PlotStochasticOptions = null,
    streamgraph: PlotStreamgraphOptions = null,
    sunburst: PlotSunburstOptions = null,
    supertrend: PlotSupertrendOptions = null,
    tema: PlotTemaOptions = null,
    tilemap: PlotTilemapOptions = null,
    timeline: PlotTimelineOptions = null,
    treemap: PlotTreemapOptions = null,
    trendline: PlotTrendlineOptions = null,
    trix: PlotTrixOptions = null,
    variablepie: PlotVariablepieOptions = null,
    variwide: PlotVariwideOptions = null,
    vbp: PlotVbpOptions = null,
    vector: PlotVectorOptions = null,
    venn: PlotVennOptions = null,
    vwap: PlotVwapOptions = null,
    waterfall: PlotWaterfallOptions = null,
    williamsr: PlotWilliamsrOptions = null,
    windbarb: PlotWindbarbOptions = null,
    wma: PlotWmaOptions = null,
    wordcloud: PlotWordcloudOptions = null,
    xrange: PlotXrangeOptions = null,
    zigzag: PlotZigzagOptions = null
  ): PlotOptions = {
    val __obj = js.Dynamic.literal()
    if (abands != null) __obj.updateDynamic("abands")(abands.asInstanceOf[js.Any])
    if (ad != null) __obj.updateDynamic("ad")(ad.asInstanceOf[js.Any])
    if (ao != null) __obj.updateDynamic("ao")(ao.asInstanceOf[js.Any])
    if (apo != null) __obj.updateDynamic("apo")(apo.asInstanceOf[js.Any])
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (arearange != null) __obj.updateDynamic("arearange")(arearange.asInstanceOf[js.Any])
    if (areaspline != null) __obj.updateDynamic("areaspline")(areaspline.asInstanceOf[js.Any])
    if (areasplinerange != null) __obj.updateDynamic("areasplinerange")(areasplinerange.asInstanceOf[js.Any])
    if (aroon != null) __obj.updateDynamic("aroon")(aroon.asInstanceOf[js.Any])
    if (aroonoscillator != null) __obj.updateDynamic("aroonoscillator")(aroonoscillator.asInstanceOf[js.Any])
    if (atr != null) __obj.updateDynamic("atr")(atr.asInstanceOf[js.Any])
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (bb != null) __obj.updateDynamic("bb")(bb.asInstanceOf[js.Any])
    if (bellcurve != null) __obj.updateDynamic("bellcurve")(bellcurve.asInstanceOf[js.Any])
    if (boxplot != null) __obj.updateDynamic("boxplot")(boxplot.asInstanceOf[js.Any])
    if (bubble != null) __obj.updateDynamic("bubble")(bubble.asInstanceOf[js.Any])
    if (bullet != null) __obj.updateDynamic("bullet")(bullet.asInstanceOf[js.Any])
    if (candlestick != null) __obj.updateDynamic("candlestick")(candlestick.asInstanceOf[js.Any])
    if (cci != null) __obj.updateDynamic("cci")(cci.asInstanceOf[js.Any])
    if (chaikin != null) __obj.updateDynamic("chaikin")(chaikin.asInstanceOf[js.Any])
    if (cmf != null) __obj.updateDynamic("cmf")(cmf.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (columnpyramid != null) __obj.updateDynamic("columnpyramid")(columnpyramid.asInstanceOf[js.Any])
    if (columnrange != null) __obj.updateDynamic("columnrange")(columnrange.asInstanceOf[js.Any])
    if (cylinder != null) __obj.updateDynamic("cylinder")(cylinder.asInstanceOf[js.Any])
    if (dema != null) __obj.updateDynamic("dema")(dema.asInstanceOf[js.Any])
    if (dependencywheel != null) __obj.updateDynamic("dependencywheel")(dependencywheel.asInstanceOf[js.Any])
    if (dpo != null) __obj.updateDynamic("dpo")(dpo.asInstanceOf[js.Any])
    if (ema != null) __obj.updateDynamic("ema")(ema.asInstanceOf[js.Any])
    if (errorbar != null) __obj.updateDynamic("errorbar")(errorbar.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (funnel != null) __obj.updateDynamic("funnel")(funnel.asInstanceOf[js.Any])
    if (funnel3d != null) __obj.updateDynamic("funnel3d")(funnel3d.asInstanceOf[js.Any])
    if (gantt != null) __obj.updateDynamic("gantt")(gantt.asInstanceOf[js.Any])
    if (gauge != null) __obj.updateDynamic("gauge")(gauge.asInstanceOf[js.Any])
    if (heatmap != null) __obj.updateDynamic("heatmap")(heatmap.asInstanceOf[js.Any])
    if (histogram != null) __obj.updateDynamic("histogram")(histogram.asInstanceOf[js.Any])
    if (ikh != null) __obj.updateDynamic("ikh")(ikh.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (keltnerchannels != null) __obj.updateDynamic("keltnerchannels")(keltnerchannels.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (linearregression != null) __obj.updateDynamic("linearregression")(linearregression.asInstanceOf[js.Any])
    if (linearregressionangle != null) __obj.updateDynamic("linearregressionangle")(linearregressionangle.asInstanceOf[js.Any])
    if (linearregressionintercept != null) __obj.updateDynamic("linearregressionintercept")(linearregressionintercept.asInstanceOf[js.Any])
    if (linearregressionslope != null) __obj.updateDynamic("linearregressionslope")(linearregressionslope.asInstanceOf[js.Any])
    if (macd != null) __obj.updateDynamic("macd")(macd.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (mapbubble != null) __obj.updateDynamic("mapbubble")(mapbubble.asInstanceOf[js.Any])
    if (mapline != null) __obj.updateDynamic("mapline")(mapline.asInstanceOf[js.Any])
    if (mappoint != null) __obj.updateDynamic("mappoint")(mappoint.asInstanceOf[js.Any])
    if (mfi != null) __obj.updateDynamic("mfi")(mfi.asInstanceOf[js.Any])
    if (momentum != null) __obj.updateDynamic("momentum")(momentum.asInstanceOf[js.Any])
    if (natr != null) __obj.updateDynamic("natr")(natr.asInstanceOf[js.Any])
    if (networkgraph != null) __obj.updateDynamic("networkgraph")(networkgraph.asInstanceOf[js.Any])
    if (ohlc != null) __obj.updateDynamic("ohlc")(ohlc.asInstanceOf[js.Any])
    if (organization != null) __obj.updateDynamic("organization")(organization.asInstanceOf[js.Any])
    if (packedbubble != null) __obj.updateDynamic("packedbubble")(packedbubble.asInstanceOf[js.Any])
    if (pareto != null) __obj.updateDynamic("pareto")(pareto.asInstanceOf[js.Any])
    if (pc != null) __obj.updateDynamic("pc")(pc.asInstanceOf[js.Any])
    if (pie != null) __obj.updateDynamic("pie")(pie.asInstanceOf[js.Any])
    if (pivotpoints != null) __obj.updateDynamic("pivotpoints")(pivotpoints.asInstanceOf[js.Any])
    if (polygon != null) __obj.updateDynamic("polygon")(polygon.asInstanceOf[js.Any])
    if (ppo != null) __obj.updateDynamic("ppo")(ppo.asInstanceOf[js.Any])
    if (priceenvelopes != null) __obj.updateDynamic("priceenvelopes")(priceenvelopes.asInstanceOf[js.Any])
    if (psar != null) __obj.updateDynamic("psar")(psar.asInstanceOf[js.Any])
    if (pyramid != null) __obj.updateDynamic("pyramid")(pyramid.asInstanceOf[js.Any])
    if (pyramid3d != null) __obj.updateDynamic("pyramid3d")(pyramid3d.asInstanceOf[js.Any])
    if (roc != null) __obj.updateDynamic("roc")(roc.asInstanceOf[js.Any])
    if (rsi != null) __obj.updateDynamic("rsi")(rsi.asInstanceOf[js.Any])
    if (sankey != null) __obj.updateDynamic("sankey")(sankey.asInstanceOf[js.Any])
    if (scatter != null) __obj.updateDynamic("scatter")(scatter.asInstanceOf[js.Any])
    if (scatter3d != null) __obj.updateDynamic("scatter3d")(scatter3d.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (sma != null) __obj.updateDynamic("sma")(sma.asInstanceOf[js.Any])
    if (solidgauge != null) __obj.updateDynamic("solidgauge")(solidgauge.asInstanceOf[js.Any])
    if (spline != null) __obj.updateDynamic("spline")(spline.asInstanceOf[js.Any])
    if (stochastic != null) __obj.updateDynamic("stochastic")(stochastic.asInstanceOf[js.Any])
    if (streamgraph != null) __obj.updateDynamic("streamgraph")(streamgraph.asInstanceOf[js.Any])
    if (sunburst != null) __obj.updateDynamic("sunburst")(sunburst.asInstanceOf[js.Any])
    if (supertrend != null) __obj.updateDynamic("supertrend")(supertrend.asInstanceOf[js.Any])
    if (tema != null) __obj.updateDynamic("tema")(tema.asInstanceOf[js.Any])
    if (tilemap != null) __obj.updateDynamic("tilemap")(tilemap.asInstanceOf[js.Any])
    if (timeline != null) __obj.updateDynamic("timeline")(timeline.asInstanceOf[js.Any])
    if (treemap != null) __obj.updateDynamic("treemap")(treemap.asInstanceOf[js.Any])
    if (trendline != null) __obj.updateDynamic("trendline")(trendline.asInstanceOf[js.Any])
    if (trix != null) __obj.updateDynamic("trix")(trix.asInstanceOf[js.Any])
    if (variablepie != null) __obj.updateDynamic("variablepie")(variablepie.asInstanceOf[js.Any])
    if (variwide != null) __obj.updateDynamic("variwide")(variwide.asInstanceOf[js.Any])
    if (vbp != null) __obj.updateDynamic("vbp")(vbp.asInstanceOf[js.Any])
    if (vector != null) __obj.updateDynamic("vector")(vector.asInstanceOf[js.Any])
    if (venn != null) __obj.updateDynamic("venn")(venn.asInstanceOf[js.Any])
    if (vwap != null) __obj.updateDynamic("vwap")(vwap.asInstanceOf[js.Any])
    if (waterfall != null) __obj.updateDynamic("waterfall")(waterfall.asInstanceOf[js.Any])
    if (williamsr != null) __obj.updateDynamic("williamsr")(williamsr.asInstanceOf[js.Any])
    if (windbarb != null) __obj.updateDynamic("windbarb")(windbarb.asInstanceOf[js.Any])
    if (wma != null) __obj.updateDynamic("wma")(wma.asInstanceOf[js.Any])
    if (wordcloud != null) __obj.updateDynamic("wordcloud")(wordcloud.asInstanceOf[js.Any])
    if (xrange != null) __obj.updateDynamic("xrange")(xrange.asInstanceOf[js.Any])
    if (zigzag != null) __obj.updateDynamic("zigzag")(zigzag.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotOptions]
  }
}

