package typings.hapiJoi.anon

import typings.hapiJoi.mod.ExtensionBoundSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Build extends js.Object {
  var build: js.UndefOr[js.Function2[/* obj */ ExtensionBoundSchema, /* desc */ Record[String, _], _]] = js.undefined
}

object Build {
  @scala.inline
  def apply(build: (/* obj */ ExtensionBoundSchema, /* desc */ Record[String, _]) => _ = null): Build = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(js.Any.fromFunction2(build))
    __obj.asInstanceOf[Build]
  }
}

