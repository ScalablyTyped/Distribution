package typings.koaMorgan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormatFn = js.Function3[
    /* tokens */ typings.koaMorgan.mod.TokenIndexer, 
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* res */ typings.node.httpMod.ServerResponse, 
    java.lang.String
  ]
  type StreamOptions = typings.morgan.mod.StreamOptions
  type TokenCallbackFn = js.Function3[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* res */ typings.node.httpMod.ServerResponse, 
    /* arg */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean], 
    java.lang.String
  ]
  type TokenIndexer = typings.morgan.mod.TokenIndexer[typings.node.httpMod.IncomingMessage, typings.node.httpMod.ServerResponse]
}
