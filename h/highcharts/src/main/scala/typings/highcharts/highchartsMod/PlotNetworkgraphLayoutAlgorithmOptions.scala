package typings.highcharts.highchartsMod

import typings.highcharts.highchartsStrings.`reingold-fruchterman`
import typings.highcharts.highchartsStrings.circle
import typings.highcharts.highchartsStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotNetworkgraphLayoutAlgorithmOptions extends js.Object {
  /**
    * (Highcharts) Approximation used to calculate repulsive forces affecting
    * nodes. By default, when calculateing net force, nodes are compared
    * against each other, which gives O(N^2) complexity. Using Barnes-Hut
    * approximation, we decrease this to O(N log N), but the resulting graph
    * will have different layout. Barnes-Hut approximation divides space into
    * rectangles via quad tree, where forces exerted on nodes are calculated
    * directly for nearby cells, and for all others, cells are treated as a
    * separate node with center of mass.
    */
  var approximation: js.UndefOr[OptionsApproximationValue] = js.undefined
  /**
    * (Highcharts) Attraction force applied on a node which is conected to
    * another node by a link. Passed are two arguments:
    *
    * - `d` - which is current distance between two nodes
    *
    * - `k` - which is desired distance between two nodes
    *
    * In `verlet` integration, defaults to: `function (d, k) { return (k - d) /
    * d; }`
    */
  var attractiveForce: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highcharts) Experimental. Enables live simulation of the algorithm
    * implementation. All nodes are animated as the forces applies on them.
    */
  var enableSimulation: js.UndefOr[Boolean] = js.undefined
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
  /**
    * (Highcharts) Repulsive force applied on a node. Passed are two arguments:
    *
    * - `d` - which is current distance between two nodes
    *
    * - `k` - which is desired distance between two nodes
    *
    * In `verlet` integration, defaults to: `function (d, k) { return (k - d) /
    * d * (k > d ? 1 : 0) }`
    */
  var repulsiveForce: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highcharts) Barnes-Hut approximation only. Deteremines when distance
    * between cell and node is small enough to caculate forces. Value of
    * `theta` is compared directly with quotient `s / d`, where `s` is the size
    * of the cell, and `d` is distance between center of cell's mass and
    * currently compared node.
    */
  var theta: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Type of the algorithm used when positioning nodes.
    */
  var `type`: js.UndefOr[`reingold-fruchterman`] = js.undefined
}

object PlotNetworkgraphLayoutAlgorithmOptions {
  @scala.inline
  def apply(
    approximation: OptionsApproximationValue = null,
    attractiveForce: js.Function = null,
    enableSimulation: js.UndefOr[Boolean] = js.undefined,
    friction: Int | Double = null,
    gravitationalConstant: Int | Double = null,
    initialPositionRadius: Int | Double = null,
    initialPositions: circle | random | js.Function = null,
    integration: OptionsIntegrationValue = null,
    linkLength: Int | Double = null,
    maxIterations: Int | Double = null,
    maxSpeed: Int | Double = null,
    repulsiveForce: js.Function = null,
    theta: Int | Double = null,
    `type`: `reingold-fruchterman` = null
  ): PlotNetworkgraphLayoutAlgorithmOptions = {
    val __obj = js.Dynamic.literal()
    if (approximation != null) __obj.updateDynamic("approximation")(approximation)
    if (attractiveForce != null) __obj.updateDynamic("attractiveForce")(attractiveForce)
    if (!js.isUndefined(enableSimulation)) __obj.updateDynamic("enableSimulation")(enableSimulation)
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (gravitationalConstant != null) __obj.updateDynamic("gravitationalConstant")(gravitationalConstant.asInstanceOf[js.Any])
    if (initialPositionRadius != null) __obj.updateDynamic("initialPositionRadius")(initialPositionRadius.asInstanceOf[js.Any])
    if (initialPositions != null) __obj.updateDynamic("initialPositions")(initialPositions.asInstanceOf[js.Any])
    if (integration != null) __obj.updateDynamic("integration")(integration)
    if (linkLength != null) __obj.updateDynamic("linkLength")(linkLength.asInstanceOf[js.Any])
    if (maxIterations != null) __obj.updateDynamic("maxIterations")(maxIterations.asInstanceOf[js.Any])
    if (maxSpeed != null) __obj.updateDynamic("maxSpeed")(maxSpeed.asInstanceOf[js.Any])
    if (repulsiveForce != null) __obj.updateDynamic("repulsiveForce")(repulsiveForce)
    if (theta != null) __obj.updateDynamic("theta")(theta.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PlotNetworkgraphLayoutAlgorithmOptions]
  }
}

