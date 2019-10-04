package typings.intlDashMessageformatDashParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import typings.intlDashMessageformatDashParser.distTypesMod.TYPE.argument
  import typings.intlDashMessageformatDashParser.distTypesMod.TYPE.date
  import typings.intlDashMessageformatDashParser.distTypesMod.TYPE.literal
  import typings.intlDashMessageformatDashParser.distTypesMod.TYPE.number
  import typings.intlDashMessageformatDashParser.distTypesMod.TYPE.time

  type ArgumentElement = BaseElement[argument]
  type DateElement = SimpleFormatElement[date, DateTimeSkeleton]
  type LiteralElement = BaseElement[literal]
  /* Rewritten from type alias, can be one of: 
    - typings.intlDashMessageformatDashParser.distTypesMod.LiteralElement
    - typings.intlDashMessageformatDashParser.distTypesMod.ArgumentElement
    - typings.intlDashMessageformatDashParser.distTypesMod.NumberElement
    - typings.intlDashMessageformatDashParser.distTypesMod.DateElement
    - typings.intlDashMessageformatDashParser.distTypesMod.TimeElement
    - typings.intlDashMessageformatDashParser.distTypesMod.SelectElement
    - typings.intlDashMessageformatDashParser.distTypesMod.PluralElement
  */
  type MessageFormatElement = _MessageFormatElement | LiteralElement | ArgumentElement | NumberElement | DateElement | TimeElement
  type NumberElement = SimpleFormatElement[number, NumberSkeleton]
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
