package typings.leafletGeosearch.anon

import typings.leaflet.mod.ControlPosition
import typings.leaflet.mod.MarkerOptions
import typings.leafletGeosearch.leafletGeosearchStrings.bar
import typings.leafletGeosearch.leafletGeosearchStrings.button
import typings.leafletGeosearch.providersMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<leaflet-geosearch.leaflet-geosearch/dist/SearchControl.SearchControlProps, 'provider'> & {  provider :leaflet-geosearch.leaflet-geosearch/dist/SearchControl.SearchControlProps['provider'] | undefined} */
trait OmitSearchControlPropspro extends StObject {
  
  var animateZoom: Boolean
  
  var autoClose: Boolean
  
  var autoComplete: Boolean
  
  var autoCompleteDelay: Double
  
  var classNames: Button
  
  var keepResult: Boolean
  
  var marker: MarkerOptions
  
  var maxMarkers: Double
  
  var maxSuggestions: Double
  
  var messageHideDelay: Double
  
  var notFoundMessage: String
  
  def popupFormat[T](args: Query[T]): String
  @JSName("popupFormat")
  var popupFormat_Original: js.Function1[/* args */ Query[Any], String]
  
  var position: ControlPosition
  
  var provider: js.UndefOr[Provider[Any, Any]] = js.undefined
  
  def resultFormat[T](args: Result[T]): String
  @JSName("resultFormat")
  var resultFormat_Original: js.Function1[/* args */ Result[Any], String]
  
  var retainZoomLevel: Boolean
  
  var searchLabel: String
  
  var showMarker: Boolean
  
  var showPopup: Boolean
  
  var style: button | bar
  
  var updateMap: Boolean
  
  var zoomLevel: Double
}
object OmitSearchControlPropspro {
  
  inline def apply(
    animateZoom: Boolean,
    autoClose: Boolean,
    autoComplete: Boolean,
    autoCompleteDelay: Double,
    classNames: Button,
    keepResult: Boolean,
    marker: MarkerOptions,
    maxMarkers: Double,
    maxSuggestions: Double,
    messageHideDelay: Double,
    notFoundMessage: String,
    popupFormat: /* args */ Query[Any] => String,
    position: ControlPosition,
    resultFormat: /* args */ Result[Any] => String,
    retainZoomLevel: Boolean,
    searchLabel: String,
    showMarker: Boolean,
    showPopup: Boolean,
    style: button | bar,
    updateMap: Boolean,
    zoomLevel: Double
  ): OmitSearchControlPropspro = {
    val __obj = js.Dynamic.literal(animateZoom = animateZoom.asInstanceOf[js.Any], autoClose = autoClose.asInstanceOf[js.Any], autoComplete = autoComplete.asInstanceOf[js.Any], autoCompleteDelay = autoCompleteDelay.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], keepResult = keepResult.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], maxMarkers = maxMarkers.asInstanceOf[js.Any], maxSuggestions = maxSuggestions.asInstanceOf[js.Any], messageHideDelay = messageHideDelay.asInstanceOf[js.Any], notFoundMessage = notFoundMessage.asInstanceOf[js.Any], popupFormat = js.Any.fromFunction1(popupFormat), position = position.asInstanceOf[js.Any], resultFormat = js.Any.fromFunction1(resultFormat), retainZoomLevel = retainZoomLevel.asInstanceOf[js.Any], searchLabel = searchLabel.asInstanceOf[js.Any], showMarker = showMarker.asInstanceOf[js.Any], showPopup = showPopup.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], updateMap = updateMap.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitSearchControlPropspro]
  }
  
  extension [Self <: OmitSearchControlPropspro](x: Self) {
    
    inline def setAnimateZoom(value: Boolean): Self = StObject.set(x, "animateZoom", value.asInstanceOf[js.Any])
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteDelay(value: Double): Self = StObject.set(x, "autoCompleteDelay", value.asInstanceOf[js.Any])
    
    inline def setClassNames(value: Button): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setKeepResult(value: Boolean): Self = StObject.set(x, "keepResult", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: MarkerOptions): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMaxMarkers(value: Double): Self = StObject.set(x, "maxMarkers", value.asInstanceOf[js.Any])
    
    inline def setMaxSuggestions(value: Double): Self = StObject.set(x, "maxSuggestions", value.asInstanceOf[js.Any])
    
    inline def setMessageHideDelay(value: Double): Self = StObject.set(x, "messageHideDelay", value.asInstanceOf[js.Any])
    
    inline def setNotFoundMessage(value: String): Self = StObject.set(x, "notFoundMessage", value.asInstanceOf[js.Any])
    
    inline def setPopupFormat(value: /* args */ Query[Any] => String): Self = StObject.set(x, "popupFormat", js.Any.fromFunction1(value))
    
    inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: Provider[Any, Any]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setResultFormat(value: /* args */ Result[Any] => String): Self = StObject.set(x, "resultFormat", js.Any.fromFunction1(value))
    
    inline def setRetainZoomLevel(value: Boolean): Self = StObject.set(x, "retainZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setSearchLabel(value: String): Self = StObject.set(x, "searchLabel", value.asInstanceOf[js.Any])
    
    inline def setShowMarker(value: Boolean): Self = StObject.set(x, "showMarker", value.asInstanceOf[js.Any])
    
    inline def setShowPopup(value: Boolean): Self = StObject.set(x, "showPopup", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: button | bar): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setUpdateMap(value: Boolean): Self = StObject.set(x, "updateMap", value.asInstanceOf[js.Any])
    
    inline def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
  }
}
