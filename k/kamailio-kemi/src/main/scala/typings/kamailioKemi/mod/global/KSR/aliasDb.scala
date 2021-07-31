package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliasDb {
  
  @JSGlobal("KSR.alias_db")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def lookup(stable: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(stable.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def lookupEx(stable: String, sflags: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup_ex")(stable.asInstanceOf[js.Any], sflags.asInstanceOf[js.Any])).asInstanceOf[Double]
}
