package typings.hapiHapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hapiHapi.hapiHapiStrings.data
  - typings.hapiHapi.hapiHapiStrings.stream
  - typings.hapiHapi.hapiHapiStrings.file
*/
trait PayloadOutput extends js.Object

object PayloadOutput {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typings.hapiHapi.hapiHapiStrings.data = this.cast("data")
  @scala.inline
  def file: typings.hapiHapi.hapiHapiStrings.file = this.cast("file")
  @scala.inline
  def stream: typings.hapiHapi.hapiHapiStrings.stream = this.cast("stream")
}

