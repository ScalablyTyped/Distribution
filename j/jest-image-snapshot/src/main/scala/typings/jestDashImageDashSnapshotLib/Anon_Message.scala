package typings
package jestDashImageDashSnapshotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var pass: scala.Boolean
  def message(): java.lang.String
}

object Anon_Message {
  @scala.inline
  def apply(message: () => java.lang.String, pass: scala.Boolean): Anon_Message = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), pass = pass)
  
    __obj.asInstanceOf[Anon_Message]
  }
}

