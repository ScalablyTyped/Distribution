package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Data
import typings.instagramPrivateApi.insightsOptionsMod.AccountInsightsOptions
import typings.instagramPrivateApi.insightsServiceAccountResponseMod.InsightsServiceAccountResponseRootObject
import typings.instagramPrivateApi.insightsServicePostResponseMod.InsightsServicePostResponseRootObject
import typings.instagramPrivateApi.repositoryMod.Repository
import typings.instagramPrivateApi.storiesInsightsFeedResponseMod.StoriesInsightsFeedResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/services/insights.service", JSImport.Namespace)
@js.native
object insightsServiceMod extends js.Object {
  @js.native
  class InsightsService () extends Repository {
    def account(options: AccountInsightsOptions): js.Promise[InsightsServiceAccountResponseRootObject] = js.native
    def igtv(mediaId: String): js.Promise[Data] = js.native
    def post(mediaId: String): js.Promise[InsightsServicePostResponseRootObject] = js.native
    def story(storyId: String): js.Promise[StoriesInsightsFeedResponseRootObject] = js.native
  }
  
}

