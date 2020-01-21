package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpath extends js.Object {
  def add_path(): Double
  def add_path_received(): Double
  def add_path_received_user(_user: String): Double
  def add_path_received_user_params(_user: String, _params: String): Double
  def add_path_user(_user: String): Double
  def add_path_user_params(_user: String, _params: String): Double
}

object Typeofpath {
  @scala.inline
  def apply(
    add_path: () => Double,
    add_path_received: () => Double,
    add_path_received_user: String => Double,
    add_path_received_user_params: (String, String) => Double,
    add_path_user: String => Double,
    add_path_user_params: (String, String) => Double
  ): Typeofpath = {
    val __obj = js.Dynamic.literal(add_path = js.Any.fromFunction0(add_path), add_path_received = js.Any.fromFunction0(add_path_received), add_path_received_user = js.Any.fromFunction1(add_path_received_user), add_path_received_user_params = js.Any.fromFunction2(add_path_received_user_params), add_path_user = js.Any.fromFunction1(add_path_user), add_path_user_params = js.Any.fromFunction2(add_path_user_params))
  
    __obj.asInstanceOf[Typeofpath]
  }
}

