package typings.grommet.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.grommet.grommetStrings.xxsmall
  - typings.grommet.grommetStrings.xsmall
  - typings.grommet.grommetStrings.small
  - typings.grommet.grommetStrings.medium
  - typings.grommet.grommetStrings.large
  - typings.grommet.grommetStrings.xlarge
*/
trait EdgeSizeType
  extends _EdgeType
     with _GapType

object EdgeSizeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def large: typings.grommet.grommetStrings.large = this.cast("large")
  @scala.inline
  def medium: typings.grommet.grommetStrings.medium = this.cast("medium")
  @scala.inline
  def small: typings.grommet.grommetStrings.small = this.cast("small")
  @scala.inline
  def xlarge: typings.grommet.grommetStrings.xlarge = this.cast("xlarge")
  @scala.inline
  def xsmall: typings.grommet.grommetStrings.xsmall = this.cast("xsmall")
  @scala.inline
  def xxsmall: typings.grommet.grommetStrings.xxsmall = this.cast("xxsmall")
}

