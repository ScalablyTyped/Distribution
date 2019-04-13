package typings
package gulpDashInterceptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashInterceptMod {
  type Intercept = js.Function1[/* interceptFunction */ InterceptFunction, nodeLib.NodeJSNs.ReadWriteStream]
  type InterceptFunction = js.Function1[/* file */ vinylLib.vinylMod.File, vinylLib.vinylMod.File]
}
