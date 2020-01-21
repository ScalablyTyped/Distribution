package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An occurrence of a particular package installation found within a
  * system&#39;s filesystem. e.g. glibc was found in /var/lib/dpkg/status
  */
@js.native
trait SchemaLocation extends js.Object {
  /**
    * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/)
    * denoting the package manager version distributing a package.
    */
  var cpeUri: js.UndefOr[String] = js.native
  /**
    * The path from which we gathered that this package/version is installed.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The version installed at this location.
    */
  var version: js.UndefOr[SchemaVersion] = js.native
}

object SchemaLocation {
  @scala.inline
  def apply(cpeUri: String = null, path: String = null, version: SchemaVersion = null): SchemaLocation = {
    val __obj = js.Dynamic.literal()
    if (cpeUri != null) __obj.updateDynamic("cpeUri")(cpeUri.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLocation]
  }
}

