package typings.intlMessageformatParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object parserMod {
  
  type ParseFunction = js.Function2[
    /* input */ java.lang.String, 
    /* options */ js.UndefOr[typings.intlMessageformatParser.parserMod.IParseOptions], 
    js.Array[typings.intlMessageformatParser.typesMod.MessageFormatElement]
  ]
}
