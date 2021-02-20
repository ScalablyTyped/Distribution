package typings.highcharts.mod

import typings.highcharts.highchartsStrings.`reingold-fruchterman`
import typings.highcharts.highchartsStrings.circle
import typings.highcharts.highchartsStrings.random
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotPackedbubbleLayoutAlgorithmParentNodeOptions extends StObject {
  
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
  implicit class PlotPackedbubbleLayoutAlgorithmParentNodeOptionsMutableBuilder[Self <: PlotPackedbubbleLayoutAlgorithmParentNodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    @scala.inline
    def setGravitationalConstant(value: Double): Self = StObject.set(x, "gravitationalConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravitationalConstantUndefined: Self = StObject.set(x, "gravitationalConstant", js.undefined)
    
    @scala.inline
    def setInitialPositionRadius(value: Double): Self = StObject.set(x, "initialPositionRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialPositionRadiusUndefined: Self = StObject.set(x, "initialPositionRadius", js.undefined)
    
    @scala.inline
    def setInitialPositions(value: circle | random | js.Function): Self = StObject.set(x, "initialPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialPositionsUndefined: Self = StObject.set(x, "initialPositions", js.undefined)
    
    @scala.inline
    def setIntegration(value: OptionsIntegrationValue): Self = StObject.set(x, "integration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationUndefined: Self = StObject.set(x, "integration", js.undefined)
    
    @scala.inline
    def setLinkLength(value: Double): Self = StObject.set(x, "linkLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkLengthUndefined: Self = StObject.set(x, "linkLength", js.undefined)
    
    @scala.inline
    def setMarker(value: PointMarkerOptionsObject): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
    
    @scala.inline
    def setMaxSpeed(value: Double): Self = StObject.set(x, "maxSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSpeedUndefined: Self = StObject.set(x, "maxSpeed", js.undefined)
    
    @scala.inline
    def setSeriesInteraction(value: Boolean): Self = StObject.set(x, "seriesInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesInteractionUndefined: Self = StObject.set(x, "seriesInteraction", js.undefined)
    
    @scala.inline
    def setType(value: `reingold-fruchterman`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
