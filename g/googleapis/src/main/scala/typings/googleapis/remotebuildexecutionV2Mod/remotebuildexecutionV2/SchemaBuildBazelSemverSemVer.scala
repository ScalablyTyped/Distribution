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
  def apply(
    major: js.UndefOr[Double] = js.undefined,
    minor: js.UndefOr[Double] = js.undefined,
    patch: js.UndefOr[Double] = js.undefined,
    prerelease: String = null
  ): SchemaBuildBazelSemverSemVer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(major)) __obj.updateDynamic("major")(major.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minor)) __obj.updateDynamic("minor")(minor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(patch)) __obj.updateDynamic("patch")(patch.get.asInstanceOf[js.Any])
    if (prerelease != null) __obj.updateDynamic("prerelease")(prerelease.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBuildBazelSemverSemVer]
  }
}

