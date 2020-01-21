package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Security Command Center&#39;s (Cloud SCC) finding source. A finding
  * source is an entity or a mechanism that can produce a finding. A source is
  * like a container of findings that come from the same scanner, logger,
  * monitor, etc.
  */
@js.native
trait SchemaSource extends js.Object {
  /**
    * The description of the source (max of 1024 characters). Example:
    * &quot;Cloud Security Scanner is a web security scanner for common
    * vulnerabilities in App Engine applications. It can automatically scan and
    * detect four common vulnerabilities, including cross-site-scripting (XSS),
    * Flash injection, mixed content (HTTP in HTTPS), and outdated/insecure
    * libraries.&quot;
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The source’s display name. A source’s display name must be unique amongst
    * its siblings, for example, two sources with the same parent can&#39;t
    * share the same display name. The display name must start and end with a
    * letter or digit, may contain letters, digits, spaces, hyphens, and
    * underscores, and can be no longer than 32 characters. This is captured by
    * the regular expression: [\p{L}\p{N}]({\p{L}\p{N}_- ]{0,30}[\p{L}\p{N}])?.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The relative resource name of this source. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Example: &quot;organizations/123/sources/456&quot;
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaSource {
  @scala.inline
  def apply(description: String = null, displayName: String = null, name: String = null): SchemaSource = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSource]
  }
}

