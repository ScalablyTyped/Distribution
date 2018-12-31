package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  def cancel(n: scala.Double, callback: js.Function1[/* err */ nodeLib.Error, scala.Unit]): scala.Unit
  def item(n: scala.Double, callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit
  def list(callback: js.Function2[/* err */ nodeLib.Error, /* data */ js.Any, scala.Unit]): scala.Unit
}

