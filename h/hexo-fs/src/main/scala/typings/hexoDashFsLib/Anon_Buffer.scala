package typings
package hexoDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var buffer: nodeLib.Buffer
  var bytesRead: scala.Double
}

object Anon_Buffer {
  @scala.inline
  def apply(buffer: nodeLib.Buffer, bytesRead: scala.Double): Anon_Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer, bytesRead = bytesRead)
  
    __obj.asInstanceOf[Anon_Buffer]
  }
}

