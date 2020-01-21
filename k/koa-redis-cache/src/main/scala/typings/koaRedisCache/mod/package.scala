package typings.koaRedisCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type getPrefixCallback = js.Function1[/* ctx */ typings.koa.mod.Context, java.lang.String]
  type onErrorCallback = js.Function1[/* error */ typings.std.Error, scala.Unit]
}
