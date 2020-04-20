package typings.mapbox.mod._Global_.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FeatureGroup<ILayer> * / any */ trait FeatureLayer_ extends js.Object {
  /**
  			 * Gets the filter function for this data layer.
  			 */
  def getFilter(): FilterFunction
  /**
  			 * Get the contents of this layer as GeoJSON data.
  			 */
  def getGeoJSON(): js.Any
  /**
  			 * Load marker GeoJSON data from a map with the given id on Mapbox.
  			 */
  def loadID(id: String): js.Any
  /**
  			 * Load GeoJSON data for this layer from the URL given by url.
  			 */
  def loadURL(url: String): js.Any
  /**
  			 * Sets the filter function for this data layer.
  			 */
  def setFilter(filter: FilterFunction): js.Any
  /**
  			 * Set the contents of a markers layer: run the provided features through
  			 * the filter function and then through the factory function to create
  			 * elements for the map. If the layer already has features, they are
  			 * replaced with the new features. An empty array will clear the
  			 * layer of all features.
  			 */
  def setGeoJSON(geojson: js.Any): FeatureLayer_
}

object FeatureLayer_ {
  @scala.inline
  def apply(
    getFilter: () => FilterFunction,
    getGeoJSON: () => js.Any,
    loadID: String => js.Any,
    loadURL: String => js.Any,
    setFilter: FilterFunction => js.Any,
    setGeoJSON: js.Any => FeatureLayer_
  ): FeatureLayer_ = {
    val __obj = js.Dynamic.literal(getFilter = js.Any.fromFunction0(getFilter), getGeoJSON = js.Any.fromFunction0(getGeoJSON), loadID = js.Any.fromFunction1(loadID), loadURL = js.Any.fromFunction1(loadURL), setFilter = js.Any.fromFunction1(setFilter), setGeoJSON = js.Any.fromFunction1(setGeoJSON))
    __obj.asInstanceOf[FeatureLayer_]
  }
}

