package typings.atJupyterlabCoreutils.libNbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The valid output types.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.execute_result
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.display_data
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.stream
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.error
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.update_display_data
*/
trait OutputType extends js.Object

object OutputType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def display_data: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.display_data = this.cast("display_data")
  @scala.inline
  def error: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.error = this.cast("error")
  @scala.inline
  def execute_result: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.execute_result = this.cast("execute_result")
  @scala.inline
  def stream: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.stream = this.cast("stream")
  @scala.inline
  def update_display_data: typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.update_display_data = this.cast("update_display_data")
}

