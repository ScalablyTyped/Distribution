package typings.khanacademySimpleMarkdown.distMod

import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.Capture
import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.MatchFunction
import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserRule extends StObject {
  
  val `match`: MatchFunction
  
  val order: Double
  
  val parse: ParseFunction
  
  val quality: js.UndefOr[
    js.Function3[/* capture */ Capture, /* state */ State, /* prevCapture */ String, Double]
  ] = js.undefined
}
object ParserRule {
  
  inline def apply(
    `match`: MatchFunction,
    order: Double,
    parse: (/* capture */ Capture, /* nestedParse */ Parser, /* state */ State) => UnTypedASTNode | ASTNode
  ): ParserRule = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], parse = js.Any.fromFunction3(parse))
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParserRule] (val x: Self) extends AnyVal {
    
    inline def setMatch(value: MatchFunction): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setParse(
      value: (/* capture */ Capture, /* nestedParse */ Parser, /* state */ State) => UnTypedASTNode | ASTNode
    ): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
    
    inline def setQuality(value: (/* capture */ Capture, /* state */ State, /* prevCapture */ String) => Double): Self = StObject.set(x, "quality", js.Any.fromFunction3(value))
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
