package typings.atJupyterlabStatusbar

import typings.atJupyterlabStatusbar.libDefaultsMemoryUsageMod.MemoryUsage.MemoryUnit
import typings.atJupyterlabStatusbar.libTokensMod.IStatusBar.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atJupyterlabStatusbarStrings {
  @js.native
  sealed trait B extends MemoryUnit
  
  @js.native
  sealed trait GB extends MemoryUnit
  
  @js.native
  sealed trait KB extends MemoryUnit
  
  @js.native
  sealed trait MB extends MemoryUnit
  
  @js.native
  sealed trait PB extends MemoryUnit
  
  @js.native
  sealed trait TB extends MemoryUnit
  
  @js.native
  sealed trait left extends Alignment
  
  @js.native
  sealed trait middle extends Alignment
  
  @js.native
  sealed trait right extends Alignment
  
  @scala.inline
  def B: B = "B".asInstanceOf[B]
  @scala.inline
  def GB: GB = "GB".asInstanceOf[GB]
  @scala.inline
  def KB: KB = "KB".asInstanceOf[KB]
  @scala.inline
  def MB: MB = "MB".asInstanceOf[MB]
  @scala.inline
  def PB: PB = "PB".asInstanceOf[PB]
  @scala.inline
  def TB: TB = "TB".asInstanceOf[TB]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
}

