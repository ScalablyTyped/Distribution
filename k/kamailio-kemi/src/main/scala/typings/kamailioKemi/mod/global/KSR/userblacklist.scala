package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userblacklist {
  
  @JSGlobal("KSR.userblacklist")
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkUserBlacklist(suser: String, sdomain: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("check_user_blacklist")(suser.asInstanceOf[js.Any], sdomain.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def checkUserBlacklistNumber(suser: String, sdomain: String, snumber: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("check_user_blacklist_number")(suser.asInstanceOf[js.Any], sdomain.asInstanceOf[js.Any], snumber.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def checkUserBlacklistTable(suser: String, sdomain: String, snumber: String, stable: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("check_user_blacklist_table")(suser.asInstanceOf[js.Any], sdomain.asInstanceOf[js.Any], snumber.asInstanceOf[js.Any], stable.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def checkUserWhitelist(suser: String, sdomain: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("check_user_whitelist")(suser.asInstanceOf[js.Any], sdomain.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def checkUserWhitelistNumber(suser: String, sdomain: String, snumber: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("check_user_whitelist_number")(suser.asInstanceOf[js.Any], sdomain.asInstanceOf[js.Any], snumber.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def checkUserWhitelistTable(suser: String, sdomain: String, snumber: String, stable: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("check_user_whitelist_table")(suser.asInstanceOf[js.Any], sdomain.asInstanceOf[js.Any], snumber.asInstanceOf[js.Any], stable.asInstanceOf[js.Any])).asInstanceOf[Double]
}
