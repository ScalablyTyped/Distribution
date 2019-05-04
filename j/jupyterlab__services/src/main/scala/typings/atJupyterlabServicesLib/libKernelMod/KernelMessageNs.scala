package typings
package atJupyterlabServicesLib.libKernelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel", "KernelMessage")
@js.native
object KernelMessageNs extends js.Object {
  /**
    * Create a well-formed kernel message.
    */
  def createMessage(options: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IOptions): atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage = js.native
  def createMessage(
    options: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IOptions,
    content: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  ): atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage = js.native
  def createMessage(
    options: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IOptions,
    content: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  ): atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage = js.native
  def createMessage(
    options: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IOptions,
    content: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    buffers: js.Array[stdLib.ArrayBuffer | stdLib.ArrayBufferView]
  ): atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage = js.native
  /**
    * Create a well-formed kernel shell message.
    */
  def createShellMessage(options: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IOptions): atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IShellMessage = js.native
  def createShellMessage(
    options: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IOptions,
    content: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  ): atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IShellMessage = js.native
  def createShellMessage(
    options: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IOptions,
    content: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  ): atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IShellMessage = js.native
  def createShellMessage(
    options: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IOptions,
    content: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    metadata: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    buffers: js.Array[stdLib.ArrayBuffer | stdLib.ArrayBufferView]
  ): atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IShellMessage = js.native
  /**
    * Test whether a kernel message is a `'clear_output'` message.
    */
  def isClearOutputMsg(msg: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IClearOutputMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is a `'comm_close'` message.
    */
  def isCommCloseMsg(msg: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommCloseMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is a `'comm_msg'` message.
    */
  def isCommMsgMsg(msg: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommMsgMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is a `'comm_open'` message.
    */
  def isCommOpenMsg(msg: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.ICommOpenMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is an `'display_data'` message.
    */
  def isDisplayDataMsg(msg: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IDisplayDataMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is an `'error'` message.
    */
  def isErrorMsg(msg: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IErrorMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is an `'execute_input'` message.
    */
  def isExecuteInputMsg(msg: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IExecuteInputMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is an `'execute_reply'` message.
    */
  def isExecuteReplyMsg(msg: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IExecuteReplyMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is an `'execute_result'` message.
    */
  def isExecuteResultMsg(msg: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IExecuteResultMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is an `'input_request'` message.
    */
  def isInputRequestMsg(msg: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IInputRequestMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is a `'status'` message.
    */
  def isStatusMsg(msg: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IStatusMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is a `'stream'` message.
    */
  def isStreamMsg(msg: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IStreamMsg */ scala.Boolean = js.native
  /**
    * Test whether a kernel message is an `'update_display_data'` message.
    */
  def isUpdateDisplayDataMsg(msg: atJupyterlabServicesLib.libKernelMessagesMod.KernelMessageNs.IMessage): /* is @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.IUpdateDisplayDataMsg */ scala.Boolean = js.native
}

