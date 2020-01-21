package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The version of the SDK used to run the job.
  */
@js.native
trait SchemaSdkVersion extends js.Object {
  /**
    * The support status for this SDK version.
    */
  var sdkSupportStatus: js.UndefOr[String] = js.native
  /**
    * The version of the SDK used to run the job.
    */
  var version: js.UndefOr[String] = js.native
  /**
    * A readable string describing the version of the SDK.
    */
  var versionDisplayName: js.UndefOr[String] = js.native
}

object SchemaSdkVersion {
  @scala.inline
  def apply(sdkSupportStatus: String = null, version: String = null, versionDisplayName: String = null): SchemaSdkVersion = {
    val __obj = js.Dynamic.literal()
    if (sdkSupportStatus != null) __obj.updateDynamic("sdkSupportStatus")(sdkSupportStatus.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versionDisplayName != null) __obj.updateDynamic("versionDisplayName")(versionDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSdkVersion]
  }
}

