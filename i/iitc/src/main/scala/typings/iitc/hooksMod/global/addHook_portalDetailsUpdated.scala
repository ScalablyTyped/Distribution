package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.portalDetailsUpdated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_portalDetailsUpdated extends js.Object {
  
  /**
    * register a callback for an event
    * fired after the details in the sidebar have been (re-)rendered Provides data about the portal
    * that has been selected.
    */
  def apply(event: portalDetailsUpdated, callback: js.Function1[/* e */ EventPortalDetailsUpdated, Unit]): Unit = js.native
}
