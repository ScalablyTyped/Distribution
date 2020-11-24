package typings.iitc.locationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * either retrieves the last shown position from a cookie, from the
    * URL or if neither is present, via Geolocation. If that fails, it
    * returns a map that shows the whole world.
    */
  def getPosition(): Unit = js.native
  
  /** retrieves current position from map and stores it cookies */
  def storeMapPosition(): Unit = js.native
}
