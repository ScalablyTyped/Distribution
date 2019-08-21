package typings.jssip.jssipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jssip", "RTCSession")
@js.native
object RTCSessionNs extends js.Object {
  @js.native
  class DTMF () extends js.Object {
    var duration: Double = js.native
    var tone: String = js.native
  }
  
  @js.native
  class Info () extends js.Object {
    var body: String = js.native
    var contentType: String = js.native
  }
  
}

