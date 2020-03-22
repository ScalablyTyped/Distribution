package typings.grommet.diagramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.direct
  - typings.grommet.grommetStrings.curved
  - typings.grommet.grommetStrings.rectilinear
*/
trait DiagramConnectionType extends js.Object

object DiagramConnectionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def curved: typings.grommet.grommetStrings.curved = this.cast("curved")
  @scala.inline
  def direct: typings.grommet.grommetStrings.direct = this.cast("direct")
  @scala.inline
  def rectilinear: typings.grommet.grommetStrings.rectilinear = this.cast("rectilinear")
}

