package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a particular channel of distribution for a given package.
  * E.g., Debian&#39;s jessie-backports dpkg mirror.
  */
@js.native
trait SchemaDistribution extends js.Object {
  /**
    * The CPU architecture for which packages in this distribution channel were
    * built.
    */
  var architecture: js.UndefOr[String] = js.native
  /**
    * Required. The cpe_uri in [CPE
    * format](https://cpe.mitre.org/specification/) denoting the package
    * manager version distributing a package.
    */
  var cpeUri: js.UndefOr[String] = js.native
  /**
    * The distribution channel-specific description of this package.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The latest available version of this package in this distribution
    * channel.
    */
  var latestVersion: js.UndefOr[SchemaVersion] = js.native
  /**
    * A freeform string denoting the maintainer of this package.
    */
  var maintainer: js.UndefOr[String] = js.native
  /**
    * The distribution channel-specific homepage for this package.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaDistribution {
  @scala.inline
  def apply(): SchemaDistribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistribution]
  }
  @scala.inline
  implicit class SchemaDistributionOps[Self <: SchemaDistribution] (val x: Self) extends AnyVal {
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
    def setArchitecture(value: String): Self = this.set("architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchitecture: Self = this.set("architecture", js.undefined)
    @scala.inline
    def setCpeUri(value: String): Self = this.set("cpeUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpeUri: Self = this.set("cpeUri", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLatestVersion(value: SchemaVersion): Self = this.set("latestVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestVersion: Self = this.set("latestVersion", js.undefined)
    @scala.inline
    def setMaintainer(value: String): Self = this.set("maintainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintainer: Self = this.set("maintainer", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

