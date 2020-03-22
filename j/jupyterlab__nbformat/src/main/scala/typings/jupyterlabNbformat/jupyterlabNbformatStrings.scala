package typings.jupyterlabNbformat

import typings.jupyterlabNbformat.mod.CellType
import typings.jupyterlabNbformat.mod.OutputType
import typings.jupyterlabNbformat.mod.StreamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jupyterlabNbformatStrings {
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait code extends CellType
  
  @js.native
  sealed trait display_data extends OutputType
  
  @js.native
  sealed trait error extends OutputType
  
  @js.native
  sealed trait execute_result extends OutputType
  
  @js.native
  sealed trait markdown extends CellType
  
  @js.native
  sealed trait raw extends CellType
  
  @js.native
  sealed trait stderr extends StreamType
  
  @js.native
  sealed trait stdout extends StreamType
  
  @js.native
  sealed trait stream extends OutputType
  
  @js.native
  sealed trait update_display_data extends OutputType
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  @scala.inline
  def display_data: display_data = "display_data".asInstanceOf[display_data]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def execute_result: execute_result = "execute_result".asInstanceOf[execute_result]
  @scala.inline
  def markdown: markdown = "markdown".asInstanceOf[markdown]
  @scala.inline
  def raw: raw = "raw".asInstanceOf[raw]
  @scala.inline
  def stderr: stderr = "stderr".asInstanceOf[stderr]
  @scala.inline
  def stdout: stdout = "stdout".asInstanceOf[stdout]
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  @scala.inline
  def update_display_data: update_display_data = "update_display_data".asInstanceOf[update_display_data]
}

