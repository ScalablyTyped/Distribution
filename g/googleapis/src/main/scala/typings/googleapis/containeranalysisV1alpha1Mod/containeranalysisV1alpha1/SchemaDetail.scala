package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies all occurrences of this vulnerability in the package for a
  * specific distro/location For example: glibc in cpe:/o:debian:debian_linux:8
  * for versions 2.1 - 2.2
  */
@js.native
trait SchemaDetail extends js.Object {
  /**
    * The name of the package where the vulnerability was found. This field can
    * be used as a filter in list requests.
    */
  @JSName("package")
  var _package: js.UndefOr[String] = js.native
  /**
    * The cpe_uri in [cpe format] (https://cpe.mitre.org/specification/) in
    * which the vulnerability manifests.  Examples include distro or storage
    * location for vulnerable jar. This field can be used as a filter in list
    * requests.
    */
  var cpeUri: js.UndefOr[String] = js.native
  /**
    * A vendor-specific description of this note.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The fix for this specific package version.
    */
  var fixedLocation: js.UndefOr[SchemaVulnerabilityLocation] = js.native
  /**
    * Whether this Detail is obsolete. Occurrences are expected not to point to
    * obsolete details.
    */
  var isObsolete: js.UndefOr[Boolean] = js.native
  /**
    * The max version of the package in which the vulnerability exists. This
    * field can be used as a filter in list requests.
    */
  var maxAffectedVersion: js.UndefOr[SchemaVersion] = js.native
  /**
    * The min version of the package in which the vulnerability exists.
    */
  var minAffectedVersion: js.UndefOr[SchemaVersion] = js.native
  /**
    * The type of package; whether native or non native(ruby gems, node.js
    * packages etc)
    */
  var packageType: js.UndefOr[String] = js.native
  /**
    * The severity (eg: distro assigned severity) for this vulnerability.
    */
  var severityName: js.UndefOr[String] = js.native
}

object SchemaDetail {
  @scala.inline
  def apply(
    _package: String = null,
    cpeUri: String = null,
    description: String = null,
    fixedLocation: SchemaVulnerabilityLocation = null,
    isObsolete: js.UndefOr[Boolean] = js.undefined,
    maxAffectedVersion: SchemaVersion = null,
    minAffectedVersion: SchemaVersion = null,
    packageType: String = null,
    severityName: String = null
  ): SchemaDetail = {
    val __obj = js.Dynamic.literal()
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (cpeUri != null) __obj.updateDynamic("cpeUri")(cpeUri.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (fixedLocation != null) __obj.updateDynamic("fixedLocation")(fixedLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(isObsolete)) __obj.updateDynamic("isObsolete")(isObsolete.get.asInstanceOf[js.Any])
    if (maxAffectedVersion != null) __obj.updateDynamic("maxAffectedVersion")(maxAffectedVersion.asInstanceOf[js.Any])
    if (minAffectedVersion != null) __obj.updateDynamic("minAffectedVersion")(minAffectedVersion.asInstanceOf[js.Any])
    if (packageType != null) __obj.updateDynamic("packageType")(packageType.asInstanceOf[js.Any])
    if (severityName != null) __obj.updateDynamic("severityName")(severityName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDetail]
  }
}

