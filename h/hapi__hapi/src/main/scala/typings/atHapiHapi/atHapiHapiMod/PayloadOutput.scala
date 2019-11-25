package typings.atHapiHapi.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atHapiHapi.atHapiHapiStrings.data
  - typings.atHapiHapi.atHapiHapiStrings.stream
  - typings.atHapiHapi.atHapiHapiStrings.file
*/
trait PayloadOutput extends js.Object

object PayloadOutput {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typings.atHapiHapi.atHapiHapiStrings.data = this.cast("data")
  @scala.inline
  def file: typings.atHapiHapi.atHapiHapiStrings.file = this.cast("file")
  @scala.inline
  def stream: typings.atHapiHapi.atHapiHapiStrings.stream = this.cast("stream")
}

