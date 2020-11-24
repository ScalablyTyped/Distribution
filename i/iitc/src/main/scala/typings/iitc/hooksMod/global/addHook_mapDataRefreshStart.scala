package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.mapDataRefreshStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_mapDataRefreshStart extends js.Object {
  
  /**
    * register a callback for an event
    * called when we start refreshing map data
    */
  def apply(event: mapDataRefreshStart, callback: js.Function1[/* e */ EventMapDataRefreshStart, Unit]): Unit = js.native
}
