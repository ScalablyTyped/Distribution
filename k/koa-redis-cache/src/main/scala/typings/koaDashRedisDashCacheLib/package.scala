package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashRedisDashCacheLib {
  type getPrefixCallback = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Koa.Context */ /* ctx */ js.Any, 
    java.lang.String
  ]
  type onErrorCallback = js.Function1[/* error */ nodeLib.Error, scala.Unit]
}
