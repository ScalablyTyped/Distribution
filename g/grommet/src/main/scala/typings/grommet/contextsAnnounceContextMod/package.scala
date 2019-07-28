package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextsAnnounceContextMod {
  type AnnounceMessage = String
  type AnnounceValue = js.Function2[/* message */ AnnounceMessage, /* mode */ AnnounceMode, Unit]
}
