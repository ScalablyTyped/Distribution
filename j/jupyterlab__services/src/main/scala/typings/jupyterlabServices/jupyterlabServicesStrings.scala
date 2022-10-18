package typings.jupyterlabServices

import typings.jupyterlabServices.libContentsMod.Contents.ContentType
import typings.jupyterlabServices.libContentsMod.Contents._FileFormat
import typings.jupyterlabServices.libKernelMessagesMod.Channel
import typings.jupyterlabServices.libKernelMessagesMod.ControlMessageType
import typings.jupyterlabServices.libKernelMessagesMod.IOPubMessageType
import typings.jupyterlabServices.libKernelMessagesMod.MessageType
import typings.jupyterlabServices.libKernelMessagesMod.ShellMessageType
import typings.jupyterlabServices.libKernelMessagesMod.Status
import typings.jupyterlabServices.libKernelMessagesMod.StdinMessageType
import typings.jupyterlabServices.libTerminalTerminalMod.ConnectionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jupyterlabServicesStrings {
  
  @js.native
  sealed trait abort extends StObject
  inline def abort: abort = "abort".asInstanceOf[abort]
  
  @js.native
  sealed trait autorestarting
    extends StObject
       with Status
  inline def autorestarting: autorestarting = "autorestarting".asInstanceOf[autorestarting]
  
  @js.native
  sealed trait base64
    extends StObject
       with _FileFormat
  inline def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait building extends StObject
  inline def building: building = "building".asInstanceOf[building]
  
  @js.native
  sealed trait busy
    extends StObject
       with Status
  inline def busy: busy = "busy".asInstanceOf[busy]
  
  @js.native
  sealed trait clear_output
    extends StObject
       with IOPubMessageType
       with MessageType
  inline def clear_output: clear_output = "clear_output".asInstanceOf[clear_output]
  
  @js.native
  sealed trait comm_close
    extends StObject
       with IOPubMessageType
       with MessageType
       with ShellMessageType
  inline def comm_close: comm_close = "comm_close".asInstanceOf[comm_close]
  
  @js.native
  sealed trait comm_info_reply
    extends StObject
       with MessageType
       with ShellMessageType
  inline def comm_info_reply: comm_info_reply = "comm_info_reply".asInstanceOf[comm_info_reply]
  
  @js.native
  sealed trait comm_info_request
    extends StObject
       with MessageType
       with ShellMessageType
  inline def comm_info_request: comm_info_request = "comm_info_request".asInstanceOf[comm_info_request]
  
  @js.native
  sealed trait comm_msg
    extends StObject
       with IOPubMessageType
       with MessageType
       with ShellMessageType
  inline def comm_msg: comm_msg = "comm_msg".asInstanceOf[comm_msg]
  
  @js.native
  sealed trait comm_open
    extends StObject
       with IOPubMessageType
       with MessageType
       with ShellMessageType
  inline def comm_open: comm_open = "comm_open".asInstanceOf[comm_open]
  
  @js.native
  sealed trait complete extends StObject
  inline def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait complete_reply
    extends StObject
       with MessageType
       with ShellMessageType
  inline def complete_reply: complete_reply = "complete_reply".asInstanceOf[complete_reply]
  
  @js.native
  sealed trait complete_request
    extends StObject
       with MessageType
       with ShellMessageType
  inline def complete_request: complete_request = "complete_request".asInstanceOf[complete_request]
  
  @js.native
  sealed trait connected
    extends StObject
       with ConnectionStatus
       with typings.jupyterlabServices.libKernelKernelMod.ConnectionStatus
  inline def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait connecting
    extends StObject
       with ConnectionStatus
       with typings.jupyterlabServices.libKernelKernelMod.ConnectionStatus
  inline def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait control
    extends StObject
       with Channel
  inline def control: control = "control".asInstanceOf[control]
  
  @js.native
  sealed trait dead
    extends StObject
       with Status
  inline def dead: dead = "dead".asInstanceOf[dead]
  
  @js.native
  sealed trait debug_event
    extends StObject
       with IOPubMessageType
       with MessageType
  inline def debug_event: debug_event = "debug_event".asInstanceOf[debug_event]
  
  @js.native
  sealed trait debug_reply
    extends StObject
       with ControlMessageType
       with MessageType
  inline def debug_reply: debug_reply = "debug_reply".asInstanceOf[debug_reply]
  
  @js.native
  sealed trait debug_request
    extends StObject
       with ControlMessageType
       with MessageType
  inline def debug_request: debug_request = "debug_request".asInstanceOf[debug_request]
  
  @js.native
  sealed trait delete extends StObject
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait directory
    extends StObject
       with ContentType
  inline def directory: directory = "directory".asInstanceOf[directory]
  
  @js.native
  sealed trait disconnect
    extends StObject
       with typings.jupyterlabServices.libTerminalTerminalMod.MessageType
  inline def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  
  @js.native
  sealed trait disconnected
    extends StObject
       with ConnectionStatus
       with typings.jupyterlabServices.libKernelKernelMod.ConnectionStatus
  inline def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait display_data
    extends StObject
       with IOPubMessageType
       with MessageType
  inline def display_data: display_data = "display_data".asInstanceOf[display_data]
  
  @js.native
  sealed trait error
    extends StObject
       with IOPubMessageType
       with MessageType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait event extends StObject
  inline def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait execute_input
    extends StObject
       with IOPubMessageType
       with MessageType
  inline def execute_input: execute_input = "execute_input".asInstanceOf[execute_input]
  
  @js.native
  sealed trait execute_reply
    extends StObject
       with MessageType
       with ShellMessageType
  inline def execute_reply: execute_reply = "execute_reply".asInstanceOf[execute_reply]
  
  @js.native
  sealed trait execute_request
    extends StObject
       with MessageType
       with ShellMessageType
  inline def execute_request: execute_request = "execute_request".asInstanceOf[execute_request]
  
  @js.native
  sealed trait execute_result
    extends StObject
       with IOPubMessageType
       with MessageType
  inline def execute_result: execute_result = "execute_result".asInstanceOf[execute_result]
  
  @js.native
  sealed trait file
    extends StObject
       with ContentType
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait history_reply
    extends StObject
       with MessageType
       with ShellMessageType
  inline def history_reply: history_reply = "history_reply".asInstanceOf[history_reply]
  
  @js.native
  sealed trait history_request
    extends StObject
       with MessageType
       with ShellMessageType
  inline def history_request: history_request = "history_request".asInstanceOf[history_request]
  
  @js.native
  sealed trait idle
    extends StObject
       with Status
  inline def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait incomplete extends StObject
  inline def incomplete: incomplete = "incomplete".asInstanceOf[incomplete]
  
  @js.native
  sealed trait input_reply
    extends StObject
       with MessageType
       with StdinMessageType
  inline def input_reply: input_reply = "input_reply".asInstanceOf[input_reply]
  
  @js.native
  sealed trait input_request
    extends StObject
       with MessageType
       with StdinMessageType
  inline def input_request: input_request = "input_request".asInstanceOf[input_request]
  
  @js.native
  sealed trait inspect_reply
    extends StObject
       with MessageType
       with ShellMessageType
  inline def inspect_reply: inspect_reply = "inspect_reply".asInstanceOf[inspect_reply]
  
  @js.native
  sealed trait inspect_request
    extends StObject
       with MessageType
       with ShellMessageType
  inline def inspect_request: inspect_request = "inspect_request".asInstanceOf[inspect_request]
  
  @js.native
  sealed trait interrupt_reply
    extends StObject
       with MessageType
       with ShellMessageType
  inline def interrupt_reply: interrupt_reply = "interrupt_reply".asInstanceOf[interrupt_reply]
  
  @js.native
  sealed trait interrupt_request
    extends StObject
       with MessageType
       with ShellMessageType
  inline def interrupt_request: interrupt_request = "interrupt_request".asInstanceOf[interrupt_request]
  
  @js.native
  sealed trait invalid extends StObject
  inline def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @js.native
  sealed trait iopub
    extends StObject
       with Channel
  inline def iopub: iopub = "iopub".asInstanceOf[iopub]
  
  @js.native
  sealed trait is_complete_reply
    extends StObject
       with MessageType
       with ShellMessageType
  inline def is_complete_reply: is_complete_reply = "is_complete_reply".asInstanceOf[is_complete_reply]
  
  @js.native
  sealed trait is_complete_request
    extends StObject
       with MessageType
       with ShellMessageType
  inline def is_complete_request: is_complete_request = "is_complete_request".asInstanceOf[is_complete_request]
  
  @js.native
  sealed trait json
    extends StObject
       with _FileFormat
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait kernel extends StObject
  inline def kernel: kernel = "kernel".asInstanceOf[kernel]
  
  @js.native
  sealed trait kernel_info_reply
    extends StObject
       with MessageType
       with ShellMessageType
  inline def kernel_info_reply: kernel_info_reply = "kernel_info_reply".asInstanceOf[kernel_info_reply]
  
  @js.native
  sealed trait kernel_info_request
    extends StObject
       with MessageType
       with ShellMessageType
  inline def kernel_info_request: kernel_info_request = "kernel_info_request".asInstanceOf[kernel_info_request]
  
  @js.native
  sealed trait name extends StObject
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait needed extends StObject
  inline def needed: needed = "needed".asInstanceOf[needed]
  
  @js.native
  sealed trait `new` extends StObject
  inline def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait notebook
    extends StObject
       with ContentType
  inline def notebook: notebook = "notebook".asInstanceOf[notebook]
  
  @js.native
  sealed trait ok extends StObject
  inline def ok: ok = "ok".asInstanceOf[ok]
  
  @js.native
  sealed trait path extends StObject
  inline def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait range extends StObject
  inline def range: range = "range".asInstanceOf[range]
  
  @js.native
  sealed trait recv extends StObject
  inline def recv: recv = "recv".asInstanceOf[recv]
  
  @js.native
  sealed trait rename extends StObject
  inline def rename: rename = "rename".asInstanceOf[rename]
  
  @js.native
  sealed trait request extends StObject
  inline def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait response extends StObject
  inline def response: response = "response".asInstanceOf[response]
  
  @js.native
  sealed trait restarting
    extends StObject
       with Status
  inline def restarting: restarting = "restarting".asInstanceOf[restarting]
  
  @js.native
  sealed trait save extends StObject
  inline def save: save = "save".asInstanceOf[save]
  
  @js.native
  sealed trait search extends StObject
  inline def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait send extends StObject
  inline def send: send = "send".asInstanceOf[send]
  
  @js.native
  sealed trait set_size
    extends StObject
       with typings.jupyterlabServices.libTerminalTerminalMod.MessageType
  inline def set_size: set_size = "set_size".asInstanceOf[set_size]
  
  @js.native
  sealed trait shell
    extends StObject
       with Channel
  inline def shell: shell = "shell".asInstanceOf[shell]
  
  @js.native
  sealed trait shutdown_reply
    extends StObject
       with IOPubMessageType
       with MessageType
  inline def shutdown_reply: shutdown_reply = "shutdown_reply".asInstanceOf[shutdown_reply]
  
  @js.native
  sealed trait shutdown_request
    extends StObject
       with MessageType
       with ShellMessageType
  inline def shutdown_request: shutdown_request = "shutdown_request".asInstanceOf[shutdown_request]
  
  @js.native
  sealed trait stable extends StObject
  inline def stable: stable = "stable".asInstanceOf[stable]
  
  @js.native
  sealed trait starting
    extends StObject
       with Status
  inline def starting: starting = "starting".asInstanceOf[starting]
  
  @js.native
  sealed trait status
    extends StObject
       with IOPubMessageType
       with MessageType
  inline def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait stderr extends StObject
  inline def stderr: stderr = "stderr".asInstanceOf[stderr]
  
  @js.native
  sealed trait stdin
    extends StObject
       with Channel
       with typings.jupyterlabServices.libTerminalTerminalMod.MessageType
  inline def stdin: stdin = "stdin".asInstanceOf[stdin]
  
  @js.native
  sealed trait stdout
    extends StObject
       with typings.jupyterlabServices.libTerminalTerminalMod.MessageType
  inline def stdout: stdout = "stdout".asInstanceOf[stdout]
  
  @js.native
  sealed trait stream
    extends StObject
       with IOPubMessageType
       with MessageType
  inline def stream: stream = "stream".asInstanceOf[stream]
  
  @js.native
  sealed trait tail extends StObject
  inline def tail: tail = "tail".asInstanceOf[tail]
  
  @js.native
  sealed trait terminating
    extends StObject
       with Status
  inline def terminating: terminating = "terminating".asInstanceOf[terminating]
  
  @js.native
  sealed trait text
    extends StObject
       with _FileFormat
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait `type` extends StObject
  inline def `type`: `type` = "type".asInstanceOf[`type`]
  
  @js.native
  sealed trait unknown
    extends StObject
       with Status
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait update_display_data
    extends StObject
       with IOPubMessageType
       with MessageType
  inline def update_display_data: update_display_data = "update_display_data".asInstanceOf[update_display_data]
}
