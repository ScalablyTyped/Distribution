package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Offset
import typings.instagramPrivateApi.anon.RuploadParams
import typings.instagramPrivateApi.anon.StreamId_
import typings.instagramPrivateApi.anon.Streamid
import typings.instagramPrivateApi.repositoryMod.Repository
import typings.instagramPrivateApi.uploadPhotoOptionsMod.UploadPhotoOptions
import typings.instagramPrivateApi.uploadRepositoryPhotoResponseMod.UploadRepositoryPhotoResponseRootObject
import typings.instagramPrivateApi.uploadVideoOptionsMod.UploadRetryContext
import typings.instagramPrivateApi.uploadVideoOptionsMod.UploadVideoOptions
import typings.instagramPrivateApi.uploadVideoOptionsMod.UploadVideoSegmentInitOptions
import typings.instagramPrivateApi.uploadVideoOptionsMod.UploadVideoSegmentTransferOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/repositories/upload.repository", JSImport.Namespace)
@js.native
object uploadRepositoryMod extends js.Object {
  @js.native
  class UploadRepository () extends Repository {
    var chance: js.Any = js.native
    var getBaseHeaders: js.Any = js.native
    def endSegmentedVideo(hasRuploadParamsStreamId: StreamId_): js.Promise[_] = js.native
    def initVideo(hasNameRuploadParamsWaterfallId: RuploadParams): js.Promise[Offset] = js.native
    def photo(options: UploadPhotoOptions): js.Promise[UploadRepositoryPhotoResponseRootObject] = js.native
    def startSegmentedVideo(ruploadParams: js.Any): js.Promise[Streamid] = js.native
    def video(options: UploadVideoOptions): js.Promise[_] = js.native
    def videoSegmentInit(options: UploadVideoSegmentInitOptions): js.Promise[Offset] = js.native
    def videoSegmentTransfer(options: UploadVideoSegmentTransferOptions): js.Promise[_] = js.native
  }
  
  /* static members */
  @js.native
  object UploadRepository extends js.Object {
    var createPhotoRuploadParams: js.Any = js.native
    var uploadDebug: js.Any = js.native
    def createVideoRuploadParams(options: UploadVideoOptions, uploadId: String): js.Any = js.native
    def createVideoRuploadParams(options: UploadVideoOptions, uploadId: String, retryContext: UploadRetryContext): js.Any = js.native
    def createVideoRuploadParams(options: UploadVideoOptions, uploadId: Double): js.Any = js.native
    def createVideoRuploadParams(options: UploadVideoOptions, uploadId: Double, retryContext: UploadRetryContext): js.Any = js.native
  }
  
}

