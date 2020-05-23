package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpresence extends js.Object {
  def handle_publish(): Double
  def handle_publish_uri(sender_uri: String): Double
  def handle_subscribe(): Double
  def handle_subscribe_uri(wuri: String): Double
  def pres_auth_status(watcher_uri: String, presentity_uri: String): Double
  def pres_has_subscribers(pres_uri: String, wevent: String): Double
  def pres_refresh_watchers(pres: String, event: String, `type`: Double): Double
  def pres_refresh_watchers_file(pres: String, event: String, `type`: Double, file_uri: String, filename: String): Double
  def pres_update_watchers(pres_uri: String, event: String): Double
}

object Typeofpresence {
  @scala.inline
  def apply(
    handle_publish: () => Double,
    handle_publish_uri: String => Double,
    handle_subscribe: () => Double,
    handle_subscribe_uri: String => Double,
    pres_auth_status: (String, String) => Double,
    pres_has_subscribers: (String, String) => Double,
    pres_refresh_watchers: (String, String, Double) => Double,
    pres_refresh_watchers_file: (String, String, Double, String, String) => Double,
    pres_update_watchers: (String, String) => Double
  ): Typeofpresence = {
    val __obj = js.Dynamic.literal(handle_publish = js.Any.fromFunction0(handle_publish), handle_publish_uri = js.Any.fromFunction1(handle_publish_uri), handle_subscribe = js.Any.fromFunction0(handle_subscribe), handle_subscribe_uri = js.Any.fromFunction1(handle_subscribe_uri), pres_auth_status = js.Any.fromFunction2(pres_auth_status), pres_has_subscribers = js.Any.fromFunction2(pres_has_subscribers), pres_refresh_watchers = js.Any.fromFunction3(pres_refresh_watchers), pres_refresh_watchers_file = js.Any.fromFunction5(pres_refresh_watchers_file), pres_update_watchers = js.Any.fromFunction2(pres_update_watchers))
    __obj.asInstanceOf[Typeofpresence]
  }
}

