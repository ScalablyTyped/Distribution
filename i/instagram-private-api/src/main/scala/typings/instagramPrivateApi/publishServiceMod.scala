package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Duration
import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.mediaRepositoryConfigureResponseMod.MediaRepositoryConfigureResponseRootObject
import typings.instagramPrivateApi.postingAlbumOptionsMod.PostingAlbumOptions
import typings.instagramPrivateApi.postingIgtvOptionsMod.PostingIgtvOptions
import typings.instagramPrivateApi.postingPhotoOptionsMod.PostingPhotoOptions
import typings.instagramPrivateApi.postingPhotoOptionsMod.PostingStoryPhotoOptions
import typings.instagramPrivateApi.postingVideoOptionsMod.PostingStoryVideoOptions
import typings.instagramPrivateApi.postingVideoOptionsMod.PostingVideoOptions
import typings.instagramPrivateApi.repositoryMod.Repository
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publishServiceMod {
  
  @JSImport("instagram-private-api/dist/services/publish.service", "PublishService")
  @js.native
  class PublishService protected () extends Repository {
    def this(client: IgApiClient) = this()
    
    def album(options: PostingAlbumOptions): js.Promise[_] = js.native
    
    var chance: js.Any = js.native
    
    def igtvVideo(options: PostingIgtvOptions): js.Promise[_] = js.native
    
    def photo(options: PostingPhotoOptions): js.Promise[MediaRepositoryConfigureResponseRootObject] = js.native
    
    var regularVideo: js.Any = js.native
    
    var segmentedVideo: js.Any = js.native
    
    def story(options: PostingStoryPhotoOptions): js.Promise[_] = js.native
    def story(options: PostingStoryVideoOptions): js.Promise[_] = js.native
    
    var uploadAndConfigureStoryPhoto: js.Any = js.native
    
    var uploadAndConfigureStoryVideo: js.Any = js.native
    
    def video(options: PostingVideoOptions): js.Promise[MediaRepositoryConfigureResponseRootObject] = js.native
  }
  /* static members */
  object PublishService {
    
    @JSImport("instagram-private-api/dist/services/publish.service", "PublishService")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("instagram-private-api/dist/services/publish.service", "PublishService.catchTranscodeError")
    @js.native
    def catchTranscodeError(videoInfo: js.Any, transcodeDelayInMs: Double): js.Function1[/* error */ js.Any, typings.bluebird.mod.^[Unit]] = js.native
    
    @JSImport("instagram-private-api/dist/services/publish.service", "PublishService.getMP4Duration")
    @js.native
    def getMP4Duration(buffer: Buffer): Double = js.native
    
    @JSImport("instagram-private-api/dist/services/publish.service", "PublishService.getVideoInfo")
    @js.native
    def getVideoInfo(buffer: Buffer): Duration = js.native
    
    @JSImport("instagram-private-api/dist/services/publish.service", "PublishService.makeLocationOptions")
    @js.native
    def makeLocationOptions: js.Any = js.native
    @scala.inline
    def makeLocationOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeLocationOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("instagram-private-api/dist/services/publish.service", "PublishService.publishDebug")
    @js.native
    def publishDebug: js.Any = js.native
    @scala.inline
    def publishDebug_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("publishDebug")(x.asInstanceOf[js.Any])
    
    @JSImport("instagram-private-api/dist/services/publish.service", "PublishService.read16")
    @js.native
    def read16: js.Any = js.native
    @scala.inline
    def read16_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("read16")(x.asInstanceOf[js.Any])
    
    @JSImport("instagram-private-api/dist/services/publish.service", "PublishService.read32")
    @js.native
    def read32: js.Any = js.native
    @scala.inline
    def read32_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("read32")(x.asInstanceOf[js.Any])
  }
}
