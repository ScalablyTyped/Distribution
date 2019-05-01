package typings
package jsDashMoneyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jsDashMoneyLibStrings {
  @js.native
  sealed trait ceil
    extends jsDashMoneyLib.jsDashMoneyMod.Rounders
  
  @js.native
  sealed trait floor
    extends jsDashMoneyLib.jsDashMoneyMod.Rounders
  
  @js.native
  sealed trait round
    extends jsDashMoneyLib.jsDashMoneyMod.Rounders
  
  @scala.inline
  def ceil: ceil = "ceil".asInstanceOf[ceil]
  @scala.inline
  def floor: floor = "floor".asInstanceOf[floor]
  @scala.inline
  def round: round = "round".asInstanceOf[round]
}

