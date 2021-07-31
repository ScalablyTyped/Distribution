package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Broadcastid
import typings.instagramPrivateApi.clientMod.IgApiClient
import typings.instagramPrivateApi.entityMod.Entity
import typings.instagramPrivateApi.liveObsSettingsMod.LiveRtmpSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveEntityMod {
  
  @JSImport("instagram-private-api/dist/entities/live.entity", "LiveEntity")
  @js.native
  class LiveEntity protected () extends Entity {
    def this(client: IgApiClient) = this()
  }
  /* static members */
  object LiveEntity {
    
    @JSImport("instagram-private-api/dist/entities/live.entity", "LiveEntity")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getUrlAndKey(info: Broadcastid): LiveRtmpSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrlAndKey")(info.asInstanceOf[js.Any]).asInstanceOf[LiveRtmpSettings]
  }
}
