package typings.knockoutDotKogrid

import typings.knockoutDotKogrid.kgNs.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object knockoutDotKogridStrings {
  @js.native
  sealed trait asc extends Direction
  
  @js.native
  sealed trait desc extends Direction
  
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
}

