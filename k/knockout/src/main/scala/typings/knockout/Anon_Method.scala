package typings.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var timeout: Double
}

object Anon_Method {
  @scala.inline
  def apply(timeout: Double, method: String = null): Anon_Method = {
    val __obj = js.Dynamic.literal(timeout = timeout)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[Anon_Method]
  }
}

