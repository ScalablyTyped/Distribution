package typings.iitc.bootMod

import typings.leaflet.mod.Marker_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def boot(): Unit = js.native
  
  def createDefaultBaseMapLayers(): Unit = js.native
  
  def extendLeaflet(): Unit = js.native
  
  // BOOTING ///////////////////////////////////////////////////////////
  def prepPluginsToLoad(): Unit = js.native
  
  def registerMarkerForOMS(marker: Marker_[_]): Unit = js.native
  
  /** adds a base layer to the map. done separately from the above, so that plugins that add base layers can be the default */
  def setMapBaseLayer(): Unit = js.native
  
  def setupIcons(): Unit = js.native
  
  def setupLargeImagePreview(): Unit = js.native
  
  def setupLayerChooserApi(): Unit = js.native
  
  /**
    * adds listeners to the layer chooser such that a long press hides
    * all custom layers except the long pressed one.
    */
  def setupLayerChooserSelectOne(): Unit = js.native
  
  /** Setup the function to record the on/off status of overlay layerGroups */
  def setupLayerChooserStatusRecorder(): Unit = js.native
  
  def setupMap(): Unit = js.native
  
  /**
    * OMS doesn't cancel the original click event, so the topmost marker will get a click event while spiderfying.
    * Also, OMS only supports a global callback for all managed markers. Therefore, we will use a custom event that gets fired
    * for each marker.
    */
  def setupOMS(): Unit = js.native
  
  /**
    * renders player details into the website. Since the player info is
    * included as inline script in the original site, the data is static
    * and cannot be updated.
    */
  def setupPlayerStat(): Unit = js.native
  
  def setupSidebarToggle(): Unit = js.native
  
  def setupStyles(): Unit = js.native
  
  def setupTooltips(): Unit = js.native
}
