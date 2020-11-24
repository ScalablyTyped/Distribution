package typings.highcharts.mod

import typings.highcharts.highchartsStrings.`reingold-fruchterman`
import typings.highcharts.highchartsStrings.circle
import typings.highcharts.highchartsStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotPackedbubbleLayoutAlgorithmOptions extends js.Object {
  
  /**
    * (Highcharts) The distance between two bubbles, when the algorithm starts
    * to treat two bubbles as overlapping. The `bubblePadding` is also the
    * expected distance between all the bubbles on simulation end.
    */
  var bubblePadding: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) In case of split series, this option allows user to drag and
    * drop points between series, for changing point related series.
    */
  var dragBetweenSeries: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Experimental. Enables live simulation of the algorithm
    * implementation. All nodes are animated as the forces applies on them.
    */
  var enableSimulation: js.UndefOr[Boolean] = js.native
  
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
    * of the built-in options ("circle", "random") or a function where
    * positions should be set on each node (`this.nodes`) as `node.plotX` and
    * `node.plotY`.
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
    * (Highcharts) Max number of iterations before algorithm will stop. In
    * general, algorithm should find positions sooner, but when rendering huge
    * number of nodes, it is recommended to increase this value as finding
    * perfect graph positions can require more time.
    */
  var maxIterations: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Max speed that node can get in one iteration. In terms of
    * simulation, it's a maximum translation (in pixels) that a node can move
    * (in both, x and y, dimensions). While `friction` is applied on all nodes,
    * max speed is applied only for nodes that move very fast, for example
    * small or disconnected ones.
    */
  var maxSpeed: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Whether bubbles should interact with their parentNode to
    * keep them inside.
    */
  var parentNodeLimit: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Layout algorithm options for parent nodes.
    */
  var parentNodeOptions: js.UndefOr[PlotPackedbubbleLayoutAlgorithmParentNodeOptions] = js.native
  
  /**
    * (Highcharts) Whether series should interact with each other or not. When
    * `parentNodeLimit` is set to true, thi option should be set to false to
    * avoid sticking points in wrong series parentNode.
    */
  var seriesInteraction: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Whether to split series into individual groups or to mix all
    * series together.
    */
  var splitSeries: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts) Type of the algorithm used when positioning nodes.
    */
  var `type`: js.UndefOr[`reingold-fruchterman`] = js.native
}
object PlotPackedbubbleLayoutAlgorithmOptions {
  
  @scala.inline
  def apply(): PlotPackedbubbleLayoutAlgorithmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPackedbubbleLayoutAlgorithmOptions]
  }
  
  @scala.inline
  implicit class PlotPackedbubbleLayoutAlgorithmOptionsOps[Self <: PlotPackedbubbleLayoutAlgorithmOptions] (val x: Self) extends AnyVal {
    
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
    def setBubblePadding(value: Double): Self = this.set("bubblePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBubblePadding: Self = this.set("bubblePadding", js.undefined)
    
    @scala.inline
    def setDragBetweenSeries(value: Boolean): Self = this.set("dragBetweenSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragBetweenSeries: Self = this.set("dragBetweenSeries", js.undefined)
    
    @scala.inline
    def setEnableSimulation(value: Boolean): Self = this.set("enableSimulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSimulation: Self = this.set("enableSimulation", js.undefined)
    
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
    def setMaxIterations(value: Double): Self = this.set("maxIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxIterations: Self = this.set("maxIterations", js.undefined)
    
    @scala.inline
    def setMaxSpeed(value: Double): Self = this.set("maxSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSpeed: Self = this.set("maxSpeed", js.undefined)
    
    @scala.inline
    def setParentNodeLimit(value: Boolean): Self = this.set("parentNodeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentNodeLimit: Self = this.set("parentNodeLimit", js.undefined)
    
    @scala.inline
    def setParentNodeOptions(value: PlotPackedbubbleLayoutAlgorithmParentNodeOptions): Self = this.set("parentNodeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentNodeOptions: Self = this.set("parentNodeOptions", js.undefined)
    
    @scala.inline
    def setSeriesInteraction(value: Boolean): Self = this.set("seriesInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesInteraction: Self = this.set("seriesInteraction", js.undefined)
    
    @scala.inline
    def setSplitSeries(value: String): Self = this.set("splitSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitSeries: Self = this.set("splitSeries", js.undefined)
    
    @scala.inline
    def setType(value: `reingold-fruchterman`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
