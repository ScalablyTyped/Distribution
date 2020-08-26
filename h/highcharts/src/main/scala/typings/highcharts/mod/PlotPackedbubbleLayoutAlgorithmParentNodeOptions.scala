package typings.highcharts.mod

import typings.highcharts.highchartsStrings.`reingold-fruchterman`
import typings.highcharts.highchartsStrings.circle
import typings.highcharts.highchartsStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotPackedbubbleLayoutAlgorithmParentNodeOptions extends js.Object {
  /**
    * (Highcharts) Friction applied on forces to prevent nodes rushing to fast
    * to the desired positions.
    */
  var friction: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Gravitational const used in the barycenter force of the
    * algorithm.
    */
  var gravitationalConstant: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) When `initialPositions` are set to 'circle',
    * `initialPositionRadius` is a distance from the center of circle, in which
    * nodes are created.
    */
  var initialPositionRadius: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Initial layout algorithm for positioning nodes. Can be one
    * of built-in options ("circle", "random") or a function where positions
    * should be set on each node (`this.nodes`) as `node.plotX` and
    * `node.plotY`
    */
  var initialPositions: js.UndefOr[circle | random | js.Function] = js.native
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
  var integration: js.UndefOr[OptionsIntegrationValue] = js.native
  /**
    * (Highcharts) Ideal length (px) of the link between two nodes. When not
    * defined, length is calculated as: `Math.pow(availableWidth *
    * availableHeight / nodesLength, 0.4);`
    *
    * Note: Because of the algorithm specification, length of each link might
    * be not exactly as specified.
    */
  var linkLength: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Styling options for parentNodes markers. Similar to
    * line.marker options.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.native
  /**
    * (Highcharts) Max number of iterations before algorithm will stop. In
    * general, algorithm should find positions sooner, but when rendering huge
    * number of nodes, it is recommended to increase this value as finding
    * perfect graph positions can require more time.
    */
  var maxIterations: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Verlet integration only. Max speed that node can get in one
    * iteration. In terms of simulation, it's a maximum translation (in pixels)
    * that node can move (in both, x and y, dimensions). While `friction` is
    * applied on all nodes, max speed is applied only for nodes that move very
    * fast, for example small or disconnected ones.
    */
  var maxSpeed: js.UndefOr[Double] = js.native
  var seriesInteraction: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Type of the algorithm used when positioning nodes.
    */
  var `type`: js.UndefOr[`reingold-fruchterman`] = js.native
}

object PlotPackedbubbleLayoutAlgorithmParentNodeOptions {
  @scala.inline
  def apply(): PlotPackedbubbleLayoutAlgorithmParentNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPackedbubbleLayoutAlgorithmParentNodeOptions]
  }
  @scala.inline
  implicit class PlotPackedbubbleLayoutAlgorithmParentNodeOptionsOps[Self <: PlotPackedbubbleLayoutAlgorithmParentNodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    @scala.inline
    def setGravitationalConstant(value: Double): Self = this.set("gravitationalConstant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravitationalConstant: Self = this.set("gravitationalConstant", js.undefined)
    @scala.inline
    def setInitialPositionRadius(value: Double): Self = this.set("initialPositionRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialPositionRadius: Self = this.set("initialPositionRadius", js.undefined)
    @scala.inline
    def setInitialPositions(value: circle | random | js.Function): Self = this.set("initialPositions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialPositions: Self = this.set("initialPositions", js.undefined)
    @scala.inline
    def setIntegration(value: OptionsIntegrationValue): Self = this.set("integration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegration: Self = this.set("integration", js.undefined)
    @scala.inline
    def setLinkLength(value: Double): Self = this.set("linkLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkLength: Self = this.set("linkLength", js.undefined)
    @scala.inline
    def setMarker(value: PointMarkerOptionsObject): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setMaxIterations(value: Double): Self = this.set("maxIterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxIterations: Self = this.set("maxIterations", js.undefined)
    @scala.inline
    def setMaxSpeed(value: Double): Self = this.set("maxSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSpeed: Self = this.set("maxSpeed", js.undefined)
    @scala.inline
    def setSeriesInteraction(value: Boolean): Self = this.set("seriesInteraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesInteraction: Self = this.set("seriesInteraction", js.undefined)
    @scala.inline
    def setType(value: `reingold-fruchterman`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

