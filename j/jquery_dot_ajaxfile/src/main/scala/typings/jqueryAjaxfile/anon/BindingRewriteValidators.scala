package typings.jqueryAjaxfile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingRewriteValidators extends StObject {
  
  var bindingRewriteValidators: js.Any = js.native
  
  def parseObjectLiteral(objectLiteralString: String): js.Array[_] = js.native
}
object BindingRewriteValidators {
  
  @scala.inline
  def apply(bindingRewriteValidators: js.Any, parseObjectLiteral: String => js.Array[_]): BindingRewriteValidators = {
    val __obj = js.Dynamic.literal(bindingRewriteValidators = bindingRewriteValidators.asInstanceOf[js.Any], parseObjectLiteral = js.Any.fromFunction1(parseObjectLiteral))
    __obj.asInstanceOf[BindingRewriteValidators]
  }
  
  @scala.inline
  implicit class BindingRewriteValidatorsMutableBuilder[Self <: BindingRewriteValidators] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingRewriteValidators(value: js.Any): Self = StObject.set(x, "bindingRewriteValidators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseObjectLiteral(value: String => js.Array[_]): Self = StObject.set(x, "parseObjectLiteral", js.Any.fromFunction1(value))
  }
}
