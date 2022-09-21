package typings.levelTranscoder

import typings.levelTranscoder.formatsMod.BufferFormat
import typings.levelTranscoder.formatsMod.UTF8Format
import typings.levelTranscoder.formatsMod.ViewFormat
import typings.levelTranscoder.levelTranscoderStrings.buffer
import typings.levelTranscoder.levelTranscoderStrings.utf8
import typings.levelTranscoder.levelTranscoderStrings.view
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingMod {
  
  @JSImport("level-transcoder/lib/encoding", "Encoding")
  @js.native
  abstract class Encoding[TIn, TFormat, TOut] protected ()
    extends StObject
       with IEncoding[TIn, TFormat, TOut] {
    def this(options: IEncoding[TIn, TFormat, TOut]) = this()
    
    /**
      * Common name, computed from {@link name}. If this encoding is a
      * transcoder encoding, {@link name} will be for example 'json+view'
      * and {@link commonName} will be just 'json'. Else {@link name}
      * will equal {@link commonName}.
      */
    def commonName: String = js.native
    
    @JSName("createBufferTranscoder")
    def createBufferTranscoder_MEncoding(): BufferFormat[TIn, TOut] = js.native
    
    @JSName("createUTF8Transcoder")
    def createUTF8Transcoder_MEncoding(): UTF8Format[TIn, TOut] = js.native
    
    @JSName("createViewTranscoder")
    def createViewTranscoder_MEncoding(): ViewFormat[TIn, TOut] = js.native
    
    /**
      * Decode data.
      */
    /* CompleteClass */
    override def decode(data: TFormat): TOut = js.native
    
    /**
      * Encode data.
      */
    /* CompleteClass */
    override def encode(data: TIn): TFormat = js.native
    
    /**
      * The name of the (lower-level) encoding used by the return value of
      * {@link encode}. One of 'buffer', 'view', 'utf8'.
      */
    /* CompleteClass */
    var format: buffer | view | utf8 = js.native
    
    /**
      * Unique name.
      */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait IEncoding[TIn, TFormat, TOut]
    extends StObject
       with MixedEncoding[TIn, TFormat, TOut] {
    
    /**
      * Create a new encoding that transcodes {@link TFormat} from / to a buffer.
      */
    var createBufferTranscoder: js.UndefOr[js.Function0[BufferFormat[TIn, TOut]]] = js.undefined
    
    /**
      * Create a new encoding that transcodes {@link TFormat} from / to a UTF-8 string.
      */
    var createUTF8Transcoder: js.UndefOr[js.Function0[UTF8Format[TIn, TOut]]] = js.undefined
    
    /**
      * Create a new encoding that transcodes {@link TFormat} from / to a view.
      */
    var createViewTranscoder: js.UndefOr[js.Function0[ViewFormat[TIn, TOut]]] = js.undefined
    
    /**
      * Decode data.
      */
    def decode(data: TFormat): TOut
    
    /**
      * Encode data.
      */
    def encode(data: TIn): TFormat
    
    /**
      * The name of the (lower-level) encoding used by the return value of
      * {@link encode}. One of 'buffer', 'view', 'utf8'.
      */
    var format: buffer | view | utf8
    
    /**
      * Unique name.
      */
    var name: String
  }
  object IEncoding {
    
    inline def apply[TIn, TFormat, TOut](decode: TFormat => TOut, encode: TIn => TFormat, format: buffer | view | utf8, name: String): IEncoding[TIn, TFormat, TOut] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEncoding[TIn, TFormat, TOut]]
    }
    
    extension [Self <: IEncoding[?, ?, ?], TIn, TFormat, TOut](x: Self & (IEncoding[TIn, TFormat, TOut])) {
      
      inline def setCreateBufferTranscoder(value: () => BufferFormat[TIn, TOut]): Self = StObject.set(x, "createBufferTranscoder", js.Any.fromFunction0(value))
      
      inline def setCreateBufferTranscoderUndefined: Self = StObject.set(x, "createBufferTranscoder", js.undefined)
      
      inline def setCreateUTF8Transcoder(value: () => UTF8Format[TIn, TOut]): Self = StObject.set(x, "createUTF8Transcoder", js.Any.fromFunction0(value))
      
      inline def setCreateUTF8TranscoderUndefined: Self = StObject.set(x, "createUTF8Transcoder", js.undefined)
      
      inline def setCreateViewTranscoder(value: () => ViewFormat[TIn, TOut]): Self = StObject.set(x, "createViewTranscoder", js.Any.fromFunction0(value))
      
      inline def setCreateViewTranscoderUndefined: Self = StObject.set(x, "createViewTranscoder", js.undefined)
      
      inline def setDecode(value: TFormat => TOut): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: TIn => TFormat): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setFormat(value: buffer | view | utf8): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IExternalEncoding[TIn, TFormat, TOut]
    extends StObject
       with MixedEncoding[TIn, TFormat, TOut] {
    
    /**
      * Legacy `level-codec` option that means the same as `format: 'buffer'`
      * if true or `format: 'utf8'` if false.
      */
    var buffer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * To detect `multiformats`. If a number, then the encoding is
      * assumed to have a {@link format} of 'view'.
      * @see https://github.com/multiformats/js-multiformats/blob/master/src/codecs/interface.ts
      */
    var code: js.UndefOr[Any] = js.undefined
    
    /**
      * Decode data.
      */
    def decode(data: TFormat): TOut
    
    /**
      * Encode data.
      */
    def encode(data: TIn): TFormat
    
    /**
      * Unique name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Legacy `level-codec` alias for {@link name}. Used only when the
      * {@link name} option is undefined.
      */
    var `type`: js.UndefOr[Any] = js.undefined
  }
  object IExternalEncoding {
    
    inline def apply[TIn, TFormat, TOut](decode: TFormat => TOut, encode: TIn => TFormat): IExternalEncoding[TIn, TFormat, TOut] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[IExternalEncoding[TIn, TFormat, TOut]]
    }
    
    extension [Self <: IExternalEncoding[?, ?, ?], TIn, TFormat, TOut](x: Self & (IExternalEncoding[TIn, TFormat, TOut])) {
      
      inline def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setCode(value: Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDecode(value: TFormat => TOut): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: TIn => TFormat): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type KnownEncoding[N /* <: KnownEncodingName */, TFormat] = Encoding[KnownEncodingInput[N], TFormat, KnownEncodingOutput[N]]
  
  type KnownEncodingInput[N /* <: KnownEncodingName */] = Buffer | String | js.typedarray.Uint8Array
  
  /* Rewritten from type alias, can be one of: 
    - typings.levelTranscoder.levelTranscoderStrings.utf8
    - typings.levelTranscoder.levelTranscoderStrings.buffer
    - typings.levelTranscoder.levelTranscoderStrings.view
    - typings.levelTranscoder.levelTranscoderStrings.json
    - typings.levelTranscoder.levelTranscoderStrings.hex
    - typings.levelTranscoder.levelTranscoderStrings.base64
  */
  trait KnownEncodingName extends StObject
  object KnownEncodingName {
    
    inline def base64: typings.levelTranscoder.levelTranscoderStrings.base64 = "base64".asInstanceOf[typings.levelTranscoder.levelTranscoderStrings.base64]
    
    inline def buffer: typings.levelTranscoder.levelTranscoderStrings.buffer = "buffer".asInstanceOf[typings.levelTranscoder.levelTranscoderStrings.buffer]
    
    inline def hex: typings.levelTranscoder.levelTranscoderStrings.hex = "hex".asInstanceOf[typings.levelTranscoder.levelTranscoderStrings.hex]
    
    inline def json: typings.levelTranscoder.levelTranscoderStrings.json = "json".asInstanceOf[typings.levelTranscoder.levelTranscoderStrings.json]
    
    inline def utf8: typings.levelTranscoder.levelTranscoderStrings.utf8 = "utf8".asInstanceOf[typings.levelTranscoder.levelTranscoderStrings.utf8]
    
    inline def view: typings.levelTranscoder.levelTranscoderStrings.view = "view".asInstanceOf[typings.levelTranscoder.levelTranscoderStrings.view]
  }
  
  type KnownEncodingOutput[N /* <: KnownEncodingName */] = String | js.typedarray.Uint8Array | Buffer
  
  /* Rewritten from type alias, can be one of: 
    - typings.levelTranscoder.encodingMod.IEncoding[TIn, TFormat, TOut]
    - typings.levelTranscoder.encodingMod.IExternalEncoding[TIn, TFormat, TOut]
  */
  trait MixedEncoding[TIn, TFormat, TOut] extends StObject
  object MixedEncoding {
    
    inline def IEncoding[TIn, TFormat, TOut](decode: TFormat => TOut, encode: TIn => TFormat, format: buffer | view | utf8, name: String): typings.levelTranscoder.encodingMod.IEncoding[TIn, TFormat, TOut] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.levelTranscoder.encodingMod.IEncoding[TIn, TFormat, TOut]]
    }
    
    inline def IExternalEncoding[TIn, TFormat, TOut](decode: TFormat => TOut, encode: TIn => TFormat): typings.levelTranscoder.encodingMod.IExternalEncoding[TIn, TFormat, TOut] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[typings.levelTranscoder.encodingMod.IExternalEncoding[TIn, TFormat, TOut]]
    }
  }
  
  type PartialDecoder[TOut] = MixedEncoding[Any, Any, TOut]
  
  type PartialEncoder[TIn] = MixedEncoding[TIn, Any, Any]
  
  type PartialEncoding[TIn, TOut] = MixedEncoding[TIn, Any, TOut]
}
