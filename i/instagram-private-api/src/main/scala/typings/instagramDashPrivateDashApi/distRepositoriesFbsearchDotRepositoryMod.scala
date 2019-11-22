package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotPlacesDotResponseMod.FbsearchRepositoryPlacesResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod.FbsearchRepositoryTopsearchFlatResponseRootObject
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.blended
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.hashtags
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.places
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/fbsearch.repository", JSImport.Namespace)
@js.native
object distRepositoriesFbsearchDotRepositoryMod extends js.Object {
  @js.native
  class FbsearchRepository () extends Repository {
    def places(query: String): js.Promise[FbsearchRepositoryPlacesResponseRootObject] = js.native
    def recentSearches(): js.Promise[_] = js.native
    @JSName("suggestedSearches")
    def suggestedSearches_blended(`type`: blended): js.Promise[_] = js.native
    @JSName("suggestedSearches")
    def suggestedSearches_hashtags(`type`: hashtags): js.Promise[_] = js.native
    @JSName("suggestedSearches")
    def suggestedSearches_places(`type`: places): js.Promise[_] = js.native
    @JSName("suggestedSearches")
    def suggestedSearches_users(`type`: users): js.Promise[_] = js.native
    def topsearchFlat(query: String): js.Promise[FbsearchRepositoryTopsearchFlatResponseRootObject] = js.native
  }
  
}

