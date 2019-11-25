package typings.jackrabbit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyKeys extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var prefetch: js.UndefOr[Double] = js.undefined
}

object Anon_KeyKeys {
  @scala.inline
  def apply(
    key: String = null,
    keys: js.Array[String] = null,
    name: String = null,
    prefetch: Int | Double = null
  ): Anon_KeyKeys = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefetch != null) __obj.updateDynamic("prefetch")(prefetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyKeys]
  }
}

