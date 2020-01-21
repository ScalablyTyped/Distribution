package typings.imageSize.interfaceMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImage extends js.Object {
  def calculate(buffer: Buffer): ISizeCalculationResult = js.native
  def calculate(buffer: Buffer, filepath: String): ISizeCalculationResult = js.native
  def validate(buffer: Buffer): Boolean = js.native
}

