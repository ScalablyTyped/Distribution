package typings.instagramPrivateApi.mod

import typings.instagramPrivateApi.anon.Broadcastid
import typings.instagramPrivateApi.liveObsSettingsMod.LiveRtmpSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api", "LiveEntity")
@js.native
class LiveEntity ()
  extends typings.instagramPrivateApi.entitiesMod.LiveEntity

/* static members */
@JSImport("instagram-private-api", "LiveEntity")
@js.native
object LiveEntity extends js.Object {
  def getUrlAndKey(info: Broadcastid): LiveRtmpSettings = js.native
}

