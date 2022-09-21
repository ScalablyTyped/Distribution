package typings.lapoAsn1js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lapo/asn1js", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with ASN1 {
    def this(stream: Stream, header: Double, length: Double, tag: ASN1Tag, tagLen: Double) = this()
    def this(stream: Stream, header: Double, length: Double, tag: ASN1Tag, tagLen: Double, sub: js.Array[ASN1]) = this()
  }
  @JSImport("@lapo/asn1js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def decode(stream: StreamOrBinary): ASN1 = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(stream.asInstanceOf[js.Any]).asInstanceOf[ASN1]
  inline def decode(stream: StreamOrBinary, offset: Double): ASN1 = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(stream.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[ASN1]
  
  @js.native
  trait ASN1 extends StObject {
    
    def content(): String | Null = js.native
    def content(maxLength: Double): String | Null = js.native
    
    def decodeLength(stream: Stream): Double = js.native
    
    var header: Double = js.native
    
    var length: Double = js.native
    
    def posContent(): Double = js.native
    
    def posEnd(): Double = js.native
    
    def posLen(): Double = js.native
    
    def posStart(): Double = js.native
    
    var stream: Stream = js.native
    
    var sub: js.Array[ASN1] | Null = js.native
    
    var tag: ASN1Tag = js.native
    
    var tagLen: Double = js.native
    
    def toB64String(): String = js.native
    
    def toHexString(): String = js.native
    
    def toPrettyString(): String = js.native
    def toPrettyString(indent: String): String = js.native
    
    def typeName(): String = js.native
  }
  
  trait ASN1Tag extends StObject {
    
    def isEOC(): Boolean
    
    def isUniversal(): Boolean
    
    var tagClass: Double
    
    var tagConstructed: Boolean
    
    var tagNumber: Double
  }
  object ASN1Tag {
    
    inline def apply(
      isEOC: () => Boolean,
      isUniversal: () => Boolean,
      tagClass: Double,
      tagConstructed: Boolean,
      tagNumber: Double
    ): ASN1Tag = {
      val __obj = js.Dynamic.literal(isEOC = js.Any.fromFunction0(isEOC), isUniversal = js.Any.fromFunction0(isUniversal), tagClass = tagClass.asInstanceOf[js.Any], tagConstructed = tagConstructed.asInstanceOf[js.Any], tagNumber = tagNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[ASN1Tag]
    }
    
    extension [Self <: ASN1Tag](x: Self) {
      
      inline def setIsEOC(value: () => Boolean): Self = StObject.set(x, "isEOC", js.Any.fromFunction0(value))
      
      inline def setIsUniversal(value: () => Boolean): Self = StObject.set(x, "isUniversal", js.Any.fromFunction0(value))
      
      inline def setTagClass(value: Double): Self = StObject.set(x, "tagClass", value.asInstanceOf[js.Any])
      
      inline def setTagConstructed(value: Boolean): Self = StObject.set(x, "tagConstructed", value.asInstanceOf[js.Any])
      
      inline def setTagNumber(value: Double): Self = StObject.set(x, "tagNumber", value.asInstanceOf[js.Any])
    }
  }
  
  type Binary = String | js.Array[Double] | js.typedarray.Uint8Array
  
  @js.native
  trait Stream extends StObject {
    
    def b64Dump(start: Double, end: Double): String = js.native
    
    var enc: Binary = js.native
    
    def get(): Double = js.native
    def get(pos: Double): Double = js.native
    
    def hexByte(b: Double): String = js.native
    
    def hexDump(start: Double, end: Double, raw: Boolean): String = js.native
    
    def isASCII(start: Double, end: Double): Boolean = js.native
    
    def parseBitString(start: Double, end: Double, maxLength: Double): StreamParseReturn = js.native
    
    def parseInteger(start: Double, end: Double): String = js.native
    
    def parseOID(start: Double, end: Double, maxLength: Double): String = js.native
    
    def parseOctetString(start: Double, end: Double, maxLength: Double): StreamParseReturn = js.native
    
    def parseStringBMP(start: Double, end: Double, maxLength: Double): StreamParseReturn = js.native
    
    def parseStringISO(start: Double, end: Double, maxLength: Double): StreamParseReturn = js.native
    
    def parseStringT61(start: Double, end: Double, maxLength: Double): StreamParseReturn = js.native
    
    def parseStringUTF(start: Double, end: Double, maxLength: Double): StreamParseReturn = js.native
    
    def parseTime(start: Double, end: Double, shortYear: Boolean): String = js.native
    
    var pos: Double = js.native
  }
  
  type StreamOrBinary = Stream | Binary
  
  trait StreamParseReturn extends StObject {
    
    var size: Double
    
    var str: String
  }
  object StreamParseReturn {
    
    inline def apply(size: Double, str: String): StreamParseReturn = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamParseReturn]
    }
    
    extension [Self <: StreamParseReturn](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
    }
  }
}
