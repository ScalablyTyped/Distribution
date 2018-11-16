package typings
package gulpDashCheerioLib.gulpDashCheerioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cheerioNs {
  type Callback = js.Function3[
    /* $ */ cheerioLib.CheerioStatic, 
    /* file */ vinylLib.vinylMod.File, 
    /* done */ js.UndefOr[js.Function], 
    js.Any
  ]
}
