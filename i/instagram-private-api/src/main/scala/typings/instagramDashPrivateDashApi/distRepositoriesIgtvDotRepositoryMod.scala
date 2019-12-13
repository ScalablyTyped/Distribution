package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesIgtvDotSearchDotResponseMod.IgtvSearchResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesStatusDotResponseMod.StatusResponse
import typings.instagramDashPrivateDashApi.distTypesIgtvDotWriteDashSeenDashStateDotOptionsMod.IgtvWriteSeenStateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/igtv.repository", JSImport.Namespace)
@js.native
object distRepositoriesIgtvDotRepositoryMod extends js.Object {
  @js.native
  class IgtvRepository () extends Repository {
    def allUserSeries(user: String): js.Promise[_] = js.native
    def allUserSeries(user: String, data: js.Object): js.Promise[_] = js.native
    def allUserSeries(user: Double): js.Promise[_] = js.native
    def allUserSeries(user: Double, data: js.Object): js.Promise[_] = js.native
    def createSeries(title: String): js.Promise[_] = js.native
    def createSeries(title: String, description: String): js.Promise[_] = js.native
    def search(): js.Promise[IgtvSearchResponseRootObject] = js.native
    def search(query: String): js.Promise[IgtvSearchResponseRootObject] = js.native
    def seriesAddEpisode(series: String, mediaId: String): js.Promise[_] = js.native
    def seriesAddEpisode(series: Double, mediaId: String): js.Promise[_] = js.native
    def writeSeenState(options: IgtvWriteSeenStateOptions): js.Promise[StatusResponse] = js.native
  }
  
}

