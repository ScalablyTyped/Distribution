package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An occurrence of a particular package installation found within a
  * system&#39;s filesystem. E.g., glibc was found in `/var/lib/dpkg/status`.
  */
@js.native
trait SchemaLocation extends js.Object {
  /**
    * Required. The CPE URI in [CPE
    * format](https://cpe.mitre.org/specification/) denoting the package
    * manager version distributing a package.
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
  def apply(): SchemaLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocation]
  }
  @scala.inline
  implicit class SchemaLocationOps[Self <: SchemaLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCpeUri(value: String): Self = this.set("cpeUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpeUri: Self = this.set("cpeUri", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setVersion(value: SchemaVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

