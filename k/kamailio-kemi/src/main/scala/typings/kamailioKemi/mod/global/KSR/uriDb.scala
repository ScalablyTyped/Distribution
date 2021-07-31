package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uriDb {
  
  @JSGlobal("KSR.uri_db")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def checkFrom(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("check_from")().asInstanceOf[Double]
  
  @scala.inline
  def checkTo(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("check_to")().asInstanceOf[Double]
  
  @scala.inline
  def checkUri(suri: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("check_uri")(suri.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def checkUriRealm(suri: String, susername: String, srealm: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("check_uri_realm")(suri.asInstanceOf[js.Any], susername.asInstanceOf[js.Any], srealm.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def doesUriExist(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("does_uri_exist")().asInstanceOf[Double]
}
