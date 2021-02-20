package typings.iitc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object locationMod {
  
  object global {
    
    /**
      * either retrieves the last shown position from a cookie, from the
      * URL or if neither is present, via Geolocation. If that fails, it
      * returns a map that shows the whole world.
      */
    @JSGlobal("getPosition")
    @js.native
    def getPosition(): Unit = js.native
    
    /** retrieves current position from map and stores it cookies */
    @JSGlobal("storeMapPosition")
    @js.native
    def storeMapPosition(): Unit = js.native
  }
}
