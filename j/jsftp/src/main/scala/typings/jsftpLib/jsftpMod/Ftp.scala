package typings
package jsftpLib.jsftpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ftp
  extends nodeLib.eventsMod.EventEmitter {
  def destroy(): scala.Unit = js.native
  def get(remotePath: java.lang.String, callback: GetCallback): scala.Unit = js.native
  def get(remotePath: java.lang.String, localPath: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
  def keepAlive(): scala.Unit = js.native
  def keepAlive(timeInMs: scala.Double): scala.Unit = js.native
  def list(filePath: java.lang.String, callback: ListCallback): scala.Unit = js.native
  def ls(filePath: java.lang.String, callback: LsCallback): scala.Unit = js.native
  def put(source: java.lang.String, remotePath: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
  def put(source: nodeLib.Buffer, remotePath: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
  def put(source: nodeLib.NodeJSNs.ReadableStream, remotePath: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
  def raw(
    command: java.lang.String,
    arg1: js.Any,
    arg2: js.Any,
    arg3: js.Any,
    arg4: js.Any,
    callback: RawCallback
  ): scala.Unit = js.native
  def raw(command: java.lang.String, arg1: js.Any, arg2: js.Any, arg3: js.Any, callback: RawCallback): scala.Unit = js.native
  def raw(command: java.lang.String, arg1: js.Any, arg2: js.Any, callback: RawCallback): scala.Unit = js.native
  def raw(command: java.lang.String, arg1: js.Any, callback: RawCallback): scala.Unit = js.native
  // Ftp.raw(command, params, callback)
  def raw(command: java.lang.String, callback: RawCallback): scala.Unit = js.native
  def rename(from: java.lang.String, to: java.lang.String, callback: ErrorCallback): scala.Unit = js.native
}

