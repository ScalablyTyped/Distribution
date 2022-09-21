package typings.jsBase64

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Base64 {
    
    @JSImport("js-base64", "Base64")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("js-base64", "Base64.VERSION")
    @js.native
    def VERSION_ : String = js.native
    
    inline def VERSION__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    inline def atob(asc: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("atob")(asc.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def atobPolyfill(asc: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("atobPolyfill")(asc.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def btoa(bin: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("btoa")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def btoaPolyfill(bin: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("btoaPolyfill")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def btou(b: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("btou")(b.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def decode(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(src.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encode(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(src.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def encode(src: String, urlsafe: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(src.asInstanceOf[js.Any], urlsafe.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def encodeURI(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeURI")(src.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encodeURL(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeURL")(src.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def extendBuiltins(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendBuiltins")().asInstanceOf[Unit]
    
    inline def extendString(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendString")().asInstanceOf[Unit]
    
    inline def extendUint8Array(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendUint8Array")().asInstanceOf[Unit]
    
    inline def fromBase64(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(src.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def fromUint8Array(u8a: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(u8a.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromUint8Array(u8a: js.typedarray.Uint8Array, urlsafe: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(u8a.asInstanceOf[js.Any], urlsafe.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def isValid(src: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(src.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def toBase64(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(src.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toBase64(src: String, urlsafe: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(src.asInstanceOf[js.Any], urlsafe.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toUint8Array(a: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(a.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def utob(u: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utob")(u.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("js-base64", "Base64.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @deprecated use lowercase `version`.
    */
  @JSImport("js-base64", "VERSION")
  @js.native
  val VERSION_ : /* "3.7.2" */ String = js.native
  
  /**
    * does what `window.atob` of web browsers do.
    * @param {String} asc Base64-encoded string
    * @returns {string} binary string
    */
  inline def atob(asc: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("atob")(asc.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * polyfill version of `atob`
    */
  inline def atobPolyfill(asc: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("atobPolyfill")(asc.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * does what `window.btoa` of web browsers do.
    * @param {String} bin binary string
    * @returns {string} Base64-encoded string
    */
  inline def btoa(bin: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("btoa")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * polyfill version of `btoa`
    */
  inline def btoaPolyfill(bin: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("btoaPolyfill")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @deprecated should have been internal use only.
    * @param {string} src UTF-16 string
    * @returns {string} UTF-8 string
    */
  inline def btou(b: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("btou")(b.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * converts a Base64 string to a UTF-8 string.
    * @param {String} src Base64 string.  Both normal and URL-safe are supported
    * @returns {string} UTF-8 string
    */
  inline def decode(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * converts a UTF-8-encoded string to a Base64 string.
    * @param {boolean} [urlsafe] if `true` make the result URL-safe
    * @returns {string} Base64 string
    */
  inline def encode(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(src: String, urlsafe: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(src.asInstanceOf[js.Any], urlsafe.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * converts a UTF-8-encoded string to URL-safe Base64 RFC4648 §5.
    * @returns {string} Base64 string
    */
  inline def encodeURI(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeURI")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * converts a UTF-8-encoded string to URL-safe Base64 RFC4648 §5.
    * @returns {string} Base64 string
    */
  inline def encodeURL(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeURL")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * extend Builtin prototypes with relevant methods
    */
  inline def extendBuiltins(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendBuiltins")().asInstanceOf[Unit]
  
  /**
    * extend String.prototype with relevant methods
    */
  inline def extendString(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendString")().asInstanceOf[Unit]
  
  /**
    * extend Uint8Array.prototype with relevant methods
    */
  inline def extendUint8Array(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendUint8Array")().asInstanceOf[Unit]
  
  /**
    * converts a Base64 string to a UTF-8 string.
    * @param {String} src Base64 string.  Both normal and URL-safe are supported
    * @returns {string} UTF-8 string
    */
  inline def fromBase64(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * converts a Uint8Array to a Base64 string.
    * @param {boolean} [urlsafe] URL-and-filename-safe a la RFC4648 §5
    * @returns {string} Base64 string
    */
  inline def fromUint8Array(u8a: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(u8a.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fromUint8Array(u8a: js.typedarray.Uint8Array, urlsafe: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(u8a.asInstanceOf[js.Any], urlsafe.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * check if a value is a valid Base64 string
    * @param {String} src a value to check
    */
  inline def isValid(src: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(src.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * converts a UTF-8-encoded string to a Base64 string.
    * @param {boolean} [urlsafe] if `true` make the result URL-safe
    * @returns {string} Base64 string
    */
  inline def toBase64(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(src.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toBase64(src: String, urlsafe: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(src.asInstanceOf[js.Any], urlsafe.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * converts a Base64 string to a Uint8Array.
    */
  inline def toUint8Array(a: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(a.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /**
    * @deprecated should have been internal use only.
    * @param {string} src UTF-8 string
    * @returns {string} UTF-16 string
    */
  inline def utob(u: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("utob")(u.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("js-base64", "version")
  @js.native
  val version: /* "3.7.2" */ String = js.native
}
