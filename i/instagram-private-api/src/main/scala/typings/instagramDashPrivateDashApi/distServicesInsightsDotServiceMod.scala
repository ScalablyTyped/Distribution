package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotAccountDotResponseMod.InsightsServiceAccountResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesInsightsDotServiceDotPostDotResponseMod.InsightsServicePostResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesStoriesDashInsightsDotFeedDotResponseMod.StoriesInsightsFeedResponseRootObject
import typings.instagramDashPrivateDashApi.distTypesInsightsDotOptionsMod.AccountInsightsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/services/insights.service", JSImport.Namespace)
@js.native
object distServicesInsightsDotServiceMod extends js.Object {
  @js.native
  class InsightsService () extends Repository {
    def account(options: AccountInsightsOptions): js.Promise[InsightsServiceAccountResponseRootObject] = js.native
    def post(mediaId: String): js.Promise[InsightsServicePostResponseRootObject] = js.native
    def story(storyId: String): js.Promise[StoriesInsightsFeedResponseRootObject] = js.native
  }
  
}

