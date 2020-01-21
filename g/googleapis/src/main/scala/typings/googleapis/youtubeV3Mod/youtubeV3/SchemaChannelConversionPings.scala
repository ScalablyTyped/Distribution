package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The conversionPings object encapsulates information about conversion pings
  * that need to be respected by the channel.
  */
@js.native
trait SchemaChannelConversionPings extends js.Object {
  /**
    * Pings that the app shall fire (authenticated by biscotti cookie). Each
    * ping has a context, in which the app must fire the ping, and a url
    * identifying the ping.
    */
  var pings: js.UndefOr[js.Array[SchemaChannelConversionPing]] = js.native
}

object SchemaChannelConversionPings {
  @scala.inline
  def apply(pings: js.Array[SchemaChannelConversionPing] = null): SchemaChannelConversionPings = {
    val __obj = js.Dynamic.literal()
    if (pings != null) __obj.updateDynamic("pings")(pings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChannelConversionPings]
  }
}

