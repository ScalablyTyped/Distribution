package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.fbsearchRepositoryPlacesResponseMod.FbsearchRepositoryPlacesResponseRootObject
import typings.instagramPrivateApi.fbsearchRepositoryTopsearchFlatResponseMod.FbsearchRepositoryTopsearchFlatResponseRootObject
import typings.instagramPrivateApi.instagramPrivateApiStrings.blended
import typings.instagramPrivateApi.instagramPrivateApiStrings.hashtags
import typings.instagramPrivateApi.instagramPrivateApiStrings.places
import typings.instagramPrivateApi.instagramPrivateApiStrings.users
import typings.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fbsearchRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/fbsearch.repository", "FbsearchRepository")
  @js.native
  class FbsearchRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
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
