package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speeddial {
  
  @JSGlobal("KSR.speeddial")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def lookup(stable: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(stable.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def lookupOwner(stable: String, sowner: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup_owner")(stable.asInstanceOf[js.Any], sowner.asInstanceOf[js.Any])).asInstanceOf[Double]
}
