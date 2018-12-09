package typings
package hashaLib.hashaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hasha", JSImport.Namespace)
@js.native
object hashaModMembers extends js.Object {
  def apply(input: hashaLib.hashaMod.hashaNs.HashaInput): java.lang.String = js.native
  def apply[E /* <: hashaLib.hashaMod.hashaNs.ToStringEncoding */](input: hashaLib.hashaMod.hashaNs.HashaInput, options: hashaLib.hashaMod.hashaNs.HashaOptions[E]): java.lang.String = js.native
  def fromFile(filePath: java.lang.String): js.Promise[java.lang.String | scala.Null] = js.native
  def fromFile[E /* <: hashaLib.hashaLibStrings.buffer */](filePath: java.lang.String, options: hashaLib.hashaMod.hashaNs.HashaOptions[E]): js.Promise[nodeLib.Buffer | scala.Null] = js.native
  def fromFileSync(filePath: java.lang.String): java.lang.String = js.native
  def fromFileSync[E /* <: hashaLib.hashaMod.hashaNs.ToStringEncoding */](filePath: java.lang.String, options: hashaLib.hashaMod.hashaNs.HashaOptions[E]): java.lang.String = js.native
  @JSName("fromFileSync")
  def fromFileSync_EbufferBuffer[E /* <: hashaLib.hashaLibStrings.buffer */](filePath: java.lang.String, options: hashaLib.hashaMod.hashaNs.HashaOptions[E]): nodeLib.Buffer = js.native
  @JSName("fromFile")
  def fromFile_EToStringEncoding[E /* <: hashaLib.hashaMod.hashaNs.ToStringEncoding */](filePath: java.lang.String, options: hashaLib.hashaMod.hashaNs.HashaOptions[E]): js.Promise[java.lang.String | scala.Null] = js.native
  def fromStream(stream: nodeLib.NodeJSNs.ReadableStream): js.Promise[java.lang.String | scala.Null] = js.native
  def fromStream[E /* <: hashaLib.hashaLibStrings.buffer */](stream: nodeLib.NodeJSNs.ReadableStream, options: hashaLib.hashaMod.hashaNs.HashaOptions[E]): js.Promise[nodeLib.Buffer | scala.Null] = js.native
  @JSName("fromStream")
  def fromStream_EToStringEncoding[E /* <: hashaLib.hashaMod.hashaNs.ToStringEncoding */](stream: nodeLib.NodeJSNs.ReadableStream): js.Promise[java.lang.String | scala.Null] = js.native
  @JSName("fromStream")
  def fromStream_EToStringEncoding[E /* <: hashaLib.hashaMod.hashaNs.ToStringEncoding */](stream: nodeLib.NodeJSNs.ReadableStream, options: hashaLib.hashaMod.hashaNs.HashaOptions[E]): js.Promise[java.lang.String | scala.Null] = js.native
  @JSName("fromStream")
  def fromStream_Ebuffer[E /* <: hashaLib.hashaLibStrings.buffer */](stream: nodeLib.NodeJSNs.ReadableStream): js.Promise[nodeLib.Buffer | scala.Null] = js.native
  def stream(): nodeLib.cryptoMod.Hash = js.native
  def stream(options: hashaLib.hashaMod.hashaNs.HashaOptions[hashaLib.hashaMod.hashaNs.HashaEncoding]): nodeLib.cryptoMod.Hash = js.native
}

