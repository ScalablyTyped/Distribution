package typings.hlsJs.anon

import typings.hlsJs.mod.K_KEY_SYSTEM_ERROR
import typings.hlsJs.mod.K_MEDIA_ERROR
import typings.hlsJs.mod.K_MUX_ERROR
import typings.hlsJs.mod.K_NETWORK_ERROR
import typings.hlsJs.mod.K_OTHER_ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KEYSYSTEMERROR extends js.Object {
  /**
    * EME (encrypted media extensions) errors
    */
  var KEY_SYSTEM_ERROR: K_KEY_SYSTEM_ERROR = js.native
  /**
    * Identifier for a media Error (video/parsing/mediasource error)
    */
  var MEDIA_ERROR: K_MEDIA_ERROR = js.native
  /**
    * Identifier for a mux Error (demuxing/remuxing)
    */
  var MUX_ERROR: K_MUX_ERROR = js.native
  /**
    * Identifier for a network error (loading error / timeout ...)
    */
  var NETWORK_ERROR: K_NETWORK_ERROR = js.native
  /**
    * Identifier for all other errors
    */
  var OTHER_ERROR: K_OTHER_ERROR = js.native
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
  @scala.inline
  implicit class KEYSYSTEMERROROps[Self <: KEYSYSTEMERROR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKEY_SYSTEM_ERROR(value: K_KEY_SYSTEM_ERROR): Self = this.set("KEY_SYSTEM_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setMEDIA_ERROR(value: K_MEDIA_ERROR): Self = this.set("MEDIA_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setMUX_ERROR(value: K_MUX_ERROR): Self = this.set("MUX_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setNETWORK_ERROR(value: K_NETWORK_ERROR): Self = this.set("NETWORK_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setOTHER_ERROR(value: K_OTHER_ERROR): Self = this.set("OTHER_ERROR", value.asInstanceOf[js.Any])
  }
  
}

