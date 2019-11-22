package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotPlacesDotResponseMod.FbsearchRepositoryPlacesResponseItemsItem
import typings.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod.FbsearchRepositoryTopsearchFlatResponseHashtag
import typings.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod.FbsearchRepositoryTopsearchFlatResponseListItem
import typings.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod.FbsearchRepositoryTopsearchFlatResponsePlace
import typings.instagramDashPrivateDashApi.distResponsesFbsearchDotRepositoryDotTopsearchDashFlatDotResponseMod.FbsearchRepositoryTopsearchFlatResponseUser
import typings.instagramDashPrivateDashApi.distResponsesLocationDotRepositoryDotSearchDotResponseMod.LocationRepositorySearchResponseVenuesItem
import typings.instagramDashPrivateDashApi.distResponsesTagDotRepositoryDotSearchDotResponseMod.TagRepositorySearchResponseResultsItem
import typings.instagramDashPrivateDashApi.distResponsesUserDotRepositoryDotSearchDotResponseMod.UserRepositorySearchResponseUsersItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/services/search.service", JSImport.Namespace)
@js.native
object distServicesSearchDotServiceMod extends js.Object {
  @js.native
  class SearchService () extends Repository {
    def blended(query: String): js.Promise[js.Array[FbsearchRepositoryTopsearchFlatResponseListItem]] = js.native
    def blendedItems(query: String): js.Promise[
        js.Array[
          FbsearchRepositoryTopsearchFlatResponsePlace | FbsearchRepositoryTopsearchFlatResponseHashtag | FbsearchRepositoryTopsearchFlatResponseUser
        ]
      ] = js.native
    def location(latitude: Double, longitude: Double): js.Promise[js.Array[LocationRepositorySearchResponseVenuesItem]] = js.native
    def location(latitude: Double, longitude: Double, query: String): js.Promise[js.Array[LocationRepositorySearchResponseVenuesItem]] = js.native
    def places(query: String): js.Promise[js.Array[FbsearchRepositoryPlacesResponseItemsItem]] = js.native
    def tags(query: String): js.Promise[js.Array[TagRepositorySearchResponseResultsItem]] = js.native
    def users(query: String): js.Promise[js.Array[UserRepositorySearchResponseUsersItem]] = js.native
  }
  
}

