package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.repositoryMod.Repository
import typings.instagramPrivateApi.tagRepositorySearchResponseMod.TagRepositorySearchResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/tag.repository", "TagRepository")
  @js.native
  class TagRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def search(q: String): js.Promise[TagRepositorySearchResponseRootObject] = js.native
    
    def section(q: String, tab: String): js.Promise[TagRepositorySearchResponseRootObject] = js.native
  }
}
