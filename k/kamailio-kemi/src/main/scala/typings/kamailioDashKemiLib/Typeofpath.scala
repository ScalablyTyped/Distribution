package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpath extends js.Object {
  def add_path(): scala.Double
  def add_path_received(): scala.Double
  def add_path_received_user(_user: java.lang.String): scala.Double
  def add_path_received_user_params(_user: java.lang.String, _params: java.lang.String): scala.Double
  def add_path_user(_user: java.lang.String): scala.Double
  def add_path_user_params(_user: java.lang.String, _params: java.lang.String): scala.Double
}

object Typeofpath {
  @scala.inline
  def apply(
    add_path: () => scala.Double,
    add_path_received: () => scala.Double,
    add_path_received_user: java.lang.String => scala.Double,
    add_path_received_user_params: (java.lang.String, java.lang.String) => scala.Double,
    add_path_user: java.lang.String => scala.Double,
    add_path_user_params: (java.lang.String, java.lang.String) => scala.Double
  ): Typeofpath = {
    val __obj = js.Dynamic.literal(add_path = js.Any.fromFunction0(add_path), add_path_received = js.Any.fromFunction0(add_path_received), add_path_received_user = js.Any.fromFunction1(add_path_received_user), add_path_received_user_params = js.Any.fromFunction2(add_path_received_user_params), add_path_user = js.Any.fromFunction1(add_path_user), add_path_user_params = js.Any.fromFunction2(add_path_user_params))
  
    __obj.asInstanceOf[Typeofpath]
  }
}

