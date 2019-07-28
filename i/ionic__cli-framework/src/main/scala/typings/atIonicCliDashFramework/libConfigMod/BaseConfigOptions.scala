package typings.atIonicCliDashFramework.libConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseConfigOptions extends js.Object {
  /**
    * If specified, the class will operate on a nested object within the config
    * file navigated to by this path prefix, an array of object path keys.
    *
    * For example, to operate on `c` object within `{ a: { b: { c: {} } } }`,
    * use `pathPrefix` of `['a', 'b', 'c']`.
    */
  var pathPrefix: js.UndefOr[js.Array[String]] = js.undefined
}

object BaseConfigOptions {
  @scala.inline
  def apply(pathPrefix: js.Array[String] = null): BaseConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (pathPrefix != null) __obj.updateDynamic("pathPrefix")(pathPrefix)
    __obj.asInstanceOf[BaseConfigOptions]
  }
}

