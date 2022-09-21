package typings.iconvLite

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iconv-lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(buffer: Buffer, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decode(buffer: Buffer, encoding: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodeStream(encoding: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(encoding.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def decodeStream(encoding: String, options: Options): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStream")(encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def encode(content: String, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(content.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encode(content: String, encoding: String, options: Options): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(content.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encodeStream(encoding: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(encoding.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def encodeStream(encoding: String, options: Options): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeStream")(encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def encodingExists(encoding: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingExists")(encoding.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getDecoder(encoding: String): DecoderStream = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecoder")(encoding.asInstanceOf[js.Any]).asInstanceOf[DecoderStream]
  inline def getDecoder(encoding: String, options: Options): DecoderStream = (^.asInstanceOf[js.Dynamic].applyDynamic("getDecoder")(encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecoderStream]
  
  inline def getEncoder(encoding: String): EncoderStream = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncoder")(encoding.asInstanceOf[js.Any]).asInstanceOf[EncoderStream]
  inline def getEncoder(encoding: String, options: Options): EncoderStream = (^.asInstanceOf[js.Dynamic].applyDynamic("getEncoder")(encoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EncoderStream]
}
