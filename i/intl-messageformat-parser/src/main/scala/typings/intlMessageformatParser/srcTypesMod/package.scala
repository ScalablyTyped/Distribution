package typings.intlMessageformatParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object srcTypesMod {
  
  type ArgumentElement = typings.intlMessageformatParser.srcTypesMod.BaseElement[typings.intlMessageformatParser.srcTypesMod.TYPE.argument]
  
  type DateElement = typings.intlMessageformatParser.srcTypesMod.SimpleFormatElement[
    typings.intlMessageformatParser.srcTypesMod.TYPE.date, 
    typings.intlMessageformatParser.srcTypesMod.DateTimeSkeleton
  ]
  
  type LiteralElement = typings.intlMessageformatParser.srcTypesMod.BaseElement[typings.intlMessageformatParser.srcTypesMod.TYPE.literal]
  
  /* Rewritten from type alias, can be one of: 
    - typings.intlMessageformatParser.srcTypesMod.LiteralElement
    - typings.intlMessageformatParser.srcTypesMod.ArgumentElement
    - typings.intlMessageformatParser.srcTypesMod.NumberElement
    - typings.intlMessageformatParser.srcTypesMod.DateElement
    - typings.intlMessageformatParser.srcTypesMod.TimeElement
    - typings.intlMessageformatParser.srcTypesMod.SelectElement
    - typings.intlMessageformatParser.srcTypesMod.PluralElement
    - typings.intlMessageformatParser.srcTypesMod.TagElement
    - typings.intlMessageformatParser.srcTypesMod.PoundElement
  */
  type MessageFormatElement = typings.intlMessageformatParser.srcTypesMod._MessageFormatElement | typings.intlMessageformatParser.srcTypesMod.LiteralElement | typings.intlMessageformatParser.srcTypesMod.ArgumentElement | typings.intlMessageformatParser.srcTypesMod.NumberElement | typings.intlMessageformatParser.srcTypesMod.DateElement | typings.intlMessageformatParser.srcTypesMod.TimeElement
  
  type NumberElement = typings.intlMessageformatParser.srcTypesMod.SimpleFormatElement[
    typings.intlMessageformatParser.srcTypesMod.TYPE.number, 
    typings.intlMessageformatParser.srcTypesMod.NumberSkeleton
  ]
  
  type TimeElement = typings.intlMessageformatParser.srcTypesMod.SimpleFormatElement[
    typings.intlMessageformatParser.srcTypesMod.TYPE.time, 
    typings.intlMessageformatParser.srcTypesMod.DateTimeSkeleton
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.intlMessageformatParser.intlMessageformatParserStrings.zero
    - typings.intlMessageformatParser.intlMessageformatParserStrings.one
    - typings.intlMessageformatParser.intlMessageformatParserStrings.two
    - typings.intlMessageformatParser.intlMessageformatParserStrings.few
    - typings.intlMessageformatParser.intlMessageformatParserStrings.many
    - typings.intlMessageformatParser.intlMessageformatParserStrings.other
    - java.lang.String
  */
  type ValidPluralRule = typings.intlMessageformatParser.srcTypesMod._ValidPluralRule | java.lang.String
  
  @scala.inline
  def createLiteralElement(value: java.lang.String): typings.intlMessageformatParser.srcTypesMod.LiteralElement = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createLiteralElement")(value.asInstanceOf[js.Any]).asInstanceOf[typings.intlMessageformatParser.srcTypesMod.LiteralElement]
  
  @scala.inline
  def createNumberElement(value: java.lang.String): typings.intlMessageformatParser.srcTypesMod.NumberElement = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any]).asInstanceOf[typings.intlMessageformatParser.srcTypesMod.NumberElement]
  @scala.inline
  def createNumberElement(value: java.lang.String, style: java.lang.String): typings.intlMessageformatParser.srcTypesMod.NumberElement = (typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("createNumberElement")(value.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[typings.intlMessageformatParser.srcTypesMod.NumberElement]
  
  @scala.inline
  def isArgumentElement(el: typings.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.ArgumentElement */ scala.Boolean = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isArgumentElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.ArgumentElement */ scala.Boolean]
  
  @scala.inline
  def isDateElement(el: typings.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateElement */ scala.Boolean = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDateElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateElement */ scala.Boolean]
  
  @scala.inline
  def isDateTimeSkeleton(): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ scala.Boolean = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")().asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ scala.Boolean]
  @scala.inline
  def isDateTimeSkeleton(
    el: js.UndefOr[
      typings.intlMessageformatParser.srcTypesMod.DateTimeSkeleton | scala.Null | java.lang.String
    ]
  ): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ scala.Boolean = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ scala.Boolean]
  @scala.inline
  def isDateTimeSkeleton(el: typings.intlMessageformatParser.srcTypesMod.Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ scala.Boolean = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isDateTimeSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.DateTimeSkeleton */ scala.Boolean]
  
  @scala.inline
  def isLiteralElement(el: typings.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.LiteralElement */ scala.Boolean = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.LiteralElement */ scala.Boolean]
  
  @scala.inline
  def isNumberElement(el: typings.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberElement */ scala.Boolean = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumberElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberElement */ scala.Boolean]
  
  @scala.inline
  def isNumberSkeleton(
    el: js.UndefOr[
      java.lang.String | typings.intlMessageformatParser.srcTypesMod.NumberSkeleton | scala.Null
    ]
  ): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ scala.Boolean = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ scala.Boolean]
  @scala.inline
  def isNumberSkeleton(el: typings.intlMessageformatParser.srcTypesMod.Skeleton): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ scala.Boolean = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumberSkeleton")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.NumberSkeleton */ scala.Boolean]
  
  @scala.inline
  def isPluralElement(el: typings.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.PluralElement */ scala.Boolean = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPluralElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.PluralElement */ scala.Boolean]
  
  @scala.inline
  def isPoundElement(el: typings.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.PoundElement */ scala.Boolean = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPoundElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.PoundElement */ scala.Boolean]
  
  @scala.inline
  def isSelectElement(el: typings.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.SelectElement */ scala.Boolean = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isSelectElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.SelectElement */ scala.Boolean]
  
  @scala.inline
  def isTagElement(el: typings.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.TagElement */ scala.Boolean = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTagElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.TagElement */ scala.Boolean]
  
  @scala.inline
  def isTimeElement(el: typings.intlMessageformatParser.srcTypesMod.MessageFormatElement): /* is intl-messageformat-parser.intl-messageformat-parser/src/types.TimeElement */ scala.Boolean = typings.intlMessageformatParser.srcTypesMod.^.asInstanceOf[js.Dynamic].applyDynamic("isTimeElement")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat-parser.intl-messageformat-parser/src/types.TimeElement */ scala.Boolean]
}
