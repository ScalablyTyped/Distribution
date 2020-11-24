package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.mapDataEntityInject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_mapDataEntityInject extends js.Object {
  
  /**
    * register a callback for an event
    * called just as we start to render data. has callback to inject cached entities into the map render
    */
  def apply(event: mapDataEntityInject, callback: js.Function1[/* e */ EventMapDataEntityInject, Unit]): Unit = js.native
}
