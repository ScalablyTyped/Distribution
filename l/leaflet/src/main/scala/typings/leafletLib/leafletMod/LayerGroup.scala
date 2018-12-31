package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "LayerGroup")
@js.native
class LayerGroup[P] () extends Layer {
  def this(layers: js.Array[Layer]) = this()
  def this(layers: js.Array[Layer], options: LayerOptions) = this()
  var feature: js.UndefOr[
    (geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.GeometryObject, P]) | (geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.MultiPoint, P]) | geojsonLib.geojsonMod.GeometryCollection
  ] = js.native
  /**
    * Adds the given layer to the group.
    */
  def addLayer(layer: Layer): this.type = js.native
  /**
    * Removes all the layers from the group.
    */
  def clearLayers(): this.type = js.native
  /**
    * Iterates over the layers of the group,
    * optionally specifying context of the iterator function.
    */
  def eachLayer(fn: js.Function1[/* layer */ Layer, scala.Unit]): this.type = js.native
  def eachLayer(fn: js.Function1[/* layer */ Layer, scala.Unit], context: js.Any): this.type = js.native
  /**
    * Returns the layer with the given internal ID.
    */
  def getLayer(id: scala.Double): js.UndefOr[Layer] = js.native
  /**
    * Returns the internal ID for a layer
    */
  def getLayerId(layer: Layer): scala.Double = js.native
  /**
    * Returns an array of all the layers added to the group.
    */
  def getLayers(): js.Array[Layer] = js.native
  /**
    * Returns true if the given layer is currently added to the group.
    */
  def hasLayer(layer: Layer): scala.Boolean = js.native
  /**
    * Calls methodName on every layer contained in this group, passing any additional parameters.
    * Has no effect if the layers contained do not implement methodName.
    */
  def invoke(methodName: java.lang.String, params: js.Any*): this.type = js.native
  def removeLayer(layer: Layer): this.type = js.native
  /**
    * Removes the layer with the given internal ID or the given layer from the group.
    */
  def removeLayer(layer: scala.Double): this.type = js.native
  /**
    * Calls setZIndex on every layer contained in this group, passing the z-index.
    */
  def setZIndex(zIndex: scala.Double): this.type = js.native
  /**
    * Returns a GeoJSON representation of the layer group (as a GeoJSON GeometryCollection, GeoJSONFeatureCollection or Multipoint).
    */
  def toGeoJSON(): (geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.GeometryObject, P]) | (geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.MultiPoint, P]) | geojsonLib.geojsonMod.GeometryCollection = js.native
}

