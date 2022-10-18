package typings.iitc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLocationMod {
  
  object global {
    
    /**
      * either retrieves the last shown position from a cookie, from the
      * URL or if neither is present, via Geolocation. If that fails, it
      * returns a map that shows the whole world.
      */
    inline def getPosition(): Unit = js.Dynamic.global.applyDynamic("getPosition")().asInstanceOf[Unit]
    
    /** retrieves current position from map and stores it cookies */
    inline def storeMapPosition(): Unit = js.Dynamic.global.applyDynamic("storeMapPosition")().asInstanceOf[Unit]
  }
}
