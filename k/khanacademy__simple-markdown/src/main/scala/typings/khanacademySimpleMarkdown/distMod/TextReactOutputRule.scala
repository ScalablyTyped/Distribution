package typings.khanacademySimpleMarkdown.distMod

import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextReactOutputRule extends StObject {
  
  val react: NodeOutput[String]
}
object TextReactOutputRule {
  
  inline def apply(react: (/* node */ SingleASTNode, /* nestedOutput */ Output[String], /* state */ State) => String): TextReactOutputRule = {
    val __obj = js.Dynamic.literal(react = js.Any.fromFunction3(react))
    __obj.asInstanceOf[TextReactOutputRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextReactOutputRule] (val x: Self) extends AnyVal {
    
    inline def setReact(value: (/* node */ SingleASTNode, /* nestedOutput */ Output[String], /* state */ State) => String): Self = StObject.set(x, "react", js.Any.fromFunction3(value))
  }
}
