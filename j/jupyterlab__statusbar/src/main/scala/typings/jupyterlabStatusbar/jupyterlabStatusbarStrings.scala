package typings.jupyterlabStatusbar

import typings.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.MemoryUnit
import typings.jupyterlabStatusbar.tokensMod.IStatusBar.Alignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabStatusbarStrings {
  
  @js.native
  sealed trait B
    extends StObject
       with MemoryUnit
  inline def B: B = "B".asInstanceOf[B]
  
  @js.native
  sealed trait GB
    extends StObject
       with MemoryUnit
  inline def GB: GB = "GB".asInstanceOf[GB]
  
  @js.native
  sealed trait KB
    extends StObject
       with MemoryUnit
  inline def KB: KB = "KB".asInstanceOf[KB]
  
  @js.native
  sealed trait MB
    extends StObject
       with MemoryUnit
  inline def MB: MB = "MB".asInstanceOf[MB]
  
  @js.native
  sealed trait PB
    extends StObject
       with MemoryUnit
  inline def PB: PB = "PB".asInstanceOf[PB]
  
  @js.native
  sealed trait TB
    extends StObject
       with MemoryUnit
  inline def TB: TB = "TB".asInstanceOf[TB]
  
  @js.native
  sealed trait left
    extends StObject
       with Alignment
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait middle
    extends StObject
       with Alignment
  inline def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait right
    extends StObject
       with Alignment
  inline def right: right = "right".asInstanceOf[right]
}
