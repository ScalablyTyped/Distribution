package typings
package koaDashSendLib.koaDashSendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sendNs {
  type SetHeaders = js.Function3[
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* path */ java.lang.String, 
    /* stats */ nodeLib.fsMod.Stats, 
    js.Any
  ]
}
