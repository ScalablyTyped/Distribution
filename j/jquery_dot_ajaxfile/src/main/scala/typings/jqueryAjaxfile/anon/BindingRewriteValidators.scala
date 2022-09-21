package typings.jqueryAjaxfile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingRewriteValidators extends StObject {
  
  var bindingRewriteValidators: Any
  
  def parseObjectLiteral(objectLiteralString: String): js.Array[Any]
}
object BindingRewriteValidators {
  
  inline def apply(bindingRewriteValidators: Any, parseObjectLiteral: String => js.Array[Any]): BindingRewriteValidators = {
    val __obj = js.Dynamic.literal(bindingRewriteValidators = bindingRewriteValidators.asInstanceOf[js.Any], parseObjectLiteral = js.Any.fromFunction1(parseObjectLiteral))
    __obj.asInstanceOf[BindingRewriteValidators]
  }
  
  extension [Self <: BindingRewriteValidators](x: Self) {
    
    inline def setBindingRewriteValidators(value: Any): Self = StObject.set(x, "bindingRewriteValidators", value.asInstanceOf[js.Any])
    
    inline def setParseObjectLiteral(value: String => js.Array[Any]): Self = StObject.set(x, "parseObjectLiteral", js.Any.fromFunction1(value))
  }
}
