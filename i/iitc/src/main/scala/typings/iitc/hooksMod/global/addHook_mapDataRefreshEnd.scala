package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.mapDataRefreshEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_mapDataRefreshEnd extends js.Object {
  
  /**
    * register a callback for an event
    * called when we complete the map data load
    */
  def apply(event: mapDataRefreshEnd, callback: js.Function1[/* e */ EventMapDataRefreshEnd, Unit]): Unit = js.native
}
