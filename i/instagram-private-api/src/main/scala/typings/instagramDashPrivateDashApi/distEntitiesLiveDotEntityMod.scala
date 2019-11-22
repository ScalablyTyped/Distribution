package typings.instagramDashPrivateDashApi

import typings.instagramDashPrivateDashApi.distCoreRepositoryMod.Repository
import typings.instagramDashPrivateDashApi.distTypesLiveDotObsDashSettingsMod.LiveRtmpSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/entities/live.entity", JSImport.Namespace)
@js.native
object distEntitiesLiveDotEntityMod extends js.Object {
  @js.native
  class LiveEntity () extends Repository
  
  /* static members */
  @js.native
  object LiveEntity extends js.Object {
    def getUrlAndKey(info: Anon_Broadcastid): LiveRtmpSettings = js.native
  }
  
}

