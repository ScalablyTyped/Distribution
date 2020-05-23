package typings.hlsJs.anon

import typings.hlsJs.mod.K_KEY_SYSTEM_ERROR
import typings.hlsJs.mod.K_MEDIA_ERROR
import typings.hlsJs.mod.K_MUX_ERROR
import typings.hlsJs.mod.K_NETWORK_ERROR
import typings.hlsJs.mod.K_OTHER_ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KEYSYSTEMERROR extends js.Object {
  /**
    * EME (encrypted media extensions) errors
    */
  var KEY_SYSTEM_ERROR: K_KEY_SYSTEM_ERROR
  /**
    * Identifier for a media Error (video/parsing/mediasource error)
    */
  var MEDIA_ERROR: K_MEDIA_ERROR
  /**
    * Identifier for a mux Error (demuxing/remuxing)
    */
  var MUX_ERROR: K_MUX_ERROR
  /**
    * Identifier for a network error (loading error / timeout ...)
    */
  var NETWORK_ERROR: K_NETWORK_ERROR
  /**
    * Identifier for all other errors
    */
  var OTHER_ERROR: K_OTHER_ERROR
}

object KEYSYSTEMERROR {
  @scala.inline
  def apply(
    KEY_SYSTEM_ERROR: K_KEY_SYSTEM_ERROR,
    MEDIA_ERROR: K_MEDIA_ERROR,
    MUX_ERROR: K_MUX_ERROR,
    NETWORK_ERROR: K_NETWORK_ERROR,
    OTHER_ERROR: K_OTHER_ERROR
  ): KEYSYSTEMERROR = {
    val __obj = js.Dynamic.literal(KEY_SYSTEM_ERROR = KEY_SYSTEM_ERROR.asInstanceOf[js.Any], MEDIA_ERROR = MEDIA_ERROR.asInstanceOf[js.Any], MUX_ERROR = MUX_ERROR.asInstanceOf[js.Any], NETWORK_ERROR = NETWORK_ERROR.asInstanceOf[js.Any], OTHER_ERROR = OTHER_ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[KEYSYSTEMERROR]
  }
}

