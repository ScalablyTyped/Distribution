package typings
package logfmtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object logfmtMod {
  type HTTPHandler = js.Function3[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    js.Any
  ]
  type RequestLoggerFormatter = js.Function2[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    js.Object
  ]
}
