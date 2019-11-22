package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesMusicDotRepositoryDotGenresDotResponseMod.MusicRepositoryGenresResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesMusicDotRepositoryDotLyricsDotResponseMod.MusicRepositoryLyricsResponseRootObject
import typings.instagramDashPrivateDashApi.distResponsesMusicDotRepositoryDotMoodsDotResponseMod.MusicRepositoryMoodsResponseRootObject
import typings.instagramDashPrivateDashApi.distTypesCommonDotTypesMod.IgAppModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/music.repository", JSImport.Namespace)
@js.native
object distRepositoriesMusicDotRepositoryMod extends js.Object {
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

