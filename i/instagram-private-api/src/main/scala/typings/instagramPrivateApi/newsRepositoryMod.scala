package typings.instagramPrivateApi

import typings.instagramPrivateApi.newsRepositoryInboxResponseMod.NewsRepositoryInboxResponseRootObject
import typings.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/news.repository", JSImport.Namespace)
@js.native
object newsRepositoryMod extends js.Object {
  @js.native
  class NewsRepository () extends Repository {
    def inbox(): js.Promise[NewsRepositoryInboxResponseRootObject] = js.native
  }
  
}

