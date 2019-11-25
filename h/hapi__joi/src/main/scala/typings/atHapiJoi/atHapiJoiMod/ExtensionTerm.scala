package typings.atHapiJoi.atHapiJoiMod

import typings.atHapiJoi.atHapiJoiStrings.schema
import typings.atHapiJoi.atHapiJoiStrings.single
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionTerm extends js.Object {
  var init: js.Array[_] | Null
  var manifest: js.UndefOr[Record[String, schema | single | ExtensionTermManifest]] = js.undefined
  var register: js.UndefOr[js.Any] = js.undefined
}

object ExtensionTerm {
  @scala.inline
  def apply(
    init: js.Array[_] = null,
    manifest: Record[String, schema | single | ExtensionTermManifest] = null,
    register: js.Any = null
  ): ExtensionTerm = {
    val __obj = js.Dynamic.literal()
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (register != null) __obj.updateDynamic("register")(register.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionTerm]
  }
}

