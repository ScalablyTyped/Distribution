package typings.instagramPrivateApi

import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import typings.instagramPrivateApi.musicRepositoryGenresResponseMod.MusicRepositoryGenresResponseRootObject
import typings.instagramPrivateApi.musicRepositoryLyricsResponseMod.MusicRepositoryLyricsResponseRootObject
import typings.instagramPrivateApi.musicRepositoryMoodsResponseMod.MusicRepositoryMoodsResponseRootObject
import typings.instagramPrivateApi.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicRepositoryMod {
  
  @JSImport("instagram-private-api/dist/repositories/music.repository", "MusicRepository")
  @js.native
  class MusicRepository protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def genres(): js.Promise[MusicRepositoryGenresResponseRootObject] = js.native
    def genres(product: IgAppModule): js.Promise[MusicRepositoryGenresResponseRootObject] = js.native
    
    def lyrics(trackId: String): js.Promise[MusicRepositoryLyricsResponseRootObject] = js.native
    def lyrics(trackId: Double): js.Promise[MusicRepositoryLyricsResponseRootObject] = js.native
    
    def moods(): js.Promise[MusicRepositoryMoodsResponseRootObject] = js.native
    def moods(product: IgAppModule): js.Promise[MusicRepositoryMoodsResponseRootObject] = js.native
  }
}
