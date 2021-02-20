package typings.handlebars.hbs.AST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait helpers extends StObject {
  
  def helperExpression(node: Node): Boolean = js.native
  
  def scopeId(path: PathExpression): Boolean = js.native
  
  def simpleId(path: PathExpression): Boolean = js.native
}
object helpers {
  
  @scala.inline
  def apply(
    helperExpression: Node => Boolean,
    scopeId: PathExpression => Boolean,
    simpleId: PathExpression => Boolean
  ): helpers = {
    val __obj = js.Dynamic.literal(helperExpression = js.Any.fromFunction1(helperExpression), scopeId = js.Any.fromFunction1(scopeId), simpleId = js.Any.fromFunction1(simpleId))
    __obj.asInstanceOf[helpers]
  }
  
  @scala.inline
  implicit class helpersMutableBuilder[Self <: helpers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHelperExpression(value: Node => Boolean): Self = StObject.set(x, "helperExpression", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScopeId(value: PathExpression => Boolean): Self = StObject.set(x, "scopeId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSimpleId(value: PathExpression => Boolean): Self = StObject.set(x, "simpleId", js.Any.fromFunction1(value))
  }
}
