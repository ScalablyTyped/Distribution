package typings.he

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("he", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("he", "decode")
  @js.native
  def decode: Decode_ = js.native
  @scala.inline
  def decode_=(x: Decode_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decode")(x.asInstanceOf[js.Any])
  
  @JSImport("he", "encode")
  @js.native
  def encode: Encode_ = js.native
  @scala.inline
  def encode_=(x: Encode_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encode")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def escape(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("he", "unescape")
  @js.native
  def unescape: Decode_ = js.native
  @scala.inline
  def unescape_=(x: Decode_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unescape")(x.asInstanceOf[js.Any])
  
  @JSImport("he", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  trait DecodeOptions extends StObject {
    
    /**
      * The default value for the isAttributeValue option is false. This means
      * that decode() will decode the string as if it were used in a text
      * context in an HTML document. HTML has different rules for parsing
      * character references in attribute values — set this option to true to
      * treat the input string as if it were used as an attribute value.
      */
    var isAttributeValue: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The default value for the strict option is false. This means that
      * decode() will decode any HTML text content you feed it, even if it
      * contains any entities that cause parse errors. To throw an error when
      * such invalid HTML is encountered, set the strict option to true. This
      * option makes it possible to use he as part of HTML parsers and HTML
      * validators.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object DecodeOptions {
    
    @scala.inline
    def apply(): DecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptions]
    }
    
    @scala.inline
    implicit class DecodeOptionsMutableBuilder[Self <: DecodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsAttributeValue(value: Boolean): Self = StObject.set(x, "isAttributeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAttributeValueUndefined: Self = StObject.set(x, "isAttributeValue", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait Decode_ extends StObject {
    
    /**
      * Decode a string of HTML text
      *
      * This function takes a string of HTML and decodes any named and numerical
      * character references in it using the algorithm described in section
      * 12.2.4.69 of the HTML spec.
      */
    def apply(html: String): String = js.native
    def apply(html: String, options: DecodeOptions): String = js.native
    
    var options: DecodeOptions = js.native
  }
  
  trait EncodeOptions extends StObject {
    
    /**
      * The default value for the allowUnsafeSymbols option is false. This means
      * that characters that are unsafe for use in HTML content (&, <, >, ", ',
      * and `) will be encoded. When set to true, only non-ASCII characters will
      * be encoded. If the encodeEverything option is set to true, this option
      * will be ignored.
      */
    var allowUnsafeSymbols: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The default value for the decimal option is false. If the option is
      * enabled, encode will generally use decimal escapes (e.g. &#169;)
      * rather than hexadecimal escapes (e.g. &#xA9;). Beside of this
      * replacement, the basic behavior remains the same when combined with
      * other options. For example: if both options useNamedReferences and
      * decimal are enabled, named references (e.g. &copy;) are used over
      * decimal escapes. HTML entities without a named reference are encoded
      * using decimal escapes.
      */
    var decimal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The default value for the encodeEverything option is false. This means
      * that encode() will not use any character references for printable ASCII
      * symbols that don’t need escaping. Set it to true to encode every symbol
      * in the input string. When set to true, this option takes precedence over
      * allowUnsafeSymbols (i.e. setting the latter to true in such a case has
      * no effect).
      */
    var encodeEverything: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The default value for the strict option is false. This means that
      * encode() will encode any HTML text content you feed it, even if it
      * contains any symbols that cause parse errors. To throw an error when such
      * invalid HTML is encountered, set the strict option to true. This option
      * makes it possible to use he as part of HTML parsers and HTML validators.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The default value for the useNamedReferences option is false. This
      * means that encode() will not use any named character references
      * (e.g. &copy;) in the output — hexadecimal escapes (e.g. &#xA9;) will
      * be used instead. Set it to true to enable the use of named references.
      */
    var useNamedReferences: js.UndefOr[Boolean] = js.undefined
  }
  object EncodeOptions {
    
    @scala.inline
    def apply(): EncodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodeOptions]
    }
    
    @scala.inline
    implicit class EncodeOptionsMutableBuilder[Self <: EncodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUnsafeSymbols(value: Boolean): Self = StObject.set(x, "allowUnsafeSymbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnsafeSymbolsUndefined: Self = StObject.set(x, "allowUnsafeSymbols", js.undefined)
      
      @scala.inline
      def setDecimal(value: Boolean): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      @scala.inline
      def setEncodeEverything(value: Boolean): Self = StObject.set(x, "encodeEverything", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodeEverythingUndefined: Self = StObject.set(x, "encodeEverything", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setUseNamedReferences(value: Boolean): Self = StObject.set(x, "useNamedReferences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNamedReferencesUndefined: Self = StObject.set(x, "useNamedReferences", js.undefined)
    }
  }
  
  @js.native
  trait Encode_ extends StObject {
    
    /**
      * Encode a string of text
      *
      * This function takes a string of text and encodes (by default) any symbols
      * that aren’t printable ASCII symbols and &, <, >, ", ', and `, replacing
      * them with character references.
      *
      * As long as the input string contains allowed code points only, the return
      * value of this function is always valid HTML. Any (invalid) code points
      * that cannot be represented using a character reference in the input are
      * not encoded.
      */
    def apply(text: String): String = js.native
    def apply(text: String, options: EncodeOptions): String = js.native
    
    var options: EncodeOptions = js.native
  }
}
