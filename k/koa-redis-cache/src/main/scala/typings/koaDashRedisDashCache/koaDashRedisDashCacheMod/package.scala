package typings.koaDashRedisDashCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashRedisDashCacheMod {
  import typings.koa.koaMod.Context
  import typings.std.Error

  type getPrefixCallback = js.Function1[/* ctx */ Context, String]
  type onErrorCallback = js.Function1[/* error */ Error, Unit]
}
