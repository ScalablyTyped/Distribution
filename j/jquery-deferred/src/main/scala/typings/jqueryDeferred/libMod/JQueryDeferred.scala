package typings.jqueryDeferred.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryDeferred extends JQueryPromise {
  def notify(args: js.Any*): JQueryDeferred = js.native
  def notifyWith(context: js.Any, args: js.Any*): JQueryDeferred = js.native
  def progress(progressCallbacks: js.Any*): JQueryDeferred = js.native
  def reject(args: js.Any*): JQueryDeferred = js.native
  def rejectWith(context: js.Any, args: js.Any*): JQueryDeferred = js.native
  def resolve(args: js.Any*): JQueryDeferred = js.native
  def resolveWith(context: js.Any, args: js.Any*): JQueryDeferred = js.native
}

