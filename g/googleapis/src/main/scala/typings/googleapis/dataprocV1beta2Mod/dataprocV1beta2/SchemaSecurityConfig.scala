package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Security related configuration, including encryption, Kerberos, etc.
  */
@js.native
trait SchemaSecurityConfig extends js.Object {
  /**
    * Kerberos related configuration.
    */
  var kerberosConfig: js.UndefOr[SchemaKerberosConfig] = js.native
}

object SchemaSecurityConfig {
  @scala.inline
  def apply(kerberosConfig: SchemaKerberosConfig = null): SchemaSecurityConfig = {
    val __obj = js.Dynamic.literal()
    if (kerberosConfig != null) __obj.updateDynamic("kerberosConfig")(kerberosConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSecurityConfig]
  }
}

