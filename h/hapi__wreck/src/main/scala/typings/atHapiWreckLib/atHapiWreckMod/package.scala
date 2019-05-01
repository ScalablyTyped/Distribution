package typings
package atHapiWreckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiWreckMod {
  type RequestCallback = js.Function2[
    /* uri */ java.lang.String, 
    /* options */ RequestOptions with atHapiWreckLib.Anon_Payload, 
    scala.Unit
  ]
  type ResponseCallback = js.Function2[
    /* err */ js.UndefOr[atHapiBoomLib.atHapiBoomMod.^[js.Any]], 
    /* details */ atHapiWreckLib.Anon_Req, 
    scala.Unit
  ]
}
