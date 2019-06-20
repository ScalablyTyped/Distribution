package typings
package logfmtLib.logfmtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritableStream extends js.Object {
  def write(data: java.lang.String): scala.Unit
}

object WritableStream {
  @scala.inline
  def apply(write: java.lang.String => scala.Unit): WritableStream = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[WritableStream]
  }
}

