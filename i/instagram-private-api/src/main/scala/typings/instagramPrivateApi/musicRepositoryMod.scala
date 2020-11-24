package typings.instagramPrivateApi

import typings.instagramPrivateApi.commonTypesMod.IgAppModule
import typings.instagramPrivateApi.musicRepositoryGenresResponseMod.MusicRepositoryGenresResponseRootObject
import typings.instagramPrivateApi.musicRepositoryLyricsResponseMod.MusicRepositoryLyricsResponseRootObject
import typings.instagramPrivateApi.musicRepositoryMoodsResponseMod.MusicRepositoryMoodsResponseRootObject
import typings.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/repositories/music.repository", JSImport.Namespace)
@js.native
object musicRepositoryMod extends js.Object {
  
  @js.native
  class MusicRepository () extends Repository {
    
    def genres(): js.Promise[MusicRepositoryGenresResponseRootObject] = js.native
    def genres(product: IgAppModule): js.Promise[MusicRepositoryGenresResponseRootObject] = js.native
    
    def lyrics(trackId: String): js.Promise[MusicRepositoryLyricsResponseRootObject] = js.native
    def lyrics(trackId: Double): js.Promise[MusicRepositoryLyricsResponseRootObject] = js.native
    
    def moods(): js.Promise[MusicRepositoryMoodsResponseRootObject] = js.native
    def moods(product: IgAppModule): js.Promise[MusicRepositoryMoodsResponseRootObject] = js.native
  }
}
