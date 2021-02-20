package typings.intlMessageformat

import typings.intlMessageformat.anon.FnCall
import typings.intlMessageformat.anon.Locale
import typings.intlMessageformat.anon.PartialFormats
import typings.intlMessageformat.formattersMod.FormatXMLElementFn
import typings.intlMessageformat.formattersMod.Formatters
import typings.intlMessageformat.formattersMod.MessageFormatPart
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.std.Date
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("intl-messageformat/lib/src/core", "IntlMessageFormat")
  @js.native
  class IntlMessageFormat protected () extends StObject {
    def this(message: String) = this()
    def this(message: js.Array[MessageFormatElement]) = this()
    def this(message: String, locales: String) = this()
    def this(message: String, locales: js.Array[String]) = this()
    def this(message: js.Array[MessageFormatElement], locales: String) = this()
    def this(message: js.Array[MessageFormatElement], locales: js.Array[String]) = this()
    def this(message: String, locales: js.UndefOr[scala.Nothing], overrideFormats: PartialFormats) = this()
    def this(message: String, locales: String, overrideFormats: PartialFormats) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.UndefOr[scala.Nothing],
      overrideFormats: PartialFormats
    ) = this()
    def this(message: js.Array[MessageFormatElement], locales: String, overrideFormats: PartialFormats) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: PartialFormats
    ) = this()
    def this(
      message: String,
      locales: js.UndefOr[scala.Nothing],
      overrideFormats: js.UndefOr[scala.Nothing],
      opts: Options
    ) = this()
    def this(
      message: String,
      locales: js.UndefOr[scala.Nothing],
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
    def this(message: String, locales: String, overrideFormats: js.UndefOr[scala.Nothing], opts: Options) = this()
    def this(message: String, locales: String, overrideFormats: PartialFormats, opts: Options) = this()
    def this(
      message: String,
      locales: js.Array[String],
      overrideFormats: js.UndefOr[scala.Nothing],
      opts: Options
    ) = this()
    def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats, opts: Options) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.UndefOr[scala.Nothing],
      overrideFormats: js.UndefOr[scala.Nothing],
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.UndefOr[scala.Nothing],
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: String,
      overrideFormats: js.UndefOr[scala.Nothing],
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: String,
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: js.UndefOr[scala.Nothing],
      opts: Options
    ) = this()
    def this(
      message: js.Array[MessageFormatElement],
      locales: js.Array[String],
      overrideFormats: PartialFormats,
      opts: Options
    ) = this()
    
    val ast: js.Any = js.native
    
    def format[T](): String | T | (js.Array[String | T]) = js.native
    def format[T](
      values: Record[
          String, 
          js.UndefOr[
            String | Double | Boolean | Date | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])]) | Null
          ]
        ]
    ): String | T | (js.Array[String | T]) = js.native
    
    def formatToParts[T](): js.Array[MessageFormatPart[T]] = js.native
    def formatToParts[T](
      values: Record[
          String, 
          js.UndefOr[
            String | Double | Boolean | Date | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])]) | Null
          ]
        ]
    ): js.Array[MessageFormatPart[T]] = js.native
    
    val formats: js.Any = js.native
    
    val formatterCache: js.Any = js.native
    
    val formatters: js.Any = js.native
    
    def getAst(): js.Array[MessageFormatElement] = js.native
    
    val locales: js.Any = js.native
    
    val message: js.Any = js.native
    
    def resolvedOptions(): Locale = js.native
  }
  /* static members */
  object IntlMessageFormat {
    
    @JSImport("intl-messageformat/lib/src/core", "IntlMessageFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("intl-messageformat/lib/src/core", "IntlMessageFormat.__parse")
    @js.native
    def __parse: js.UndefOr[FnCall] = js.native
    @scala.inline
    def __parse_=(x: js.UndefOr[FnCall]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__parse")(x.asInstanceOf[js.Any])
    
    @JSImport("intl-messageformat/lib/src/core", "IntlMessageFormat.formats")
    @js.native
    def formats: typings.intlMessageformat.anon.Date = js.native
    @scala.inline
    def formats_=(x: typings.intlMessageformat.anon.Date): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport("intl-messageformat/lib/src/core", "IntlMessageFormat.memoizedDefaultLocale")
    @js.native
    def memoizedDefaultLocale: js.Any = js.native
    @scala.inline
    def memoizedDefaultLocale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("memoizedDefaultLocale")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Options extends StObject {
    
    var formatters: js.UndefOr[Formatters] = js.native
    
    /**
      * Whether to treat HTML/XML tags as string literal
      * instead of parsing them as tag token.
      * When this is false we only allow simple tags without
      * any attributes
      */
    var ignoreTag: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatters(value: Formatters): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
      
      @scala.inline
      def setIgnoreTag(value: Boolean): Self = StObject.set(x, "ignoreTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTagUndefined: Self = StObject.set(x, "ignoreTag", js.undefined)
    }
  }
}
