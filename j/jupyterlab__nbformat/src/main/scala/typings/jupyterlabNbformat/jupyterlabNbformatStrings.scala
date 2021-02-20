package typings.jupyterlabNbformat

import typings.jupyterlabNbformat.mod.CellType
import typings.jupyterlabNbformat.mod.OutputType
import typings.jupyterlabNbformat.mod.StreamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabNbformatStrings {
  
  @js.native
  sealed trait auto extends StObject
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait code extends CellType
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait display_data extends OutputType
  @scala.inline
  def display_data: display_data = "display_data".asInstanceOf[display_data]
  
  @js.native
  sealed trait error extends OutputType
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait execute_result extends OutputType
  @scala.inline
  def execute_result: execute_result = "execute_result".asInstanceOf[execute_result]
  
  @js.native
  sealed trait markdown extends CellType
  @scala.inline
  def markdown: markdown = "markdown".asInstanceOf[markdown]
  
  @js.native
  sealed trait raw extends CellType
  @scala.inline
  def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait stderr extends StreamType
  @scala.inline
  def stderr: stderr = "stderr".asInstanceOf[stderr]
  
  @js.native
  sealed trait stdout extends StreamType
  @scala.inline
  def stdout: stdout = "stdout".asInstanceOf[stdout]
  
  @js.native
  sealed trait stream extends OutputType
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  
  @js.native
  sealed trait update_display_data extends OutputType
  @scala.inline
  def update_display_data: update_display_data = "update_display_data".asInstanceOf[update_display_data]
}
