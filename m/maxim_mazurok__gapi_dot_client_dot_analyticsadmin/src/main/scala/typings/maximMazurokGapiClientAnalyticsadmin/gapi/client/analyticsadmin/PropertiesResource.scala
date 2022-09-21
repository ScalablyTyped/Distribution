package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAnalyticsadmin.anon.CallbackEntity
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Entity
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Filter
import typings.maximMazurokGapiClientAnalyticsadmin.anon.KeyNameOauthtoken
import typings.maximMazurokGapiClientAnalyticsadmin.anon.KeyOauthtokenPrettyPrint
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Name
import typings.maximMazurokGapiClientAnalyticsadmin.anon.NameOauthtokenPrettyPrint
import typings.maximMazurokGapiClientAnalyticsadmin.anon.OauthtokenPrettyPrintQuotaUser
import typings.maximMazurokGapiClientAnalyticsadmin.anon.PrettyPrintProperty
import typings.maximMazurokGapiClientAnalyticsadmin.anon.PrettyPrintQuotaUserResource
import typings.maximMazurokGapiClientAnalyticsadmin.anon.Property
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UpdateMask
import typings.maximMazurokGapiClientAnalyticsadmin.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertiesResource extends StObject {
  
  def acknowledgeUserDataCollection(
    request: PrettyPrintProperty,
    body: GoogleAnalyticsAdminV1alphaAcknowledgeUserDataCollectionRequest
  ): Request[js.Object] = js.native
  /**
    * Acknowledges the terms of user data collection for the specified property. This acknowledgement must be completed (either in the Google Analytics UI or via this API) before
    * MeasurementProtocolSecret resources may be created.
    */
  def acknowledgeUserDataCollection(request: Property): Request[js.Object] = js.native
  
  var audiences: AudiencesResource = js.native
  
  var conversionEvents: ConversionEventsResource = js.native
  
  /** Creates an "GA4" property with the specified location and attributes. */
  def create(request: KeyOauthtokenPrettyPrint): Request[GoogleAnalyticsAdminV1alphaProperty] = js.native
  def create(request: UploadType, body: GoogleAnalyticsAdminV1alphaProperty): Request[GoogleAnalyticsAdminV1alphaProperty] = js.native
  
  var customDimensions: CustomDimensionsResource = js.native
  
  var customMetrics: CustomMetricsResource = js.native
  
  var dataStreams: DataStreamsResource = js.native
  
  /**
    * Marks target Property as soft-deleted (ie: "trashed") and returns it. This API does not have a method to restore soft-deleted properties. However, they can be restored using the
    * Trash Can UI. If the properties are not restored before the expiration time, the Property and all child resources (eg: GoogleAdsLinks, Streams, UserLinks) will be permanently
    * purged. https://support.google.com/analytics/answer/6154772 Returns an error if the target is not found, or is not an GA4 Property.
    */
  def delete(): Request[GoogleAnalyticsAdminV1alphaProperty] = js.native
  def delete(request: Name): Request[GoogleAnalyticsAdminV1alphaProperty] = js.native
  
  var displayVideo360AdvertiserLinkProposals: DisplayVideo360AdvertiserLinkProposalsResource = js.native
  
  var displayVideo360AdvertiserLinks: DisplayVideo360AdvertiserLinksResource = js.native
  
  var firebaseLinks: FirebaseLinksResource = js.native
  
  /** Lookup for a single "GA4" Property. */
  def get(): Request[GoogleAnalyticsAdminV1alphaProperty] = js.native
  def get(request: Name): Request[GoogleAnalyticsAdminV1alphaProperty] = js.native
  
  /** Lookup for a AttributionSettings singleton. */
  def getAttributionSettings(): Request[GoogleAnalyticsAdminV1alphaAttributionSettings] = js.native
  def getAttributionSettings(request: Name): Request[GoogleAnalyticsAdminV1alphaAttributionSettings] = js.native
  
  /** Returns the singleton data retention settings for this property. */
  def getDataRetentionSettings(): Request[GoogleAnalyticsAdminV1alphaDataRetentionSettings] = js.native
  def getDataRetentionSettings(request: Name): Request[GoogleAnalyticsAdminV1alphaDataRetentionSettings] = js.native
  
  /** Lookup for Google Signals settings for a property. */
  def getGoogleSignalsSettings(): Request[GoogleAnalyticsAdminV1alphaGoogleSignalsSettings] = js.native
  def getGoogleSignalsSettings(request: Name): Request[GoogleAnalyticsAdminV1alphaGoogleSignalsSettings] = js.native
  
  var googleAdsLinks: GoogleAdsLinksResource = js.native
  
  /**
    * Returns child Properties under the specified parent Account. Only "GA4" properties will be returned. Properties will be excluded if the caller does not have access. Soft-deleted
    * (ie: "trashed") properties are excluded by default. Returns an empty list if no relevant properties are found.
    */
  def list(): Request[GoogleAnalyticsAdminV1alphaListPropertiesResponse] = js.native
  def list(request: Filter): Request[GoogleAnalyticsAdminV1alphaListPropertiesResponse] = js.native
  
  /** Updates a property. */
  def patch(request: KeyNameOauthtoken): Request[GoogleAnalyticsAdminV1alphaProperty] = js.native
  def patch(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaProperty): Request[GoogleAnalyticsAdminV1alphaProperty] = js.native
  
  def runAccessReport(request: CallbackEntity, body: GoogleAnalyticsAdminV1alphaRunAccessReportRequest): Request[GoogleAnalyticsAdminV1alphaRunAccessReportResponse] = js.native
  /**
    * Returns a customized report of data access records. The report provides records of each time a user reads Google Analytics reporting data. Access records are retained for up to 2
    * years. Data Access Reports can be requested for a property. The property must be in Google Analytics 360. This method is only available to Administrators. These data access records
    * include GA4 UI Reporting, GA4 UI Explorations, GA4 Data API, and other products like Firebase & Admob that can retrieve data from Google Analytics through a linkage. These records
    * don't include property configuration changes like adding a stream or changing a property's time zone. For configuration change history, see
    * [searchChangeHistoryEvents](https://developers.google.com/analytics/devguides/config/admin/v1/rest/v1alpha/accounts/searchChangeHistoryEvents).
    */
  def runAccessReport(request: Entity): Request[GoogleAnalyticsAdminV1alphaRunAccessReportResponse] = js.native
  
  /** Updates attribution settings on a property. */
  def updateAttributionSettings(request: NameOauthtokenPrettyPrint): Request[GoogleAnalyticsAdminV1alphaAttributionSettings] = js.native
  def updateAttributionSettings(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaAttributionSettings): Request[GoogleAnalyticsAdminV1alphaAttributionSettings] = js.native
  
  /** Updates the singleton data retention settings for this property. */
  def updateDataRetentionSettings(request: OauthtokenPrettyPrintQuotaUser): Request[GoogleAnalyticsAdminV1alphaDataRetentionSettings] = js.native
  def updateDataRetentionSettings(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaDataRetentionSettings): Request[GoogleAnalyticsAdminV1alphaDataRetentionSettings] = js.native
  
  /** Updates Google Signals settings for a property. */
  def updateGoogleSignalsSettings(request: PrettyPrintQuotaUserResource): Request[GoogleAnalyticsAdminV1alphaGoogleSignalsSettings] = js.native
  def updateGoogleSignalsSettings(request: UpdateMask, body: GoogleAnalyticsAdminV1alphaGoogleSignalsSettings): Request[GoogleAnalyticsAdminV1alphaGoogleSignalsSettings] = js.native
  
  var userLinks: UserLinksResource = js.native
}
