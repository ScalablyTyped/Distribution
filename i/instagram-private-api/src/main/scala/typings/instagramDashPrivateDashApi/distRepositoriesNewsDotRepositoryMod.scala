package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesNewsDotRepositoryDotInboxDotResponseMod.NewsRepositoryInboxResponseRootObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/news.repository", JSImport.Namespace)
@js.native
object distRepositoriesNewsDotRepositoryMod extends js.Object {
  @js.native
  class NewsRepository () extends Repository {
    def inbox(): js.Promise[NewsRepositoryInboxResponseRootObject] = js.native
  }
  
}

