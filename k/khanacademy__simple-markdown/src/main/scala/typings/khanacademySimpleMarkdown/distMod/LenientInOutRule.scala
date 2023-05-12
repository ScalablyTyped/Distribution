package typings.khanacademySimpleMarkdown.distMod

import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.Capture
import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.MatchFunction
import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LenientInOutRule
  extends StObject
     with SingleNodeParserRule
     with NonNullReactOutputRule
     with NonNullHtmlOutputRule
object LenientInOutRule {
  
  inline def apply(
    html: (/* node */ SingleASTNode, /* nestedOutput */ Output[String], /* state */ State) => String,
    `match`: MatchFunction,
    order: Double,
    parse: (/* capture */ Capture, /* nestedParse */ Parser, /* state */ State) => UnTypedASTNode,
    react: (/* node */ SingleASTNode, /* nestedOutput */ Output[ReactElements], /* state */ State) => ReactElements
  ): LenientInOutRule = {
    val __obj = js.Dynamic.literal(html = js.Any.fromFunction3(html), order = order.asInstanceOf[js.Any], parse = js.Any.fromFunction3(parse), react = js.Any.fromFunction3(react))
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LenientInOutRule]
  }
}
