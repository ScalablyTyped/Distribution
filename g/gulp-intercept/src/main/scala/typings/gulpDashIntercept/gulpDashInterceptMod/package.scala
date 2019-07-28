package typings.gulpDashIntercept

import typings.node.NodeJSNs.ReadWriteStream
import typings.vinyl.vinylMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashInterceptMod {
  type Intercept = js.Function1[/* interceptFunction */ InterceptFunction, ReadWriteStream]
  type InterceptFunction = js.Function1[/* file */ File, File]
}
