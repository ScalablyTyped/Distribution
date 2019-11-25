package typings.atGrpcGrpcDashJs

import typings.atGrpcGrpcDashJs.atGrpcGrpcDashJsStrings.data
import typings.atGrpcGrpcDashJs.buildSrcEventsMod.EmitterAugmentation1
import typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.IntermediateObjectReadable
import typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.IntermediateObjectWritable
import typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.ObjectReadable
import typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.ObjectWritable
import typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.WriteCallback
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/object-stream", JSImport.Namespace)
@js.native
object buildSrcObjectDashStreamMod extends js.Object {
  @js.native
  trait IntermediateObjectReadable[T] extends Readable
  
  @js.native
  trait IntermediateObjectWritable[T] extends Writable {
    def _write(chunk: js.Any with T, encoding: String, callback: js.Function): Unit = js.native
    def end(chunk: js.Any with T, cb: js.Function): Unit = js.native
    def end(chunk: js.Any with T, encoding: js.Any): Unit = js.native
    def end(chunk: js.Any with T, encoding: js.Any, cb: js.Function): Unit = js.native
    def write(chunk: js.Any with T, encoding: js.Any): Boolean = js.native
    def write(chunk: js.Any with T, encoding: js.Any, cb: WriteCallback): Boolean = js.native
  }
  
  @js.native
  trait ObjectWritable[T] extends IntermediateObjectWritable[T] {
    def _write(chunk: T, encoding: String, callback: js.Function): Unit = js.native
    def end(chunk: T): Unit = js.native
    def end(chunk: T, cb: js.Function): Unit = js.native
    def end(chunk: T, encoding: js.Any): Unit = js.native
    def end(chunk: T, encoding: js.Any, cb: js.Function): Unit = js.native
    def write(chunk: T): Boolean = js.native
    def write(chunk: T, cb: js.Function): Boolean = js.native
    def write(chunk: T, encoding: js.Any): Boolean = js.native
    def write(chunk: T, encoding: js.Any, cb: js.Function): Boolean = js.native
  }
  
  type ObjectDuplex[T, U] = (Anon_Callback[U, T]) with Duplex with ObjectWritable[T] with ObjectReadable[U]
  type ObjectReadable[T] = Anon_Read[T] with (EmitterAugmentation1[data, T]) with IntermediateObjectReadable[T]
  type WriteCallback = js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
}

