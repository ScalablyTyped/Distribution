package typings.jquerySimplemodal

import typings.jquerySimplemodal.SimpleModal.JQueryExtension
import typings.jquerySimplemodal.SimpleModal.SimpleModalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def modal(): JQuery
  def modal(options: SimpleModalOptions): JQuery
  @JSName("modal")
  var modal_Original: JQueryExtension
}
object JQuery {
  
  @scala.inline
  def apply(modal: /* options */ js.UndefOr[SimpleModalOptions] => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(modal = js.Any.fromFunction1(modal))
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModal(value: /* options */ js.UndefOr[SimpleModalOptions] => JQuery): Self = StObject.set(x, "modal", js.Any.fromFunction1(value))
  }
}
