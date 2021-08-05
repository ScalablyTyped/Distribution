package typings.intlMessageformatParser

import typings.intlMessageformatParser.typesMod.DateTimeSkeleton
import typings.intlMessageformatParser.typesMod.LiteralElement
import typings.intlMessageformatParser.typesMod.MessageFormatElement
import typings.intlMessageformatParser.typesMod.NumberElement
import typings.intlMessageformatParser.typesMod.NumberSkeleton
import typings.intlMessageformatParser.typesMod.Options
import typings.intlMessageformatParser.typesMod.Skeleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDummyMod {
  
  @JSImport("intl-messageformat-parser/lib/dummy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("intl-messageformat-parser/lib/dummy", "TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.intlMessageformatParser.typesMod.TYPE & Double] = js.native
    
    /* 1 */ val argument: typings.intlMessageformatParser.typesMod.TYPE.argument & Double = js.native
    
    /* 3 */ val date: typings.intlMessageformatParser.typesMod.TYPE.date & Double = js.native
    
    /* 0 */ val literal: typings.intlMessageformatParser.typesMod.TYPE.literal & Double = js.native
    
    /* 2 */ val number: typings.intlMessageformatParser.typesMod.TYPE.number & Double = js.native
    
    /* 6 */ val plural: typings.intlMessageformatParser.typesMod.TYPE.plural & Double = js.native
    
    /* 7 */ val pound: typings.intlMessageformatParser.typesMod.TYPE.pound & Double = js.native
    
    /* 5 */ val select: typings.intlMessageformatParser.typesMod.TYPE.select & Double = js.native
    
    /* 8 */ val tag: typings.intlMessageformatParser.typesMod.TYPE.tag & Double = js.native
    
    /* 4 */ val time: typings.intlMessageformatParser.typesMod.TYPE.time & Double = js.native
  }
  
  inline def createLiteralElement(value: String): LiteralElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createLiteralElement")(value.asInstanceOf[js.Any]).asInstanceOf[LiteralElement]
  
  inline def createNumberElement(value: String): NumberElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any]).asInstanceOf[NumberElement]
  inline def createNumberElement(value: String, style: String): NumberElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[NumberElement]
  
  inline def isArgumentElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.ArgumentElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgumentElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.ArgumentElement */ Boolean]
  
  inline def isDateElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateElement */ Boolean]
  
  inline def isDateTimeSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")().asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ Boolean]
  inline def isDateTimeSkeleton(el: js.UndefOr[DateTimeSkeleton | Null | String]): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ Boolean]
  inline def isDateTimeSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ Boolean]
  
  inline def isLiteralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.LiteralElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.LiteralElement */ Boolean]
  
  inline def isNumberElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberElement */ Boolean]
  
  inline def isNumberSkeleton(el: js.UndefOr[String | NumberSkeleton | Null]): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberSkeleton */ Boolean]
  inline def isNumberSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberSkeleton */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberSkeleton */ Boolean]
  
  inline def isPluralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.PluralElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPluralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.PluralElement */ Boolean]
  
  inline def isPoundElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.PoundElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoundElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.PoundElement */ Boolean]
  
  inline def isSelectElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.SelectElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelectElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.SelectElement */ Boolean]
  
  inline def isTagElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.TagElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTagElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.TagElement */ Boolean]
  
  inline def isTimeElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.TimeElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.TimeElement */ Boolean]
  
  inline def parse(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Unit]
  
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
  - typings.intlMessageformatParser.parserMod.IParseOptions because Inheritance from two classes. Inlined filename, startRule, tracer */ trait ParseOptions
    extends StObject
       with Options {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var startRule: js.UndefOr[String] = js.undefined
    
    var tracer: js.UndefOr[js.Any] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setStartRule(value: String): Self = StObject.set(x, "startRule", value.asInstanceOf[js.Any])
      
      inline def setStartRuleUndefined: Self = StObject.set(x, "startRule", js.undefined)
      
      inline def setTracer(value: js.Any): Self = StObject.set(x, "tracer", value.asInstanceOf[js.Any])
      
      inline def setTracerUndefined: Self = StObject.set(x, "tracer", js.undefined)
    }
  }
}
