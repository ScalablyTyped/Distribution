package typings.maximMazurokGapiClientBillingbudgets

import org.scalablytyped.runtime.TopLevel
import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientBillingbudgets.anon.Accesstoken
import typings.maximMazurokGapiClientBillingbudgets.anon.Alt
import typings.maximMazurokGapiClientBillingbudgets.anon.Callback
import typings.maximMazurokGapiClientBillingbudgets.anon.Fields
import typings.maximMazurokGapiClientBillingbudgets.anon.Key
import typings.maximMazurokGapiClientBillingbudgets.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object billingbudgets {
      
      trait BillingAccountsResource extends StObject {
        
        var budgets: BudgetsResource
      }
      object BillingAccountsResource {
        
        inline def apply(budgets: BudgetsResource): BillingAccountsResource = {
          val __obj = js.Dynamic.literal(budgets = budgets.asInstanceOf[js.Any])
          __obj.asInstanceOf[BillingAccountsResource]
        }
        
        extension [Self <: BillingAccountsResource](x: Self) {
          
          inline def setBudgets(value: BudgetsResource): Self = StObject.set(x, "budgets", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait BudgetsResource extends StObject {
        
        /** Creates a new budget. See [Quotas and limits](https://cloud.google.com/billing/quotas) for more information on the limits of the number of budgets you can create. */
        def create(request: Accesstoken): Request[GoogleCloudBillingBudgetsV1Budget] = js.native
        def create(request: Alt, body: GoogleCloudBillingBudgetsV1Budget): Request[GoogleCloudBillingBudgetsV1Budget] = js.native
        
        /** Deletes a budget. Returns successfully if already deleted. */
        def delete(): Request[js.Object] = js.native
        def delete(request: Callback): Request[js.Object] = js.native
        
        /**
          * Returns a budget. WARNING: There are some fields exposed on the Google Cloud Console that aren't available on this API. When reading from the API, you will not see these fields in
          * the return value, though they may have been set in the Cloud Console.
          */
        def get(): Request[GoogleCloudBillingBudgetsV1Budget] = js.native
        def get(request: Callback): Request[GoogleCloudBillingBudgetsV1Budget] = js.native
        
        /**
          * Returns a list of budgets for a billing account. WARNING: There are some fields exposed on the Google Cloud Console that aren't available on this API. When reading from the API, you
          * will not see these fields in the return value, though they may have been set in the Cloud Console.
          */
        def list(): Request[GoogleCloudBillingBudgetsV1ListBudgetsResponse] = js.native
        def list(request: Fields): Request[GoogleCloudBillingBudgetsV1ListBudgetsResponse] = js.native
        
        /**
          * Updates a budget and returns the updated budget. WARNING: There are some fields exposed on the Google Cloud Console that aren't available on this API. Budget fields that are not
          * exposed in this API will not be changed by this method.
          */
        def patch(request: Key): Request[GoogleCloudBillingBudgetsV1Budget] = js.native
        def patch(request: Name, body: GoogleCloudBillingBudgetsV1Budget): Request[GoogleCloudBillingBudgetsV1Budget] = js.native
      }
      
      trait GoogleCloudBillingBudgetsV1Budget extends StObject {
        
        /** Required. Budgeted amount. */
        var amount: js.UndefOr[GoogleCloudBillingBudgetsV1BudgetAmount] = js.undefined
        
        /** Optional. Filters that define which resources are used to compute the actual spend against the budget. */
        var budgetFilter: js.UndefOr[GoogleCloudBillingBudgetsV1Filter] = js.undefined
        
        /** User data for display name in UI. The name must be less than or equal to 60 characters. */
        var displayName: js.UndefOr[String] = js.undefined
        
        /** Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An empty etag will cause an update to overwrite other changes. */
        var etag: js.UndefOr[String] = js.undefined
        
        /** Output only. Resource name of the budget. The resource name implies the scope of a budget. Values are of the form `billingAccounts/{billingAccountId}/budgets/{budgetId}`. */
        var name: js.UndefOr[String] = js.undefined
        
        /** Optional. Rules to apply to notifications sent based on budget spend and thresholds. */
        var notificationsRule: js.UndefOr[GoogleCloudBillingBudgetsV1NotificationsRule] = js.undefined
        
        /** Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend exceeds the specified percentages of the budget. */
        var thresholdRules: js.UndefOr[js.Array[GoogleCloudBillingBudgetsV1ThresholdRule]] = js.undefined
      }
      object GoogleCloudBillingBudgetsV1Budget {
        
        inline def apply(): GoogleCloudBillingBudgetsV1Budget = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleCloudBillingBudgetsV1Budget]
        }
        
        extension [Self <: GoogleCloudBillingBudgetsV1Budget](x: Self) {
          
          inline def setAmount(value: GoogleCloudBillingBudgetsV1BudgetAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
          
          inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
          
          inline def setBudgetFilter(value: GoogleCloudBillingBudgetsV1Filter): Self = StObject.set(x, "budgetFilter", value.asInstanceOf[js.Any])
          
          inline def setBudgetFilterUndefined: Self = StObject.set(x, "budgetFilter", js.undefined)
          
          inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
          
          inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
          
          inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
          
          inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setNotificationsRule(value: GoogleCloudBillingBudgetsV1NotificationsRule): Self = StObject.set(x, "notificationsRule", value.asInstanceOf[js.Any])
          
          inline def setNotificationsRuleUndefined: Self = StObject.set(x, "notificationsRule", js.undefined)
          
          inline def setThresholdRules(value: js.Array[GoogleCloudBillingBudgetsV1ThresholdRule]): Self = StObject.set(x, "thresholdRules", value.asInstanceOf[js.Any])
          
          inline def setThresholdRulesUndefined: Self = StObject.set(x, "thresholdRules", js.undefined)
          
          inline def setThresholdRulesVarargs(value: GoogleCloudBillingBudgetsV1ThresholdRule*): Self = StObject.set(x, "thresholdRules", js.Array(value :_*))
        }
      }
      
      trait GoogleCloudBillingBudgetsV1BudgetAmount extends StObject {
        
        /** Use the last period's actual spend as the budget for the present period. */
        var lastPeriodAmount: js.UndefOr[js.Any] = js.undefined
        
        /** A specified amount to use as the budget. `currency_code` is optional. If specified, it must match the currency of the billing account. The `currency_code` is provided on output. */
        var specifiedAmount: js.UndefOr[GoogleTypeMoney] = js.undefined
      }
      object GoogleCloudBillingBudgetsV1BudgetAmount {
        
        inline def apply(): GoogleCloudBillingBudgetsV1BudgetAmount = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleCloudBillingBudgetsV1BudgetAmount]
        }
        
        extension [Self <: GoogleCloudBillingBudgetsV1BudgetAmount](x: Self) {
          
          inline def setLastPeriodAmount(value: js.Any): Self = StObject.set(x, "lastPeriodAmount", value.asInstanceOf[js.Any])
          
          inline def setLastPeriodAmountUndefined: Self = StObject.set(x, "lastPeriodAmount", js.undefined)
          
          inline def setSpecifiedAmount(value: GoogleTypeMoney): Self = StObject.set(x, "specifiedAmount", value.asInstanceOf[js.Any])
          
          inline def setSpecifiedAmountUndefined: Self = StObject.set(x, "specifiedAmount", js.undefined)
        }
      }
      
      trait GoogleCloudBillingBudgetsV1Filter extends StObject {
        
        /**
          * Optional. If Filter.credit_types_treatment is INCLUDE_SPECIFIED_CREDITS, this is a list of credit types to be subtracted from gross cost to determine the spend for threshold
          * calculations. If Filter.credit_types_treatment is **not** INCLUDE_SPECIFIED_CREDITS, this field must be empty. See [a list of acceptable credit type
          * values](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type).
          */
        var creditTypes: js.UndefOr[js.Array[String]] = js.undefined
        
        /** Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`. */
        var creditTypesTreatment: js.UndefOr[String] = js.undefined
        
        /**
          * Optional. A single label and value pair specifying that usage from only this set of labeled resources should be included in the budget. Currently, multiple entries or multiple
          * values per entry are not allowed. If omitted, the report will include all labeled and unlabeled usage.
          */
        var labels: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: std.Array<any>}
          */ typings.maximMazurokGapiClientBillingbudgets.maximMazurokGapiClientBillingbudgetsStrings.GoogleCloudBillingBudgetsV1Filter & TopLevel[js.Any]
              ] = js.undefined
        
        /**
          * Optional. A set of projects of the form `projects/{project}`, specifying that usage from only this set of projects should be included in the budget. If omitted, the report will
          * include all usage for the billing account, regardless of which project the usage occurred on. Only zero or one project can be specified currently.
          */
        var projects: js.UndefOr[js.Array[String]] = js.undefined
        
        /**
          * Optional. A set of services of the form `services/{service_id}`, specifying that usage from only this set of services should be included in the budget. If omitted, the report will
          * include usage for all the services. The service names are available through the Catalog API: https://cloud.google.com/billing/v1/how-tos/catalog-api.
          */
        var services: js.UndefOr[js.Array[String]] = js.undefined
        
        /**
          * Optional. A set of subaccounts of the form `billingAccounts/{account_id}`, specifying that usage from only this set of subaccounts should be included in the budget. If a subaccount
          * is set to the name of the parent account, usage from the parent account will be included. If the field is omitted, the report will include usage from the parent account and all
          * subaccounts, if they exist.
          */
        var subaccounts: js.UndefOr[js.Array[String]] = js.undefined
      }
      object GoogleCloudBillingBudgetsV1Filter {
        
        inline def apply(): GoogleCloudBillingBudgetsV1Filter = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleCloudBillingBudgetsV1Filter]
        }
        
        extension [Self <: GoogleCloudBillingBudgetsV1Filter](x: Self) {
          
          inline def setCreditTypes(value: js.Array[String]): Self = StObject.set(x, "creditTypes", value.asInstanceOf[js.Any])
          
          inline def setCreditTypesTreatment(value: String): Self = StObject.set(x, "creditTypesTreatment", value.asInstanceOf[js.Any])
          
          inline def setCreditTypesTreatmentUndefined: Self = StObject.set(x, "creditTypesTreatment", js.undefined)
          
          inline def setCreditTypesUndefined: Self = StObject.set(x, "creditTypes", js.undefined)
          
          inline def setCreditTypesVarargs(value: String*): Self = StObject.set(x, "creditTypes", js.Array(value :_*))
          
          inline def setLabels(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: std.Array<any>}
            */ typings.maximMazurokGapiClientBillingbudgets.maximMazurokGapiClientBillingbudgetsStrings.GoogleCloudBillingBudgetsV1Filter & TopLevel[js.Any]
          ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
          
          inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
          
          inline def setProjects(value: js.Array[String]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
          
          inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
          
          inline def setProjectsVarargs(value: String*): Self = StObject.set(x, "projects", js.Array(value :_*))
          
          inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
          
          inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
          
          inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value :_*))
          
          inline def setSubaccounts(value: js.Array[String]): Self = StObject.set(x, "subaccounts", value.asInstanceOf[js.Any])
          
          inline def setSubaccountsUndefined: Self = StObject.set(x, "subaccounts", js.undefined)
          
          inline def setSubaccountsVarargs(value: String*): Self = StObject.set(x, "subaccounts", js.Array(value :_*))
        }
      }
      
      // tslint:disable-next-line:no-empty-interface
      trait GoogleCloudBillingBudgetsV1LastPeriodAmount extends StObject
      
      trait GoogleCloudBillingBudgetsV1ListBudgetsResponse extends StObject {
        
        /** List of the budgets owned by the requested billing account. */
        var budgets: js.UndefOr[js.Array[GoogleCloudBillingBudgetsV1Budget]] = js.undefined
        
        /** If not empty, indicates that there may be more budgets that match the request; this value should be passed in a new `ListBudgetsRequest`. */
        var nextPageToken: js.UndefOr[String] = js.undefined
      }
      object GoogleCloudBillingBudgetsV1ListBudgetsResponse {
        
        inline def apply(): GoogleCloudBillingBudgetsV1ListBudgetsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleCloudBillingBudgetsV1ListBudgetsResponse]
        }
        
        extension [Self <: GoogleCloudBillingBudgetsV1ListBudgetsResponse](x: Self) {
          
          inline def setBudgets(value: js.Array[GoogleCloudBillingBudgetsV1Budget]): Self = StObject.set(x, "budgets", value.asInstanceOf[js.Any])
          
          inline def setBudgetsUndefined: Self = StObject.set(x, "budgets", js.undefined)
          
          inline def setBudgetsVarargs(value: GoogleCloudBillingBudgetsV1Budget*): Self = StObject.set(x, "budgets", js.Array(value :_*))
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      trait GoogleCloudBillingBudgetsV1NotificationsRule extends StObject {
        
        /**
          * Optional. When set to true, disables default notifications sent when a threshold is exceeded. Default notifications are sent to those with Billing Account Administrator and Billing
          * Account User IAM roles for the target account.
          */
        var disableDefaultIamRecipients: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Optional. Targets to send notifications to when a threshold is exceeded. This is in addition to default recipients who have billing account IAM roles. The value is the full REST
          * resource name of a monitoring notification channel with the form `projects/{project_id}/notificationChannels/{channel_id}`. A maximum of 5 channels are allowed. See
          * https://cloud.google.com/billing/docs/how-to/budgets-notification-recipients for more details.
          */
        var monitoringNotificationChannels: js.UndefOr[js.Array[String]] = js.undefined
        
        /**
          * Optional. The name of the Pub/Sub topic where budget related messages will be published, in the form `projects/{project_id}/topics/{topic_id}`. Updates are sent at regular intervals
          * to the topic. The topic needs to be created before the budget is created; see https://cloud.google.com/billing/docs/how-to/budgets#manage-notifications for more details. Caller is
          * expected to have `pubsub.topics.setIamPolicy` permission on the topic when it's set for a budget, otherwise, the API call will fail with PERMISSION_DENIED. See
          * https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications for more details on Pub/Sub roles and permissions.
          */
        var pubsubTopic: js.UndefOr[String] = js.undefined
        
        /**
          * Optional. The schema version of the notification sent to `pubsub_topic`. Only "1.0" is accepted. It represents the JSON schema as defined in
          * https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#notification_format
          */
        var schemaVersion: js.UndefOr[String] = js.undefined
      }
      object GoogleCloudBillingBudgetsV1NotificationsRule {
        
        inline def apply(): GoogleCloudBillingBudgetsV1NotificationsRule = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleCloudBillingBudgetsV1NotificationsRule]
        }
        
        extension [Self <: GoogleCloudBillingBudgetsV1NotificationsRule](x: Self) {
          
          inline def setDisableDefaultIamRecipients(value: Boolean): Self = StObject.set(x, "disableDefaultIamRecipients", value.asInstanceOf[js.Any])
          
          inline def setDisableDefaultIamRecipientsUndefined: Self = StObject.set(x, "disableDefaultIamRecipients", js.undefined)
          
          inline def setMonitoringNotificationChannels(value: js.Array[String]): Self = StObject.set(x, "monitoringNotificationChannels", value.asInstanceOf[js.Any])
          
          inline def setMonitoringNotificationChannelsUndefined: Self = StObject.set(x, "monitoringNotificationChannels", js.undefined)
          
          inline def setMonitoringNotificationChannelsVarargs(value: String*): Self = StObject.set(x, "monitoringNotificationChannels", js.Array(value :_*))
          
          inline def setPubsubTopic(value: String): Self = StObject.set(x, "pubsubTopic", value.asInstanceOf[js.Any])
          
          inline def setPubsubTopicUndefined: Self = StObject.set(x, "pubsubTopic", js.undefined)
          
          inline def setSchemaVersion(value: String): Self = StObject.set(x, "schemaVersion", value.asInstanceOf[js.Any])
          
          inline def setSchemaVersionUndefined: Self = StObject.set(x, "schemaVersion", js.undefined)
        }
      }
      
      trait GoogleCloudBillingBudgetsV1ThresholdRule extends StObject {
        
        /** Optional. The type of basis used to determine if spend has passed the threshold. Behavior defaults to CURRENT_SPEND if not set. */
        var spendBasis: js.UndefOr[String] = js.undefined
        
        /** Required. Send an alert when this threshold is exceeded. This is a 1.0-based percentage, so 0.5 = 50%. Validation: non-negative number. */
        var thresholdPercent: js.UndefOr[Double] = js.undefined
      }
      object GoogleCloudBillingBudgetsV1ThresholdRule {
        
        inline def apply(): GoogleCloudBillingBudgetsV1ThresholdRule = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleCloudBillingBudgetsV1ThresholdRule]
        }
        
        extension [Self <: GoogleCloudBillingBudgetsV1ThresholdRule](x: Self) {
          
          inline def setSpendBasis(value: String): Self = StObject.set(x, "spendBasis", value.asInstanceOf[js.Any])
          
          inline def setSpendBasisUndefined: Self = StObject.set(x, "spendBasis", js.undefined)
          
          inline def setThresholdPercent(value: Double): Self = StObject.set(x, "thresholdPercent", value.asInstanceOf[js.Any])
          
          inline def setThresholdPercentUndefined: Self = StObject.set(x, "thresholdPercent", js.undefined)
        }
      }
      
      // tslint:disable-next-line:no-empty-interface
      trait GoogleProtobufEmpty extends StObject
      
      trait GoogleTypeMoney extends StObject {
        
        /** The three-letter currency code defined in ISO 4217. */
        var currencyCode: js.UndefOr[String] = js.undefined
        
        /**
          * Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and +999,999,999 inclusive. If `units` is positive, `nanos` must be positive or zero. If `units`
          * is zero, `nanos` can be positive, zero, or negative. If `units` is negative, `nanos` must be negative or zero. For example $-1.75 is represented as `units`=-1 and
          * `nanos`=-750,000,000.
          */
        var nanos: js.UndefOr[Double] = js.undefined
        
        /** The whole units of the amount. For example if `currencyCode` is `"USD"`, then 1 unit is one US dollar. */
        var units: js.UndefOr[String] = js.undefined
      }
      object GoogleTypeMoney {
        
        inline def apply(): GoogleTypeMoney = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GoogleTypeMoney]
        }
        
        extension [Self <: GoogleTypeMoney](x: Self) {
          
          inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
          
          inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
          
          inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
          
          inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
          
          inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
          
          inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
        }
      }
    }
  }
}
