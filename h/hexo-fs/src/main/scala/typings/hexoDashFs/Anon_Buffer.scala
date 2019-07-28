package typings.hexoDashFs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var buffer: Buffer
  var bytesRead: Double
}

object Anon_Buffer {
  @scala.inline
  def apply(buffer: Buffer, bytesRead: Double): Anon_Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesRead = bytesRead)
  
    __obj.asInstanceOf[Anon_Buffer]
  }
}

