package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Broadcastid
import typings.instagramPrivateApi.liveObsSettingsMod.LiveRtmpSettings
import typings.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/entities/live.entity", JSImport.Namespace)
@js.native
object liveEntityMod extends js.Object {
  
  @js.native
  class LiveEntity () extends Repository
  /* static members */
  @js.native
  object LiveEntity extends js.Object {
    
    def getUrlAndKey(info: Broadcastid): LiveRtmpSettings = js.native
  }
}
