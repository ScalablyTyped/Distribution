package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplatesListRequest
  extends StObject
     with BaseRequest {
  
  /** an optional label to filter the templates */
  var label: js.UndefOr[String] = js.undefined
}
object TemplatesListRequest {
  
  inline def apply(): TemplatesListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplatesListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplatesListRequest] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
