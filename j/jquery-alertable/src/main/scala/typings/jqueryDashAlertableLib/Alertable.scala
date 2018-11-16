package typings
package jqueryDashAlertableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alertable extends js.Object {
  var defaults: AlertableOptions = js.native
  def alert(message: java.lang.String): jqueryLib.JQueryPromise[scala.Unit] = js.native
  def alert(message: java.lang.String, options: AlertableOptions): jqueryLib.JQueryPromise[scala.Unit] = js.native
  def confirm(message: java.lang.String): jqueryLib.JQueryPromise[scala.Unit] = js.native
  def confirm(message: java.lang.String, options: AlertableOptions): jqueryLib.JQueryPromise[scala.Unit] = js.native
  def prompt(message: java.lang.String): jqueryLib.JQueryPromise[scala.Unit] = js.native
  def prompt(message: java.lang.String, options: AlertableOptions): jqueryLib.JQueryPromise[scala.Unit] = js.native
}

