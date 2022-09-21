package typings.ioredis

import org.scalablytyped.runtime.StringDictionary
import typings.ioredis.builtTypesMod.Callback
import typings.node.bufferMod.global.BufferEncoding
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("ioredis/built/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ioredis/built/utils", "CONNECTION_CLOSED_ERROR_MSG")
  @js.native
  val CONNECTION_CLOSED_ERROR_MSG: /* "Connection is closed." */ String = js.native
  
  inline def Debug(namespace: String): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Debug")(namespace.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  
  inline def convertBufferToString(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("convertBufferToString")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def convertBufferToString(value: Any, encoding: BufferEncoding): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convertBufferToString")(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def convertMapToArray[K, V](map: Map[K, V]): js.Array[K | V] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertMapToArray")(map.asInstanceOf[js.Any]).asInstanceOf[js.Array[K | V]]
  
  inline def convertObjectToArray[T](obj: Record[String, T]): js.Array[String | T] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertObjectToArray")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | T]]
  
  inline def isInt(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInt")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def optimizeErrorStack(error: js.Error, friendlyStack: String, filterPath: String): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("optimizeErrorStack")(error.asInstanceOf[js.Any], friendlyStack.asInstanceOf[js.Any], filterPath.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def packObject(array: js.Array[Any]): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("packObject")(array.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  
  inline def parseURL(url: String): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseURL")(url.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  
  inline def resolveTLSProfile(options: TLSOptions): TLSOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveTLSProfile")(options.asInstanceOf[js.Any]).asInstanceOf[TLSOptions]
  
  inline def sample[T](array: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sample")(array.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def sample[T](array: js.Array[T], from: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sample")(array.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def shuffle[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def timeout[T](callback: Callback[T], timeout: Double): Callback[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Callback[T]]
  
  inline def toArg(arg: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toArg")(arg.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def wrapMultiResult(): js.Array[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapMultiResult")().asInstanceOf[js.Array[js.Array[Any]]]
  inline def wrapMultiResult(arr: js.Array[Any]): js.Array[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapMultiResult")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Any]]]
  
  inline def zipMap[K, V](keys: js.Array[K], values: js.Array[V]): Map[K, V] = (^.asInstanceOf[js.Dynamic].applyDynamic("zipMap")(keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Map[K, V]]
  
  trait TLSOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var host: String
    
    var port: Double
  }
  object TLSOptions {
    
    inline def apply(host: String, port: Double): TLSOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[TLSOptions]
    }
    
    extension [Self <: TLSOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
