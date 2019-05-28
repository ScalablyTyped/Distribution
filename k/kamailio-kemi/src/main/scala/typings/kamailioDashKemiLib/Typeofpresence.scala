package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpresence extends js.Object {
  def handle_publish(): scala.Double
  def handle_publish_uri(sender_uri: java.lang.String): scala.Double
  def handle_subscribe(): scala.Double
  def handle_subscribe_uri(wuri: java.lang.String): scala.Double
  def pres_auth_status(watcher_uri: java.lang.String, presentity_uri: java.lang.String): scala.Double
  def pres_has_subscribers(pres_uri: java.lang.String, wevent: java.lang.String): scala.Double
  def pres_refresh_watchers(pres: java.lang.String, event: java.lang.String, `type`: scala.Double): scala.Double
  def pres_refresh_watchers_file(
    pres: java.lang.String,
    event: java.lang.String,
    `type`: scala.Double,
    file_uri: java.lang.String,
    filename: java.lang.String
  ): scala.Double
  def pres_update_watchers(pres_uri: java.lang.String, event: java.lang.String): scala.Double
}

object Typeofpresence {
  @scala.inline
  def apply(
    handle_publish: () => scala.Double,
    handle_publish_uri: java.lang.String => scala.Double,
    handle_subscribe: () => scala.Double,
    handle_subscribe_uri: java.lang.String => scala.Double,
    pres_auth_status: (java.lang.String, java.lang.String) => scala.Double,
    pres_has_subscribers: (java.lang.String, java.lang.String) => scala.Double,
    pres_refresh_watchers: (java.lang.String, java.lang.String, scala.Double) => scala.Double,
    pres_refresh_watchers_file: (java.lang.String, java.lang.String, scala.Double, java.lang.String, java.lang.String) => scala.Double,
    pres_update_watchers: (java.lang.String, java.lang.String) => scala.Double
  ): Typeofpresence = {
    val __obj = js.Dynamic.literal(handle_publish = js.Any.fromFunction0(handle_publish), handle_publish_uri = js.Any.fromFunction1(handle_publish_uri), handle_subscribe = js.Any.fromFunction0(handle_subscribe), handle_subscribe_uri = js.Any.fromFunction1(handle_subscribe_uri), pres_auth_status = js.Any.fromFunction2(pres_auth_status), pres_has_subscribers = js.Any.fromFunction2(pres_has_subscribers), pres_refresh_watchers = js.Any.fromFunction3(pres_refresh_watchers), pres_refresh_watchers_file = js.Any.fromFunction5(pres_refresh_watchers_file), pres_update_watchers = js.Any.fromFunction2(pres_update_watchers))
  
    __obj.asInstanceOf[Typeofpresence]
  }
}

