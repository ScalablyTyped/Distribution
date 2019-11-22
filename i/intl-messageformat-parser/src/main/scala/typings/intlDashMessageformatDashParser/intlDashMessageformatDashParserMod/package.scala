package typings.intlDashMessageformatDashParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object intlDashMessageformatDashParserMod {
  import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.TYPE.argument
  import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.TYPE.date
  import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.TYPE.literal
  import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.TYPE.number
  import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.TYPE.time

  type ArgumentElement = BaseElement[argument]
  type DateElement = SimpleFormatElement[date, DateTimeSkeleton]
  type LiteralElement = BaseElement[literal]
  /* Rewritten from type alias, can be one of: 
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.LiteralElement
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.ArgumentElement
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.NumberElement
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.DateElement
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.TimeElement
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.SelectElement
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.PluralElement
  */
  type MessageFormatElement = _MessageFormatElement | LiteralElement | ArgumentElement | NumberElement | DateElement | TimeElement
  type NumberElement = SimpleFormatElement[number, NumberSkeleton]
  type ParseFunction = js.Function2[
    /* input */ String, 
    /* options */ js.UndefOr[IParseOptions], 
    js.Array[MessageFormatElement]
  ]
  type ParseOptions = Options with IParseOptions
  type TimeElement = SimpleFormatElement[time, DateTimeSkeleton]
  /* Rewritten from type alias, can be one of: 
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.zero
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.one
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.two
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.few
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.many
    - typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserStrings.other
    - java.lang.String
  */
  type ValidPluralRule = _ValidPluralRule | String
}
