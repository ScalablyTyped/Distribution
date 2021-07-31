package typings.jqueryTypeahead

import typings.jqueryTypeahead.RunningCoder.Typeahead.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def typeahead(options: Options): JQuery
}
object JQueryStatic {
  
  @scala.inline
  def apply(typeahead: Options => JQuery): JQueryStatic = {
    val __obj = js.Dynamic.literal(typeahead = js.Any.fromFunction1(typeahead))
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypeahead(value: Options => JQuery): Self = StObject.set(x, "typeahead", js.Any.fromFunction1(value))
  }
}
