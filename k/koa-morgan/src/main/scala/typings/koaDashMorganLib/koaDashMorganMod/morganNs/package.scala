package typings
package koaDashMorganLib.koaDashMorganMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object morganNs {
  type FormatFn = js.Function3[
    /* tokens */ TokenIndexer, 
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    java.lang.String
  ]
  type StreamOptions = morganLib.morganMod.morganNs.StreamOptions
  type TokenCallbackFn = js.Function3[
    /* req */ nodeLib.httpMod.IncomingMessage, 
    /* res */ nodeLib.httpMod.ServerResponse, 
    /* arg */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean], 
    java.lang.String
  ]
  type TokenIndexer = morganLib.morganMod.morganNs.TokenIndexer
}
