package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Data
import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.insightsOptionsMod.AccountInsightsOptions
import typings.instagramPrivateApi.insightsServiceAccountResponseMod.InsightsServiceAccountResponseRootObject
import typings.instagramPrivateApi.insightsServicePostResponseMod.InsightsServicePostResponseRootObject
import typings.instagramPrivateApi.repositoryMod.Repository
import typings.instagramPrivateApi.storiesInsightsFeedResponseMod.StoriesInsightsFeedResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insightsServiceMod {
  
  @JSImport("instagram-private-api/dist/services/insights.service", "InsightsService")
  @js.native
  class InsightsService protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def account(options: AccountInsightsOptions): js.Promise[InsightsServiceAccountResponseRootObject] = js.native
    
    def igtv(mediaId: String): js.Promise[Data] = js.native
    
    def post(mediaId: String): js.Promise[InsightsServicePostResponseRootObject] = js.native
    
    def story(storyId: String): js.Promise[StoriesInsightsFeedResponseRootObject] = js.native
  }
}
