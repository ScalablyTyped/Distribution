package typings.heredatalens.H.datalens

import typings.heredatalens.H.datalens.ObjectLayer.Options
import typings.heredatalens.H.datalens.ObjectLayer.StyleState
import typings.heremaps.H.map.Object
import typings.heremaps.H.map.provider.RemoteTileProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Presents data as points or spatial map objects with data-driven styles and client-side clustering.
  * Applicable for drawing interactive map objects like markers, polygons, circles and other instances of map.Object. Source of data can be either tiled or not tiled.
  * Styles for objects can be parametrized with data rows and zoom level. Allows to create data-driven icons for markers like donuts or bars.
  * Also enables clustering and data domains for visualizing up to 100k points or more.
  */
@JSGlobal("H.datalens.ObjectLayer")
@js.native
class ObjectLayer_ protected ()
  extends typings.heremaps.H.map.layer.ObjectLayer {
  def this(provider: Provider, options: Options) = this()
  def this(provider: QueryProvider, options: Options) = this()
  def this(provider: QueryTileProvider, options: Options) = this()
  /**
    * Constructor
    * @param provider - Data source (tiled or not)
    * @param options - Defines data processing, clustering and data-driven styling
    */
  def this(provider: RemoteTileProvider, options: Options) = this()
  /**
    * Force re-rendering of the layer. In the case where the callbacks passed to the layer options are not pure functions, you can call this method to force re-rendering.
    */
  def redraw(): Unit = js.native
  /**
    * Recalculates the style and applies it to the map object based on the new StyleState
    * @param object - Map object
    * @param state - New state
    */
  def updateObjectStyle(any: Object, state: StyleState): Unit = js.native
}

