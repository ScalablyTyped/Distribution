package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait helpers extends StObject {
  
  def helperExpression(node: Node): Boolean
  
  def scopeId(path: PathExpression): Boolean
  
  def simpleId(path: PathExpression): Boolean
}
object helpers {
  
  inline def apply(
    helperExpression: Node => Boolean,
    scopeId: PathExpression => Boolean,
    simpleId: PathExpression => Boolean
  ): helpers = {
    val __obj = js.Dynamic.literal(helperExpression = js.Any.fromFunction1(helperExpression), scopeId = js.Any.fromFunction1(scopeId), simpleId = js.Any.fromFunction1(simpleId))
    __obj.asInstanceOf[helpers]
  }
  
  extension [Self <: helpers](x: Self) {
    
    inline def setHelperExpression(value: Node => Boolean): Self = StObject.set(x, "helperExpression", js.Any.fromFunction1(value))
    
    inline def setScopeId(value: PathExpression => Boolean): Self = StObject.set(x, "scopeId", js.Any.fromFunction1(value))
    
    inline def setSimpleId(value: PathExpression => Boolean): Self = StObject.set(x, "simpleId", js.Any.fromFunction1(value))
  }
}
