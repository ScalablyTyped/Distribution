package typings
package gulpDashTapLib.gulpDashTapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tapNs {
  type Tap = js.Function2[
    /* tapFunction */ TapFunction, 
    /* t */ js.UndefOr[js.Any], 
    nodeLib.NodeJSNs.ReadWriteStream
  ]
  type TapFunction = js.Function1[/* file */ vinylLib.vinylMod.File, js.Any]
}
