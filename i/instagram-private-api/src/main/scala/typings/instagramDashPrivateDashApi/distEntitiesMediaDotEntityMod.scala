package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distResponsesMediaDotEntityDotOembedDotResponseMod.MediaEntityOembedResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/entities/media.entity", JSImport.Namespace)
@js.native
object distEntitiesMediaDotEntityMod extends js.Object {
  @js.native
  class MediaEntity () extends Repository
  
  /* static members */
  @js.native
  object MediaEntity extends js.Object {
    def oembed(url: String): js.Promise[MediaEntityOembedResponse] = js.native
  }
  
}

