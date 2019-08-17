package typings.gulpDashIntercept

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashInterceptMod {
  import typings.node.NodeJSNs.ReadWriteStream
  import typings.vinyl.vinylMod.File

  type Intercept = js.Function1[/* interceptFunction */ InterceptFunction, ReadWriteStream]
  type InterceptFunction = js.Function1[/* file */ File, File]
}
