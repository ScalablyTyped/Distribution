package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.fbsearchRepositoryPlacesResponseMod.FbsearchRepositoryPlacesResponseItemsItem
import typings.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponseHashtag
import typings.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponseListItem
import typings.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponsePlace
import typings.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponseUser
import typings.instagramPrivateApi.locationRepositorySearchResponseMod.LocationRepositorySearchResponseVenuesItem
import typings.instagramPrivateApi.repositoryMod.Repository
import typings.instagramPrivateApi.tagRepositorySearchResponseMod.TagRepositorySearchResponseResultsItem
import typings.instagramPrivateApi.userRepositorySearchResponseMod.UserRepositorySearchResponseUsersItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchServiceMod {
  
  @JSImport("instagram-private-api/dist/services/search.service", "SearchService")
  @js.native
  class SearchService protected () extends Repository {
    def this(client: IgApiClient) = this()
    
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
