package typings
package heredatalensLib.HNs.datalensNs

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
class ObjectLayer protected ()
  extends heremapsLib.HNs.mapNs.layerNs.ObjectLayer {
  def this(provider: Provider, options: heredatalensLib.HNs.datalensNs.ObjectLayerNs.Options) = this()
  def this(provider: QueryProvider, options: heredatalensLib.HNs.datalensNs.ObjectLayerNs.Options) = this()
  def this(provider: QueryTileProvider, options: heredatalensLib.HNs.datalensNs.ObjectLayerNs.Options) = this()
  /**
    * Constructor
    * @param provider - Data source (tiled or not)
    * @param options - Defines data processing, clustering and data-driven styling
    */
  def this(provider: heremapsLib.HNs.mapNs.providerNs.RemoteTileProvider, options: heredatalensLib.HNs.datalensNs.ObjectLayerNs.Options) = this()
  /**
    * Force re-rendering of the layer. In the case where the callbacks passed to the layer options are not pure functions, you can call this method to force re-rendering.
    */
  def redraw(): scala.Unit = js.native
  /**
    * Recalculates the style and applies it to the map object based on the new StyleState
    * @param object - Map object
    * @param state - New state
    */
  def updateObjectStyle(any: heremapsLib.HNs.mapNs.Object, state: heredatalensLib.HNs.datalensNs.ObjectLayerNs.StyleState): scala.Unit = js.native
}

/* static members */
@JSGlobal("H.datalens.ObjectLayer")
@js.native
object ObjectLayer extends js.Object {
  /**
    * A factory method for data-driven icons. The method allows you to build an icon from SVG markup or JsonML object. Provides caching of icons with the same markup.
    * @param svg - SVG presented as markup or JsonML Array
    * @param options - Icon options (eg size and anchor). Note that the default anchor is in the middle.
    * @param options.size - When the icon is a square, you can define the size as a number in pixels
    * @returns - Icon which can be used for marker or cluster
    */
  def createIcon(svg: java.lang.String): heremapsLib.HNs.mapNs.Icon = js.native
  def createIcon(svg: java.lang.String, options: heremapsLib.HNs.mapNs.IconNs.Options): heremapsLib.HNs.mapNs.Icon = js.native
  def createIcon(svg: js.Array[_]): heremapsLib.HNs.mapNs.Icon = js.native
  def createIcon(svg: js.Array[_], options: heremapsLib.HNs.mapNs.IconNs.Options): heremapsLib.HNs.mapNs.Icon = js.native
  /**
    * Default value for dataToRows callback option. It represents each row as an object where property names correspond to data column names.
    */
  def defaultDataToRows(data: heredatalensLib.HNs.datalensNs.ServiceNs.Data): js.Array[heredatalensLib.HNs.datalensNs.ObjectLayerNs.Row] = js.native
  /**
    * Returns cache of icons created with the createIcon method. Can be used to clean the icon cache.
    * @return - Icon cache
    */
  def getIconCache(): heremapsLib.HNs.utilNs.Cache = js.native
}

