package typings.atHapiJoi

import typings.atHapiJoi.atHapiJoiMod.ExtensionBoundSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Build extends js.Object {
  var build: js.UndefOr[js.Function2[/* obj */ ExtensionBoundSchema, /* desc */ Record[String, _], _]] = js.undefined
}

object Anon_Build {
  @scala.inline
  def apply(build: (/* obj */ ExtensionBoundSchema, /* desc */ Record[String, _]) => _ = null): Anon_Build = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(js.Any.fromFunction2(build))
    __obj.asInstanceOf[Anon_Build]
  }
}

