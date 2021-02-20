package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object x {
  
  // Equivalent of drop from native kamailio.cfg scripting language, stop the execution of the SIP routing script
  // and drop routing further the SIP request branch or response.
  @JSGlobal("KSR.x.drop")
  @js.native
  def drop(): Unit = js.native
  
  // Equivalent of exit from native kamailio.cfg scripting language, stop the execution of the SIP routing script.
  @JSGlobal("KSR.x.exit")
  @js.native
  def exit(): Unit = js.native
  
  // Execute a function (specified by fname) exported by a Kamailio module. Additional parameters must be string
  // and they are passed to the Kamailio module function.
  @JSGlobal("KSR.x.modf")
  @js.native
  def modf(name: String, params: String*): Double = js.native
}
