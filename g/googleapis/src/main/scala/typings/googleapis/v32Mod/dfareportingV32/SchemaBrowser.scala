package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a browser that can be targeted by ads.
  */
@js.native
trait SchemaBrowser extends js.Object {
  /**
    * ID referring to this grouping of browser and version numbers. This is the
    * ID used for targeting.
    */
  var browserVersionId: js.UndefOr[String] = js.native
  /**
    * DART ID of this browser. This is the ID used when generating reports.
    */
  var dartId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#browser&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Major version number (leftmost number) of this browser. For example, for
    * Chrome 5.0.376.86 beta, this field should be set to 5. An asterisk (*)
    * may be used to target any version number, and a question mark (?) may be
    * used to target cases where the version number cannot be identified. For
    * example, Chrome *.* targets any version of Chrome: 1.2, 2.5, 3.5, and so
    * on. Chrome 3.* targets Chrome 3.1, 3.5, but not 4.0. Firefox ?.? targets
    * cases where the ad server knows the browser is Firefox but can&#39;t tell
    * which version it is.
    */
  var majorVersion: js.UndefOr[String] = js.native
  /**
    * Minor version number (number after first dot on left) of this browser.
    * For example, for Chrome 5.0.375.86 beta, this field should be set to 0.
    * An asterisk (*) may be used to target any version number, and a question
    * mark (?) may be used to target cases where the version number cannot be
    * identified. For example, Chrome *.* targets any version of Chrome:
    * 1.2, 2.5, 3.5, and so on. Chrome 3.* targets Chrome 3.1, 3.5, but
    * not 4.0. Firefox ?.? targets cases where the ad server knows the browser
    * is Firefox but can&#39;t tell which version it is.
    */
  var minorVersion: js.UndefOr[String] = js.native
  /**
    * Name of this browser.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaBrowser {
  @scala.inline
  def apply(
    browserVersionId: String = null,
    dartId: String = null,
    kind: String = null,
    majorVersion: String = null,
    minorVersion: String = null,
    name: String = null
  ): SchemaBrowser = {
    val __obj = js.Dynamic.literal()
    if (browserVersionId != null) __obj.updateDynamic("browserVersionId")(browserVersionId.asInstanceOf[js.Any])
    if (dartId != null) __obj.updateDynamic("dartId")(dartId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (majorVersion != null) __obj.updateDynamic("majorVersion")(majorVersion.asInstanceOf[js.Any])
    if (minorVersion != null) __obj.updateDynamic("minorVersion")(minorVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBrowser]
  }
}

