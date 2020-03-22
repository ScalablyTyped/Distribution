package typings.jupyterlabNbformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabNbformat.jupyterlabNbformatStrings.execute_result
  - typings.jupyterlabNbformat.jupyterlabNbformatStrings.display_data
  - typings.jupyterlabNbformat.jupyterlabNbformatStrings.stream
  - typings.jupyterlabNbformat.jupyterlabNbformatStrings.error
  - typings.jupyterlabNbformat.jupyterlabNbformatStrings.update_display_data
*/
trait OutputType extends js.Object

object OutputType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def display_data: typings.jupyterlabNbformat.jupyterlabNbformatStrings.display_data = this.cast("display_data")
  @scala.inline
  def error: typings.jupyterlabNbformat.jupyterlabNbformatStrings.error = this.cast("error")
  @scala.inline
  def execute_result: typings.jupyterlabNbformat.jupyterlabNbformatStrings.execute_result = this.cast("execute_result")
  @scala.inline
  def stream: typings.jupyterlabNbformat.jupyterlabNbformatStrings.stream = this.cast("stream")
  @scala.inline
  def update_display_data: typings.jupyterlabNbformat.jupyterlabNbformatStrings.update_display_data = this.cast("update_display_data")
}

