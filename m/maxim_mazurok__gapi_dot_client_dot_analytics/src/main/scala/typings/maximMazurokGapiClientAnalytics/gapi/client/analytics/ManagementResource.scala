package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagementResource extends StObject {
  
  var accountSummaries: AccountSummariesResource
  
  var accountUserLinks: AccountUserLinksResource
  
  var accounts: AccountsResource
  
  var clientId: ClientIdResource
  
  var customDataSources: CustomDataSourcesResource
  
  var customDimensions: CustomDimensionsResource
  
  var customMetrics: CustomMetricsResource
  
  var experiments: ExperimentsResource
  
  var filters: FiltersResource
  
  var goals: GoalsResource
  
  var profileFilterLinks: ProfileFilterLinksResource
  
  var profileUserLinks: ProfileUserLinksResource
  
  var profiles: ProfilesResource
  
  var remarketingAudience: RemarketingAudienceResource
  
  var segments: SegmentsResource
  
  var unsampledReports: UnsampledReportsResource
  
  var uploads: UploadsResource
  
  var webPropertyAdWordsLinks: WebPropertyAdWordsLinksResource
  
  var webproperties: WebpropertiesResource
  
  var webpropertyUserLinks: WebpropertyUserLinksResource
}
object ManagementResource {
  
  inline def apply(
    accountSummaries: AccountSummariesResource,
    accountUserLinks: AccountUserLinksResource,
    accounts: AccountsResource,
    clientId: ClientIdResource,
    customDataSources: CustomDataSourcesResource,
    customDimensions: CustomDimensionsResource,
    customMetrics: CustomMetricsResource,
    experiments: ExperimentsResource,
    filters: FiltersResource,
    goals: GoalsResource,
    profileFilterLinks: ProfileFilterLinksResource,
    profileUserLinks: ProfileUserLinksResource,
    profiles: ProfilesResource,
    remarketingAudience: RemarketingAudienceResource,
    segments: SegmentsResource,
    unsampledReports: UnsampledReportsResource,
    uploads: UploadsResource,
    webPropertyAdWordsLinks: WebPropertyAdWordsLinksResource,
    webproperties: WebpropertiesResource,
    webpropertyUserLinks: WebpropertyUserLinksResource
  ): ManagementResource = {
    val __obj = js.Dynamic.literal(accountSummaries = accountSummaries.asInstanceOf[js.Any], accountUserLinks = accountUserLinks.asInstanceOf[js.Any], accounts = accounts.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], customDataSources = customDataSources.asInstanceOf[js.Any], customDimensions = customDimensions.asInstanceOf[js.Any], customMetrics = customMetrics.asInstanceOf[js.Any], experiments = experiments.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], goals = goals.asInstanceOf[js.Any], profileFilterLinks = profileFilterLinks.asInstanceOf[js.Any], profileUserLinks = profileUserLinks.asInstanceOf[js.Any], profiles = profiles.asInstanceOf[js.Any], remarketingAudience = remarketingAudience.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], unsampledReports = unsampledReports.asInstanceOf[js.Any], uploads = uploads.asInstanceOf[js.Any], webPropertyAdWordsLinks = webPropertyAdWordsLinks.asInstanceOf[js.Any], webproperties = webproperties.asInstanceOf[js.Any], webpropertyUserLinks = webpropertyUserLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagementResource] (val x: Self) extends AnyVal {
    
    inline def setAccountSummaries(value: AccountSummariesResource): Self = StObject.set(x, "accountSummaries", value.asInstanceOf[js.Any])
    
    inline def setAccountUserLinks(value: AccountUserLinksResource): Self = StObject.set(x, "accountUserLinks", value.asInstanceOf[js.Any])
    
    inline def setAccounts(value: AccountsResource): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: ClientIdResource): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setCustomDataSources(value: CustomDataSourcesResource): Self = StObject.set(x, "customDataSources", value.asInstanceOf[js.Any])
    
    inline def setCustomDimensions(value: CustomDimensionsResource): Self = StObject.set(x, "customDimensions", value.asInstanceOf[js.Any])
    
    inline def setCustomMetrics(value: CustomMetricsResource): Self = StObject.set(x, "customMetrics", value.asInstanceOf[js.Any])
    
    inline def setExperiments(value: ExperimentsResource): Self = StObject.set(x, "experiments", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: FiltersResource): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setGoals(value: GoalsResource): Self = StObject.set(x, "goals", value.asInstanceOf[js.Any])
    
    inline def setProfileFilterLinks(value: ProfileFilterLinksResource): Self = StObject.set(x, "profileFilterLinks", value.asInstanceOf[js.Any])
    
    inline def setProfileUserLinks(value: ProfileUserLinksResource): Self = StObject.set(x, "profileUserLinks", value.asInstanceOf[js.Any])
    
    inline def setProfiles(value: ProfilesResource): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setRemarketingAudience(value: RemarketingAudienceResource): Self = StObject.set(x, "remarketingAudience", value.asInstanceOf[js.Any])
    
    inline def setSegments(value: SegmentsResource): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setUnsampledReports(value: UnsampledReportsResource): Self = StObject.set(x, "unsampledReports", value.asInstanceOf[js.Any])
    
    inline def setUploads(value: UploadsResource): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyAdWordsLinks(value: WebPropertyAdWordsLinksResource): Self = StObject.set(x, "webPropertyAdWordsLinks", value.asInstanceOf[js.Any])
    
    inline def setWebproperties(value: WebpropertiesResource): Self = StObject.set(x, "webproperties", value.asInstanceOf[js.Any])
    
    inline def setWebpropertyUserLinks(value: WebpropertyUserLinksResource): Self = StObject.set(x, "webpropertyUserLinks", value.asInstanceOf[js.Any])
  }
}
