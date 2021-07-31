package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siputils {
  
  @JSGlobal("KSR.siputils")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hasTotag(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("has_totag")().asInstanceOf[Double]
  
  @scala.inline
  def isAlphanum(tval: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_alphanum")(tval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isAlphanumex(tval: String, eset: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("is_alphanumex")(tval.asInstanceOf[js.Any], eset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def isFirstHop(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_first_hop")().asInstanceOf[Double]
  
  @scala.inline
  def isNumeric(tval: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_numeric")(tval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isReply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_reply")().asInstanceOf[Double]
  
  @scala.inline
  def isRequest(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_request")().asInstanceOf[Double]
  
  @scala.inline
  def isTelNumber(tval: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_tel_number")(tval.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isUri(suri: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_uri")(suri.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isUser(suser: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("is_user")(suser.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def uriParam(sparam: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uri_param")(sparam.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def uriParamValue(sparam: String, svalue: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("uri_param_value")(sparam.asInstanceOf[js.Any], svalue.asInstanceOf[js.Any])).asInstanceOf[Double]
}
