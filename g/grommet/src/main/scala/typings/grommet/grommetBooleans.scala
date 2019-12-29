package typings.grommet

import typings.grommet.utilsMod._OpacityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object grommetBooleans {
  @js.native
  sealed trait `false` extends _OpacityType
  
  @js.native
  sealed trait `true` extends _OpacityType
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

