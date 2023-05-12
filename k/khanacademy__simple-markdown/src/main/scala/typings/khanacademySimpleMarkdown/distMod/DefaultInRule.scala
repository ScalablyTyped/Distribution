package typings.khanacademySimpleMarkdown.distMod

import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.Capture
import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.MatchFunction
import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultInRule
  extends StObject
     with SingleNodeParserRule
     with ReactOutputRule
     with HtmlOutputRule
object DefaultInRule {
  
  inline def apply(
    `match`: MatchFunction,
    order: Double,
    parse: (/* capture */ Capture, /* nestedParse */ Parser, /* state */ State) => UnTypedASTNode
  ): DefaultInRule = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], parse = js.Any.fromFunction3(parse), html = null, react = null)
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultInRule]
  }
}
