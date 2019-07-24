package typings
package intlDashMessageformatDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  type ArgumentElement = BaseElement[intlDashMessageformatDashParserLib.libTypesMod.TYPE.argument]
  type DateElement = SimpleFormatElement[intlDashMessageformatDashParserLib.libTypesMod.TYPE.date]
  type LiteralElement = BaseElement[intlDashMessageformatDashParserLib.libTypesMod.TYPE.literal]
  /* Rewritten from type alias, can be one of: 
    - LiteralElement
    - ArgumentElement
    - NumberElement
    - DateElement
    - TimeElement
    - SelectElement
    - PluralElement
  */
  type MessageFormatElement = _MessageFormatElement | LiteralElement | ArgumentElement | NumberElement | DateElement | TimeElement
  type NumberElement = SimpleFormatElement[intlDashMessageformatDashParserLib.libTypesMod.TYPE.number]
  type TimeElement = SimpleFormatElement[intlDashMessageformatDashParserLib.libTypesMod.TYPE.time]
  /* Rewritten from type alias, can be one of: 
    - intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.zero
    - intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.one
    - intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.two
    - intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.few
    - intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.many
    - intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibStrings.other
    - java.lang.String
  */
  type ValidPluralRule = _ValidPluralRule | java.lang.String
}
