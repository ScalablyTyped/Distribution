package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUnmappedIdentity extends js.Object {
  /**
    * The resource name for an external user.
    */
  var externalIdentity: js.UndefOr[SchemaPrincipal] = js.native
  /**
    * The resolution status for the external identity.
    */
  var resolutionStatusCode: js.UndefOr[String] = js.native
}

object SchemaUnmappedIdentity {
  @scala.inline
  def apply(externalIdentity: SchemaPrincipal = null, resolutionStatusCode: String = null): SchemaUnmappedIdentity = {
    val __obj = js.Dynamic.literal()
    if (externalIdentity != null) __obj.updateDynamic("externalIdentity")(externalIdentity.asInstanceOf[js.Any])
    if (resolutionStatusCode != null) __obj.updateDynamic("resolutionStatusCode")(resolutionStatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUnmappedIdentity]
  }
}

