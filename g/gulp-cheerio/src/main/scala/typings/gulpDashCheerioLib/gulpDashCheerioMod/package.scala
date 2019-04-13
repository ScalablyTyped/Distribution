package typings
package gulpDashCheerioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashCheerioMod {
  type Callback = js.Function3[
    /* $ */ cheerioLib.CheerioStatic, 
    /* file */ vinylLib.vinylMod.File, 
    /* done */ js.UndefOr[js.Function], 
    js.Any
  ]
}
