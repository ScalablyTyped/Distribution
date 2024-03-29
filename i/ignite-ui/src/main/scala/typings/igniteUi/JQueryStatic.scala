package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var ig: IgniteUIStatic
}
object JQueryStatic {
  
  inline def apply(ig: IgniteUIStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(ig = ig.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setIg(value: IgniteUIStatic): Self = StObject.set(x, "ig", value.asInstanceOf[js.Any])
  }
}
