package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesStatusDotResponseMod.StatusResponse
import typings.instagramDashPrivateDashApi.distTypesStoriesDotTypesMod.StoryServiceInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/services/story.service", JSImport.Namespace)
@js.native
object distServicesStoryDotServiceMod extends js.Object {
  @js.native
  class StoryService () extends Repository {
    def seen(input: StoryServiceInput): js.Promise[StatusResponse] = js.native
    def seen(input: StoryServiceInput, sourceId: String): js.Promise[StatusResponse] = js.native
  }
  
}

