package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotCreateDashReelDotResponseMod.HighlightsRepositoryCreateReelResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotEditDashReelDotResponseMod.HighlightsRepositoryEditReelResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesHighlightsDotRepositoryDotHighlightsDashTrayDotResponseMod.HighlightsRepositoryHighlightsTrayResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesStatusDotResponseMod.StatusResponse
import typings.instagramDashPrivateDashApi.distTypesCreateDashHighlightsDashReelDotOptionsMod.CreateHighlightsReelOptions
import typings.instagramDashPrivateDashApi.distTypesEditDashHighlightsDashReelDotOptionsMod.EditHighlightsReelOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/highlights.repository", JSImport.Namespace)
@js.native
object distRepositoriesHighlightsDotRepositoryMod extends js.Object {
  @js.native
  class HighlightsRepository () extends Repository {
    def createReel(options: CreateHighlightsReelOptions): js.Promise[HighlightsRepositoryCreateReelResponseRootObject] = js.native
    def deleteReel(highlightId: String): js.Promise[StatusResponse] = js.native
    def editReel(options: EditHighlightsReelOptions): js.Promise[HighlightsRepositoryEditReelResponseRootObject] = js.native
    def highlightsTray(userId: String): js.Promise[HighlightsRepositoryHighlightsTrayResponseRootObject] = js.native
    def highlightsTray(userId: Double): js.Promise[HighlightsRepositoryHighlightsTrayResponseRootObject] = js.native
  }
  
}

