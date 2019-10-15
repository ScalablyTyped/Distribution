package typings.imageDashSize

import typings.imageDashSize.distTypesInterfaceMod.ISizeCalculationResult
import typings.imageDashSize.imageDashSizeMod.CallbackFn
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-size", JSImport.Namespace)
@js.native
object imageDashSizeMod extends js.Object {
  val types: js.Array[String] = js.native
  def imageSize(input: String): ISizeCalculationResult = js.native
  def imageSize(input: String, callback: CallbackFn): Unit = js.native
  def imageSize(input: Buffer): ISizeCalculationResult = js.native
  def setConcurrency(c: Double): Unit = js.native
  type CallbackFn = js.Function2[/* e */ Error | Null, /* r */ js.UndefOr[ISizeCalculationResult], Unit]
}

