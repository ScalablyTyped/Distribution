package typings.launchpad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object launchpadMod {
  type BrowserFunction = js.Function2[
    /* url */ String, 
    /* callback */ js.Function2[/* err */ js.Any, /* instance */ Instance, Unit], 
    Unit
  ]
}
