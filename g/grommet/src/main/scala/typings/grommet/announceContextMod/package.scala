package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object announceContextMod {
  type AnnounceMessage = java.lang.String
  type AnnounceValue = js.Function2[
    /* message */ typings.grommet.announceContextMod.AnnounceMessage, 
    /* mode */ typings.grommet.announceContextMod.AnnounceMode, 
    scala.Unit
  ]
}
