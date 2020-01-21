package typings.jupyterlabStatusbar.memoryUsageMod.MemoryUsage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The type of unit used for reporting memory usage.
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.B
  - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.KB
  - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.MB
  - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.GB
  - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.TB
  - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.PB
*/
trait MemoryUnit extends js.Object

object MemoryUnit {
  @scala.inline
  def B: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.B = this.cast("B")
  @scala.inline
  def GB: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.GB = this.cast("GB")
  @scala.inline
  def KB: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.KB = this.cast("KB")
  @scala.inline
  def MB: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.MB = this.cast("MB")
  @scala.inline
  def PB: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.PB = this.cast("PB")
  @scala.inline
  def TB: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.TB = this.cast("TB")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

