package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object x {
  
  @JSGlobal("KSR.x")
  @js.native
  val ^ : js.Any = js.native
  
  // Equivalent of drop from native kamailio.cfg scripting language, stop the execution of the SIP routing script
  // and drop routing further the SIP request branch or response.
  inline def drop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("drop")().asInstanceOf[Unit]
  
  // Equivalent of exit from native kamailio.cfg scripting language, stop the execution of the SIP routing script.
  inline def exit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exit")().asInstanceOf[Unit]
  
  // Execute a function (specified by fname) exported by a Kamailio module. Additional parameters must be string
  // and they are passed to the Kamailio module function.
  inline def modf(name: String, params: String*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("modf")(List(name.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double]
}
