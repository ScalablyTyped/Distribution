package typings.intlDashMessageformatDashParser

import typings.intlDashMessageformatDashParser.libTypesMod.MessageFormatElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libParserMod {
  type ParseFunction = js.Function2[
    /* input */ String, 
    /* options */ js.UndefOr[IParseOptions], 
    js.Array[MessageFormatElement]
  ]
}
