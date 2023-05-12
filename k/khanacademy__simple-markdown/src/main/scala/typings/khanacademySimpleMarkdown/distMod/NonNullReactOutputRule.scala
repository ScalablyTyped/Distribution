package typings.khanacademySimpleMarkdown.distMod

import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonNullReactOutputRule extends StObject {
  
  val react: ReactNodeOutput
}
object NonNullReactOutputRule {
  
  inline def apply(
    react: (/* node */ SingleASTNode, /* nestedOutput */ Output[ReactElements], /* state */ State) => ReactElements
  ): NonNullReactOutputRule = {
    val __obj = js.Dynamic.literal(react = js.Any.fromFunction3(react))
    __obj.asInstanceOf[NonNullReactOutputRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonNullReactOutputRule] (val x: Self) extends AnyVal {
    
    inline def setReact(
      value: (/* node */ SingleASTNode, /* nestedOutput */ Output[ReactElements], /* state */ State) => ReactElements
    ): Self = StObject.set(x, "react", js.Any.fromFunction3(value))
  }
}
