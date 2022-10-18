package typings.iitc

import typings.leaflet.mod.Marker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreBootMod {
  
  object global {
    
    inline def boot(): Unit = js.Dynamic.global.applyDynamic("boot")().asInstanceOf[Unit]
    
    inline def createDefaultBaseMapLayers(): Unit = js.Dynamic.global.applyDynamic("createDefaultBaseMapLayers")().asInstanceOf[Unit]
    
    inline def extendLeaflet(): Unit = js.Dynamic.global.applyDynamic("extendLeaflet")().asInstanceOf[Unit]
    
    // BOOTING ///////////////////////////////////////////////////////////
    inline def prepPluginsToLoad(): Unit = js.Dynamic.global.applyDynamic("prepPluginsToLoad")().asInstanceOf[Unit]
    
    inline def registerMarkerForOMS(marker: Marker_[Any]): Unit = js.Dynamic.global.applyDynamic("registerMarkerForOMS")(marker.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** adds a base layer to the map. done separately from the above, so that plugins that add base layers can be the default */
    inline def setMapBaseLayer(): Unit = js.Dynamic.global.applyDynamic("setMapBaseLayer")().asInstanceOf[Unit]
    
    inline def setupIcons(): Unit = js.Dynamic.global.applyDynamic("setupIcons")().asInstanceOf[Unit]
    
    inline def setupLargeImagePreview(): Unit = js.Dynamic.global.applyDynamic("setupLargeImagePreview")().asInstanceOf[Unit]
    
    inline def setupLayerChooserApi(): Unit = js.Dynamic.global.applyDynamic("setupLayerChooserApi")().asInstanceOf[Unit]
    
    /**
      * adds listeners to the layer chooser such that a long press hides
      * all custom layers except the long pressed one.
      */
    inline def setupLayerChooserSelectOne(): Unit = js.Dynamic.global.applyDynamic("setupLayerChooserSelectOne")().asInstanceOf[Unit]
    
    /** Setup the function to record the on/off status of overlay layerGroups */
    inline def setupLayerChooserStatusRecorder(): Unit = js.Dynamic.global.applyDynamic("setupLayerChooserStatusRecorder")().asInstanceOf[Unit]
    
    inline def setupMap(): Unit = js.Dynamic.global.applyDynamic("setupMap")().asInstanceOf[Unit]
    
    /**
      * OMS doesn't cancel the original click event, so the topmost marker will get a click event while spiderfying.
      * Also, OMS only supports a global callback for all managed markers. Therefore, we will use a custom event that gets fired
      * for each marker.
      */
    inline def setupOMS(): Unit = js.Dynamic.global.applyDynamic("setupOMS")().asInstanceOf[Unit]
    
    /**
      * renders player details into the website. Since the player info is
      * included as inline script in the original site, the data is static
      * and cannot be updated.
      */
    inline def setupPlayerStat(): Unit = js.Dynamic.global.applyDynamic("setupPlayerStat")().asInstanceOf[Unit]
    
    inline def setupSidebarToggle(): Unit = js.Dynamic.global.applyDynamic("setupSidebarToggle")().asInstanceOf[Unit]
    
    inline def setupStyles(): Unit = js.Dynamic.global.applyDynamic("setupStyles")().asInstanceOf[Unit]
    
    inline def setupTooltips(): Unit = js.Dynamic.global.applyDynamic("setupTooltips")().asInstanceOf[Unit]
  }
}
