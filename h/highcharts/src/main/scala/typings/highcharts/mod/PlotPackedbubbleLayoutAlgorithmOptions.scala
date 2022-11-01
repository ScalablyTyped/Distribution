package typings.highcharts.mod

import typings.highcharts.highchartsStrings.circle
import typings.highcharts.highchartsStrings.random
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotPackedbubbleLayoutAlgorithmOptions extends StObject {
  
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
  var approximation: js.UndefOr[String] = js.undefined
  
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
    * (Highcharts) The distance between two bubbles, when the algorithm starts
    * to treat two bubbles as overlapping. The `bubblePadding` is also the
    * expected distance between all the bubbles on simulation end.
    */
  var bubblePadding: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) In case of split series, this option allows user to drag and
    * drop points between series, for changing point related series.
    */
  var dragBetweenSeries: js.UndefOr[Boolean] = js.undefined
  
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
    * of the built-in options ("circle", "random") or a function where
    * positions should be set on each node (`this.nodes`) as `node.plotX` and
    * `node.plotY`.
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
  var integration: js.UndefOr[String] = js.undefined
  
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
    * (Highcharts) Max speed that node can get in one iteration. In terms of
    * simulation, it's a maximum translation (in pixels) that a node can move
    * (in both, x and y, dimensions). While `friction` is applied on all nodes,
    * max speed is applied only for nodes that move very fast, for example
    * small or disconnected ones.
    */
  var maxSpeed: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Whether bubbles should interact with their parentNode to
    * keep them inside.
    */
  var parentNodeLimit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) Layout algorithm options for parent nodes.
    */
  var parentNodeOptions: js.UndefOr[PlotPackedbubbleLayoutAlgorithmParentNodeOptions] = js.undefined
  
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
    * (Highcharts) Whether series should interact with each other or not. When
    * `parentNodeLimit` is set to true, thi option should be set to false to
    * avoid sticking points in wrong series parentNode.
    */
  var seriesInteraction: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) Whether to split series into individual groups or to mix all
    * series together.
    */
  var splitSeries: js.UndefOr[Boolean] = js.undefined
  
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
  var `type`: js.UndefOr[String] = js.undefined
}
object PlotPackedbubbleLayoutAlgorithmOptions {
  
  inline def apply(): PlotPackedbubbleLayoutAlgorithmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPackedbubbleLayoutAlgorithmOptions]
  }
  
  extension [Self <: PlotPackedbubbleLayoutAlgorithmOptions](x: Self) {
    
    inline def setApproximation(value: String): Self = StObject.set(x, "approximation", value.asInstanceOf[js.Any])
    
    inline def setApproximationUndefined: Self = StObject.set(x, "approximation", js.undefined)
    
    inline def setAttractiveForce(value: js.Function): Self = StObject.set(x, "attractiveForce", value.asInstanceOf[js.Any])
    
    inline def setAttractiveForceUndefined: Self = StObject.set(x, "attractiveForce", js.undefined)
    
    inline def setBubblePadding(value: Double): Self = StObject.set(x, "bubblePadding", value.asInstanceOf[js.Any])
    
    inline def setBubblePaddingUndefined: Self = StObject.set(x, "bubblePadding", js.undefined)
    
    inline def setDragBetweenSeries(value: Boolean): Self = StObject.set(x, "dragBetweenSeries", value.asInstanceOf[js.Any])
    
    inline def setDragBetweenSeriesUndefined: Self = StObject.set(x, "dragBetweenSeries", js.undefined)
    
    inline def setEnableSimulation(value: Boolean): Self = StObject.set(x, "enableSimulation", value.asInstanceOf[js.Any])
    
    inline def setEnableSimulationUndefined: Self = StObject.set(x, "enableSimulation", js.undefined)
    
    inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    inline def setGravitationalConstant(value: Double): Self = StObject.set(x, "gravitationalConstant", value.asInstanceOf[js.Any])
    
    inline def setGravitationalConstantUndefined: Self = StObject.set(x, "gravitationalConstant", js.undefined)
    
    inline def setInitialPositionRadius(value: Double): Self = StObject.set(x, "initialPositionRadius", value.asInstanceOf[js.Any])
    
    inline def setInitialPositionRadiusUndefined: Self = StObject.set(x, "initialPositionRadius", js.undefined)
    
    inline def setInitialPositions(value: circle | random | js.Function): Self = StObject.set(x, "initialPositions", value.asInstanceOf[js.Any])
    
    inline def setInitialPositionsUndefined: Self = StObject.set(x, "initialPositions", js.undefined)
    
    inline def setIntegration(value: String): Self = StObject.set(x, "integration", value.asInstanceOf[js.Any])
    
    inline def setIntegrationUndefined: Self = StObject.set(x, "integration", js.undefined)
    
    inline def setLinkLength(value: Double): Self = StObject.set(x, "linkLength", value.asInstanceOf[js.Any])
    
    inline def setLinkLengthUndefined: Self = StObject.set(x, "linkLength", js.undefined)
    
    inline def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
    
    inline def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
    
    inline def setMaxSpeed(value: Double): Self = StObject.set(x, "maxSpeed", value.asInstanceOf[js.Any])
    
    inline def setMaxSpeedUndefined: Self = StObject.set(x, "maxSpeed", js.undefined)
    
    inline def setParentNodeLimit(value: Boolean): Self = StObject.set(x, "parentNodeLimit", value.asInstanceOf[js.Any])
    
    inline def setParentNodeLimitUndefined: Self = StObject.set(x, "parentNodeLimit", js.undefined)
    
    inline def setParentNodeOptions(value: PlotPackedbubbleLayoutAlgorithmParentNodeOptions): Self = StObject.set(x, "parentNodeOptions", value.asInstanceOf[js.Any])
    
    inline def setParentNodeOptionsUndefined: Self = StObject.set(x, "parentNodeOptions", js.undefined)
    
    inline def setRepulsiveForce(value: js.Function): Self = StObject.set(x, "repulsiveForce", value.asInstanceOf[js.Any])
    
    inline def setRepulsiveForceUndefined: Self = StObject.set(x, "repulsiveForce", js.undefined)
    
    inline def setSeriesInteraction(value: Boolean): Self = StObject.set(x, "seriesInteraction", value.asInstanceOf[js.Any])
    
    inline def setSeriesInteractionUndefined: Self = StObject.set(x, "seriesInteraction", js.undefined)
    
    inline def setSplitSeries(value: Boolean): Self = StObject.set(x, "splitSeries", value.asInstanceOf[js.Any])
    
    inline def setSplitSeriesUndefined: Self = StObject.set(x, "splitSeries", js.undefined)
    
    inline def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    inline def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
