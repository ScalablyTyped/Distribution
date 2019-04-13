package typings
package gulpDashTapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashTapMod {
  type Tap = js.Function2[
    /* tapFunction */ TapFunction, 
    /* t */ js.UndefOr[js.Any], 
    nodeLib.NodeJSNs.ReadWriteStream
  ]
  type TapFunction = js.Function1[/* file */ vinylLib.vinylMod.File, js.Any]
}
