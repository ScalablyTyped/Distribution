package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaManagedZoneDnsSecConfig extends js.Object {
  var defaultKeySpecs: js.UndefOr[js.Array[SchemaDnsKeySpec]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZoneDnsSecConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var nonExistence: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object SchemaManagedZoneDnsSecConfig {
  @scala.inline
  def apply(
    defaultKeySpecs: js.Array[SchemaDnsKeySpec] = null,
    kind: String = null,
    nonExistence: String = null,
    state: String = null
  ): SchemaManagedZoneDnsSecConfig = {
    val __obj = js.Dynamic.literal()
    if (defaultKeySpecs != null) __obj.updateDynamic("defaultKeySpecs")(defaultKeySpecs.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nonExistence != null) __obj.updateDynamic("nonExistence")(nonExistence.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedZoneDnsSecConfig]
  }
}

