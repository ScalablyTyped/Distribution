package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.portalDetailLoaded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_portalDetailLoaded extends js.Object {
  
  /**
    * register a callback for an event
    * alled when a request to load full portal detail completes.
    */
  def apply(event: portalDetailLoaded, callback: js.Function1[/* e */ EventPortalDetailLoaded, Unit]): Unit = js.native
}
