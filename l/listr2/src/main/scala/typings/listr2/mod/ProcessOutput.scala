package typings.listr2.mod

import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new Listr2 process-output controller.
  *
  * This is used to control the flow to `process.stdout` and `process.stderr` for all renderers.
  *
  * @see {@link https://listr2.kilic.dev/renderer/process-output.html}
  */
@JSImport("listr2", "ProcessOutput")
@js.native
open class ProcessOutput () extends StObject {
  def this(stdout: WriteStream) = this()
  def this(stdout: Unit, stderr: WriteStream) = this()
  def this(stdout: WriteStream, stderr: WriteStream) = this()
  def this(stdout: Unit, stderr: Unit, options: ProcessOutputOptions) = this()
  def this(stdout: Unit, stderr: WriteStream, options: ProcessOutputOptions) = this()
  def this(stdout: WriteStream, stderr: Unit, options: ProcessOutputOptions) = this()
  def this(stdout: WriteStream, stderr: WriteStream, options: ProcessOutputOptions) = this()
  
  /* protected */ var active: Boolean = js.native
  
  def hijack(): Unit = js.native
  
  /* private */ val options: Any = js.native
  
  def release(): Unit = js.native
  
  def stderr: WriteStream = js.native
  
  def stdout: WriteStream = js.native
  
  val stream: ProcessOutputStreamMap = js.native
  
  def toStderr(buffer: String): Boolean = js.native
  def toStderr(buffer: String, eol: Boolean): Boolean = js.native
  
  def toStdout(buffer: String): Boolean = js.native
  def toStdout(buffer: String, eol: Boolean): Boolean = js.native
}
