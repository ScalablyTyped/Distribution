package typings.koaDashMorgan

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashMorganMod {
  type FormatFn = js.Function3[/* tokens */ TokenIndexer, /* req */ IncomingMessage, /* res */ ServerResponse, String]
  type StreamOptions = typings.morgan.morganMod.StreamOptions
  type TokenCallbackFn = js.Function3[
    /* req */ IncomingMessage, 
    /* res */ ServerResponse, 
    /* arg */ js.UndefOr[String | Double | Boolean], 
    String
  ]
  type TokenIndexer = typings.morgan.morganMod.TokenIndexer
}
