package typings
package hlsDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KEYSYSTEMERROR extends js.Object {
  /**
    * EME (encrypted media extensions) errors
    */
  var KEY_SYSTEM_ERROR: hlsDotJsLib.hlsDotJsMod.K_KEY_SYSTEM_ERROR
  /**
    * Identifier for a media Error (video/parsing/mediasource error)
    */
  var MEDIA_ERROR: hlsDotJsLib.hlsDotJsMod.K_MEDIA_ERROR
  /**
    * Identifier for a mux Error (demuxing/remuxing)
    */
  var MUX_ERROR: hlsDotJsLib.hlsDotJsMod.K_MUX_ERROR
  /**
    * Identifier for a network error (loading error / timeout ...)
    */
  var NETWORK_ERROR: hlsDotJsLib.hlsDotJsMod.K_NETWORK_ERROR
  /**
    * Identifier for all other errors
    */
  var OTHER_ERROR: hlsDotJsLib.hlsDotJsMod.K_OTHER_ERROR
}

object Anon_KEYSYSTEMERROR {
  @scala.inline
  def apply(
    KEY_SYSTEM_ERROR: hlsDotJsLib.hlsDotJsMod.K_KEY_SYSTEM_ERROR,
    MEDIA_ERROR: hlsDotJsLib.hlsDotJsMod.K_MEDIA_ERROR,
    MUX_ERROR: hlsDotJsLib.hlsDotJsMod.K_MUX_ERROR,
    NETWORK_ERROR: hlsDotJsLib.hlsDotJsMod.K_NETWORK_ERROR,
    OTHER_ERROR: hlsDotJsLib.hlsDotJsMod.K_OTHER_ERROR
  ): Anon_KEYSYSTEMERROR = {
    val __obj = js.Dynamic.literal(KEY_SYSTEM_ERROR = KEY_SYSTEM_ERROR, MEDIA_ERROR = MEDIA_ERROR, MUX_ERROR = MUX_ERROR, NETWORK_ERROR = NETWORK_ERROR, OTHER_ERROR = OTHER_ERROR)
  
    __obj.asInstanceOf[Anon_KEYSYSTEMERROR]
  }
}

