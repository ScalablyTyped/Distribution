package typings.jqueryUniform

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def uniform(): JQuery
  def uniform(options: UniformOptions): JQuery
  @JSName("uniform")
  var uniform_Original: Uniform
}
object JQuery {
  
  inline def apply(uniform: Uniform): JQuery = {
    val __obj = js.Dynamic.literal(uniform = uniform.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    inline def setUniform(value: Uniform): Self = StObject.set(x, "uniform", value.asInstanceOf[js.Any])
  }
}
