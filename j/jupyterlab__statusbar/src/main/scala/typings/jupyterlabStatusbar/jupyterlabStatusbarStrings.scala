package typings.jupyterlabStatusbar

import typings.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.MemoryUnit
import typings.jupyterlabStatusbar.tokensMod.IStatusBar.Alignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabStatusbarStrings {
  
  @js.native
  sealed trait B extends MemoryUnit
  @scala.inline
  def B: B = "B".asInstanceOf[B]
  
  @js.native
  sealed trait GB extends MemoryUnit
  @scala.inline
  def GB: GB = "GB".asInstanceOf[GB]
  
  @js.native
  sealed trait KB extends MemoryUnit
  @scala.inline
  def KB: KB = "KB".asInstanceOf[KB]
  
  @js.native
  sealed trait MB extends MemoryUnit
  @scala.inline
  def MB: MB = "MB".asInstanceOf[MB]
  
  @js.native
  sealed trait PB extends MemoryUnit
  @scala.inline
  def PB: PB = "PB".asInstanceOf[PB]
  
  @js.native
  sealed trait TB extends MemoryUnit
  @scala.inline
  def TB: TB = "TB".asInstanceOf[TB]
  
  @js.native
  sealed trait left extends Alignment
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait middle extends Alignment
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait right extends Alignment
  @scala.inline
  def right: right = "right".asInstanceOf[right]
}
