package typings.jsYaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsYaml.jsYamlStrings.open
  - typings.jsYaml.jsYamlStrings.close
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def close: typings.jsYaml.jsYamlStrings.close = this.cast("close")
  @scala.inline
  def open: typings.jsYaml.jsYamlStrings.open = this.cast("open")
}

