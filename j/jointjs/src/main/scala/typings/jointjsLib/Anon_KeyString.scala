package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyString extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_KeyString {
  @scala.inline
  def apply(key: java.lang.String = null): Anon_KeyString = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_KeyString]
  }
}

