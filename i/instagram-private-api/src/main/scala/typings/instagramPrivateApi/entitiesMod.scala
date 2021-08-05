package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Broadcastid
import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.liveObsSettingsMod.LiveRtmpSettings
import typings.instagramPrivateApi.mediaEntityOembedResponseMod.MediaEntityOembedResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("instagram-private-api/dist/entities", "LiveEntity")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getUrlAndKey(info: Broadcastid): LiveRtmpSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrlAndKey")(info.asInstanceOf[js.Any]).asInstanceOf[LiveRtmpSettings]
  }
  
  @JSImport("instagram-private-api/dist/entities", "MediaEntity")
  @js.native
  class MediaEntity protected ()
    extends typings.instagramPrivateApi.mediaEntityMod.MediaEntity {
    def this(client: IgApiClient) = this()
  }
  /* static members */
  object MediaEntity {
    
    @JSImport("instagram-private-api/dist/entities", "MediaEntity")
    @js.native
    val ^ : js.Any = js.native
    
    inline def oembed(url: String): js.Promise[MediaEntityOembedResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("oembed")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MediaEntityOembedResponse]]
  }
  
  @JSImport("instagram-private-api/dist/entities", "ProfileEntity")
  @js.native
  class ProfileEntity protected ()
    extends typings.instagramPrivateApi.profileEntityMod.ProfileEntity {
    def this(client: IgApiClient) = this()
  }
}
