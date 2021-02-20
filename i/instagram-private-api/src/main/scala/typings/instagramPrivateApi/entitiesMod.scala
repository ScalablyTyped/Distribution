package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Broadcastid
import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.liveObsSettingsMod.LiveRtmpSettings
import typings.instagramPrivateApi.mediaEntityOembedResponseMod.MediaEntityOembedResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitiesMod {
  
  @JSImport("instagram-private-api/dist/entities", "DirectThreadEntity")
  @js.native
  class DirectThreadEntity protected ()
    extends typings.instagramPrivateApi.directThreadEntityMod.DirectThreadEntity {
    def this(client: IgApiClient) = this()
  }
  
  @JSImport("instagram-private-api/dist/entities", "LiveEntity")
  @js.native
  class LiveEntity protected ()
    extends typings.instagramPrivateApi.liveEntityMod.LiveEntity {
    def this(client: IgApiClient) = this()
  }
  /* static members */
  object LiveEntity {
    
    @JSImport("instagram-private-api/dist/entities", "LiveEntity.getUrlAndKey")
    @js.native
    def getUrlAndKey(info: Broadcastid): LiveRtmpSettings = js.native
  }
  
  @JSImport("instagram-private-api/dist/entities", "MediaEntity")
  @js.native
  class MediaEntity protected ()
    extends typings.instagramPrivateApi.mediaEntityMod.MediaEntity {
    def this(client: IgApiClient) = this()
  }
  /* static members */
  object MediaEntity {
    
    @JSImport("instagram-private-api/dist/entities", "MediaEntity.oembed")
    @js.native
    def oembed(url: String): js.Promise[MediaEntityOembedResponse] = js.native
  }
  
  @JSImport("instagram-private-api/dist/entities", "ProfileEntity")
  @js.native
  class ProfileEntity protected ()
    extends typings.instagramPrivateApi.profileEntityMod.ProfileEntity {
    def this(client: IgApiClient) = this()
  }
}
