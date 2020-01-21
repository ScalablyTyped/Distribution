package typings.intlMessageformatParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ArgumentElement = typings.intlMessageformatParser.typesMod.BaseElement[typings.intlMessageformatParser.typesMod.TYPE.argument]
  type DateElement = typings.intlMessageformatParser.typesMod.SimpleFormatElement[
    typings.intlMessageformatParser.typesMod.TYPE.date, 
    typings.intlMessageformatParser.typesMod.DateTimeSkeleton
  ]
  type LiteralElement = typings.intlMessageformatParser.typesMod.BaseElement[typings.intlMessageformatParser.typesMod.TYPE.literal]
  /* Rewritten from type alias, can be one of: 
    - typings.intlMessageformatParser.typesMod.LiteralElement
    - typings.intlMessageformatParser.typesMod.ArgumentElement
    - typings.intlMessageformatParser.typesMod.NumberElement
    - typings.intlMessageformatParser.typesMod.DateElement
    - typings.intlMessageformatParser.typesMod.TimeElement
    - typings.intlMessageformatParser.typesMod.SelectElement
    - typings.intlMessageformatParser.typesMod.PluralElement
    - typings.intlMessageformatParser.typesMod.PoundElement
  */
  type MessageFormatElement = typings.intlMessageformatParser.typesMod._MessageFormatElement | typings.intlMessageformatParser.typesMod.LiteralElement | typings.intlMessageformatParser.typesMod.ArgumentElement | typings.intlMessageformatParser.typesMod.NumberElement | typings.intlMessageformatParser.typesMod.DateElement | typings.intlMessageformatParser.typesMod.TimeElement
  type NumberElement = typings.intlMessageformatParser.typesMod.SimpleFormatElement[
    typings.intlMessageformatParser.typesMod.TYPE.number, 
    typings.intlMessageformatParser.typesMod.NumberSkeleton
  ]
  type TimeElement = typings.intlMessageformatParser.typesMod.SimpleFormatElement[
    typings.intlMessageformatParser.typesMod.TYPE.time, 
    typings.intlMessageformatParser.typesMod.DateTimeSkeleton
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
  type ValidPluralRule = typings.intlMessageformatParser.typesMod._ValidPluralRule | java.lang.String
}
