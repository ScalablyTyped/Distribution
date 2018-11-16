package typings
package knockoutDashPostboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutPostBox extends js.Object {
  def defaultComparer[T](newValue: T, oldValue: T): scala.Boolean = js.native
  def publish[T](topic: java.lang.String): scala.Unit = js.native
  def publish[T](topic: java.lang.String, value: T): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def serializer(`object`: js.Any): java.lang.String = js.native
  def subscribe[T](topic: java.lang.String, handler: js.Function1[/* value */ T, scala.Unit]): knockoutLib.KnockoutSubscription = js.native
  def subscribe[T](topic: java.lang.String, handler: js.Function1[/* value */ T, scala.Unit], target: js.Any): knockoutLib.KnockoutSubscription = js.native
}

