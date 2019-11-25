package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Jupyter message types.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.clear_output
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_close
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_msg
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_open
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.display_data
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.error
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_input
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_result
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.status
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.stream
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.update_display_data
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_event
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_info_reply
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_info_request
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.complete_reply
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.complete_request
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_reply
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_request
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.history_reply
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.history_request
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.inspect_reply
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.inspect_request
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.interrupt_reply
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.interrupt_request
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.is_complete_reply
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.is_complete_request
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.kernel_info_reply
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.kernel_info_request
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.shutdown_reply
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.shutdown_request
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_request
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_reply
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.input_request
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.input_reply
*/
trait MessageType extends js.Object

object MessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clear_output: typings.atJupyterlabServices.atJupyterlabServicesStrings.clear_output = this.cast("clear_output")
  @scala.inline
  def comm_close: typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_close = this.cast("comm_close")
  @scala.inline
  def comm_info_reply: typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_info_reply = this.cast("comm_info_reply")
  @scala.inline
  def comm_info_request: typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_info_request = this.cast("comm_info_request")
  @scala.inline
  def comm_msg: typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_msg = this.cast("comm_msg")
  @scala.inline
  def comm_open: typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_open = this.cast("comm_open")
  @scala.inline
  def complete_reply: typings.atJupyterlabServices.atJupyterlabServicesStrings.complete_reply = this.cast("complete_reply")
  @scala.inline
  def complete_request: typings.atJupyterlabServices.atJupyterlabServicesStrings.complete_request = this.cast("complete_request")
  @scala.inline
  def debug_event: typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_event = this.cast("debug_event")
  @scala.inline
  def debug_reply: typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_reply = this.cast("debug_reply")
  @scala.inline
  def debug_request: typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_request = this.cast("debug_request")
  @scala.inline
  def display_data: typings.atJupyterlabServices.atJupyterlabServicesStrings.display_data = this.cast("display_data")
  @scala.inline
  def error: typings.atJupyterlabServices.atJupyterlabServicesStrings.error = this.cast("error")
  @scala.inline
  def execute_input: typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_input = this.cast("execute_input")
  @scala.inline
  def execute_reply: typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_reply = this.cast("execute_reply")
  @scala.inline
  def execute_request: typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_request = this.cast("execute_request")
  @scala.inline
  def execute_result: typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_result = this.cast("execute_result")
  @scala.inline
  def history_reply: typings.atJupyterlabServices.atJupyterlabServicesStrings.history_reply = this.cast("history_reply")
  @scala.inline
  def history_request: typings.atJupyterlabServices.atJupyterlabServicesStrings.history_request = this.cast("history_request")
  @scala.inline
  def input_reply: typings.atJupyterlabServices.atJupyterlabServicesStrings.input_reply = this.cast("input_reply")
  @scala.inline
  def input_request: typings.atJupyterlabServices.atJupyterlabServicesStrings.input_request = this.cast("input_request")
  @scala.inline
  def inspect_reply: typings.atJupyterlabServices.atJupyterlabServicesStrings.inspect_reply = this.cast("inspect_reply")
  @scala.inline
  def inspect_request: typings.atJupyterlabServices.atJupyterlabServicesStrings.inspect_request = this.cast("inspect_request")
  @scala.inline
  def interrupt_reply: typings.atJupyterlabServices.atJupyterlabServicesStrings.interrupt_reply = this.cast("interrupt_reply")
  @scala.inline
  def interrupt_request: typings.atJupyterlabServices.atJupyterlabServicesStrings.interrupt_request = this.cast("interrupt_request")
  @scala.inline
  def is_complete_reply: typings.atJupyterlabServices.atJupyterlabServicesStrings.is_complete_reply = this.cast("is_complete_reply")
  @scala.inline
  def is_complete_request: typings.atJupyterlabServices.atJupyterlabServicesStrings.is_complete_request = this.cast("is_complete_request")
  @scala.inline
  def kernel_info_reply: typings.atJupyterlabServices.atJupyterlabServicesStrings.kernel_info_reply = this.cast("kernel_info_reply")
  @scala.inline
  def kernel_info_request: typings.atJupyterlabServices.atJupyterlabServicesStrings.kernel_info_request = this.cast("kernel_info_request")
  @scala.inline
  def shutdown_reply: typings.atJupyterlabServices.atJupyterlabServicesStrings.shutdown_reply = this.cast("shutdown_reply")
  @scala.inline
  def shutdown_request: typings.atJupyterlabServices.atJupyterlabServicesStrings.shutdown_request = this.cast("shutdown_request")
  @scala.inline
  def status: typings.atJupyterlabServices.atJupyterlabServicesStrings.status = this.cast("status")
  @scala.inline
  def stream: typings.atJupyterlabServices.atJupyterlabServicesStrings.stream = this.cast("stream")
  @scala.inline
  def update_display_data: typings.atJupyterlabServices.atJupyterlabServicesStrings.update_display_data = this.cast("update_display_data")
}

