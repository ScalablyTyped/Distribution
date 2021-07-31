package typings.maximMazurokGapiClientAdmin

import org.scalablytyped.runtime.TopLevel
import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAdmin.anon.Accesstoken
import typings.maximMazurokGapiClientAdmin.anon.ActorIpAddress
import typings.maximMazurokGapiClientAdmin.anon.Alt
import typings.maximMazurokGapiClientAdmin.anon.ApplicationName
import typings.maximMazurokGapiClientAdmin.anon.Callback
import typings.maximMazurokGapiClientAdmin.anon.CallerType
import typings.maximMazurokGapiClientAdmin.anon.Code
import typings.maximMazurokGapiClientAdmin.anon.CustomerId
import typings.maximMazurokGapiClientAdmin.anon.Date
import typings.maximMazurokGapiClientAdmin.anon.DatetimeValue
import typings.maximMazurokGapiClientAdmin.anon.EntityKey
import typings.maximMazurokGapiClientAdmin.anon.Fields
import typings.maximMazurokGapiClientAdmin.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object admin {
      
      trait Activities extends StObject {
        
        /** ETag of the resource. */
        var etag: js.UndefOr[String] = js.undefined
        
        /** Each activity record in the response. */
        var items: js.UndefOr[js.Array[Activity]] = js.undefined
        
        /** The type of API resource. For an activity report, the value is reports#activities. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** Token for retrieving the follow-on next page of the report. The nextPageToken value is used in the request's pageToken query string. */
        var nextPageToken: js.UndefOr[String] = js.undefined
      }
      object Activities {
        
        @scala.inline
        def apply(): Activities = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Activities]
        }
        
        @scala.inline
        implicit class ActivitiesMutableBuilder[Self <: Activities] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
          
          @scala.inline
          def setItems(value: js.Array[Activity]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
          
          @scala.inline
          def setItemsVarargs(value: Activity*): Self = StObject.set(x, "items", js.Array(value :_*))
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          @scala.inline
          def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      @js.native
      trait ActivitiesResource extends StObject {
        
        /**
          * Retrieves a list of activities for a specific customer's account and application such as the Admin console application or the Google Drive application. For more information, see the
          * guides for administrator and Google Drive activity reports. For more information about the activity report's parameters, see the activity parameters reference guides.
          */
        def list(): Request[Activities] = js.native
        def list(request: Accesstoken): Request[Activities] = js.native
        
        def watch(request: Accesstoken, body: Channel): Request[Channel] = js.native
        /** Start receiving notifications for account activities. For more information, see Receiving Push Notifications. */
        def watch(request: ActorIpAddress): Request[Channel] = js.native
      }
      
      trait Activity extends StObject {
        
        /** User doing the action. */
        var actor: js.UndefOr[CallerType] = js.undefined
        
        /** ETag of the entry. */
        var etag: js.UndefOr[String] = js.undefined
        
        /** Activity events in the report. */
        var events: js.UndefOr[js.Array[Name]] = js.undefined
        
        /** Unique identifier for each activity record. */
        var id: js.UndefOr[ApplicationName] = js.undefined
        
        /**
          * IP address of the user doing the action. This is the Internet Protocol (IP) address of the user when logging into G Suite which may or may not reflect the user's physical location.
          * For example, the IP address can be the user's proxy server's address or a virtual private network (VPN) address. The API supports IPv4 and IPv6.
          */
        var ipAddress: js.UndefOr[String] = js.undefined
        
        /** The type of API resource. For an activity report, the value is audit#activity. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** This is the domain that is affected by the report's event. For example domain of Admin console or the Drive application's document owner. */
        var ownerDomain: js.UndefOr[String] = js.undefined
      }
      object Activity {
        
        @scala.inline
        def apply(): Activity = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Activity]
        }
        
        @scala.inline
        implicit class ActivityMutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setActor(value: CallerType): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
          
          @scala.inline
          def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
          
          @scala.inline
          def setEvents(value: js.Array[Name]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
          
          @scala.inline
          def setEventsVarargs(value: Name*): Self = StObject.set(x, "events", js.Array(value :_*))
          
          @scala.inline
          def setId(value: ApplicationName): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
          
          @scala.inline
          def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          @scala.inline
          def setOwnerDomain(value: String): Self = StObject.set(x, "ownerDomain", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOwnerDomainUndefined: Self = StObject.set(x, "ownerDomain", js.undefined)
        }
      }
      
      trait Channel extends StObject {
        
        /** The address where notifications are delivered for this channel. */
        var address: js.UndefOr[String] = js.undefined
        
        /** Date and time of notification channel expiration, expressed as a Unix timestamp, in milliseconds. Optional. */
        var expiration: js.UndefOr[String] = js.undefined
        
        /** A UUID or similar unique string that identifies this channel. */
        var id: js.UndefOr[String] = js.undefined
        
        /** Identifies this as a notification channel used to watch for changes to a resource, which is "api#channel". */
        var kind: js.UndefOr[String] = js.undefined
        
        /** Additional parameters controlling delivery channel behavior. Optional. */
        var params: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: string}
          */ typings.maximMazurokGapiClientAdmin.maximMazurokGapiClientAdminStrings.Channel & TopLevel[js.Any]
              ] = js.undefined
        
        /** A Boolean value to indicate whether payload is wanted. Optional. */
        var payload: js.UndefOr[Boolean] = js.undefined
        
        /** An opaque ID that identifies the resource being watched on this channel. Stable across different API versions. */
        var resourceId: js.UndefOr[String] = js.undefined
        
        /** A version-specific identifier for the watched resource. */
        var resourceUri: js.UndefOr[String] = js.undefined
        
        /** An arbitrary string delivered to the target address with each notification delivered over this channel. Optional. */
        var token: js.UndefOr[String] = js.undefined
        
        /** The type of delivery mechanism used for this channel. */
        var `type`: js.UndefOr[String] = js.undefined
      }
      object Channel {
        
        @scala.inline
        def apply(): Channel = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Channel]
        }
        
        @scala.inline
        implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
          
          @scala.inline
          def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
          
          @scala.inline
          def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          @scala.inline
          def setParams(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: string}
            */ typings.maximMazurokGapiClientAdmin.maximMazurokGapiClientAdminStrings.Channel & TopLevel[js.Any]
          ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
          
          @scala.inline
          def setPayload(value: Boolean): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
          
          @scala.inline
          def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
          
          @scala.inline
          def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
          
          @scala.inline
          def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
          
          @scala.inline
          def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        }
      }
      
      @js.native
      trait ChannelsResource extends StObject {
        
        /** Stop watching resources through this channel. */
        def stop(request: Alt): Request[Unit] = js.native
        def stop(request: Callback, body: Channel): Request[Unit] = js.native
      }
      
      @js.native
      trait CustomerUsageReportsResource extends StObject {
        
        /**
          * Retrieves a report which is a collection of properties and statistics for a specific customer's account. For more information, see the Customers Usage Report guide. For more
          * information about the customer report's parameters, see the Customers Usage parameters reference guides.
          */
        def get(): Request[UsageReports] = js.native
        def get(request: Date): Request[UsageReports] = js.native
      }
      
      @js.native
      trait EntityUsageReportsResource extends StObject {
        
        /**
          * Retrieves a report which is a collection of properties and statistics for entities used by users within the account. For more information, see the Entities Usage Report guide. For
          * more information about the entities report's parameters, see the Entities Usage parameters reference guides.
          */
        def get(): Request[UsageReports] = js.native
        def get(request: EntityKey): Request[UsageReports] = js.native
      }
      
      trait NestedParameter extends StObject {
        
        /** Boolean value of the parameter. */
        var boolValue: js.UndefOr[Boolean] = js.undefined
        
        /** Integer value of the parameter. */
        var intValue: js.UndefOr[String] = js.undefined
        
        /** Multiple boolean values of the parameter. */
        var multiBoolValue: js.UndefOr[js.Array[Boolean]] = js.undefined
        
        /** Multiple integer values of the parameter. */
        var multiIntValue: js.UndefOr[js.Array[String]] = js.undefined
        
        /** Multiple string values of the parameter. */
        var multiValue: js.UndefOr[js.Array[String]] = js.undefined
        
        /** The name of the parameter. */
        var name: js.UndefOr[String] = js.undefined
        
        /** String value of the parameter. */
        var value: js.UndefOr[String] = js.undefined
      }
      object NestedParameter {
        
        @scala.inline
        def apply(): NestedParameter = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[NestedParameter]
        }
        
        @scala.inline
        implicit class NestedParameterMutableBuilder[Self <: NestedParameter] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
          
          @scala.inline
          def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
          
          @scala.inline
          def setMultiBoolValue(value: js.Array[Boolean]): Self = StObject.set(x, "multiBoolValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMultiBoolValueUndefined: Self = StObject.set(x, "multiBoolValue", js.undefined)
          
          @scala.inline
          def setMultiBoolValueVarargs(value: Boolean*): Self = StObject.set(x, "multiBoolValue", js.Array(value :_*))
          
          @scala.inline
          def setMultiIntValue(value: js.Array[String]): Self = StObject.set(x, "multiIntValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMultiIntValueUndefined: Self = StObject.set(x, "multiIntValue", js.undefined)
          
          @scala.inline
          def setMultiIntValueVarargs(value: String*): Self = StObject.set(x, "multiIntValue", js.Array(value :_*))
          
          @scala.inline
          def setMultiValue(value: js.Array[String]): Self = StObject.set(x, "multiValue", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
          
          @scala.inline
          def setMultiValueVarargs(value: String*): Self = StObject.set(x, "multiValue", js.Array(value :_*))
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          @scala.inline
          def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        }
      }
      
      trait UsageReport extends StObject {
        
        /** Output only. The date of the report request. */
        var date: js.UndefOr[String] = js.undefined
        
        /** Output only. Information about the type of the item. */
        var entity: js.UndefOr[CustomerId] = js.undefined
        
        /** ETag of the resource. */
        var etag: js.UndefOr[String] = js.undefined
        
        /** The type of API resource. For a usage report, the value is admin#reports#usageReport. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** Output only. Parameter value pairs for various applications. For the Customers usage report parameters and values, see the customer usage parameters reference. */
        var parameters: js.UndefOr[js.Array[DatetimeValue]] = js.undefined
      }
      object UsageReport {
        
        @scala.inline
        def apply(): UsageReport = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[UsageReport]
        }
        
        @scala.inline
        implicit class UsageReportMutableBuilder[Self <: UsageReport] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
          
          @scala.inline
          def setEntity(value: CustomerId): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
          
          @scala.inline
          def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          @scala.inline
          def setParameters(value: js.Array[DatetimeValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
          
          @scala.inline
          def setParametersVarargs(value: DatetimeValue*): Self = StObject.set(x, "parameters", js.Array(value :_*))
        }
      }
      
      trait UsageReports extends StObject {
        
        /** ETag of the resource. */
        var etag: js.UndefOr[String] = js.undefined
        
        /** The type of API resource. For a usage report, the value is admin#reports#usageReports. */
        var kind: js.UndefOr[String] = js.undefined
        
        /**
          * Token to specify next page. A report with multiple pages has a nextPageToken property in the response. For your follow-on requests getting all of the report's pages, enter the
          * nextPageToken value in the pageToken query string.
          */
        var nextPageToken: js.UndefOr[String] = js.undefined
        
        /** Various application parameter records. */
        var usageReports: js.UndefOr[js.Array[UsageReport]] = js.undefined
        
        /** Warnings, if any. */
        var warnings: js.UndefOr[js.Array[Code]] = js.undefined
      }
      object UsageReports {
        
        @scala.inline
        def apply(): UsageReports = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[UsageReports]
        }
        
        @scala.inline
        implicit class UsageReportsMutableBuilder[Self <: UsageReports] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
          
          @scala.inline
          def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          @scala.inline
          def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
          
          @scala.inline
          def setUsageReports(value: js.Array[UsageReport]): Self = StObject.set(x, "usageReports", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUsageReportsUndefined: Self = StObject.set(x, "usageReports", js.undefined)
          
          @scala.inline
          def setUsageReportsVarargs(value: UsageReport*): Self = StObject.set(x, "usageReports", js.Array(value :_*))
          
          @scala.inline
          def setWarnings(value: js.Array[Code]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
          
          @scala.inline
          def setWarningsVarargs(value: Code*): Self = StObject.set(x, "warnings", js.Array(value :_*))
        }
      }
      
      @js.native
      trait UserUsageReportResource extends StObject {
        
        /**
          * Retrieves a report which is a collection of properties and statistics for a set of users with the account. For more information, see the User Usage Report guide. For more
          * information about the user report's parameters, see the Users Usage parameters reference guides.
          */
        def get(): Request[UsageReports] = js.native
        def get(request: Fields): Request[UsageReports] = js.native
      }
    }
  }
}
