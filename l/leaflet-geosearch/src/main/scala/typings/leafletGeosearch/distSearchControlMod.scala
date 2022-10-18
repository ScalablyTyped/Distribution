package typings.leafletGeosearch

import typings.leaflet.mod.ControlPosition
import typings.leaflet.mod.Control_
import typings.leaflet.mod.FeatureGroup_
import typings.leaflet.mod.Map_
import typings.leaflet.mod.MarkerOptions
import typings.leafletGeosearch.anon.Button
import typings.leafletGeosearch.anon.OmitSearchControlPropspro
import typings.leafletGeosearch.anon.Query
import typings.leafletGeosearch.anon.Result
import typings.leafletGeosearch.distProvidersMod.Provider
import typings.leafletGeosearch.distProvidersProviderMod.SearchResult
import typings.leafletGeosearch.distResultListMod.default
import typings.leafletGeosearch.leafletGeosearchStrings.bar
import typings.leafletGeosearch.leafletGeosearchStrings.button
import typings.std.Event
import typings.std.HTMLAnchorElement
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchControlMod {
  
  @JSImport("leaflet-geosearch/dist/SearchControl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Any*): SearchControl & Control_ = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SearchControl & Control_]
  
  @js.native
  trait SearchControl extends StObject {
    
    def addMarker(result: SearchResult[Any], selection: Selection): Unit = js.native
    
    def autoSearch(event: KeyboardEvent): Unit = js.native
    
    var button: HTMLAnchorElement = js.native
    
    def centerMap(result: SearchResult[Any]): Unit = js.native
    
    var classNames: Button = js.native
    
    def clearResults(): Unit = js.native
    def clearResults(event: Null, force: Boolean): Unit = js.native
    def clearResults(event: Unit, force: Boolean): Unit = js.native
    def clearResults(event: KeyboardEvent): Unit = js.native
    def clearResults(event: KeyboardEvent, force: Boolean): Unit = js.native
    
    def close(): Unit = js.native
    
    def closeResults(): Unit = js.native
    
    var container: HTMLDivElement = js.native
    
    def getZoom(): Double = js.native
    
    def initialize(options: SearchControlProps): Unit = js.native
    
    var input: HTMLInputElement = js.native
    
    var map: Map_ = js.native
    
    var markers: FeatureGroup_[Any] = js.native
    
    def onAdd(map: Map_): HTMLDivElement = js.native
    
    def onClick(event: Event): Unit = js.native
    
    def onRemove(): SearchControl = js.native
    
    def onSubmit(result: Selection): Unit = js.native
    
    def open(): Unit = js.native
    
    var options: OmitSearchControlPropspro = js.native
    
    var resetButton: HTMLAnchorElement = js.native
    
    var resultList: default = js.native
    
    var searchElement: typings.leafletGeosearch.distSearchElementMod.default = js.native
    
    def selectResult(event: KeyboardEvent): Unit = js.native
    
    def showResult(result: SearchResult[Any], query: Selection): Unit = js.native
  }
  
  /* Inlined std.Partial<leaflet-geosearch.leaflet-geosearch/dist/SearchControl.SearchControlProps> & {  provider :leaflet-geosearch.leaflet-geosearch/dist/providers.Provider<any, any>} */
  trait SearchControlOptions extends StObject {
    
    var animateZoom: js.UndefOr[Boolean] = js.undefined
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var autoComplete: js.UndefOr[Boolean] = js.undefined
    
    var autoCompleteDelay: js.UndefOr[Double] = js.undefined
    
    var classNames: js.UndefOr[Button] = js.undefined
    
    var clearSearchLabel: js.UndefOr[String] = js.undefined
    
    var keepResult: js.UndefOr[Boolean] = js.undefined
    
    var marker: js.UndefOr[MarkerOptions] = js.undefined
    
    var maxMarkers: js.UndefOr[Double] = js.undefined
    
    var maxSuggestions: js.UndefOr[Double] = js.undefined
    
    var messageHideDelay: js.UndefOr[Double] = js.undefined
    
    var notFoundMessage: js.UndefOr[String] = js.undefined
    
    var popupFormat: js.UndefOr[js.Function1[/* args */ Query[Any], String]] = js.undefined
    
    var position: js.UndefOr[ControlPosition] = js.undefined
    
    var provider: (js.UndefOr[Provider[Any, Any]]) & (Provider[Any, Any])
    
    var resultFormat: js.UndefOr[js.Function1[/* args */ Result[Any], String]] = js.undefined
    
    var retainZoomLevel: js.UndefOr[Boolean] = js.undefined
    
    var searchLabel: js.UndefOr[String] = js.undefined
    
    var showMarker: js.UndefOr[Boolean] = js.undefined
    
    var showPopup: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[button | bar] = js.undefined
    
    var updateMap: js.UndefOr[Boolean] = js.undefined
    
    var zoomLevel: js.UndefOr[Double] = js.undefined
  }
  object SearchControlOptions {
    
    inline def apply(provider: (js.UndefOr[Provider[Any, Any]]) & (Provider[Any, Any])): SearchControlOptions = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchControlOptions]
    }
    
    extension [Self <: SearchControlOptions](x: Self) {
      
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
      
      inline def setClearSearchLabel(value: String): Self = StObject.set(x, "clearSearchLabel", value.asInstanceOf[js.Any])
      
      inline def setClearSearchLabelUndefined: Self = StObject.set(x, "clearSearchLabel", js.undefined)
      
      inline def setKeepResult(value: Boolean): Self = StObject.set(x, "keepResult", value.asInstanceOf[js.Any])
      
      inline def setKeepResultUndefined: Self = StObject.set(x, "keepResult", js.undefined)
      
      inline def setMarker(value: MarkerOptions): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      inline def setMaxMarkers(value: Double): Self = StObject.set(x, "maxMarkers", value.asInstanceOf[js.Any])
      
      inline def setMaxMarkersUndefined: Self = StObject.set(x, "maxMarkers", js.undefined)
      
      inline def setMaxSuggestions(value: Double): Self = StObject.set(x, "maxSuggestions", value.asInstanceOf[js.Any])
      
      inline def setMaxSuggestionsUndefined: Self = StObject.set(x, "maxSuggestions", js.undefined)
      
      inline def setMessageHideDelay(value: Double): Self = StObject.set(x, "messageHideDelay", value.asInstanceOf[js.Any])
      
      inline def setMessageHideDelayUndefined: Self = StObject.set(x, "messageHideDelay", js.undefined)
      
      inline def setNotFoundMessage(value: String): Self = StObject.set(x, "notFoundMessage", value.asInstanceOf[js.Any])
      
      inline def setNotFoundMessageUndefined: Self = StObject.set(x, "notFoundMessage", js.undefined)
      
      inline def setPopupFormat(value: /* args */ Query[Any] => String): Self = StObject.set(x, "popupFormat", js.Any.fromFunction1(value))
      
      inline def setPopupFormatUndefined: Self = StObject.set(x, "popupFormat", js.undefined)
      
      inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setProvider(value: (js.UndefOr[Provider[Any, Any]]) & (Provider[Any, Any])): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setResultFormat(value: /* args */ Result[Any] => String): Self = StObject.set(x, "resultFormat", js.Any.fromFunction1(value))
      
      inline def setResultFormatUndefined: Self = StObject.set(x, "resultFormat", js.undefined)
      
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
      
      inline def setUpdateMap(value: Boolean): Self = StObject.set(x, "updateMap", value.asInstanceOf[js.Any])
      
      inline def setUpdateMapUndefined: Self = StObject.set(x, "updateMap", js.undefined)
      
      inline def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
      
      inline def setZoomLevelUndefined: Self = StObject.set(x, "zoomLevel", js.undefined)
    }
  }
  
  trait SearchControlProps extends StObject {
    
    var animateZoom: Boolean
    
    var autoClose: Boolean
    
    var autoComplete: Boolean
    
    var autoCompleteDelay: Double
    
    var classNames: Button
    
    var clearSearchLabel: String
    
    var keepResult: Boolean
    
    var marker: MarkerOptions
    
    var maxMarkers: Double
    
    var maxSuggestions: Double
    
    var messageHideDelay: Double
    
    var notFoundMessage: String
    
    def popupFormat[T](args: Query[T]): String
    
    /** the leaflet position to render the element in */
    var position: ControlPosition
    
    /** the provider to use for searching */
    var provider: Provider[Any, Any]
    
    def resultFormat[T](args: Result[T]): String
    
    var retainZoomLevel: Boolean
    
    var searchLabel: String
    
    var showMarker: Boolean
    
    var showPopup: Boolean
    
    /**
      * the stye of the search element
      * @default bar
      **/
    var style: button | bar
    
    var updateMap: Boolean
    
    var zoomLevel: Double
  }
  object SearchControlProps {
    
    inline def apply(
      animateZoom: Boolean,
      autoClose: Boolean,
      autoComplete: Boolean,
      autoCompleteDelay: Double,
      classNames: Button,
      clearSearchLabel: String,
      keepResult: Boolean,
      marker: MarkerOptions,
      maxMarkers: Double,
      maxSuggestions: Double,
      messageHideDelay: Double,
      notFoundMessage: String,
      popupFormat: Query[Any] => String,
      position: ControlPosition,
      provider: Provider[Any, Any],
      resultFormat: Result[Any] => String,
      retainZoomLevel: Boolean,
      searchLabel: String,
      showMarker: Boolean,
      showPopup: Boolean,
      style: button | bar,
      updateMap: Boolean,
      zoomLevel: Double
    ): SearchControlProps = {
      val __obj = js.Dynamic.literal(animateZoom = animateZoom.asInstanceOf[js.Any], autoClose = autoClose.asInstanceOf[js.Any], autoComplete = autoComplete.asInstanceOf[js.Any], autoCompleteDelay = autoCompleteDelay.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], clearSearchLabel = clearSearchLabel.asInstanceOf[js.Any], keepResult = keepResult.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], maxMarkers = maxMarkers.asInstanceOf[js.Any], maxSuggestions = maxSuggestions.asInstanceOf[js.Any], messageHideDelay = messageHideDelay.asInstanceOf[js.Any], notFoundMessage = notFoundMessage.asInstanceOf[js.Any], popupFormat = js.Any.fromFunction1(popupFormat), position = position.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], resultFormat = js.Any.fromFunction1(resultFormat), retainZoomLevel = retainZoomLevel.asInstanceOf[js.Any], searchLabel = searchLabel.asInstanceOf[js.Any], showMarker = showMarker.asInstanceOf[js.Any], showPopup = showPopup.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], updateMap = updateMap.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchControlProps]
    }
    
    extension [Self <: SearchControlProps](x: Self) {
      
      inline def setAnimateZoom(value: Boolean): Self = StObject.set(x, "animateZoom", value.asInstanceOf[js.Any])
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteDelay(value: Double): Self = StObject.set(x, "autoCompleteDelay", value.asInstanceOf[js.Any])
      
      inline def setClassNames(value: Button): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClearSearchLabel(value: String): Self = StObject.set(x, "clearSearchLabel", value.asInstanceOf[js.Any])
      
      inline def setKeepResult(value: Boolean): Self = StObject.set(x, "keepResult", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: MarkerOptions): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMaxMarkers(value: Double): Self = StObject.set(x, "maxMarkers", value.asInstanceOf[js.Any])
      
      inline def setMaxSuggestions(value: Double): Self = StObject.set(x, "maxSuggestions", value.asInstanceOf[js.Any])
      
      inline def setMessageHideDelay(value: Double): Self = StObject.set(x, "messageHideDelay", value.asInstanceOf[js.Any])
      
      inline def setNotFoundMessage(value: String): Self = StObject.set(x, "notFoundMessage", value.asInstanceOf[js.Any])
      
      inline def setPopupFormat(value: Query[Any] => String): Self = StObject.set(x, "popupFormat", js.Any.fromFunction1(value))
      
      inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: Provider[Any, Any]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setResultFormat(value: Result[Any] => String): Self = StObject.set(x, "resultFormat", js.Any.fromFunction1(value))
      
      inline def setRetainZoomLevel(value: Boolean): Self = StObject.set(x, "retainZoomLevel", value.asInstanceOf[js.Any])
      
      inline def setSearchLabel(value: String): Self = StObject.set(x, "searchLabel", value.asInstanceOf[js.Any])
      
      inline def setShowMarker(value: Boolean): Self = StObject.set(x, "showMarker", value.asInstanceOf[js.Any])
      
      inline def setShowPopup(value: Boolean): Self = StObject.set(x, "showPopup", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: button | bar): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setUpdateMap(value: Boolean): Self = StObject.set(x, "updateMap", value.asInstanceOf[js.Any])
      
      inline def setZoomLevel(value: Double): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
    }
  }
  
  trait Selection extends StObject {
    
    var data: js.UndefOr[SearchResult[Any]] = js.undefined
    
    var query: String
  }
  object Selection {
    
    inline def apply(query: String): Selection = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selection]
    }
    
    extension [Self <: Selection](x: Self) {
      
      inline def setData(value: SearchResult[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
