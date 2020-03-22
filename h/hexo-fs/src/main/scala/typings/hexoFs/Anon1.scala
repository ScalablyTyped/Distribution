package typings.hexoFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(encoding: String = null): Anon1 = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

