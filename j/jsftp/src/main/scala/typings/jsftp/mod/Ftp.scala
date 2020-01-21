package typings.jsftp.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ftp extends EventEmitter {
  def destroy(): Unit = js.native
  def get(remotePath: String, callback: GetCallback): Unit = js.native
  def get(remotePath: String, localPath: String, callback: ErrorCallback): Unit = js.native
  def keepAlive(): Unit = js.native
  def keepAlive(timeInMs: Double): Unit = js.native
  def list(filePath: String, callback: ListCallback): Unit = js.native
  def ls(filePath: String, callback: LsCallback): Unit = js.native
  def put(source: String, remotePath: String, callback: ErrorCallback): Unit = js.native
  def put(source: Buffer, remotePath: String, callback: ErrorCallback): Unit = js.native
  def put(source: ReadableStream, remotePath: String, callback: ErrorCallback): Unit = js.native
  def raw(command: String, arg1: js.Any, arg2: js.Any, arg3: js.Any, arg4: js.Any, callback: RawCallback): Unit = js.native
  def raw(command: String, arg1: js.Any, arg2: js.Any, arg3: js.Any, callback: RawCallback): Unit = js.native
  def raw(command: String, arg1: js.Any, arg2: js.Any, callback: RawCallback): Unit = js.native
  def raw(command: String, arg1: js.Any, callback: RawCallback): Unit = js.native
  // Ftp.raw(command, params, callback)
  def raw(command: String, callback: RawCallback): Unit = js.native
  def rename(from: String, to: String, callback: ErrorCallback): Unit = js.native
}

