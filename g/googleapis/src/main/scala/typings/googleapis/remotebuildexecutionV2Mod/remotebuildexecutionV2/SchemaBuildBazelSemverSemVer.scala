package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The full version of a given tool.
  */
@js.native
trait SchemaBuildBazelSemverSemVer extends js.Object {
  /**
    * The major version, e.g 10 for 10.2.3.
    */
  var major: js.UndefOr[Double] = js.native
  /**
    * The minor version, e.g. 2 for 10.2.3.
    */
  var minor: js.UndefOr[Double] = js.native
  /**
    * The patch version, e.g 3 for 10.2.3.
    */
  var patch: js.UndefOr[Double] = js.native
  /**
    * The pre-release version. Either this field or major/minor/patch fields
    * must be filled. They are mutually exclusive. Pre-release versions are
    * assumed to be earlier than any released versions.
    */
  var prerelease: js.UndefOr[String] = js.native
}

object SchemaBuildBazelSemverSemVer {
  @scala.inline
  def apply(): SchemaBuildBazelSemverSemVer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelSemverSemVer]
  }
  @scala.inline
  implicit class SchemaBuildBazelSemverSemVerOps[Self <: SchemaBuildBazelSemverSemVer] (val x: Self) extends AnyVal {
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
    def setMajor(value: Double): Self = this.set("major", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajor: Self = this.set("major", js.undefined)
    @scala.inline
    def setMinor(value: Double): Self = this.set("minor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinor: Self = this.set("minor", js.undefined)
    @scala.inline
    def setPatch(value: Double): Self = this.set("patch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
    @scala.inline
    def setPrerelease(value: String): Self = this.set("prerelease", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrerelease: Self = this.set("prerelease", js.undefined)
  }
  
}

