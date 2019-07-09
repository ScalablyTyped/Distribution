package typings
package intlDashMessageformatDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libParserMod {
  type ParseFunction = js.Function2[
    /* input */ java.lang.String, 
    /* options */ js.UndefOr[IParseOptions], 
    js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement]
  ]
}
