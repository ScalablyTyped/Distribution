package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.createHighlightsReelOptionsMod.CreateHighlightsReelOptions
import typings.instagramPrivateApi.editHighlightsReelOptionsMod.EditHighlightsReelOptions
import typings.instagramPrivateApi.highlightsRepositoryCreateReelResponseMod.HighlightsRepositoryCreateReelResponseRootObject
import typings.instagramPrivateApi.highlightsRepositoryEditReelResponseMod.HighlightsRepositoryEditReelResponseRootObject
import typings.instagramPrivateApi.highlightsRepositoryHighlightsTrayResponseMod.HighlightsRepositoryHighlightsTrayResponseRootObject
import typings.instagramPrivateApi.repositoryMod.Repository
import typings.instagramPrivateApi.statusResponseMod.StatusResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightsRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/highlights.repository", "HighlightsRepository")
  @js.native
  class HighlightsRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def createReel(options: CreateHighlightsReelOptions): js.Promise[HighlightsRepositoryCreateReelResponseRootObject] = js.native
    
    def deleteReel(highlightId: String): js.Promise[StatusResponse] = js.native
    
    def editReel(options: EditHighlightsReelOptions): js.Promise[HighlightsRepositoryEditReelResponseRootObject] = js.native
    
    def highlightsTray(userId: String): js.Promise[HighlightsRepositoryHighlightsTrayResponseRootObject] = js.native
    def highlightsTray(userId: Double): js.Promise[HighlightsRepositoryHighlightsTrayResponseRootObject] = js.native
  }
}
