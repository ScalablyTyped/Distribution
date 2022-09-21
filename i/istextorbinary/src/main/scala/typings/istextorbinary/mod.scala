package typings.istextorbinary

import typings.istextorbinary.istextorbinaryStrings.binary
import typings.istextorbinary.istextorbinaryStrings.utf8
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istextorbinary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEncoding(): utf8 | binary | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncoding")().asInstanceOf[utf8 | binary | Null]
  inline def getEncoding(buffer: Null, opts: EncodingOpts): utf8 | binary | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getEncoding")(buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[utf8 | binary | Null]
  inline def getEncoding(buffer: Buffer): utf8 | binary | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncoding")(buffer.asInstanceOf[js.Any]).asInstanceOf[utf8 | binary | Null]
  inline def getEncoding(buffer: Buffer, opts: EncodingOpts): utf8 | binary | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getEncoding")(buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[utf8 | binary | Null]
  
  inline def isBinary(): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")().asInstanceOf[Boolean | Null]
  inline def isBinary(filename: String): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(filename.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  inline def isBinary(filename: String, buffer: Buffer): Boolean | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Boolean | Null]
  inline def isBinary(filename: Null, buffer: Buffer): Boolean | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Boolean | Null]
  inline def isBinary(filename: Unit, buffer: Buffer): Boolean | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Boolean | Null]
  
  inline def isText(): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("isText")().asInstanceOf[Boolean | Null]
  inline def isText(filename: String): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("isText")(filename.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  inline def isText(filename: String, buffer: Buffer): Boolean | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isText")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Boolean | Null]
  inline def isText(filename: Null, buffer: Buffer): Boolean | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isText")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Boolean | Null]
  inline def isText(filename: Unit, buffer: Buffer): Boolean | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isText")(filename.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Boolean | Null]
  
  trait EncodingOpts extends StObject {
    
    /** If not provided, will check the start, beginning, and end */
    var chunkBegin: js.UndefOr[Double] = js.undefined
    
    /** Defaults to 24 */
    var chunkLength: js.UndefOr[Double] = js.undefined
  }
  object EncodingOpts {
    
    inline def apply(): EncodingOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingOpts]
    }
    
    extension [Self <: EncodingOpts](x: Self) {
      
      inline def setChunkBegin(value: Double): Self = StObject.set(x, "chunkBegin", value.asInstanceOf[js.Any])
      
      inline def setChunkBeginUndefined: Self = StObject.set(x, "chunkBegin", js.undefined)
      
      inline def setChunkLength(value: Double): Self = StObject.set(x, "chunkLength", value.asInstanceOf[js.Any])
      
      inline def setChunkLengthUndefined: Self = StObject.set(x, "chunkLength", js.undefined)
    }
  }
}
