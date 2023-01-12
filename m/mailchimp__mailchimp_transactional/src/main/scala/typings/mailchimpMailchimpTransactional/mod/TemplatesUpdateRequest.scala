package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplatesUpdateRequest
  extends StObject
     with BaseRequest {
  
  /** the new code for the template */
  var code: js.UndefOr[String] = js.undefined
  
  /** the new default sending address */
  var from_email: js.UndefOr[String] = js.undefined
  
  /** the new default from name */
  var from_name: js.UndefOr[String] = js.undefined
  
  /** an optional array of up to 10 labels to use for filtering templates */
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  
  /** the immutable name of an existing template */
  var name: String
  
  /** set to false to update the draft version of the template without publishing */
  var publish: js.UndefOr[Boolean] = js.undefined
  
  /** the new default subject line */
  var subject: js.UndefOr[String] = js.undefined
  
  /** the new default text part to be used */
  var text: js.UndefOr[String] = js.undefined
}
object TemplatesUpdateRequest {
  
  inline def apply(name: String): TemplatesUpdateRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplatesUpdateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplatesUpdateRequest] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setFrom_email(value: String): Self = StObject.set(x, "from_email", value.asInstanceOf[js.Any])
    
    inline def setFrom_emailUndefined: Self = StObject.set(x, "from_email", js.undefined)
    
    inline def setFrom_name(value: String): Self = StObject.set(x, "from_name", value.asInstanceOf[js.Any])
    
    inline def setFrom_nameUndefined: Self = StObject.set(x, "from_name", js.undefined)
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublish(value: Boolean): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
    
    inline def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
