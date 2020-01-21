package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Release` is a particular [collection of configurations and
  * files](sites.versions) that is set to be public at a particular time.
  */
@js.native
trait SchemaRelease extends js.Object {
  /**
    * The deploy description when the release was created. The value can be up
    * to 512&amp;nbsp;characters.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Output only. The unique identifier for the release, in the format:
    * &lt;code&gt;sites/&lt;var&gt;site-name&lt;/var&gt;/releases/&lt;var&gt;releaseID&lt;/var&gt;&lt;/code&gt;
    * This name is provided in the response body when you call the
    * [`CreateRelease`](sites.releases/create) endpoint.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The time at which the version is set to be public.
    */
  var releaseTime: js.UndefOr[String] = js.native
  /**
    * Output only. Identifies the user who created the release.
    */
  var releaseUser: js.UndefOr[SchemaActingUser] = js.native
  /**
    * Explains the reason for the release. &lt;br&gt;Specify a value for this
    * field only when creating a `SITE_DISABLE` type release.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Output only.  The configuration and content that was released.
    */
  var version: js.UndefOr[SchemaVersion] = js.native
}

object SchemaRelease {
  @scala.inline
  def apply(
    message: String = null,
    name: String = null,
    releaseTime: String = null,
    releaseUser: SchemaActingUser = null,
    `type`: String = null,
    version: SchemaVersion = null
  ): SchemaRelease = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (releaseTime != null) __obj.updateDynamic("releaseTime")(releaseTime.asInstanceOf[js.Any])
    if (releaseUser != null) __obj.updateDynamic("releaseUser")(releaseUser.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRelease]
  }
}

