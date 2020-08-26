package typings.intlMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArgumentElement = typings.intlMessageformat.mod.BaseElement[typings.intlMessageformat.mod.TYPE.argument]
  type DateElement = typings.intlMessageformat.mod.SimpleFormatElement[
    typings.intlMessageformat.mod.TYPE.date, 
    typings.intlMessageformat.mod.DateTimeSkeleton
  ]
  type FormatXMLElementFn[T, R] = js.Function1[/* parts */ js.Array[java.lang.String | T], R]
  type LiteralElement = typings.intlMessageformat.mod.BaseElement[typings.intlMessageformat.mod.TYPE.literal]
  /* Rewritten from type alias, can be one of: 
    - typings.intlMessageformat.mod.LiteralElement
    - typings.intlMessageformat.mod.ArgumentElement
    - typings.intlMessageformat.mod.NumberElement
    - typings.intlMessageformat.mod.DateElement
    - typings.intlMessageformat.mod.TimeElement
    - typings.intlMessageformat.mod.SelectElement
    - typings.intlMessageformat.mod.PluralElement
    - typings.intlMessageformat.mod.TagElement
    - typings.intlMessageformat.mod.PoundElement
  */
  type MessageFormatElement = typings.intlMessageformat.mod._MessageFormatElement | typings.intlMessageformat.mod.LiteralElement | typings.intlMessageformat.mod.ArgumentElement | typings.intlMessageformat.mod.NumberElement | typings.intlMessageformat.mod.DateElement | typings.intlMessageformat.mod.TimeElement
  type NumberElement = typings.intlMessageformat.mod.SimpleFormatElement[
    typings.intlMessageformat.mod.TYPE.number, 
    typings.intlMessageformat.mod.NumberSkeleton
  ]
  type ParseOptions = typings.intlMessageformat.mod.Options2 with typings.intlMessageformat.mod.IParseOptions
  type PrimitiveType = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null | typings.std.Date]
  type TimeElement = typings.intlMessageformat.mod.SimpleFormatElement[
    typings.intlMessageformat.mod.TYPE.time, 
    typings.intlMessageformat.mod.DateTimeSkeleton
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.intlMessageformat.intlMessageformatStrings.zero
    - typings.intlMessageformat.intlMessageformatStrings.one
    - typings.intlMessageformat.intlMessageformatStrings.two
    - typings.intlMessageformat.intlMessageformatStrings.few
    - typings.intlMessageformat.intlMessageformatStrings.many
    - typings.intlMessageformat.intlMessageformatStrings.other
    - java.lang.String
  */
  type ValidPluralRule = typings.intlMessageformat.mod._ValidPluralRule | java.lang.String
}
