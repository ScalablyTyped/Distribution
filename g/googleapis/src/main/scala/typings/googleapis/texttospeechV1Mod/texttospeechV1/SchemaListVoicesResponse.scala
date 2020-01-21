package typings.googleapis.texttospeechV1Mod.texttospeechV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The message returned to the client by the `ListVoices` method.
  */
@js.native
trait SchemaListVoicesResponse extends js.Object {
  /**
    * The list of voices.
    */
  var voices: js.UndefOr[js.Array[SchemaVoice]] = js.native
}

object SchemaListVoicesResponse {
  @scala.inline
  def apply(voices: js.Array[SchemaVoice] = null): SchemaListVoicesResponse = {
    val __obj = js.Dynamic.literal()
    if (voices != null) __obj.updateDynamic("voices")(voices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListVoicesResponse]
  }
}

