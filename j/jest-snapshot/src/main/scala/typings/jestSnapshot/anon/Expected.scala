package typings.jestSnapshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expected extends js.Object {
  var actual: js.UndefOr[scala.Nothing] = js.undefined
  var expected: js.UndefOr[scala.Nothing] = js.undefined
  var name: String
  var pass: Boolean
  def message(): String
  def report(): String
}

object Expected {
  @scala.inline
  def apply(message: () => String, name: String, pass: Boolean, report: () => String): Expected = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), name = name.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], report = js.Any.fromFunction0(report))
    __obj.asInstanceOf[Expected]
  }
}

