package typings.jsonDashSchemaDashCompare.jsonDashSchemaDashCompareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Ignores certain keywords, useful to exclude meta keywords like title,
    * description etc or custom keywords. If all you want to know if they are
    * the same in terms of validation keywords.
    *
    * @default []
    */
  var ignore: js.UndefOr[js.Array[JSONSchemaKeys]] = js.undefined
}

object Options {
  @scala.inline
  def apply(ignore: js.Array[JSONSchemaKeys] = null): Options = {
    val __obj = js.Dynamic.literal()
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

