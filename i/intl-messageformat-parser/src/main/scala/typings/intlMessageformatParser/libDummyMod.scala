package typings.intlMessageformatParser

import typings.intlMessageformatParser.parserMod.IParseOptions
import typings.intlMessageformatParser.typesMod.DateTimeSkeleton
import typings.intlMessageformatParser.typesMod.LiteralElement
import typings.intlMessageformatParser.typesMod.MessageFormatElement
import typings.intlMessageformatParser.typesMod.NumberElement
import typings.intlMessageformatParser.typesMod.NumberSkeleton
import typings.intlMessageformatParser.typesMod.Options
import typings.intlMessageformatParser.typesMod.Skeleton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDummyMod {
  
  @JSImport("intl-messageformat-parser/lib/dummy", "TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.intlMessageformatParser.typesMod.TYPE with Double] = js.native
    
    /* 1 */ val argument: typings.intlMessageformatParser.typesMod.TYPE.argument with Double = js.native
    
    /* 3 */ val date: typings.intlMessageformatParser.typesMod.TYPE.date with Double = js.native
    
    /* 0 */ val literal: typings.intlMessageformatParser.typesMod.TYPE.literal with Double = js.native
    
    /* 2 */ val number: typings.intlMessageformatParser.typesMod.TYPE.number with Double = js.native
    
    /* 6 */ val plural: typings.intlMessageformatParser.typesMod.TYPE.plural with Double = js.native
    
    /* 7 */ val pound: typings.intlMessageformatParser.typesMod.TYPE.pound with Double = js.native
    
    /* 5 */ val select: typings.intlMessageformatParser.typesMod.TYPE.select with Double = js.native
    
    /* 8 */ val tag: typings.intlMessageformatParser.typesMod.TYPE.tag with Double = js.native
    
    /* 4 */ val time: typings.intlMessageformatParser.typesMod.TYPE.time with Double = js.native
  }
  
  @JSImport("intl-messageformat-parser/lib/dummy", "createLiteralElement")
  @js.native
  def createLiteralElement(value: String): LiteralElement = js.native
  
  @JSImport("intl-messageformat-parser/lib/dummy", "createNumberElement")
  @js.native
  def createNumberElement(value: String): NumberElement = js.native
  @JSImport("intl-messageformat-parser/lib/dummy", "createNumberElement")
  @js.native
  def createNumberElement(value: String, style: String): NumberElement = js.native
  
  @JSImport("intl-messageformat-parser/lib/dummy", "isArgumentElement")
  @js.native
  def isArgumentElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.ArgumentElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser/lib/dummy", "isDateElement")
  @js.native
  def isDateElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser/lib/dummy", "isDateTimeSkeleton")
  @js.native
  def isDateTimeSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ Boolean = js.native
  @JSImport("intl-messageformat-parser/lib/dummy", "isDateTimeSkeleton")
  @js.native
  def isDateTimeSkeleton(el: js.UndefOr[DateTimeSkeleton | Null | String]): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ Boolean = js.native
  @JSImport("intl-messageformat-parser/lib/dummy", "isDateTimeSkeleton")
  @js.native
  def isDateTimeSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.DateTimeSkeleton */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser/lib/dummy", "isLiteralElement")
  @js.native
  def isLiteralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.LiteralElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser/lib/dummy", "isNumberElement")
  @js.native
  def isNumberElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser/lib/dummy", "isNumberSkeleton")
  @js.native
  def isNumberSkeleton(el: js.UndefOr[String | NumberSkeleton | Null]): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberSkeleton */ Boolean = js.native
  @JSImport("intl-messageformat-parser/lib/dummy", "isNumberSkeleton")
  @js.native
  def isNumberSkeleton(el: Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.NumberSkeleton */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser/lib/dummy", "isPluralElement")
  @js.native
  def isPluralElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.PluralElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser/lib/dummy", "isPoundElement")
  @js.native
  def isPoundElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.PoundElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser/lib/dummy", "isSelectElement")
  @js.native
  def isSelectElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.SelectElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser/lib/dummy", "isTagElement")
  @js.native
  def isTagElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.TagElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser/lib/dummy", "isTimeElement")
  @js.native
  def isTimeElement(el: MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/lib/src/types.TimeElement */ Boolean = js.native
  
  @JSImport("intl-messageformat-parser/lib/dummy", "parse")
  @js.native
  def parse(): Unit = js.native
  
  type ParseOptions = Options with IParseOptions
}
