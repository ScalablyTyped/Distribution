package typings.iitc.playerNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * test to see if a specific player GUID is a special system account (e.g. __JARVIS__, __ADA__) that shouldn't be listed as a player
    */
  def isSystemPlayer(name: String): Boolean = js.native
}
