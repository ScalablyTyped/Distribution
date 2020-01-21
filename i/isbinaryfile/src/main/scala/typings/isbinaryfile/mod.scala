package typings.isbinaryfile

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("isbinaryfile", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def isBinaryFile(file: String): js.Promise[Boolean] = js.native
  def isBinaryFile(file: String, size: Double): js.Promise[Boolean] = js.native
  def isBinaryFile(file: Buffer): js.Promise[Boolean] = js.native
  def isBinaryFile(file: Buffer, size: Double): js.Promise[Boolean] = js.native
  def isBinaryFileSync(file: String): Boolean = js.native
  def isBinaryFileSync(file: String, size: Double): Boolean = js.native
  def isBinaryFileSync(file: Buffer): Boolean = js.native
  def isBinaryFileSync(file: Buffer, size: Double): Boolean = js.native
}

