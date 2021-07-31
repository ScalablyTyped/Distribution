package typings.intlMessageformatParser

import typings.intlMessageformatParser.srcParserMod.Expectation
import typings.intlMessageformatParser.srcParserMod.IFileRange
import typings.intlMessageformatParser.srcParserMod.ParseFunction
import typings.intlMessageformatParser.srcTypesMod.DateTimeSkeleton
import typings.intlMessageformatParser.srcTypesMod.LiteralElement
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.intlMessageformatParser.srcTypesMod.NumberElement
import typings.intlMessageformatParser.srcTypesMod.NumberSkeleton
import typings.intlMessageformatParser.srcTypesMod.Options
import typings.intlMessageformatParser.srcTypesMod.Skeleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("intl-messageformat-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("intl-messageformat-parser", "SyntaxError")
  @js.native
  class SyntaxError protected ()
    extends typings.intlMessageformatParser.srcParserMod.SyntaxError {
    def this(message: String, expected: js.Array[Expectation], found: String, location: IFileRange) = this()
    def this(message: String, expected: js.Array[Expectation], found: Null, location: IFileRange) = this()
  }
  /* static members */
  object SyntaxError {
    
    @JSImport("intl-messageformat-parser", "SyntaxError")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def buildMessage(expected: js.Array[Expectation]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildMessage")(expected.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def buildMessage(expected: js.Array[Expectation], found: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMessage")(expected.asInstanceOf[js.Any], found.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("intl-messageformat-parser", "TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.intlMessageformatParser.srcTypesMod.TYPE & Double] = js.native
    
    /* 1 */ val argument: typings.intlMessageformatParser.srcTypesMod.TYPE.argument & Double = js.native
    
    /* 3 */ val date: typings.intlMessageformatParser.srcTypesMod.TYPE.date & Double = js.native
    
    /* 0 */ val literal: typings.intlMessageformatParser.srcTypesMod.TYPE.literal & Double = js.native
    
    /* 2 */ val number: typings.intlMessageformatParser.srcTypesMod.TYPE.number & Double = js.native
    
    /* 6 */ val plural: typings.intlMessageformatParser.srcTypesMod.TYPE.plural & Double = js.native
    
    /* 7 */ val pound: typings.intlMessageformatParser.srcTypesMod.TYPE.pound & Double = js.native
    
    /* 5 */ val select: typings.intlMessageformatParser.srcTypesMod.TYPE.select & Double = js.native
    
    /* 8 */ val tag: typings.intlMessageformatParser.srcTypesMod.TYPE.tag & Double = js.native
    
    /* 4 */ val time: typings.intlMessageformatParser.srcTypesMod.TYPE.time & Double = js.native
  }
  
  @scala.inline
  def createLiteralElement(value: String): LiteralElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createLiteralElement")(value.asInstanceOf[js.Any]).asInstanceOf[LiteralElement]
  
  @scala.inline
  def createNumberElement(value: String): NumberElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any]).asInstanceOf[NumberElement]
  @scala.inline
  def createNumberElement(value: String, style: String): NumberElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[NumberElement]
  
  @scala.inline
  def isArgumentElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.ArgumentElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgumentElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.ArgumentElement */ Boolean]
  
  @scala.inline
  def isDateElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateElement */ Boolean]
  
  @scala.inline
  def isDateTimeSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")().asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean]
  @scala.inline
  def isDateTimeSkeleton(el: js.UndefOr[DateTimeSkeleton | Null | String]): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean]
  @scala.inline
  def isDateTimeSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ Boolean]
  
  @scala.inline
  def isLiteralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.LiteralElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.LiteralElement */ Boolean]
  
  @scala.inline
  def isNumberElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberElement */ Boolean]
  
  @scala.inline
  def isNumberSkeleton(el: js.UndefOr[String | NumberSkeleton | Null]): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ Boolean]
  @scala.inline
  def isNumberSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ Boolean]
  
  @scala.inline
  def isPluralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.PluralElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPluralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.PluralElement */ Boolean]
  
  @scala.inline
  def isPoundElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.PoundElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoundElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.PoundElement */ Boolean]
  
  @scala.inline
  def isSelectElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.SelectElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelectElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.SelectElement */ Boolean]
  
  @scala.inline
  def isTagElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.TagElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTagElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.TagElement */ Boolean]
  
  @scala.inline
  def isTimeElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.TimeElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.TimeElement */ Boolean]
  
  @scala.inline
  def parse(input: String): js.Array[MessageFormatElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[MessageFormatElement]]
  @scala.inline
  def parse(input: String, opts: ParseOptions): js.Array[MessageFormatElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatElement]]
  
  @JSImport("intl-messageformat-parser", "pegParse")
  @js.native
  val pegParse: ParseFunction = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined 
  - typings.intlMessageformatParser.srcParserMod.IParseOptions because Inheritance from two classes. Inlined filename, startRule, tracer */ trait ParseOptions
    extends StObject
       with Options {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var startRule: js.UndefOr[String] = js.undefined
    
    var tracer: js.UndefOr[js.Any] = js.undefined
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setStartRule(value: String): Self = StObject.set(x, "startRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartRuleUndefined: Self = StObject.set(x, "startRule", js.undefined)
      
      @scala.inline
      def setTracer(value: js.Any): Self = StObject.set(x, "tracer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracerUndefined: Self = StObject.set(x, "tracer", js.undefined)
    }
  }
}
