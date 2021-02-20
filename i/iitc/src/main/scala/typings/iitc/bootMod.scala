package typings.iitc

import typings.leaflet.mod.Marker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bootMod {
  
  object global {
    
    @JSGlobal("boot")
    @js.native
    def boot(): Unit = js.native
    
    @JSGlobal("createDefaultBaseMapLayers")
    @js.native
    def createDefaultBaseMapLayers(): Unit = js.native
    
    @JSGlobal("extendLeaflet")
    @js.native
    def extendLeaflet(): Unit = js.native
    
    // BOOTING ///////////////////////////////////////////////////////////
    @JSGlobal("prepPluginsToLoad")
    @js.native
    def prepPluginsToLoad(): Unit = js.native
    
    @JSGlobal("registerMarkerForOMS")
    @js.native
    def registerMarkerForOMS(marker: Marker_[_]): Unit = js.native
    
    /** adds a base layer to the map. done separately from the above, so that plugins that add base layers can be the default */
    @JSGlobal("setMapBaseLayer")
    @js.native
    def setMapBaseLayer(): Unit = js.native
    
    @JSGlobal("setupIcons")
    @js.native
    def setupIcons(): Unit = js.native
    
    @JSGlobal("setupLargeImagePreview")
    @js.native
    def setupLargeImagePreview(): Unit = js.native
    
    @JSGlobal("setupLayerChooserApi")
    @js.native
    def setupLayerChooserApi(): Unit = js.native
    
    /**
      * adds listeners to the layer chooser such that a long press hides
      * all custom layers except the long pressed one.
      */
    @JSGlobal("setupLayerChooserSelectOne")
    @js.native
    def setupLayerChooserSelectOne(): Unit = js.native
    
    /** Setup the function to record the on/off status of overlay layerGroups */
    @JSGlobal("setupLayerChooserStatusRecorder")
    @js.native
    def setupLayerChooserStatusRecorder(): Unit = js.native
    
    @JSGlobal("setupMap")
    @js.native
    def setupMap(): Unit = js.native
    
    /**
      * OMS doesn't cancel the original click event, so the topmost marker will get a click event while spiderfying.
      * Also, OMS only supports a global callback for all managed markers. Therefore, we will use a custom event that gets fired
      * for each marker.
      */
    @JSGlobal("setupOMS")
    @js.native
    def setupOMS(): Unit = js.native
    
    /**
      * renders player details into the website. Since the player info is
      * included as inline script in the original site, the data is static
      * and cannot be updated.
      */
    @JSGlobal("setupPlayerStat")
    @js.native
    def setupPlayerStat(): Unit = js.native
    
    @JSGlobal("setupSidebarToggle")
    @js.native
    def setupSidebarToggle(): Unit = js.native
    
    @JSGlobal("setupStyles")
    @js.native
    def setupStyles(): Unit = js.native
    
    @JSGlobal("setupTooltips")
    @js.native
    def setupTooltips(): Unit = js.native
  }
}
