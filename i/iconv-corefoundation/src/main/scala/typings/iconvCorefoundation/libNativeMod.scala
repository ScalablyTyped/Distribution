package typings.iconvCorefoundation

import typings.iconvCorefoundation.anon.DecodeOptionsSelectAndEnc
import typings.iconvCorefoundation.anon.SelectAndEncodeOptionsisE
import typings.node.bufferMod.global.Buffer
import typings.std.ArrayBufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNativeMod {
  
  @JSImport("iconv-corefoundation/lib/native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("iconv-corefoundation/lib/native", "StringEncoding")
  @js.native
  /** Instances of this class cannot be constructed directly. */
  /* private */ open class StringEncoding () extends StObject {
    
    /**
      * The numeric identifier of this {@link StringEncoding}.
      *
      * @remarks
      * This corresponds to the Core Foundation type {@link https://developer.apple.com/documentation/corefoundation/cfstringencoding?language=objc | CFStringEncoding}.
      *
      * Note that this is not a *unique* identifier. Core Foundation interprets many different values as Mac OS Roman. The `name` is more likely (though still not guaranteed) to be truly unique.
      */
    val cfStringEncoding: Double = js.native
    
    /**
      * Decodes the given text.
      *
      * @remarks
      * Throws {@link InvalidEncodedTextError} if the `text` is not valid in this encoding.
      *
      * @param text - The encoded text.
      * @param options - Options for decoding.
      * @returns The decoded text, as a string.
      */
    def decode(text: BufferLike): String = js.native
    def decode(text: BufferLike, options: DecodeOptions): String = js.native
    
    /**
      * Encodes the given text.
      *
      * @remarks
      * Throws {@link NotRepresentableError} if the `text` cannot be fully represented in this encoding, and `options` does not contain a `lossByte`.
      *
      * @param text - The text to encode.
      * @param options - Options for encoding.
      * @returns The encoded text, in a `Buffer`.
      */
    def encode(text: String): Buffer = js.native
    def encode(text: String, options: EncodeOptions): Buffer = js.native
    
    /**
      * Returns whether the given {@link StringEncoding} represents the same encoding as this one.
      *
      * @remarks
      * The Core Foundation framework doesn't have a corresponding function. Instead, this method is implemented by comparing the {@link StringEncoding.cfStringEncoding | cfStringEncoding} and {@link StringEncoding.name | name} properties.
      */
    def equals(other: StringEncoding): Boolean = js.native
    
    /**
      * The IANA character set name that is the closest mapping to this {@link StringEncoding}.
      *
      * @remarks
      * This is the return value of the Core Foundation function {@link https://developer.apple.com/documentation/corefoundation/1542710-cfstringconvertencodingtoianacha?language=objc | CFStringConvertEncodingToIANACharSetName}.
      */
    val ianaCharSetName: String = js.native
    
    /**
      * The canonical name of this {@link StringEncoding}. This is likely (but not guaranteed) to be a unique identifier for each distinct encoding.
      *
      * @remarks
      * This is the return value of the Core Foundation function {@link https://developer.apple.com/documentation/corefoundation/1543585-cfstringgetnameofencoding?language=objc | CFStringGetNameOfEncoding}.
      */
    val name: String = js.native
    
    /**
      * The Cocoa encoding constant that is the closest mapping to this {@link StringEncoding}.
      *
      * @remarks
      * This is the return value of the Core Foundation function {@link https://developer.apple.com/documentation/corefoundation/1543046-cfstringconvertencodingtonsstrin?language=objc | CFStringConvertEncodingToNSStringEncoding}.
      */
    val nsStringEncoding: Double | Null = js.native
    
    /**
      * The Windows codepage that is the closest mapping to this {@link StringEncoding}.
      *
      * @remarks
      * This is the return value of the Core Foundation function {@link https://developer.apple.com/documentation/corefoundation/1543125-cfstringconvertencodingtowindows?language=objc | CFStringConvertEncodingToWindowsCodepage}.
      */
    val windowsCodepage: Double | Null = js.native
  }
  /* static members */
  object StringEncoding {
    
    @JSImport("iconv-corefoundation/lib/native", "StringEncoding")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Looks up a {@link StringEncoding} by its {@link https://developer.apple.com/documentation/corefoundation/cfstringencoding?language=objc | numeric identifier}.
      *
      * @remarks
      * Throws {@link UnrecognizedEncodingError} if not recognized and supported.
      *
      * @returns The found {@link StringEncoding}.
      */
    inline def byCFStringEncoding(id: Double): StringEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("byCFStringEncoding")(id.asInstanceOf[js.Any]).asInstanceOf[StringEncoding]
    
    /**
      * Looks up a {@link StringEncoding} by corresponding IANA character set identifier.
      *
      * @remarks
      * Throws {@link UnrecognizedEncodingError} if not recognized and supported.
      *
      * This uses the Core Foundation function {@link https://developer.apple.com/documentation/corefoundation/1542975-cfstringconvertianacharsetnameto?language=objc | CFStringConvertIANACharSetNameToEncoding}.
      *
      * @returns The found {@link StringEncoding}.
      */
    inline def byIANACharSetName(charset: String): StringEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("byIANACharSetName")(charset.asInstanceOf[js.Any]).asInstanceOf[StringEncoding]
    
    /**
      * Looks up a {@link StringEncoding} by corresponding Cocoa encoding constant.
      *
      * @remarks
      * Throws {@link UnrecognizedEncodingError} if not recognized and supported.
      *
      * This uses the Core Foundation function {@link https://developer.apple.com/documentation/corefoundation/1542787-cfstringconvertnsstringencodingt?language=objc | CFStringConvertNSStringEncodingToEncoding}.
      *
      * @returns The found {@link StringEncoding}.
      */
    inline def byNSStringEncoding(nsStringEncoding: Double): StringEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("byNSStringEncoding")(nsStringEncoding.asInstanceOf[js.Any]).asInstanceOf[StringEncoding]
    
    /**
      * Looks up a {@link StringEncoding} by corresponding Windows codepage.
      *
      * @remarks
      * Throws {@link UnrecognizedEncodingError} if not recognized and supported.
      *
      * This uses the Core Foundation function {@link https://developer.apple.com/documentation/corefoundation/1542113-cfstringconvertwindowscodepageto?language=objc | CFStringConvertWindowsCodepageToEncoding}.
      *
      * @returns The found {@link StringEncoding}.
      */
    inline def byWindowsCodepage(codepage: Double): StringEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("byWindowsCodepage")(codepage.asInstanceOf[js.Any]).asInstanceOf[StringEncoding]
    
    /**
      * The default {@link StringEncoding} used by the operating system when it creates strings.
      *
      * @remarks
      * This uses the Core Foundation function {@link https://developer.apple.com/documentation/corefoundation/1541720-cfstringgetsystemencoding?language=objc | CFStringGetSystemEncoding}.
      */
    @JSImport("iconv-corefoundation/lib/native", "StringEncoding.system")
    @js.native
    val system: StringEncoding = js.native
  }
  
  inline def encodeSmallest(text: String): TextAndEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSmallest")(text.asInstanceOf[js.Any]).asInstanceOf[TextAndEncoding]
  inline def encodeSmallest(text: String, options: SelectAndEncodeOptionsisE): TextAndEncoding = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSmallest")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding]
  inline def encodeSmallest(text: String, options: SelectAndEncodeOptions): TextAndEncoding | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSmallest")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding | Null]
  
  inline def encodingExists(encoding: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingExists")(encoding.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def transcode(text: BufferLike, fromEncoding: String, toEncoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def transcode(text: BufferLike, fromEncoding: String, toEncoding: String, options: DecodeOptions & EncodeOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def transcode(text: BufferLike, fromEncoding: String, toEncoding: StringEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def transcode(
    text: BufferLike,
    fromEncoding: String,
    toEncoding: StringEncoding,
    options: DecodeOptions & EncodeOptions
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def transcode(text: BufferLike, fromEncoding: StringEncoding, toEncoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def transcode(
    text: BufferLike,
    fromEncoding: StringEncoding,
    toEncoding: String,
    options: DecodeOptions & EncodeOptions
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def transcode(text: BufferLike, fromEncoding: StringEncoding, toEncoding: StringEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def transcode(
    text: BufferLike,
    fromEncoding: StringEncoding,
    toEncoding: StringEncoding,
    options: DecodeOptions & EncodeOptions
  ): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], toEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def transcodeSmallest(text: BufferLike, fromEncoding: String): TextAndEncoding = (^.asInstanceOf[js.Dynamic].applyDynamic("transcodeSmallest")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding]
  inline def transcodeSmallest(text: BufferLike, fromEncoding: String, options: DecodeOptions & SelectAndEncodeOptions): TextAndEncoding | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transcodeSmallest")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding | Null]
  inline def transcodeSmallest(text: BufferLike, fromEncoding: String, options: DecodeOptionsSelectAndEnc): TextAndEncoding = (^.asInstanceOf[js.Dynamic].applyDynamic("transcodeSmallest")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding]
  inline def transcodeSmallest(text: BufferLike, fromEncoding: StringEncoding): TextAndEncoding = (^.asInstanceOf[js.Dynamic].applyDynamic("transcodeSmallest")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding]
  inline def transcodeSmallest(text: BufferLike, fromEncoding: StringEncoding, options: DecodeOptions & SelectAndEncodeOptions): TextAndEncoding | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transcodeSmallest")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding | Null]
  inline def transcodeSmallest(text: BufferLike, fromEncoding: StringEncoding, options: DecodeOptionsSelectAndEnc): TextAndEncoding = (^.asInstanceOf[js.Dynamic].applyDynamic("transcodeSmallest")(text.asInstanceOf[js.Any], fromEncoding.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextAndEncoding]
  
  type BufferLike = Buffer | js.typedarray.Uint8Array | js.typedarray.DataView | ArrayBufferLike
  
  trait DecodeOptions extends StObject
  
  trait EncodeOptions extends StObject {
    
    /**
      * Substitute for unrepresentable characters.
      *
      * @remarks
      * If the input text contains a character that is not representable in the output encoding, then this byte will be inserted as a placeholder in the output text.
      *
      * This property, if present, must be an integer between 1 and 255, inclusive.
      */
    var lossByte: js.UndefOr[Double] = js.undefined
  }
  object EncodeOptions {
    
    inline def apply(): EncodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodeOptions]
    }
    
    extension [Self <: EncodeOptions](x: Self) {
      
      inline def setLossByte(value: Double): Self = StObject.set(x, "lossByte", value.asInstanceOf[js.Any])
      
      inline def setLossByteUndefined: Self = StObject.set(x, "lossByte", js.undefined)
    }
  }
  
  trait SelectAndEncodeOptions
    extends StObject
       with EncodeOptions {
    
    /**
      * Decides whether to encode with the given {@link StringEncoding}.
      *
      * @remarks
      * This method is called by `encodeSmallest` and `transcodeSmallest` to let the application decide whether to proceed with Core Foundation's chosen smallest encoding, before actually performing the work of encoding the text.
      *
      * @param encoding - The selected {@link StringEncoding}.
      * @returns `true` if the text should be encoded; `false` to abort encoding. If this method returns `false`, then the calling function (`encodeSmallest` or `transcodeSmallest`) will return `null` instead of the encoded text.
      */
    var isEncodingOk: js.UndefOr[js.Function1[/* encoding */ StringEncoding, Boolean]] = js.undefined
  }
  object SelectAndEncodeOptions {
    
    inline def apply(): SelectAndEncodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectAndEncodeOptions]
    }
    
    extension [Self <: SelectAndEncodeOptions](x: Self) {
      
      inline def setIsEncodingOk(value: /* encoding */ StringEncoding => Boolean): Self = StObject.set(x, "isEncodingOk", js.Any.fromFunction1(value))
      
      inline def setIsEncodingOkUndefined: Self = StObject.set(x, "isEncodingOk", js.undefined)
    }
  }
  
  trait TextAndEncoding extends StObject {
    
    /** The encoding of the `text`. */
    var encoding: StringEncoding
    
    /** The encoded text. */
    var text: Buffer
  }
  object TextAndEncoding {
    
    inline def apply(encoding: StringEncoding, text: Buffer): TextAndEncoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextAndEncoding]
    }
    
    extension [Self <: TextAndEncoding](x: Self) {
      
      inline def setEncoding(value: StringEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setText(value: Buffer): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
