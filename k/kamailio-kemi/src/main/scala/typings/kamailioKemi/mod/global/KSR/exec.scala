package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exec {
  
  @JSGlobal("KSR.exec")
  @js.native
  val ^ : js.Any = js.native
  
  inline def execAvp(cmd: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("exec_avp")(cmd.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def execDset(cmd: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("exec_dset")(cmd.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def execMsg(cmd: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("exec_msg")(cmd.asInstanceOf[js.Any]).asInstanceOf[Double]
}
