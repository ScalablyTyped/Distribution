package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SslCerts list response.
  */
@js.native
trait SchemaSslCertsListResponse extends js.Object {
  /**
    * List of client certificates for the instance.
    */
  var items: js.UndefOr[js.Array[SchemaSslCert]] = js.native
  /**
    * This is always sql#sslCertsList.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaSslCertsListResponse {
  @scala.inline
  def apply(items: js.Array[SchemaSslCert] = null, kind: String = null): SchemaSslCertsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSslCertsListResponse]
  }
}

