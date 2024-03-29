package typings.jqueryEasyLoading

import typings.jqueryEasyLoading.JQueryEasyLoading.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var Loading: Static
}
object JQueryStatic {
  
  inline def apply(Loading: Static): JQueryStatic = {
    val __obj = js.Dynamic.literal(Loading = Loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setLoading(value: Static): Self = StObject.set(x, "Loading", value.asInstanceOf[js.Any])
  }
}
