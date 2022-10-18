package typings.iitc

import typings.leaflet.mod.LatLngBounds_
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.LayerGroup_
import typings.spectrum.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreUtilsMiscMod {
  
  object global {
    
    /**
      * Show about dialog
      *
      * Plugins metadata come from 2 sources:
      * - buildName, pluginId, dateTimeVersion: inserted in plugin body by build script
      *   (only standard plugins)
      * - script.name/version/description: from GM_info object, passed to wrapper
      *   `script` may be not available if userscript manager does not provede GM_info
      *   (atm: IITC-Mobile for iOS)
      */
    inline def aboutIITC(): Unit = js.Dynamic.global.applyDynamic("aboutIITC")().asInstanceOf[Unit]
    
    inline def addLayerGroup(name: String, layerGroup: LayerGroup_[Any]): Unit = (js.Dynamic.global.applyDynamic("addLayerGroup")(name.asInstanceOf[js.Any], layerGroup.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addLayerGroup(name: String, layerGroup: LayerGroup_[Any], defaultDisplay: Boolean): Unit = (js.Dynamic.global.applyDynamic("addLayerGroup")(name.asInstanceOf[js.Any], layerGroup.asInstanceOf[js.Any], defaultDisplay.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def androidCopy(text: String): Boolean = js.Dynamic.global.applyDynamic("androidCopy")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Given 3 sets of points in an array[3]{lat, lng} returns the area of the triangle
      * NOTE: not geodesic area!
      */
    inline def calcTriArea(p: js.Tuple3[LatLng_, LatLng_, LatLng_]): Double = js.Dynamic.global.applyDynamic("calcTriArea")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def clampLatLng(latlng: LatLng_): LatLng_ = js.Dynamic.global.applyDynamic("clampLatLng")(latlng.asInstanceOf[js.Any]).asInstanceOf[LatLng_]
    
    inline def clampLatLngBounds(bounds: LatLngBounds_): LatLngBounds_ = js.Dynamic.global.applyDynamic("clampLatLngBounds")(bounds.asInstanceOf[js.Any]).asInstanceOf[LatLngBounds_]
    
    /**
      * certain values were stored in cookies, but we're better off using localStorage instead - make it easy to convert
      */
    inline def convertCookieToLocalStorage(name: String): Unit = js.Dynamic.global.applyDynamic("convertCookieToLocalStorage")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** converts given text with newlines (\n) and tabs (\t) to a HTML table automatically. */
    inline def convertTextToTableMagic(text: String): String = js.Dynamic.global.applyDynamic("convertTextToTableMagic")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def digits(d: String): String = js.Dynamic.global.applyDynamic("digits")(d.asInstanceOf[js.Any]).asInstanceOf[String]
    /**
      * add thousand separators to given number.
      * https://stackoverflow.com/a/1990590/1684530 by Doug Neiner.
      */
    inline def digits(d: Double): String = js.Dynamic.global.applyDynamic("digits")(d.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def eraseCookie(name: String): Unit = js.Dynamic.global.applyDynamic("eraseCookie")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** escape special characters, such as tags */
    inline def escapeHtmlSpecialChars(str: String): String = js.Dynamic.global.applyDynamic("escapeHtmlSpecialChars")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * escape a javascript string, so quotes and backslashes are escaped with a backslash
      * (for strings passed as parameters to html onclick="..." for example)
      */
    inline def escapeJavascriptString(str: String): String = js.Dynamic.global.applyDynamic("escapeJavascriptString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** format time difference */
    inline def formatInterval(seconds: Double): String = js.Dynamic.global.applyDynamic("formatInterval")(seconds.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def formatInterval(seconds: Double, maxTerms: Double): String = (js.Dynamic.global.applyDynamic("formatInterval")(seconds.asInstanceOf[js.Any], maxTerms.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def genFourColumnTable(blocks: js.Array[Any]): String = js.Dynamic.global.applyDynamic("genFourColumnTable")(blocks.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getCurrentZoomTileParameters(): Any = js.Dynamic.global.applyDynamic("getCurrentZoomTileParameters")().asInstanceOf[Any]
    
    /** retrieves parameter from the URL?query=string. */
    inline def getURLParam(param: String): String = js.Dynamic.global.applyDynamic("getURLParam")(param.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Read layerGroup status from window.overlayStatus if it was added to map,
      * read from cookie if it has not added to map yet.
      * @return 'defaultDisplay' if both overlayStatus and cookie didn't have the record
      */
    inline def isLayerGroupDisplayed(name: String, defaultDisplay: Boolean): Boolean = (js.Dynamic.global.applyDynamic("isLayerGroupDisplayed")(name.asInstanceOf[js.Any], defaultDisplay.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTouchDevice(): Boolean = js.Dynamic.global.applyDynamic("isTouchDevice")().asInstanceOf[Boolean]
    
    inline def layerGroupLength(layerGroup: LayerGroup_[Any]): Double = js.Dynamic.global.applyDynamic("layerGroupLength")(layerGroup.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Makes the permalink for the portal with specified latlng, possibly including current map view.
      * Portal latlng can be omitted to create mapview-only permalink.
      * @param option:
      * - includeMapView: Boolean = null
      * Use to add zoom level and latlng of current map center.
      * - fullURL: Boolean = null
      * Use to make absolute fully qualified URL (default: relative link).
      */
    inline def makePermalink(latlng: LatLng_): String = js.Dynamic.global.applyDynamic("makePermalink")(latlng.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def makePermalink(latlng: LatLng_, options: js.Object): String = (js.Dynamic.global.applyDynamic("makePermalink")(latlng.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def prettyEnergy(nrg: Double): String = js.Dynamic.global.applyDynamic("prettyEnergy")(nrg.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def rangeLinkClick(): Unit = js.Dynamic.global.applyDynamic("rangeLinkClick")().asInstanceOf[Unit]
    
    /**
      * read cookie by name.
      * https://stackoverflow.com/a/5639455/1684530 by cwolves
      */
    inline def readCookie(name: String): String = js.Dynamic.global.applyDynamic("readCookie")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def removeLayerGroup(layerGroup: LayerGroup_[Any]): Unit = js.Dynamic.global.applyDynamic("removeLayerGroup")(layerGroup.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    // return getMapZoomTileParameters()
    /** returns number of pixels left to scroll down before reaching the bottom. */
    inline def scrollBottom(element: String): Double = js.Dynamic.global.applyDynamic("scrollBottom")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def scrollBottom(element: JQuery): Double = js.Dynamic.global.applyDynamic("scrollBottom")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def selectPortalByLatLng(lat: js.Tuple2[Double, Double]): Unit = js.Dynamic.global.applyDynamic("selectPortalByLatLng")(lat.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def selectPortalByLatLng(lat: js.Tuple2[Double, Double], lng: Double): Unit = (js.Dynamic.global.applyDynamic("selectPortalByLatLng")(lat.asInstanceOf[js.Any], lng.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def selectPortalByLatLng(lat: Double): Unit = js.Dynamic.global.applyDynamic("selectPortalByLatLng")(lat.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def selectPortalByLatLng(lat: Double, lng: Double): Unit = (js.Dynamic.global.applyDynamic("selectPortalByLatLng")(lat.asInstanceOf[js.Any], lng.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def selectPortalByLatLng(lat: LatLng_): Unit = js.Dynamic.global.applyDynamic("selectPortalByLatLng")(lat.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def selectPortalByLatLng(lat: LatLng_, lng: Double): Unit = (js.Dynamic.global.applyDynamic("selectPortalByLatLng")(lat.asInstanceOf[js.Any], lng.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def showPortalPosLinks(lat: Double, lng: Double): Unit = (js.Dynamic.global.applyDynamic("showPortalPosLinks")(lat.asInstanceOf[js.Any], lng.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def showPortalPosLinks(lat: Double, lng: Double, name: String): Unit = (js.Dynamic.global.applyDynamic("showPortalPosLinks")(lat.asInstanceOf[js.Any], lng.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def uniqueArray(arr: js.Array[Any]): js.Array[Any] = js.Dynamic.global.applyDynamic("uniqueArray")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    inline def unixTimeToDateTimeString(ticks: String): String = js.Dynamic.global.applyDynamic("unixTimeToDateTimeString")(ticks.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def unixTimeToDateTimeString(ticks: String, millisecond: Boolean): String = (js.Dynamic.global.applyDynamic("unixTimeToDateTimeString")(ticks.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def unixTimeToDateTimeString(ticks: js.Date): String = js.Dynamic.global.applyDynamic("unixTimeToDateTimeString")(ticks.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def unixTimeToDateTimeString(ticks: js.Date, millisecond: Boolean): String = (js.Dynamic.global.applyDynamic("unixTimeToDateTimeString")(ticks.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any])).asInstanceOf[String]
    /**
      * convert time to string
      * converts a javascript time to a precise date and time (optionally with millisecond precision)
      * formatted in ISO-style YYYY-MM-DD hh:mm:ss.mmm - but using local timezone
      */
    inline def unixTimeToDateTimeString(ticks: Double): String = js.Dynamic.global.applyDynamic("unixTimeToDateTimeString")(ticks.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def unixTimeToDateTimeString(ticks: Double, millisecond: Boolean): String = (js.Dynamic.global.applyDynamic("unixTimeToDateTimeString")(ticks.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def unixTimeToHHmm(time: String): String = js.Dynamic.global.applyDynamic("unixTimeToHHmm")(time.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def unixTimeToHHmm(time: js.Date): String = js.Dynamic.global.applyDynamic("unixTimeToHHmm")(time.asInstanceOf[js.Any]).asInstanceOf[String]
    /** convert time to string */
    inline def unixTimeToHHmm(time: Double): String = js.Dynamic.global.applyDynamic("unixTimeToHHmm")(time.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def unixTimeToString(): String = js.Dynamic.global.applyDynamic("unixTimeToString")().asInstanceOf[String]
    inline def unixTimeToString(time: String): String = js.Dynamic.global.applyDynamic("unixTimeToString")(time.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def unixTimeToString(time: String, full: Boolean): String = (js.Dynamic.global.applyDynamic("unixTimeToString")(time.asInstanceOf[js.Any], full.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def unixTimeToString(time: js.Date): String = js.Dynamic.global.applyDynamic("unixTimeToString")(time.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def unixTimeToString(time: js.Date, full: Boolean): String = (js.Dynamic.global.applyDynamic("unixTimeToString")(time.asInstanceOf[js.Any], full.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def unixTimeToString(time: Double): String = js.Dynamic.global.applyDynamic("unixTimeToString")(time.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def unixTimeToString(time: Double, full: Boolean): String = (js.Dynamic.global.applyDynamic("unixTimeToString")(time.asInstanceOf[js.Any], full.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def unixTimeToString(time: Unit, full: Boolean): String = (js.Dynamic.global.applyDynamic("unixTimeToString")(time.asInstanceOf[js.Any], full.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /** Update layerGroups display status to window.overlayStatus and localStorage 'ingress.intelmap.layergroupdisplayed' */
    inline def updateDisplayedLayerGroup(name: String, display: Boolean): Unit = (js.Dynamic.global.applyDynamic("updateDisplayedLayerGroup")(name.asInstanceOf[js.Any], display.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def writeCookie(name: String, `val`: String): Unit = (js.Dynamic.global.applyDynamic("writeCookie")(name.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def zeroPad(num: Double, pad: Double): String = (js.Dynamic.global.applyDynamic("zeroPad")(num.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def zoomToAndShowPortal(guid: String, latlng: LatLng_): Unit = (js.Dynamic.global.applyDynamic("zoomToAndShowPortal")(guid.asInstanceOf[js.Any], latlng.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
