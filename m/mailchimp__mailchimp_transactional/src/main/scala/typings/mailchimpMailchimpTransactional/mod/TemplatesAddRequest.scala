package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplatesAddRequest
  extends StObject
     with BaseRequest {
  
  /** the HTML code for the template with mc:edit attributes for the editable elements */
  var code: js.UndefOr[String] = js.undefined
  
  /** a default sending address for emails sent using this template */
  var from_email: js.UndefOr[String] = js.undefined
  
  /** a default from name to be used */
  var from_name: js.UndefOr[String] = js.undefined
  
  /** an optional array of up to 10 labels to use for filtering templates */
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  
  /** the name for the new template - must be unique */
  var name: String
  
  /** set to false to add a draft template without publishing */
  var publish: js.UndefOr[Boolean] = js.undefined
  
  /** a default subject line to be used */
  var subject: js.UndefOr[String] = js.undefined
  
  /** a default text part to be used when sending with this template */
  var text: js.UndefOr[String] = js.undefined
}
object TemplatesAddRequest {
  
  inline def apply(name: String): TemplatesAddRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplatesAddRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplatesAddRequest] (val x: Self) extends AnyVal {
    
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
