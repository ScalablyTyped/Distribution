package typings.jsurl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlQuery extends StObject {
  
  def clear(): Unit = js.native
}
object UrlQuery {
  
  @scala.inline
  def apply(clear: () => Unit): UrlQuery = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
    __obj.asInstanceOf[UrlQuery]
  }
  
  @scala.inline
  implicit class UrlQueryMutableBuilder[Self <: UrlQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
  }
}
