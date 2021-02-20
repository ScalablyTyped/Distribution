package typings.jqueryTruncateHtml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  def truncate(html: String, options: TruncateOptions): String = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(truncate: (String, TruncateOptions) => String): JQueryStatic = {
    val __obj = js.Dynamic.literal(truncate = js.Any.fromFunction2(truncate))
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTruncate(value: (String, TruncateOptions) => String): Self = StObject.set(x, "truncate", js.Any.fromFunction2(value))
  }
}
