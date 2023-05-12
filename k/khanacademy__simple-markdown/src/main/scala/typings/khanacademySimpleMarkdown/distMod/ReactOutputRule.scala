package typings.khanacademySimpleMarkdown.distMod

import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactOutputRule extends StObject {
  
  val react: ReactNodeOutput | Null
}
object ReactOutputRule {
  
  inline def apply(): ReactOutputRule = {
    val __obj = js.Dynamic.literal(react = null)
    __obj.asInstanceOf[ReactOutputRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReactOutputRule] (val x: Self) extends AnyVal {
    
    inline def setReact(
      value: (/* node */ SingleASTNode, /* nestedOutput */ Output[ReactElements], /* state */ State) => ReactElements
    ): Self = StObject.set(x, "react", js.Any.fromFunction3(value))
    
    inline def setReactNull: Self = StObject.set(x, "react", null)
  }
}
