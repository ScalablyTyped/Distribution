package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaValueMapValEntry extends js.Object {
  var key: js.UndefOr[String] = js.native
  var value: js.UndefOr[SchemaMapValue] = js.native
}

object SchemaValueMapValEntry {
  @scala.inline
  def apply(key: String = null, value: SchemaMapValue = null): SchemaValueMapValEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaValueMapValEntry]
  }
}

