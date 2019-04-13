package typings
package koaDashMorganLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashMorganMod {
  type FormatFn = js.Function3[
    /* tokens */ TokenIndexer, 
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    java.lang.String
  ]
  type StreamOptions = morganLib.morganMod.StreamOptions
  type TokenCallbackFn = js.Function3[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* arg */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean], 
    java.lang.String
  ]
  type TokenIndexer = morganLib.morganMod.TokenIndexer
}
