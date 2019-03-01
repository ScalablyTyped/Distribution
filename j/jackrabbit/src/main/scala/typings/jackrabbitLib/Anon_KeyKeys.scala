package typings
package jackrabbitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyKeys extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var keys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var prefetch: js.UndefOr[scala.Double] = js.undefined
}

object Anon_KeyKeys {
  @scala.inline
  def apply(
    key: java.lang.String = null,
    keys: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    prefetch: scala.Int | scala.Double = null
  ): Anon_KeyKeys = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (name != null) __obj.updateDynamic("name")(name)
    if (prefetch != null) __obj.updateDynamic("prefetch")(prefetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyKeys]
  }
}

