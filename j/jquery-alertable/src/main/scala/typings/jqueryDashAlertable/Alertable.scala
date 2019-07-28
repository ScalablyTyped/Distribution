package typings.jqueryDashAlertable

import typings.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alertable extends js.Object {
  var defaults: AlertableOptions = js.native
  def alert(message: String): JQueryPromise[Unit] = js.native
  def alert(message: String, options: AlertableOptions): JQueryPromise[Unit] = js.native
  def confirm(message: String): JQueryPromise[Unit] = js.native
  def confirm(message: String, options: AlertableOptions): JQueryPromise[Unit] = js.native
  def prompt(message: String): JQueryPromise[Unit] = js.native
  def prompt(message: String, options: AlertableOptions): JQueryPromise[Unit] = js.native
}

