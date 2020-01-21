package typings.instagramPrivateApi

import typings.instagramPrivateApi.repositoryMod.Repository
import typings.instagramPrivateApi.statusResponseMod.StatusResponse
import typings.instagramPrivateApi.storiesTypesMod.StoryServiceInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/services/story.service", JSImport.Namespace)
@js.native
object storyServiceMod extends js.Object {
  @js.native
  class StoryService () extends Repository {
    def seen(input: StoryServiceInput): js.Promise[StatusResponse] = js.native
    def seen(input: StoryServiceInput, sourceId: String): js.Promise[StatusResponse] = js.native
  }
  
}

