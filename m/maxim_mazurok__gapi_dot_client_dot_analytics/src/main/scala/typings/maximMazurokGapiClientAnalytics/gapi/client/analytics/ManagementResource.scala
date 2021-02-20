package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagementResource extends StObject {
  
  var accountSummaries: AccountSummariesResource = js.native
  
  var accountUserLinks: AccountUserLinksResource = js.native
  
  var accounts: AccountsResource = js.native
  
  var clientId: ClientIdResource = js.native
  
  var customDataSources: CustomDataSourcesResource = js.native
  
  var customDimensions: CustomDimensionsResource = js.native
  
  var customMetrics: CustomMetricsResource = js.native
  
  var experiments: ExperimentsResource = js.native
  
  var filters: FiltersResource = js.native
  
  var goals: GoalsResource = js.native
  
  var profileFilterLinks: ProfileFilterLinksResource = js.native
  
  var profileUserLinks: ProfileUserLinksResource = js.native
  
  var profiles: ProfilesResource = js.native
  
  var remarketingAudience: RemarketingAudienceResource = js.native
  
  var segments: SegmentsResource = js.native
  
  var unsampledReports: UnsampledReportsResource = js.native
  
  var uploads: UploadsResource = js.native
  
  var webPropertyAdWordsLinks: WebPropertyAdWordsLinksResource = js.native
  
  var webproperties: WebpropertiesResource = js.native
  
  var webpropertyUserLinks: WebpropertyUserLinksResource = js.native
}
object ManagementResource {
  
  @scala.inline
  def apply(
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
  implicit class ManagementResourceMutableBuilder[Self <: ManagementResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountSummaries(value: AccountSummariesResource): Self = StObject.set(x, "accountSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUserLinks(value: AccountUserLinksResource): Self = StObject.set(x, "accountUserLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccounts(value: AccountsResource): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: ClientIdResource): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataSources(value: CustomDataSourcesResource): Self = StObject.set(x, "customDataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDimensions(value: CustomDimensionsResource): Self = StObject.set(x, "customDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMetrics(value: CustomMetricsResource): Self = StObject.set(x, "customMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperiments(value: ExperimentsResource): Self = StObject.set(x, "experiments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: FiltersResource): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoals(value: GoalsResource): Self = StObject.set(x, "goals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileFilterLinks(value: ProfileFilterLinksResource): Self = StObject.set(x, "profileFilterLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUserLinks(value: ProfileUserLinksResource): Self = StObject.set(x, "profileUserLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfiles(value: ProfilesResource): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarketingAudience(value: RemarketingAudienceResource): Self = StObject.set(x, "remarketingAudience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegments(value: SegmentsResource): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsampledReports(value: UnsampledReportsResource): Self = StObject.set(x, "unsampledReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploads(value: UploadsResource): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyAdWordsLinks(value: WebPropertyAdWordsLinksResource): Self = StObject.set(x, "webPropertyAdWordsLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebproperties(value: WebpropertiesResource): Self = StObject.set(x, "webproperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebpropertyUserLinks(value: WebpropertyUserLinksResource): Self = StObject.set(x, "webpropertyUserLinks", value.asInstanceOf[js.Any])
  }
}
