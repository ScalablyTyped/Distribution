package typings.heredatalens.H.datalens

import typings.heredatalens.H.datalens.SpatialLayer.StyleState
import typings.heremaps.H.map.Object
import typings.heremaps.H.map.layer.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders vector tiles using data-driven styles
  * This layer binds the spatial data and user data, all provided by the Data Lens REST API. The layer renders geometry features using data-driven styles.
  */
@js.native
trait SpatialLayer_ extends TileLayer {
  
  /**
    * Forces re-rendering of the layer. When the callbacks passed to the layer options are not pure functions, you can call this method to force re-rendering.
    */
  def redraw(): Unit = js.native
  
  /**
    * This method changes the state of a map object; for example, style on mouse event.
    */
  def updateSpatialStyle(spatial: Object, state: StyleState): Unit = js.native
}
