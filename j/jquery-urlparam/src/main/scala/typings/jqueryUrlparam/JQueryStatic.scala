package typings.jqueryUrlparam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  def urlParam(variable: String): String = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(urlParam: String => String): JQueryStatic = {
    val __obj = js.Dynamic.literal(urlParam = js.Any.fromFunction1(urlParam))
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrlParam(value: String => String): Self = StObject.set(x, "urlParam", js.Any.fromFunction1(value))
  }
}
