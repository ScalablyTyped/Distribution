package typings.hoxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Filter[T] = typings.std.RegExp | typings.hoxy.mod.TesterFunction[T] | T
  type InterceptionHandler = js.ThisFunction3[
    /* this */ typings.hoxy.mod.Proxy, 
    /* req */ typings.hoxy.mod.Request, 
    /* res */ typings.hoxy.mod.Response, 
    /* cycle */ typings.hoxy.mod.Cycle, 
    js.Promise[scala.Unit] | scala.Unit
  ]
  type LoggerCallbackFunction = js.Function1[/* log */ typings.hoxy.mod.Log, js.Any]
  type PossibleErrorCallback = js.Function1[/* err */ js.UndefOr[typings.std.Error], js.Any]
  type TesterFunction[T] = js.Function1[/* arg */ T, scala.Boolean]
}
