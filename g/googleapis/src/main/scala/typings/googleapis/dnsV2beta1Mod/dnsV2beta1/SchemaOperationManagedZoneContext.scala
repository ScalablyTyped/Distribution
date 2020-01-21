package typings.googleapis.dnsV2beta1Mod.dnsV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOperationManagedZoneContext extends js.Object {
  var newValue: js.UndefOr[SchemaManagedZone] = js.native
  var oldValue: js.UndefOr[SchemaManagedZone] = js.native
}

object SchemaOperationManagedZoneContext {
  @scala.inline
  def apply(newValue: SchemaManagedZone = null, oldValue: SchemaManagedZone = null): SchemaOperationManagedZoneContext = {
    val __obj = js.Dynamic.literal()
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperationManagedZoneContext]
  }
}

