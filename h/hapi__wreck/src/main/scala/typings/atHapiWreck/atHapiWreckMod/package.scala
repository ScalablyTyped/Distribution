package typings.atHapiWreck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiWreckMod {
  import typings.atHapiWreck.Anon_Payload
  import typings.atHapiWreck.Anon_Req

  type RequestCallback = js.Function2[/* uri */ String, /* options */ RequestOptions with Anon_Payload, Unit]
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[typings.atHapiBoom.atHapiBoomMod.^[js.Any]], 
    /* details */ Anon_Req, 
    Unit
  ]
}
