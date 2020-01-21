package typings.googleapis.dnsV1Mod.dnsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOperationDnsKeyContext extends js.Object {
  var newValue: js.UndefOr[SchemaDnsKey] = js.native
  var oldValue: js.UndefOr[SchemaDnsKey] = js.native
}

object SchemaOperationDnsKeyContext {
  @scala.inline
  def apply(newValue: SchemaDnsKey = null, oldValue: SchemaDnsKey = null): SchemaOperationDnsKeyContext = {
    val __obj = js.Dynamic.literal()
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperationDnsKeyContext]
  }
}

