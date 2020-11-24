package typings.maximMazurokGapiClientBillingbudgets.gapi.client.billingbudgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudBillingBudgetsV1NotificationsRule extends js.Object {
  
  /**
    * Optional. When set to true, disables default notifications sent when a threshold is exceeded. Default notifications are sent to those with Billing Account Administrator and Billing
    * Account User IAM roles for the target account.
    */
  var disableDefaultIamRecipients: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. Targets to send notifications to when a threshold is exceeded. This is in addition to default recipients who have billing account IAM roles. The value is the full REST
    * resource name of a monitoring notification channel with the form `projects/{project_id}/notificationChannels/{channel_id}`. A maximum of 5 channels are allowed. See
    * https://cloud.google.com/billing/docs/how-to/budgets-notification-recipients for more details.
    */
  var monitoringNotificationChannels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The name of the Pub/Sub topic where budget related messages will be published, in the form `projects/{project_id}/topics/{topic_id}`. Updates are sent at regular intervals
    * to the topic. The topic needs to be created before the budget is created; see https://cloud.google.com/billing/docs/how-to/budgets#manage-notifications for more details. Caller is
    * expected to have `pubsub.topics.setIamPolicy` permission on the topic when it's set for a budget, otherwise, the API call will fail with PERMISSION_DENIED. See
    * https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications for more details on Pub/Sub roles and permissions.
    */
  var pubsubTopic: js.UndefOr[String] = js.native
  
  /**
    * Optional. The schema version of the notification sent to `pubsub_topic`. Only "1.0" is accepted. It represents the JSON schema as defined in
    * https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#notification_format
    */
  var schemaVersion: js.UndefOr[String] = js.native
}
object GoogleCloudBillingBudgetsV1NotificationsRule {
  
  @scala.inline
  def apply(): GoogleCloudBillingBudgetsV1NotificationsRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudBillingBudgetsV1NotificationsRule]
  }
  
  @scala.inline
  implicit class GoogleCloudBillingBudgetsV1NotificationsRuleOps[Self <: GoogleCloudBillingBudgetsV1NotificationsRule] (val x: Self) extends AnyVal {
    
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
    def setDisableDefaultIamRecipients(value: Boolean): Self = this.set("disableDefaultIamRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDefaultIamRecipients: Self = this.set("disableDefaultIamRecipients", js.undefined)
    
    @scala.inline
    def setMonitoringNotificationChannelsVarargs(value: String*): Self = this.set("monitoringNotificationChannels", js.Array(value :_*))
    
    @scala.inline
    def setMonitoringNotificationChannels(value: js.Array[String]): Self = this.set("monitoringNotificationChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoringNotificationChannels: Self = this.set("monitoringNotificationChannels", js.undefined)
    
    @scala.inline
    def setPubsubTopic(value: String): Self = this.set("pubsubTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePubsubTopic: Self = this.set("pubsubTopic", js.undefined)
    
    @scala.inline
    def setSchemaVersion(value: String): Self = this.set("schemaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersion: Self = this.set("schemaVersion", js.undefined)
  }
}
