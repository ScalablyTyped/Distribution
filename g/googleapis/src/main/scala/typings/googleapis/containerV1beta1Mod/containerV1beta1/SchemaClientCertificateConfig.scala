package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for client certificates on the cluster.
  */
@js.native
trait SchemaClientCertificateConfig extends js.Object {
  /**
    * Issue a client certificate.
    */
  var issueClientCertificate: js.UndefOr[Boolean] = js.native
}

object SchemaClientCertificateConfig {
  @scala.inline
  def apply(issueClientCertificate: js.UndefOr[Boolean] = js.undefined): SchemaClientCertificateConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(issueClientCertificate)) __obj.updateDynamic("issueClientCertificate")(issueClientCertificate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClientCertificateConfig]
  }
}

