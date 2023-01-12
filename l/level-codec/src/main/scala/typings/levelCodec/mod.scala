package typings.levelCodec

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Codec extends StObject {
    
    def createStreamDecoder(opts: CodecOptions): Any = js.native
    
    def decodeKey(key: Any): Any = js.native
    def decodeKey(key: Any, opts: CodecOptions): Any = js.native
    
    def decodeValue(value: Any): Any = js.native
    def decodeValue(value: Any, opts: CodecOptions): Any = js.native
    
    def encodeBatch(ops: Any): Any = js.native
    def encodeBatch(ops: Any, opts: CodecOptions): Any = js.native
    
    def encodeKey(key: Any): Any = js.native
    def encodeKey(key: Any, opts: Unit, batchOpts: CodecOptions): Any = js.native
    def encodeKey(key: Any, opts: CodecOptions): Any = js.native
    def encodeKey(key: Any, opts: CodecOptions, batchOpts: CodecOptions): Any = js.native
    
    def encodeLtgt(ltgt: Any): Any = js.native
    
    def encodeValue(value: Any): Any = js.native
    def encodeValue(value: Any, opts: Unit, batchOpts: CodecOptions): Any = js.native
    def encodeValue(value: Any, opts: CodecOptions): Any = js.native
    def encodeValue(value: Any, opts: CodecOptions, batchOpts: CodecOptions): Any = js.native
    
    def keyAsBuffer(): Any = js.native
    def keyAsBuffer(opts: CodecOptions): Any = js.native
    
    def valueAsBuffer(): Any = js.native
    def valueAsBuffer(opts: CodecOptions): Any = js.native
  }
  @JSImport("level-codec", "Codec")
  @js.native
  val Codec: CodecConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("level-codec", "Codec")
  @js.native
  open class CodecCls ()
    extends StObject
       with typings.levelCodec.mod.Codec {
    def this(options: CodecOptions) = this()
  }
  
  @js.native
  trait CodecConstructor
    extends StObject
       with Instantiable0[typings.levelCodec.mod.Codec]
       with Instantiable1[/* options */ CodecOptions, typings.levelCodec.mod.Codec] {
    
    def apply(): typings.levelCodec.mod.Codec = js.native
    def apply(options: CodecOptions): typings.levelCodec.mod.Codec = js.native
  }
  
  trait CodecEncoder extends StObject {
    
    var buffer: Boolean
    
    def decode(`val`: Any): Any
    
    def encode(`val`: Any): Any
    
    var `type`: String
  }
  object CodecEncoder {
    
    inline def apply(buffer: Boolean, decode: Any => Any, encode: Any => Any, `type`: String): CodecEncoder = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodecEncoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodecEncoder] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setDecode(value: Any => Any): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: Any => Any): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CodecOptions extends StObject {
    
    var keyEncoding: js.UndefOr[String | CodecEncoder] = js.undefined
    
    var valueEncoding: js.UndefOr[String | CodecEncoder] = js.undefined
  }
  object CodecOptions {
    
    inline def apply(): CodecOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodecOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodecOptions] (val x: Self) extends AnyVal {
      
      inline def setKeyEncoding(value: String | CodecEncoder): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setValueEncoding(value: String | CodecEncoder): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
      
      inline def setValueEncodingUndefined: Self = StObject.set(x, "valueEncoding", js.undefined)
    }
  }
}
