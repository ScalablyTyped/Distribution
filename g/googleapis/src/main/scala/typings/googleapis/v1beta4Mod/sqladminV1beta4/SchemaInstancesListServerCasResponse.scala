package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instances ListServerCas response.
  */
@js.native
trait SchemaInstancesListServerCasResponse extends js.Object {
  var activeVersion: js.UndefOr[String] = js.native
  /**
    * List of server CA certificates for the instance.
    */
  var certs: js.UndefOr[js.Array[SchemaSslCert]] = js.native
  /**
    * This is always sql#instancesListServerCas.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaInstancesListServerCasResponse {
  @scala.inline
  def apply(activeVersion: String = null, certs: js.Array[SchemaSslCert] = null, kind: String = null): SchemaInstancesListServerCasResponse = {
    val __obj = js.Dynamic.literal()
    if (activeVersion != null) __obj.updateDynamic("activeVersion")(activeVersion.asInstanceOf[js.Any])
    if (certs != null) __obj.updateDynamic("certs")(certs.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesListServerCasResponse]
  }
}

