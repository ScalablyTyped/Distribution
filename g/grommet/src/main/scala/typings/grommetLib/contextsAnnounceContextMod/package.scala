package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextsAnnounceContextMod {
  type AnnounceMessage = java.lang.String
  type AnnounceMode = grommetLib.grommetLibStrings.off | grommetLib.grommetLibStrings.polite | grommetLib.grommetLibStrings.assertive
  type AnnounceValue = js.Function2[/* message */ AnnounceMessage, /* mode */ AnnounceMode, scala.Unit]
}
