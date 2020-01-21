package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a package occurrence.
  */
@js.native
trait SchemaGrafeasV1beta1PackageDetails extends js.Object {
  /**
    * Required. Where the package was installed.
    */
  var installation: js.UndefOr[SchemaInstallation] = js.native
}

object SchemaGrafeasV1beta1PackageDetails {
  @scala.inline
  def apply(installation: SchemaInstallation = null): SchemaGrafeasV1beta1PackageDetails = {
    val __obj = js.Dynamic.literal()
    if (installation != null) __obj.updateDynamic("installation")(installation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGrafeasV1beta1PackageDetails]
  }
}

