package typings.jqueryCustomselect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def customSelect(`val`: JQueryCustomSelectOption): JQuery = js.native
}
object JQuery {
  
  @scala.inline
  def apply(customSelect: JQueryCustomSelectOption => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(customSelect = js.Any.fromFunction1(customSelect))
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomSelect(value: JQueryCustomSelectOption => JQuery): Self = StObject.set(x, "customSelect", js.Any.fromFunction1(value))
  }
}
