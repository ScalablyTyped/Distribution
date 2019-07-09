package typings
package intlDashMessageformatDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  type ArgumentElement = BaseElement[intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibNumbers.`1`]
  type DateElement = SimpleFormatElement[intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibNumbers.`3`]
  type LiteralElement = BaseElement[intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibNumbers.`0`]
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
  type NumberElement = SimpleFormatElement[intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibNumbers.`2`]
  type TimeElement = SimpleFormatElement[intlDashMessageformatDashParserLib.intlDashMessageformatDashParserLibNumbers.`4`]
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
