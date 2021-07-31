package typings.iitc

import typings.iitc.iitctypesMod.IITC.Portal
import typings.leaflet.mod.LayerGroup_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ornamentsMod {
  
  object global {
    
    /**
      * Added as part of the Ingress #Helios in 2014, ornaments
      * are additional image overlays for portals.
      *
      * currently there are 6 known types of ornaments: ap$x$suffix
      *  - cluster portals (without suffix)
      *  - volatile portals (_v)
      *  - meeting points (_start)
      *  - finish points (_end)
      *
      * Beacons and Frackers were introduced at the launch of the Ingress
      * ingame store on November 1st, 2015
      *  - Beacons (pe$TAG - $NAME) ie: 'peNIA - NIANTIC'
      *  - Frackers ('peFRACK')
      * (there are 7 different colors for each of them)
      */
    @JSGlobal("Ornaments")
    @js.native
    class Ornaments_ () extends StObject {
      
      // 60,
      var OVERLAY_OPACITY: Double = js.native
      
      var OVERLAY_SIZE: Double = js.native
      
      var _beacons: LayerGroup_[js.Any] = js.native
      
      var _frackers: LayerGroup_[js.Any] = js.native
      
      var _layer: LayerGroup_[js.Any] = js.native
      
      def addPortal(portal: Portal): Unit = js.native
      
      def removePortal(portal: Portal): Unit = js.native
      
      // 0.6,
      def setup(): Unit = js.native
    }
    
    @JSGlobal("ornaments")
    @js.native
    val ornaments: Ornaments_ = js.native
  }
}
