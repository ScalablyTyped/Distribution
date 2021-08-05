package typings.jsurl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlQuery extends StObject {
  
  def clear(): Unit
}
object UrlQuery {
  
  inline def apply(clear: () => Unit): UrlQuery = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
    __obj.asInstanceOf[UrlQuery]
  }
  
  extension [Self <: UrlQuery](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
  }
}
