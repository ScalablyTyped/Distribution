package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a configuration to make dlp api calls on a repeating basis. See
  * https://cloud.google.com/dlp/docs/concepts-job-triggers to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2JobTrigger extends js.Object {
  /**
    * The creation timestamp of a triggeredJob, output only field.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * User provided description (max 256 chars)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Display name (max 100 chars)
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * A stream of errors encountered when the trigger was activated. Repeated
    * errors may result in the JobTrigger automatically being paused. Will
    * return the last 100 errors. Whenever the JobTrigger is modified this list
    * will be cleared. Output only field.
    */
  var errors: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Error]] = js.native
  var inspectJob: js.UndefOr[SchemaGooglePrivacyDlpV2InspectJobConfig] = js.native
  /**
    * The timestamp of the last time this trigger executed, output only field.
    */
  var lastRunTime: js.UndefOr[String] = js.native
  /**
    * Unique resource name for the triggeredJob, assigned by the service when
    * the triggeredJob is created, for example
    * `projects/dlp-test-project/triggeredJobs/53234423`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A status for this trigger. [required]
    */
  var status: js.UndefOr[String] = js.native
  /**
    * A list of triggers which will be OR&#39;ed together. Only one in the list
    * needs to trigger for a job to be started. The list may contain only a
    * single Schedule trigger and must have at least one object.
    */
  var triggers: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Trigger]] = js.native
  /**
    * The last update timestamp of a triggeredJob, output only field.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2JobTrigger {
  @scala.inline
  def apply(
    createTime: String = null,
    description: String = null,
    displayName: String = null,
    errors: js.Array[SchemaGooglePrivacyDlpV2Error] = null,
    inspectJob: SchemaGooglePrivacyDlpV2InspectJobConfig = null,
    lastRunTime: String = null,
    name: String = null,
    status: String = null,
    triggers: js.Array[SchemaGooglePrivacyDlpV2Trigger] = null,
    updateTime: String = null
  ): SchemaGooglePrivacyDlpV2JobTrigger = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (inspectJob != null) __obj.updateDynamic("inspectJob")(inspectJob.asInstanceOf[js.Any])
    if (lastRunTime != null) __obj.updateDynamic("lastRunTime")(lastRunTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (triggers != null) __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2JobTrigger]
  }
}

