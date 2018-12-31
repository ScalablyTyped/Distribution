package typings
package leafletDashGeocoderDashMapzenLib.leafletMod.ControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderOptions extends js.Object {
  /**
    * Attribution text to include.
    * Set to blank or null to disable.
    *
    * Default value: 'Geocoding by <a href="https://mapzen.com/projects/search/">Mapzen</a>'
    */
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, suggested results are fetched on each keystroke.
    * If false, this is disabled and users must obtain results
    * by pressing the Enter key after typing in their query.
    *
    * Default value: true
    */
  var autocomplete: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, search is bounded by the current map view.
    * You may also provide a custom bounding box in form of a LatLngBounds object.
    * Note: bounds is not supported by autocomplete.
    *
    * Default value: false.
    */
  var bounds: js.UndefOr[leafletLib.leafletMod.LatLngBounds | scala.Boolean] = js.undefined
  /**
    * If true, the search input is always expanded.
    * It does not collapse into a button-only state.
    *
    * Default value: false
    */
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, search and autocomplete prioritizes results near the center
    * of the current view.
    * You may also provide a custom LatLng value
    * (in any of the accepted Leaflet formats) to act as the center bias.
    *
    * Default value: 'true'.
    */
  var focus: js.UndefOr[leafletLib.leafletMod.LatLng | scala.Boolean] = js.undefined
  /**
    * If true, the input box will expand to take up the full width of the map container.
    * If an integer breakpoint is provided,
    * the full width applies only if the map container width is below this breakpoint.
    *
    * Default value: 650
    */
  var fullWidth: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * Filters results by layers (documentation).
    * If left blank, results will come from all available layers.
    *
    * Default value: null.
    */
  var layers: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
  /**
    * If true, search results drops Leaflet's default blue markers onto the map.
    * You may customize this marker's appearance and
    * behavior using Leaflet marker options.
    *
    * Default value: true
    */
  var markers: js.UndefOr[leafletLib.leafletMod.MarkerOptions | scala.Boolean] = js.undefined
  /**
    * If true, highlighting a search result pans the map to that location.
    *
    * Default value: true
    */
  var panToPoint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An object of key-value pairs which will be serialized
    * into query parameters that will be passed to the API.
    * This allows custom queries that are not already supported
    * by the convenience options listed above.
    * For a full list of supported parameters,
    * please read the Mapzen Search documentation.
    *
    * IMPORTANT: some parameters only work with the /search endpoint,
    * and do not apply to /autocomplete requests!
    * All supplied parameters are passed through;
    * this library doesn't know which are valid parameters and which are not.
    * In the event that other options conflict with parameters passed through params,
    * the params option takes precedence.
    *
    * Default value: null.
    */
  var params: js.UndefOr[js.Object] = js.undefined
  /**
    * If true, selected results will make a request to the service /place endpoint.
    * If false, this is disabled.
    * The geocoder does not handle responses to /place,
    * you will need to do handle it yourself in the results event listener (see below).
    *
    * Default value: false
    */
  var place: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Placeholder text to display in the search input box.
    * Set to blank or null to disable.
    *
    * Default value: 'Search'
    */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If true, an icon is used to indicate a polygonal result,
    * matching any non-"venue" or non-"address" layer type.
    * If false, no icon is displayed.
    * For custom icons, pass a string containing a path to the image.
    *
    * Default value: true
    */
  var polygonIcon: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * The position of the control (one of the map corners).
    * Can be 'topleft', 'topright', 'bottomleft', or 'bottomright'.
    *
    * Default value: 'topleft'.
    */
  var position: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify PositionString */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify PositionString */ js.Any
  ] = js.undefined
  /**
    * Tooltip text to display on the search icon. Set to blank or null to disable.
    *
    * Default value: 'Search'
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Host endpoint for a Pelias-compatible search API.
    *
    * Default value: 'https://search.mapzen.com/v1'.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

