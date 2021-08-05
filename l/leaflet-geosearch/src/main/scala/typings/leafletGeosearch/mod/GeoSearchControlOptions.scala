package typings.leafletGeosearch.mod

import typings.leaflet.mod.MarkerOptions
import typings.leafletGeosearch.anon.Button
import typings.leafletGeosearch.anon.Query
import typings.leafletGeosearch.leafletGeosearchStrings.bar
import typings.leafletGeosearch.leafletGeosearchStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GeoSearchControl
  */
trait GeoSearchControlOptions extends StObject {
  
  /** @default true */
  var animateZoom: js.UndefOr[Boolean] = js.undefined
  
  /** @default false */
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  /** @default true */
  var autoComplete: js.UndefOr[Boolean] = js.undefined
  
  /** @default 250 */
  var autoCompleteDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * @default {
    *      container: 'leaflet-bar leaflet-control leaflet-control-geosearch';
    *      button: 'leaflet-bar-part leaflet-bar-part-single';
    *      resetButton: 'reset';
    *      msgbox: 'leaflet-bar message';
    *      form: '';
    *      input: '';
    * }
    */
  var classNames: js.UndefOr[Button] = js.undefined
  
  /** @default false */
  var keepResult: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  @default {
    *      icon: new L.Icon.Default(),
    *      draggable: false,
    *  }
    */
  var marker: js.UndefOr[MarkerOptions] = js.undefined
  
  /** @default false */
  var maxMarkers: js.UndefOr[Double] = js.undefined
  
  /** @default 3000 */
  var messageHideDelay: js.UndefOr[Double] = js.undefined
  
  /** @default 'Sorry; that address could not be found.' */
  var notFoundMessage: js.UndefOr[String] = js.undefined
  
  /** @default ({ result }) => `${result.label}` */
  var popupFormat: js.UndefOr[js.Function1[/* hasQueryResult */ Query, String]] = js.undefined
  
  /** @default 'topleft' */
  var position: js.UndefOr[String] = js.undefined
  
  var provider: BaseProvider[js.Object, js.Object]
  
  /** @default false */
  var retainZoomLevel: js.UndefOr[Boolean] = js.undefined
  
  /** @default 'Enter address' */
  var searchLabel: js.UndefOr[String] = js.undefined
  
  /** @default true */
  var showMarker: js.UndefOr[Boolean] = js.undefined
  
  /** @default false */
  var showPopup: js.UndefOr[Boolean] = js.undefined
  
  /** @default 'button' */
  var style: js.UndefOr[button | bar] = js.undefined
  
  /** @default 18 */
  var zoomLevel: js.UndefOr[Double] = js.undefined
}
object GeoSearchControlOptions {
  
  inline def apply(provider: BaseProvider[js.Object, js.Object]): GeoSearchControlOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoSearchControlOptions]
  }
  
  extension [Self <: GeoSearchControlOptions](x: Self) {
    
    inline def setAnimateZoom(value: Boolean): Self = StObject.set(x, "animateZoom", value.asInstanceOf[js.Any])
    
    inline def setAnimateZoomUndefined: Self = StObject.set(x, "animateZoom", js.undefined)
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteDelay(value: Double): Self = StObject.set(x, "autoCompleteDelay", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteDelayUndefined: Self = StObject.set(x, "autoCompleteDelay", js.undefined)
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setClassNames(value: Button): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    inline def setKeepResult(value: Boolean): Self = StObject.set(x, "keepResult", value.asInstanceOf[js.Any])
    
    inline def setKeepResultUndefined: Self = StObject.set(x, "keepResult", js.undefined)
    
    inline def setMarker(value: MarkerOptions): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setMaxMarkers(value: Double): Self = StObject.set(x, "maxMarkers", value.asInstanceOf[js.Any])
    
    inline def setMaxMarkersUndefined: Self = StObject.set(x, "maxMarkers", js.undefined)
    
    inline def setMessageHideDelay(value: Double): Self = StObject.set(x, "messageHideDelay", value.asInstanceOf[js.Any])
    
    inline def setMessageHideDelayUndefined: Self = StObject.set(x, "messageHideDelay", js.undefined)
    
    inline def setNotFoundMessage(value: String): Self = StObject.set(x, "notFoundMessage", value.asInstanceOf[js.Any])
    
    inline def setNotFoundMessageUndefined: Self = StObject.set(x, "notFoundMessage", js.undefined)
    
    inline def setPopupFormat(value: /* hasQueryResult */ Query => String): Self = StObject.set(x, "popupFormat", js.Any.fromFunction1(value))
    
    inline def setPopupFormatUndefined: Self = StObject.set(x, "popupFormat", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setProvider(value: BaseProvider[js.Object, js.Object]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setRetainZoomLevel(value: Boolean): Self = StObject.set(x, "retainZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setRetainZoomLevelUndefined: Self = StObject.set(x, "retainZoomLevel", js.undefined)
    
    inline def setSearchLabel(value: String): Self = StObject.set(x, "searchLabel", value.asInstanceOf[js.Any])
    
    inline def setSearchLabelUndefined: Self = StObject.set(x, "searchLabel", js.undefined)
    
    inline def setShowMarker(value: Boolean): Self = StObject.set(x, "showMarker", value.asInstanceOf[js.Any])
    
    inline def setShowMarkerUndefined: Self = StObject.set(x, "showMarker", js.undefined)
    
    inline def setShowPopup(value: Boolean): Self = StObject.set(x, "showPopup", value.asInstanceOf[js.Any])
    
    inline def setShowPopupUndefined: Self = StObject.set(x, "showPopup", js.undefined)
    
    inline def setStyle(value: button | bar): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
    
    inline def setZoomLevelUndefined: Self = StObject.set(x, "zoomLevel", js.undefined)
  }
}
