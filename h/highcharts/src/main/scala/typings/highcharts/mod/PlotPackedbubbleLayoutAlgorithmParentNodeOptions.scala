package typings.highcharts.mod

import typings.highcharts.highchartsStrings.`reingold-fruchterman`
import typings.highcharts.highchartsStrings.circle
import typings.highcharts.highchartsStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPackedbubbleLayoutAlgorithmParentNodeOptions extends js.Object {
  /**
    * (Highcharts) Friction applied on forces to prevent nodes rushing to fast
    * to the desired positions.
    */
  var friction: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Gravitational const used in the barycenter force of the
    * algorithm.
    */
  var gravitationalConstant: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) When `initialPositions` are set to 'circle',
    * `initialPositionRadius` is a distance from the center of circle, in which
    * nodes are created.
    */
  var initialPositionRadius: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Initial layout algorithm for positioning nodes. Can be one
    * of built-in options ("circle", "random") or a function where positions
    * should be set on each node (`this.nodes`) as `node.plotX` and
    * `node.plotY`
    */
  var initialPositions: js.UndefOr[circle | random | js.Function] = js.undefined
  /**
    * (Highcharts) Integration type. Available options are `'euler'` and
    * `'verlet'`. Integration determines how forces are applied on particles.
    * In Euler integration, force is applied direct as `newPosition +=
    * velocity;`. In Verlet integration, new position is based on a previous
    * posittion without velocity: `newPosition += previousPosition -
    * newPosition`.
    *
    * Note that different integrations give different results as forces are
    * different.
    *
    * In Highcharts v7.0.x only `'euler'` integration was supported.
    */
  var integration: js.UndefOr[OptionsIntegrationValue] = js.undefined
  /**
    * (Highcharts) Ideal length (px) of the link between two nodes. When not
    * defined, length is calculated as: `Math.pow(availableWidth *
    * availableHeight / nodesLength, 0.4);`
    *
    * Note: Because of the algorithm specification, length of each link might
    * be not exactly as specified.
    */
  var linkLength: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Styling options for parentNodes markers. Similar to
    * line.marker options.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.undefined
  /**
    * (Highcharts) Max number of iterations before algorithm will stop. In
    * general, algorithm should find positions sooner, but when rendering huge
    * number of nodes, it is recommended to increase this value as finding
    * perfect graph positions can require more time.
    */
  var maxIterations: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Verlet integration only. Max speed that node can get in one
    * iteration. In terms of simulation, it's a maximum translation (in pixels)
    * that node can move (in both, x and y, dimensions). While `friction` is
    * applied on all nodes, max speed is applied only for nodes that move very
    * fast, for example small or disconnected ones.
    */
  var maxSpeed: js.UndefOr[Double] = js.undefined
  var seriesInteraction: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Type of the algorithm used when positioning nodes.
    */
  var `type`: js.UndefOr[`reingold-fruchterman`] = js.undefined
}

object PlotPackedbubbleLayoutAlgorithmParentNodeOptions {
  @scala.inline
  def apply(
    friction: js.UndefOr[Double] = js.undefined,
    gravitationalConstant: js.UndefOr[Double] = js.undefined,
    initialPositionRadius: js.UndefOr[Double] = js.undefined,
    initialPositions: circle | random | js.Function = null,
    integration: OptionsIntegrationValue = null,
    linkLength: js.UndefOr[Double] = js.undefined,
    marker: PointMarkerOptionsObject = null,
    maxIterations: js.UndefOr[Double] = js.undefined,
    maxSpeed: js.UndefOr[Double] = js.undefined,
    seriesInteraction: js.UndefOr[Boolean] = js.undefined,
    `type`: `reingold-fruchterman` = null
  ): PlotPackedbubbleLayoutAlgorithmParentNodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(friction)) __obj.updateDynamic("friction")(friction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gravitationalConstant)) __obj.updateDynamic("gravitationalConstant")(gravitationalConstant.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialPositionRadius)) __obj.updateDynamic("initialPositionRadius")(initialPositionRadius.get.asInstanceOf[js.Any])
    if (initialPositions != null) __obj.updateDynamic("initialPositions")(initialPositions.asInstanceOf[js.Any])
    if (integration != null) __obj.updateDynamic("integration")(integration.asInstanceOf[js.Any])
    if (!js.isUndefined(linkLength)) __obj.updateDynamic("linkLength")(linkLength.get.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(maxIterations)) __obj.updateDynamic("maxIterations")(maxIterations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSpeed)) __obj.updateDynamic("maxSpeed")(maxSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seriesInteraction)) __obj.updateDynamic("seriesInteraction")(seriesInteraction.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPackedbubbleLayoutAlgorithmParentNodeOptions]
  }
}

