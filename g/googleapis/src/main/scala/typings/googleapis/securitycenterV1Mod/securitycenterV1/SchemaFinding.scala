package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Security Command Center (Cloud SCC) finding.  A finding is a record
  * of assessment data (security, risk, health or privacy) ingested into Cloud
  * SCC for presentation, notification, analysis, policy testing, and
  * enforcement. For example, an XSS vulnerability in an App Engine application
  * is a finding.
  */
@js.native
trait SchemaFinding extends js.Object {
  /**
    * The additional taxonomy group within findings from a given source. This
    * field is immutable after creation time. Example:
    * &quot;XSS_FLASH_INJECTION&quot;
    */
  var category: js.UndefOr[String] = js.native
  /**
    * The time at which the finding was created in Cloud SCC.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The time at which the event took place. For example, if the finding
    * represents an open firewall it would capture the time the open firewall
    * was detected.
    */
  var eventTime: js.UndefOr[String] = js.native
  /**
    * The URI that, if available, points to a web page outside of Cloud SCC
    * where additional information about the finding can be found. This field
    * is guaranteed to be either empty or a well formed URL.
    */
  var externalUri: js.UndefOr[String] = js.native
  /**
    * The relative resource name of this finding. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Example: &quot;organizations/123/sources/456/findings/789&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The relative resource name of the source the finding belongs to. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * This field is immutable after creation time. For example:
    * &quot;organizations/123/sources/456&quot;
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The full resource name of the Google Cloud Platform (GCP) resource this
    * finding is for. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    * This field is immutable after creation time.
    */
  var resourceName: js.UndefOr[String] = js.native
  /**
    * Output only. User specified security marks. These marks are entirely
    * managed by the user and come from the SecurityMarks resource that belongs
    * to the finding.
    */
  var securityMarks: js.UndefOr[SchemaSecurityMarks] = js.native
  /**
    * Source specific properties. These properties are managed by the source
    * that writes the finding. The key names in the source_properties map must
    * be between 1 and 255 characters, and must start with a letter and contain
    * alphanumeric characters or underscores only.
    */
  var sourceProperties: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The state of the finding.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaFinding {
  @scala.inline
  def apply(
    category: String = null,
    createTime: String = null,
    eventTime: String = null,
    externalUri: String = null,
    name: String = null,
    parent: String = null,
    resourceName: String = null,
    securityMarks: SchemaSecurityMarks = null,
    sourceProperties: StringDictionary[js.Any] = null,
    state: String = null
  ): SchemaFinding = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (eventTime != null) __obj.updateDynamic("eventTime")(eventTime.asInstanceOf[js.Any])
    if (externalUri != null) __obj.updateDynamic("externalUri")(externalUri.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (securityMarks != null) __obj.updateDynamic("securityMarks")(securityMarks.asInstanceOf[js.Any])
    if (sourceProperties != null) __obj.updateDynamic("sourceProperties")(sourceProperties.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFinding]
  }
}

