package typings.libmime

import org.scalablytyped.runtime.StringDictionary
import typings.libmime.anon.Key
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("libmime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildHeaderParam(key: String, data: String): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHeaderParam")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  inline def buildHeaderParam(key: String, data: String, maxLength: Double): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHeaderParam")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  inline def buildHeaderParam(key: String, data: String, maxLength: Double, fromCharset: String): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHeaderParam")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  inline def buildHeaderParam(key: String, data: String, maxLength: Unit, fromCharset: String): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHeaderParam")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  inline def buildHeaderParam(key: String, data: Buffer): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHeaderParam")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  inline def buildHeaderParam(key: String, data: Buffer, maxLength: Double): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHeaderParam")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  inline def buildHeaderParam(key: String, data: Buffer, maxLength: Double, fromCharset: String): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHeaderParam")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  inline def buildHeaderParam(key: String, data: Buffer, maxLength: Unit, fromCharset: String): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHeaderParam")(key.asInstanceOf[js.Any], data.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  inline def buildHeaderValue(structuredHeader: StructuredHeader): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildHeaderValue")(structuredHeader.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decodeFlowed(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFlowed")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeFlowed(str: String, delSp: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFlowed")(str.asInstanceOf[js.Any], delSp.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodeHeader(headerLine: String): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHeader")(headerLine.asInstanceOf[js.Any]).asInstanceOf[Key]
  
  inline def decodeHeaders(headers: String): StringDictionary[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHeaders")(headers.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Array[String]]]
  
  inline def decodeWord(charset: String, mimeWordEncoding: MimeWordEncoding, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeWord")(charset.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decodeWords(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeWords")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def detectExtension(mimeType: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("detectExtension")(mimeType.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def detectMimeType(`extension`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("detectMimeType")(`extension`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeFlowed(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeFlowed")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeFlowed(str: String, lineLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeFlowed")(str.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeWord(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeWord(data: String, mimeWordEncoding: Unit, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWord(data: String, mimeWordEncoding: MimeWordEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWord(data: String, mimeWordEncoding: MimeWordEncoding, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWord(data: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeWord(data: Buffer, mimeWordEncoding: Unit, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWord(data: Buffer, mimeWordEncoding: MimeWordEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWord(data: Buffer, mimeWordEncoding: MimeWordEncoding, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWord")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeWords(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeWords(data: String, mimeWordEncoding: Unit, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: String, mimeWordEncoding: Unit, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: String, mimeWordEncoding: Unit, maxLength: Double, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: String, mimeWordEncoding: Unit, maxLength: Unit, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: String, mimeWordEncoding: MimeWordEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: String, mimeWordEncoding: MimeWordEncoding, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: String, mimeWordEncoding: MimeWordEncoding, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: String, mimeWordEncoding: MimeWordEncoding, maxLength: Double, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: String, mimeWordEncoding: MimeWordEncoding, maxLength: Unit, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeWords(data: Buffer, mimeWordEncoding: Unit, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: Buffer, mimeWordEncoding: Unit, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: Buffer, mimeWordEncoding: Unit, maxLength: Double, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: Buffer, mimeWordEncoding: Unit, maxLength: Unit, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: Buffer, mimeWordEncoding: MimeWordEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: Buffer, mimeWordEncoding: MimeWordEncoding, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: Buffer, mimeWordEncoding: MimeWordEncoding, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: Buffer, mimeWordEncoding: MimeWordEncoding, maxLength: Double, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encodeWords(data: Buffer, mimeWordEncoding: MimeWordEncoding, maxLength: Unit, fromCharset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWords")(data.asInstanceOf[js.Any], mimeWordEncoding.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], fromCharset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def foldLines(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("foldLines")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def foldLines(str: String, lineLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldLines")(str.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldLines(str: String, lineLength: Double, afterSpace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldLines")(str.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any], afterSpace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldLines(str: String, lineLength: Unit, afterSpace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldLines")(str.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any], afterSpace.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseHeaderValue(valueString: String): StructuredHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHeaderValue")(valueString.asInstanceOf[js.Any]).asInstanceOf[StructuredHeader]
  
  /* Rewritten from type alias, can be one of: 
    - typings.libmime.libmimeStrings.Q
    - typings.libmime.libmimeStrings.B
  */
  trait MimeWordEncoding extends StObject
  object MimeWordEncoding {
    
    inline def B: typings.libmime.libmimeStrings.B = "B".asInstanceOf[typings.libmime.libmimeStrings.B]
    
    inline def Q: typings.libmime.libmimeStrings.Q = "Q".asInstanceOf[typings.libmime.libmimeStrings.Q]
  }
  
  trait StructuredHeader extends StObject {
    
    var params: StringDictionary[String]
    
    var value: String
  }
  object StructuredHeader {
    
    inline def apply(params: StringDictionary[String], value: String): StructuredHeader = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StructuredHeader]
    }
    
    extension [Self <: StructuredHeader](x: Self) {
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
