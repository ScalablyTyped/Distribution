package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Broadcastid
import typings.instagramPrivateApi.liveObsSettingsMod.LiveRtmpSettings
import typings.instagramPrivateApi.mediaEntityOembedResponseMod.MediaEntityOembedResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/entities", JSImport.Namespace)
@js.native
object entitiesMod extends js.Object {
  @js.native
  class DirectThreadEntity ()
    extends typings.instagramPrivateApi.directThreadEntityMod.DirectThreadEntity
  
  @js.native
  class LiveEntity ()
    extends typings.instagramPrivateApi.liveEntityMod.LiveEntity
  
  @js.native
  class MediaEntity ()
    extends typings.instagramPrivateApi.mediaEntityMod.MediaEntity
  
  @js.native
  class ProfileEntity ()
    extends typings.instagramPrivateApi.profileEntityMod.ProfileEntity
  
  /* static members */
  @js.native
  object LiveEntity extends js.Object {
    def getUrlAndKey(info: Broadcastid): LiveRtmpSettings = js.native
  }
  
  /* static members */
  @js.native
  object MediaEntity extends js.Object {
    def oembed(url: String): js.Promise[MediaEntityOembedResponse] = js.native
  }
  
}

