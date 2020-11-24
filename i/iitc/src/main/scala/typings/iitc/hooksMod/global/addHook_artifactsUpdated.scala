package typings.iitc.hooksMod.global

import typings.iitc.iitcStrings.artifactsUpdated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("addHook")
@js.native
object addHook_artifactsUpdated extends js.Object {
  
  /**
    * register a callback for an event
    * called when the set of artifacts (including targets) has changed.
    */
  def apply(event: artifactsUpdated, callback: js.Function1[/* e */ EventArtifactsUpdated, Unit]): Unit = js.native
}
