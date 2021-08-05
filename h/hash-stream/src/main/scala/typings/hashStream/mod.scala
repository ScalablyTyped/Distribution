package typings.hashStream

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(filename: String, algorithm: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def apply(
    filename: String,
    algorithm: String,
    callback: js.Function2[/* error */ Error | Null, /* hash */ Buffer, Unit]
  ): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def apply(stream: Readable, algorithm: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def apply(
    stream: Readable,
    algorithm: String,
    callback: js.Function2[/* error */ js.Any, /* hash */ Buffer, Unit]
  ): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  @JSImport("hash-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
