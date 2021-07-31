package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diversion {
  
  @JSGlobal("KSR.diversion")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addDiversion(reason: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("add_diversion")(reason.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def addDiversionUri(reason: String, uri: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("add_diversion_uri")(reason.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[Double]
}
