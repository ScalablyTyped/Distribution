package typings.grpcGrpcJs

import typings.grpcGrpcJs.eventsMod.EmitterAugmentation1
import typings.grpcGrpcJs.grpcGrpcJsStrings.data
import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/object-stream", JSImport.Namespace)
@js.native
object objectStreamMod extends js.Object {
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
  
  type ObjectDuplex[T, U] = (AnonCallback[U, T]) with Duplex with ObjectWritable[T] with ObjectReadable[U]
  type ObjectReadable[T] = AnonRead[T] with (EmitterAugmentation1[data, T]) with IntermediateObjectReadable[T]
  type WriteCallback = js.Function1[/* error */ js.UndefOr[Error | Null], Unit]
}

