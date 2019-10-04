package typings.intlDashMessageformatDashParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distParserMod {
  import typings.intlDashMessageformatDashParser.distTypesMod.MessageFormatElement

  type ParseFunction = js.Function2[
    /* input */ String, 
    /* options */ js.UndefOr[IParseOptions], 
    js.Array[MessageFormatElement]
  ]
}
