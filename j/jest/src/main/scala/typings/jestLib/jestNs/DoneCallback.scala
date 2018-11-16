package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoneCallback extends js.Object {
  def apply(args: js.Any*): js.Any = js.native
  def fail(): js.Any = js.native
  def fail(error: java.lang.String): js.Any = js.native
  def fail(error: jestLib.Anon_Message): js.Any = js.native
}

