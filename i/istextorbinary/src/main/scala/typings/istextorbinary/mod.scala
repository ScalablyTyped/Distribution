package typings.istextorbinary

import typings.istextorbinary.istextorbinaryStrings.binary
import typings.istextorbinary.istextorbinaryStrings.utf8
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istextorbinary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEncoding(buffer: Buffer, opts: Unit, next: js.Function2[/* err */ Null, /* result */ utf8 | binary, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getEncoding")(buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getEncoding(
    buffer: Buffer,
    opts: Options,
    next: js.Function2[/* err */ Null, /* result */ utf8 | binary, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getEncoding")(buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getEncodingSync(buffer: Buffer): utf8 | binary = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncodingSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[utf8 | binary]
  inline def getEncodingSync(buffer: Buffer, opts: Options): utf8 | binary = (^.asInstanceOf[js.Dynamic].applyDynamic("getEncodingSync")(buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[utf8 | binary]
  
  inline def isBinary(filename: String, buffer: Unit, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def isBinary(filename: String, buffer: Buffer, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def isBinary(filename: Unit, buffer: Buffer, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isBinarySync(filename: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinarySync")(filename.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isBinarySync(filename: String, buffer: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinarySync")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isBinarySync(filename: Unit, buffer: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinarySync")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isText(filename: String, buffer: Unit, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isText")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def isText(filename: String, buffer: Buffer, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isText")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def isText(filename: Unit, buffer: Buffer, next: js.Function2[/* err */ Null, /* result */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isText")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isTextSync(filename: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextSync")(filename.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isTextSync(filename: String, buffer: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTextSync")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTextSync(filename: Unit, buffer: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTextSync")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    var chunkBegin: js.UndefOr[Double] = js.undefined
    
    var chunkLength: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setChunkBegin(value: Double): Self = StObject.set(x, "chunkBegin", value.asInstanceOf[js.Any])
      
      inline def setChunkBeginUndefined: Self = StObject.set(x, "chunkBegin", js.undefined)
      
      inline def setChunkLength(value: Double): Self = StObject.set(x, "chunkLength", value.asInstanceOf[js.Any])
      
      inline def setChunkLengthUndefined: Self = StObject.set(x, "chunkLength", js.undefined)
    }
  }
}
