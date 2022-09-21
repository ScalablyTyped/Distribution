package typings.grpcGrpcJs

import typings.grpcGrpcJs.eventsMod.EmitterAugmentation1
import typings.grpcGrpcJs.grpcGrpcJsStrings.data
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectStreamMod {
  
  @js.native
  trait IntermediateObjectReadable[T] extends Readable
  
  @js.native
  trait IntermediateObjectWritable[T] extends Writable {
    
    def _write(chunk: Any & T, encoding: String, callback: js.Function): Unit = js.native
    
    def end(chunk: Any & T, cb: js.Function): Unit | this.type = js.native
    def end(chunk: Any & T, encoding: Any): Unit | this.type = js.native
    def end(chunk: Any & T, encoding: Any, cb: js.Function): Unit | this.type = js.native
    def end(chunk: Any & T, encoding: Unit, cb: js.Function): Unit | this.type = js.native
    
    def setDefaultEncoding(encoding: String): this.type = js.native
    
    def write(chunk: Any & T, encoding: Any): Boolean = js.native
    def write(chunk: Any & T, encoding: Any, cb: WriteCallback): Boolean = js.native
    def write(chunk: Any & T, encoding: Unit, cb: WriteCallback): Boolean = js.native
  }
  
  @js.native
  trait ObjectReadable[T]
    extends IntermediateObjectReadable[T]
       with EmitterAugmentation1[data, T]
  
  @js.native
  trait ObjectWritable[T] extends IntermediateObjectWritable[T] {
    
    def write(chunk: T, cb: js.Function): Boolean = js.native
    def write(chunk: T, encoding: Any, cb: js.Function): Boolean = js.native
    def write(chunk: T, encoding: Unit, cb: js.Function): Boolean = js.native
  }
  
  type WriteCallback = js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
}
