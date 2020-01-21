package typings.grommet.announceContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.off
  - typings.grommet.grommetStrings.polite
  - typings.grommet.grommetStrings.assertive
*/
trait AnnounceMode extends js.Object

object AnnounceMode {
  @scala.inline
  def assertive: typings.grommet.grommetStrings.assertive = this.cast("assertive")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def off: typings.grommet.grommetStrings.off = this.cast("off")
  @scala.inline
  def polite: typings.grommet.grommetStrings.polite = this.cast("polite")
}

