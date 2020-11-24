package typings.imageSize

import typings.imageSize.interfaceMod.ISizeCalculationResult
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("image-size", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(input: String): ISizeCalculationResult = js.native
  def default(input: String, callback: CallbackFn): Unit = js.native
  def default(input: Buffer): ISizeCalculationResult = js.native
  
  def imageSize(input: String): ISizeCalculationResult = js.native
  def imageSize(input: String, callback: CallbackFn): Unit = js.native
  def imageSize(input: Buffer): ISizeCalculationResult = js.native
  
  def setConcurrency(c: Double): Unit = js.native
  
  val types: js.Array[String] = js.native
  
  type CallbackFn = js.Function2[/* e */ Error | Null, /* r */ js.UndefOr[ISizeCalculationResult], Unit]
}
