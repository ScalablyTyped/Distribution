package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileOptions extends js.Object {
  /**
    * If true and the provided schema is (or contains parts) using an older version of joi, will return a compiled schema that is compatible with the older version.
    * If false, the schema is always compiled using the current version and if older schema components are found, an error is thrown.
    */
  var legacy: Boolean
}

object CompileOptions {
  @scala.inline
  def apply(legacy: Boolean): CompileOptions = {
    val __obj = js.Dynamic.literal(legacy = legacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileOptions]
  }
}

