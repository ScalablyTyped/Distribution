package typings.iarnaToml

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.Transform
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@iarna/toml", "parse")
  @js.native
  val parse: FuncParse = js.native
  
  @JSImport("@iarna/toml", "stringify")
  @js.native
  val stringify: FuncStringify = js.native
  
  type AnyJson = Boolean | Double | String | JsonMap | Date | JsonArray | js.Array[JsonArray]
  
  @js.native
  trait FuncParse extends StObject {
    
    /**
      * Synchronously parse a TOML string and return an object.
      */
    def apply(toml: String): JsonMap = js.native
    
    /**
      * Asynchronously parse a TOML string and return a promise of the resulting object.
      */
    def async(toml: String): js.Promise[JsonMap] = js.native
    def async(toml: String, options: ParseOptions): js.Promise[JsonMap] = js.native
    
    def stream(): Transform = js.native
    /**
      * Given a readable stream, parse it as it feeds us data. Return a promise of the resulting object.
      */
    def stream(readable: ReadableStream): js.Promise[JsonMap] = js.native
  }
  
  @js.native
  trait FuncStringify extends StObject {
    
    /**
      * Serialize an object as TOML.
      *
      * If an object `TOML.stringify` is serializing has a `toJSON` method
      * then it will call it to transform the object before serializing it.
      * This matches the behavior of JSON.stringify.
      *
      * The one exception to this is that `toJSON` is not called for `Date` objects
      * because JSON represents dates as strings and TOML can represent them natively.
      *
      * `moment` objects are treated the same as native `Date` objects, in this respect.
      */
    def apply(obj: JsonMap): String = js.native
    
    /**
      * Serialize a value as TOML would. This is a fragment and not a complete valid TOML document.
      */
    def value(any: AnyJson): String = js.native
  }
  
  type JsonArray = js.Array[Boolean | Date | Double | JsonMap | String]
  
  trait JsonMap
    extends StObject
       with /* key */ StringDictionary[AnyJson]
  object JsonMap {
    
    inline def apply(): JsonMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonMap]
    }
  }
  
  trait ParseOptions extends StObject {
    
    /**
      * The amount text to parser per pass through the event loop. Defaults to 40kb (`40000`).
      */
    var blocksize: Double
  }
  object ParseOptions {
    
    inline def apply(blocksize: Double): ParseOptions = {
      val __obj = js.Dynamic.literal(blocksize = blocksize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setBlocksize(value: Double): Self = StObject.set(x, "blocksize", value.asInstanceOf[js.Any])
    }
  }
}
