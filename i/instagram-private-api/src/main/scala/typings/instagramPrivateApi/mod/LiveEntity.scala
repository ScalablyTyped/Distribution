package typings.instagramPrivateApi.mod

import typings.instagramPrivateApi.anon.Broadcastid
import typings.instagramPrivateApi.liveObsSettingsMod.LiveRtmpSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api", "LiveEntity")
@js.native
class LiveEntity protected ()
  extends typings.instagramPrivateApi.entitiesMod.LiveEntity {
  def this(client: typings.instagramPrivateApi.clientMod.IgApiClient) = this()
}
/* static members */
object LiveEntity {
  
  @JSImport("instagram-private-api", "LiveEntity.getUrlAndKey")
  @js.native
  def getUrlAndKey(info: Broadcastid): LiveRtmpSettings = js.native
}
