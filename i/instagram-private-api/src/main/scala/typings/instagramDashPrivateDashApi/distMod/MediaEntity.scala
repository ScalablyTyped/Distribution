package typings.instagramDashPrivateDashApi.distMod

import typings.instagramDashPrivateDashApi.distResponsesMediaDotEntityDotOembedDotResponseMod.MediaEntityOembedResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist", "MediaEntity")
@js.native
class MediaEntity ()
  extends typings.instagramDashPrivateDashApi.distEntitiesMod.MediaEntity

/* static members */
@JSImport("instagram-private-api/dist", "MediaEntity")
@js.native
object MediaEntity extends js.Object {
  def oembed(url: String): js.Promise[MediaEntityOembedResponse] = js.native
}

