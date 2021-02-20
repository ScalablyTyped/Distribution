package typings.jupyterlabServices

import typings.jupyterlabServices.contentsMod.Contents.ContentType
import typings.jupyterlabServices.contentsMod.Contents.FileFormat
import typings.jupyterlabServices.messagesMod.Channel
import typings.jupyterlabServices.messagesMod.ControlMessageType
import typings.jupyterlabServices.messagesMod.IOPubMessageType
import typings.jupyterlabServices.messagesMod.MessageType
import typings.jupyterlabServices.messagesMod.ShellMessageType
import typings.jupyterlabServices.messagesMod.Status
import typings.jupyterlabServices.messagesMod.StdinMessageType
import typings.jupyterlabServices.terminalTerminalMod.ConnectionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabServicesStrings {
  
  @js.native
  sealed trait DeepPartial extends StObject
  @scala.inline
  def DeepPartial: DeepPartial = "DeepPartial".asInstanceOf[DeepPartial]
  
  @js.native
  sealed trait abort extends StObject
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  
  @js.native
  sealed trait autorestarting extends Status
  @scala.inline
  def autorestarting: autorestarting = "autorestarting".asInstanceOf[autorestarting]
  
  @js.native
  sealed trait base64 extends FileFormat
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait building extends StObject
  @scala.inline
  def building: building = "building".asInstanceOf[building]
  
  @js.native
  sealed trait busy extends Status
  @scala.inline
  def busy: busy = "busy".asInstanceOf[busy]
  
  @js.native
  sealed trait clear_output
    extends IOPubMessageType
       with MessageType
  @scala.inline
  def clear_output: clear_output = "clear_output".asInstanceOf[clear_output]
  
  @js.native
  sealed trait comm_close
    extends IOPubMessageType
       with MessageType
       with ShellMessageType
  @scala.inline
  def comm_close: comm_close = "comm_close".asInstanceOf[comm_close]
  
  @js.native
  sealed trait comm_info_reply
    extends MessageType
       with ShellMessageType
  @scala.inline
  def comm_info_reply: comm_info_reply = "comm_info_reply".asInstanceOf[comm_info_reply]
  
  @js.native
  sealed trait comm_info_request
    extends MessageType
       with ShellMessageType
  @scala.inline
  def comm_info_request: comm_info_request = "comm_info_request".asInstanceOf[comm_info_request]
  
  @js.native
  sealed trait comm_msg
    extends IOPubMessageType
       with MessageType
       with ShellMessageType
  @scala.inline
  def comm_msg: comm_msg = "comm_msg".asInstanceOf[comm_msg]
  
  @js.native
  sealed trait comm_open
    extends IOPubMessageType
       with MessageType
       with ShellMessageType
  @scala.inline
  def comm_open: comm_open = "comm_open".asInstanceOf[comm_open]
  
  @js.native
  sealed trait complete extends StObject
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait complete_reply
    extends MessageType
       with ShellMessageType
  @scala.inline
  def complete_reply: complete_reply = "complete_reply".asInstanceOf[complete_reply]
  
  @js.native
  sealed trait complete_request
    extends MessageType
       with ShellMessageType
  @scala.inline
  def complete_request: complete_request = "complete_request".asInstanceOf[complete_request]
  
  @js.native
  sealed trait connected
    extends ConnectionStatus
       with typings.jupyterlabServices.kernelKernelMod.ConnectionStatus
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait connecting
    extends ConnectionStatus
       with typings.jupyterlabServices.kernelKernelMod.ConnectionStatus
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait control extends Channel
  @scala.inline
  def control: control = "control".asInstanceOf[control]
  
  @js.native
  sealed trait dead extends Status
  @scala.inline
  def dead: dead = "dead".asInstanceOf[dead]
  
  @js.native
  sealed trait debug_event
    extends IOPubMessageType
       with MessageType
  @scala.inline
  def debug_event: debug_event = "debug_event".asInstanceOf[debug_event]
  
  @js.native
  sealed trait debug_reply
    extends ControlMessageType
       with MessageType
  @scala.inline
  def debug_reply: debug_reply = "debug_reply".asInstanceOf[debug_reply]
  
  @js.native
  sealed trait debug_request
    extends ControlMessageType
       with MessageType
  @scala.inline
  def debug_request: debug_request = "debug_request".asInstanceOf[debug_request]
  
  @js.native
  sealed trait delete extends StObject
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait directory extends ContentType
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  
  @js.native
  sealed trait disconnect
    extends typings.jupyterlabServices.terminalTerminalMod.MessageType
  @scala.inline
  def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  
  @js.native
  sealed trait disconnected
    extends ConnectionStatus
       with typings.jupyterlabServices.kernelKernelMod.ConnectionStatus
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait display_data
    extends IOPubMessageType
       with MessageType
  @scala.inline
  def display_data: display_data = "display_data".asInstanceOf[display_data]
  
  @js.native
  sealed trait error
    extends IOPubMessageType
       with MessageType
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait event extends StObject
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait execute_input
    extends IOPubMessageType
       with MessageType
  @scala.inline
  def execute_input: execute_input = "execute_input".asInstanceOf[execute_input]
  
  @js.native
  sealed trait execute_reply
    extends MessageType
       with ShellMessageType
  @scala.inline
  def execute_reply: execute_reply = "execute_reply".asInstanceOf[execute_reply]
  
  @js.native
  sealed trait execute_request
    extends MessageType
       with ShellMessageType
  @scala.inline
  def execute_request: execute_request = "execute_request".asInstanceOf[execute_request]
  
  @js.native
  sealed trait execute_result
    extends IOPubMessageType
       with MessageType
  @scala.inline
  def execute_result: execute_result = "execute_result".asInstanceOf[execute_result]
  
  @js.native
  sealed trait file extends ContentType
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait history_reply
    extends MessageType
       with ShellMessageType
  @scala.inline
  def history_reply: history_reply = "history_reply".asInstanceOf[history_reply]
  
  @js.native
  sealed trait history_request
    extends MessageType
       with ShellMessageType
  @scala.inline
  def history_request: history_request = "history_request".asInstanceOf[history_request]
  
  @js.native
  sealed trait idle extends Status
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait incomplete extends StObject
  @scala.inline
  def incomplete: incomplete = "incomplete".asInstanceOf[incomplete]
  
  @js.native
  sealed trait input_reply
    extends MessageType
       with StdinMessageType
  @scala.inline
  def input_reply: input_reply = "input_reply".asInstanceOf[input_reply]
  
  @js.native
  sealed trait input_request
    extends MessageType
       with StdinMessageType
  @scala.inline
  def input_request: input_request = "input_request".asInstanceOf[input_request]
  
  @js.native
  sealed trait inspect_reply
    extends MessageType
       with ShellMessageType
  @scala.inline
  def inspect_reply: inspect_reply = "inspect_reply".asInstanceOf[inspect_reply]
  
  @js.native
  sealed trait inspect_request
    extends MessageType
       with ShellMessageType
  @scala.inline
  def inspect_request: inspect_request = "inspect_request".asInstanceOf[inspect_request]
  
  @js.native
  sealed trait interrupt_reply
    extends MessageType
       with ShellMessageType
  @scala.inline
  def interrupt_reply: interrupt_reply = "interrupt_reply".asInstanceOf[interrupt_reply]
  
  @js.native
  sealed trait interrupt_request
    extends MessageType
       with ShellMessageType
  @scala.inline
  def interrupt_request: interrupt_request = "interrupt_request".asInstanceOf[interrupt_request]
  
  @js.native
  sealed trait invalid extends StObject
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @js.native
  sealed trait iopub extends Channel
  @scala.inline
  def iopub: iopub = "iopub".asInstanceOf[iopub]
  
  @js.native
  sealed trait is_complete_reply
    extends MessageType
       with ShellMessageType
  @scala.inline
  def is_complete_reply: is_complete_reply = "is_complete_reply".asInstanceOf[is_complete_reply]
  
  @js.native
  sealed trait is_complete_request
    extends MessageType
       with ShellMessageType
  @scala.inline
  def is_complete_request: is_complete_request = "is_complete_request".asInstanceOf[is_complete_request]
  
  @js.native
  sealed trait json extends FileFormat
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait kernel extends StObject
  @scala.inline
  def kernel: kernel = "kernel".asInstanceOf[kernel]
  
  @js.native
  sealed trait kernel_info_reply
    extends MessageType
       with ShellMessageType
  @scala.inline
  def kernel_info_reply: kernel_info_reply = "kernel_info_reply".asInstanceOf[kernel_info_reply]
  
  @js.native
  sealed trait kernel_info_request
    extends MessageType
       with ShellMessageType
  @scala.inline
  def kernel_info_request: kernel_info_request = "kernel_info_request".asInstanceOf[kernel_info_request]
  
  @js.native
  sealed trait name extends StObject
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait needed extends StObject
  @scala.inline
  def needed: needed = "needed".asInstanceOf[needed]
  
  @js.native
  sealed trait `new` extends StObject
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait notebook extends ContentType
  @scala.inline
  def notebook: notebook = "notebook".asInstanceOf[notebook]
  
  @js.native
  sealed trait ok extends StObject
  @scala.inline
  def ok: ok = "ok".asInstanceOf[ok]
  
  @js.native
  sealed trait path extends StObject
  @scala.inline
  def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait range extends StObject
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  
  @js.native
  sealed trait recv extends StObject
  @scala.inline
  def recv: recv = "recv".asInstanceOf[recv]
  
  @js.native
  sealed trait rename extends StObject
  @scala.inline
  def rename: rename = "rename".asInstanceOf[rename]
  
  @js.native
  sealed trait request extends StObject
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait response extends StObject
  @scala.inline
  def response: response = "response".asInstanceOf[response]
  
  @js.native
  sealed trait restarting extends Status
  @scala.inline
  def restarting: restarting = "restarting".asInstanceOf[restarting]
  
  @js.native
  sealed trait save extends StObject
  @scala.inline
  def save: save = "save".asInstanceOf[save]
  
  @js.native
  sealed trait search extends StObject
  @scala.inline
  def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait send extends StObject
  @scala.inline
  def send: send = "send".asInstanceOf[send]
  
  @js.native
  sealed trait set_size
    extends typings.jupyterlabServices.terminalTerminalMod.MessageType
  @scala.inline
  def set_size: set_size = "set_size".asInstanceOf[set_size]
  
  @js.native
  sealed trait shell extends Channel
  @scala.inline
  def shell: shell = "shell".asInstanceOf[shell]
  
  @js.native
  sealed trait shutdown_reply
    extends MessageType
       with ShellMessageType
  @scala.inline
  def shutdown_reply: shutdown_reply = "shutdown_reply".asInstanceOf[shutdown_reply]
  
  @js.native
  sealed trait shutdown_request
    extends MessageType
       with ShellMessageType
  @scala.inline
  def shutdown_request: shutdown_request = "shutdown_request".asInstanceOf[shutdown_request]
  
  @js.native
  sealed trait stable extends StObject
  @scala.inline
  def stable: stable = "stable".asInstanceOf[stable]
  
  @js.native
  sealed trait starting extends Status
  @scala.inline
  def starting: starting = "starting".asInstanceOf[starting]
  
  @js.native
  sealed trait status
    extends IOPubMessageType
       with MessageType
  @scala.inline
  def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait stderr extends StObject
  @scala.inline
  def stderr: stderr = "stderr".asInstanceOf[stderr]
  
  @js.native
  sealed trait stdin
    extends Channel
       with typings.jupyterlabServices.terminalTerminalMod.MessageType
  @scala.inline
  def stdin: stdin = "stdin".asInstanceOf[stdin]
  
  @js.native
  sealed trait stdout
    extends typings.jupyterlabServices.terminalTerminalMod.MessageType
  @scala.inline
  def stdout: stdout = "stdout".asInstanceOf[stdout]
  
  @js.native
  sealed trait stream
    extends IOPubMessageType
       with MessageType
  @scala.inline
  def stream: stream = "stream".asInstanceOf[stream]
  
  @js.native
  sealed trait tail extends StObject
  @scala.inline
  def tail: tail = "tail".asInstanceOf[tail]
  
  @js.native
  sealed trait terminating extends Status
  @scala.inline
  def terminating: terminating = "terminating".asInstanceOf[terminating]
  
  @js.native
  sealed trait text extends FileFormat
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait `type` extends StObject
  @scala.inline
  def `type`: `type` = "type".asInstanceOf[`type`]
  
  @js.native
  sealed trait unknown extends Status
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait update_display_data
    extends IOPubMessageType
       with MessageType
  @scala.inline
  def update_display_data: update_display_data = "update_display_data".asInstanceOf[update_display_data]
}
