package typings.listr2.mod

import typings.listr2.anon.FnCall
import typings.node.processMod.global.NodeJS.WriteStream
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("listr2", "ProcessOutputStream")
@js.native
open class ProcessOutputStream protected () extends StObject {
  def this(stream: WriteStream) = this()
  
  /* private */ val buffer: Any = js.native
  
  def hijack(): Unit = js.native
  
  /* private */ val method: Any = js.native
  
  def out: WriteStream = js.native
  
  def release(): js.Array[ProcessOutputBufferEntry] = js.native
  
  /* private */ var stream: Any = js.native
  
  def write(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<NodeJS.WriteStream['write']> is not an array type */ args: Parameters[FnCall]
  ): ReturnType[FnCall] = js.native
}
