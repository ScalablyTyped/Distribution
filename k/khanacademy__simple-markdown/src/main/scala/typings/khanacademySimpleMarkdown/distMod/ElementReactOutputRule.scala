package typings.khanacademySimpleMarkdown.distMod

import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementReactOutputRule extends StObject {
  
  val react: NodeOutput[ReactElement]
}
object ElementReactOutputRule {
  
  inline def apply(
    react: (/* node */ SingleASTNode, /* nestedOutput */ Output[ReactElement], /* state */ State) => ReactElement
  ): ElementReactOutputRule = {
    val __obj = js.Dynamic.literal(react = js.Any.fromFunction3(react))
    __obj.asInstanceOf[ElementReactOutputRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementReactOutputRule] (val x: Self) extends AnyVal {
    
    inline def setReact(
      value: (/* node */ SingleASTNode, /* nestedOutput */ Output[ReactElement], /* state */ State) => ReactElement
    ): Self = StObject.set(x, "react", js.Any.fromFunction3(value))
  }
}
