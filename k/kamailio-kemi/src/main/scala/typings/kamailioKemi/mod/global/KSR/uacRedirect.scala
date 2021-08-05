package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uacRedirect {
  
  @JSGlobal("KSR.uac_redirect")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRedirects(max_c: Double, max_b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get_redirects")(max_c.asInstanceOf[js.Any], max_b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getRedirectsAcc(max_c: Double, max_b: Double, reason: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get_redirects_acc")(max_c.asInstanceOf[js.Any], max_b.asInstanceOf[js.Any], reason.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getRedirectsAll(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get_redirects_all")().asInstanceOf[Double]
}
