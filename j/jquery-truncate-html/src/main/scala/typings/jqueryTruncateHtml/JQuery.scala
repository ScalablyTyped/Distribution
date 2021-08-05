package typings.jqueryTruncateHtml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def truncate(options: TruncateOptions): JQuery
}
object JQuery {
  
  inline def apply(truncate: TruncateOptions => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(truncate = js.Any.fromFunction1(truncate))
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setTruncate(value: TruncateOptions => JQuery): Self = StObject.set(x, "truncate", js.Any.fromFunction1(value))
  }
}
