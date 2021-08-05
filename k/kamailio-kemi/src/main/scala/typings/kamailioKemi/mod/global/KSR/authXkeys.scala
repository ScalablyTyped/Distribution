package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authXkeys {
  
  @JSGlobal("KSR.auth_xkeys")
  @js.native
  val ^ : js.Any = js.native
  
  inline def authXkeysAdd(shdr: String, skey: String, salg: String, sdata: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("auth_xkeys_add")(shdr.asInstanceOf[js.Any], skey.asInstanceOf[js.Any], salg.asInstanceOf[js.Any], sdata.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def authXkeysCheck(shdr: String, skey: String, salg: String, sdata: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("auth_xkeys_check")(shdr.asInstanceOf[js.Any], skey.asInstanceOf[js.Any], salg.asInstanceOf[js.Any], sdata.asInstanceOf[js.Any])).asInstanceOf[Double]
}
