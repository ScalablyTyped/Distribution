package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object path {
  
  @JSGlobal("KSR.path")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addPath(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("add_path")().asInstanceOf[Double]
  
  @scala.inline
  def addPathReceived(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("add_path_received")().asInstanceOf[Double]
  
  @scala.inline
  def addPathReceivedUser(_user: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("add_path_received_user")(_user.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def addPathReceivedUserParams(_user: String, _params: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("add_path_received_user_params")(_user.asInstanceOf[js.Any], _params.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def addPathUser(_user: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("add_path_user")(_user.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def addPathUserParams(_user: String, _params: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("add_path_user_params")(_user.asInstanceOf[js.Any], _params.asInstanceOf[js.Any])).asInstanceOf[Double]
}
