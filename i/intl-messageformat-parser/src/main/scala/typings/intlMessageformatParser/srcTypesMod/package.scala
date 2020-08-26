package typings.intlMessageformatParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}
