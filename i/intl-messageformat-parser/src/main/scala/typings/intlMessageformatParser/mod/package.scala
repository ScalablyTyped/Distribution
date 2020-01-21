package typings.intlMessageformatParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArgumentElement = typings.intlMessageformatParser.mod.BaseElement[typings.intlMessageformatParser.mod.TYPE.argument]
  type DateElement = typings.intlMessageformatParser.mod.SimpleFormatElement[
    typings.intlMessageformatParser.mod.TYPE.date, 
    typings.intlMessageformatParser.mod.DateTimeSkeleton
  ]
  type LiteralElement = typings.intlMessageformatParser.mod.BaseElement[typings.intlMessageformatParser.mod.TYPE.literal]
  /* Rewritten from type alias, can be one of: 
    - typings.intlMessageformatParser.mod.LiteralElement
    - typings.intlMessageformatParser.mod.ArgumentElement
    - typings.intlMessageformatParser.mod.NumberElement
    - typings.intlMessageformatParser.mod.DateElement
    - typings.intlMessageformatParser.mod.TimeElement
    - typings.intlMessageformatParser.mod.SelectElement
    - typings.intlMessageformatParser.mod.PluralElement
    - typings.intlMessageformatParser.mod.PoundElement
  */
  type MessageFormatElement = typings.intlMessageformatParser.mod._MessageFormatElement | typings.intlMessageformatParser.mod.LiteralElement | typings.intlMessageformatParser.mod.ArgumentElement | typings.intlMessageformatParser.mod.NumberElement | typings.intlMessageformatParser.mod.DateElement | typings.intlMessageformatParser.mod.TimeElement
  type NumberElement = typings.intlMessageformatParser.mod.SimpleFormatElement[
    typings.intlMessageformatParser.mod.TYPE.number, 
    typings.intlMessageformatParser.mod.NumberSkeleton
  ]
  type ParseFunction = js.Function2[
    /* input */ java.lang.String, 
    /* options */ js.UndefOr[typings.intlMessageformatParser.mod.IParseOptions], 
    js.Array[typings.intlMessageformatParser.mod.MessageFormatElement]
  ]
  type ParseOptions = typings.intlMessageformatParser.mod.Options with typings.intlMessageformatParser.mod.IParseOptions
  type TimeElement = typings.intlMessageformatParser.mod.SimpleFormatElement[
    typings.intlMessageformatParser.mod.TYPE.time, 
    typings.intlMessageformatParser.mod.DateTimeSkeleton
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
  type ValidPluralRule = typings.intlMessageformatParser.mod._ValidPluralRule | java.lang.String
}
