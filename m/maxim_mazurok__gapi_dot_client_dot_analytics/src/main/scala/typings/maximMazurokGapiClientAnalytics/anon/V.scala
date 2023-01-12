package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V extends StObject {
  
  var v: js.UndefOr[String] = js.undefined
}
object V {
  
  inline def apply(): V = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: V] (val x: Self) extends AnyVal {
    
    inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
