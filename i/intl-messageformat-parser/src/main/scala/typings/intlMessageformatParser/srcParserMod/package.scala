package typings.intlMessageformatParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object srcParserMod {
  
  type ParseFunction = js.Function2[
    /* input */ java.lang.String, 
    /* options */ js.UndefOr[typings.intlMessageformatParser.srcParserMod.IParseOptions], 
    js.Array[typings.intlMessageformatParser.srcTypesMod.MessageFormatElement]
  ]
}
