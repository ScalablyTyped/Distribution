package typings
package atJupyterlabServicesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atJupyterlabServicesLibStrings {
  @js.native
  sealed trait abort extends js.Object
  
  @js.native
  sealed trait base64
    extends atJupyterlabServicesLib.libContentsMod.ContentsNs.FileFormat
  
  @js.native
  sealed trait building extends js.Object
  
  @js.native
  sealed trait busy
    extends atJupyterlabServicesLib.libKernelKernelMod.KernelNs.Status
  
  @js.native
  sealed trait connected
    extends atJupyterlabServicesLib.libKernelKernelMod.KernelNs.Status
  
  @js.native
  sealed trait dead
    extends atJupyterlabServicesLib.libKernelKernelMod.KernelNs.Status
  
  @js.native
  sealed trait delete extends js.Object
  
  @js.native
  sealed trait directory
    extends atJupyterlabServicesLib.libContentsMod.ContentsNs.ContentType
  
  @js.native
  sealed trait disconnect
    extends atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.MessageType
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait file
    extends atJupyterlabServicesLib.libContentsMod.ContentsNs.ContentType
  
  @js.native
  sealed trait idle
    extends atJupyterlabServicesLib.libKernelKernelMod.KernelNs.Status
  
  @js.native
  sealed trait iopub
    extends atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.Channel
  
  @js.native
  sealed trait json
    extends atJupyterlabServicesLib.libContentsMod.ContentsNs.FileFormat
  
  @js.native
  sealed trait name extends js.Object
  
  @js.native
  sealed trait needed extends js.Object
  
  @js.native
  sealed trait `new` extends js.Object
  
  @js.native
  sealed trait notebook
    extends atJupyterlabServicesLib.libContentsMod.ContentsNs.ContentType
  
  @js.native
  sealed trait ok extends js.Object
  
  @js.native
  sealed trait path extends js.Object
  
  @js.native
  sealed trait range
    extends atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.HistAccess
  
  @js.native
  sealed trait reconnecting
    extends atJupyterlabServicesLib.libKernelKernelMod.KernelNs.Status
  
  @js.native
  sealed trait recv extends js.Object
  
  @js.native
  sealed trait rename extends js.Object
  
  @js.native
  sealed trait restarting
    extends atJupyterlabServicesLib.libKernelKernelMod.KernelNs.Status
  
  @js.native
  sealed trait save extends js.Object
  
  @js.native
  sealed trait search
    extends atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.HistAccess
  
  @js.native
  sealed trait send extends js.Object
  
  @js.native
  sealed trait set_size
    extends atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.MessageType
  
  @js.native
  sealed trait shell
    extends atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.Channel
  
  @js.native
  sealed trait stable extends js.Object
  
  @js.native
  sealed trait starting
    extends atJupyterlabServicesLib.libKernelKernelMod.KernelNs.Status
  
  @js.native
  sealed trait stderr extends js.Object
  
  @js.native
  sealed trait stdin
    extends atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.Channel
       with atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.MessageType
  
  @js.native
  sealed trait stdout
    extends atJupyterlabServicesLib.libTerminalTerminalMod.TerminalSessionNs.MessageType
  
  @js.native
  sealed trait tail
    extends atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.HistAccess
  
  @js.native
  sealed trait text
    extends atJupyterlabServicesLib.libContentsMod.ContentsNs.FileFormat
  
  @js.native
  sealed trait `type` extends js.Object
  
  @js.native
  sealed trait unknown
    extends atJupyterlabServicesLib.libKernelKernelMod.KernelNs.Status
  
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def building: building = "building".asInstanceOf[building]
  @scala.inline
  def busy: busy = "busy".asInstanceOf[busy]
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def dead: dead = "dead".asInstanceOf[dead]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  @scala.inline
  def disconnect: disconnect = "disconnect".asInstanceOf[disconnect]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  @scala.inline
  def iopub: iopub = "iopub".asInstanceOf[iopub]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  @scala.inline
  def needed: needed = "needed".asInstanceOf[needed]
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  @scala.inline
  def notebook: notebook = "notebook".asInstanceOf[notebook]
  @scala.inline
  def ok: ok = "ok".asInstanceOf[ok]
  @scala.inline
  def path: path = "path".asInstanceOf[path]
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  @scala.inline
  def reconnecting: reconnecting = "reconnecting".asInstanceOf[reconnecting]
  @scala.inline
  def recv: recv = "recv".asInstanceOf[recv]
  @scala.inline
  def rename: rename = "rename".asInstanceOf[rename]
  @scala.inline
  def restarting: restarting = "restarting".asInstanceOf[restarting]
  @scala.inline
  def save: save = "save".asInstanceOf[save]
  @scala.inline
  def search: search = "search".asInstanceOf[search]
  @scala.inline
  def send: send = "send".asInstanceOf[send]
  @scala.inline
  def set_size: set_size = "set_size".asInstanceOf[set_size]
  @scala.inline
  def shell: shell = "shell".asInstanceOf[shell]
  @scala.inline
  def stable: stable = "stable".asInstanceOf[stable]
  @scala.inline
  def starting: starting = "starting".asInstanceOf[starting]
  @scala.inline
  def stderr: stderr = "stderr".asInstanceOf[stderr]
  @scala.inline
  def stdin: stdin = "stdin".asInstanceOf[stdin]
  @scala.inline
  def stdout: stdout = "stdout".asInstanceOf[stdout]
  @scala.inline
  def tail: tail = "tail".asInstanceOf[tail]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def `type`: `type` = "type".asInstanceOf[`type`]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
}

