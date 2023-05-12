package typings.listr2.mod

import typings.listr2.anon.FnCall
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("listr2", "ProcessOutputBuffer")
@js.native
open class ProcessOutputBuffer () extends StObject {
  def this(options: ProcessOutputBufferOptions) = this()
  
  def all: js.Array[ProcessOutputBufferEntry] = js.native
  
  /* private */ var buffer: Any = js.native
  
  /* private */ val decoder: Any = js.native
  
  def last: ProcessOutputBufferEntry = js.native
  
  def length: Double = js.native
  
  /* private */ val options: Any = js.native
  
  def reset(): Unit = js.native
  
  def write(
    data: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | undefined | undefined, (err : Error | undefined): void | undefined] | [(err : Error | undefined): void | undefined] is not an array type */ args: js.Array[js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]]]
  ): ReturnType[FnCall] = js.native
  def write(
    data: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | undefined | undefined, (err : Error | undefined): void | undefined] | [(err : Error | undefined): void | undefined] is not an array type */ args: js.Tuple2[js.UndefOr[String], js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]]]
  ): ReturnType[FnCall] = js.native
  def write(
    data: js.typedarray.Uint8Array,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | undefined | undefined, (err : Error | undefined): void | undefined] | [(err : Error | undefined): void | undefined] is not an array type */ args: js.Array[js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]]]
  ): ReturnType[FnCall] = js.native
  def write(
    data: js.typedarray.Uint8Array,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [string | undefined | undefined, (err : Error | undefined): void | undefined] | [(err : Error | undefined): void | undefined] is not an array type */ args: js.Tuple2[js.UndefOr[String], js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]]]
  ): ReturnType[FnCall] = js.native
}
