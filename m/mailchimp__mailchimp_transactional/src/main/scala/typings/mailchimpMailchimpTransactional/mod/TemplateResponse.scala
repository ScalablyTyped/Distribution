package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateResponse extends StObject {
  
  /**
    * the full HTML code of the template, with mc:edit attributes marking the editable
    * elements - draft version
    */
  var code: String
  
  /** the date and time the template was first created as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var created_at: String
  
  /** the default sender address for the template, if provided - draft version */
  var from_email: js.UndefOr[String | Null] = js.undefined
  
  /** the default sender from name for the template, if provided - draft version */
  var from_name: js.UndefOr[String | Null] = js.undefined
  
  /** the list of labels applied to the template */
  var labels: js.Array[String]
  
  /** the name of the template */
  var name: String
  
  /**
    * the full HTML code of the template, with mc:edit attributes marking the editable elements
    * that are available as published, if it has been published
    */
  var publish_code: js.UndefOr[String | Null] = js.undefined
  
  /** the default sender address for the template, if provided */
  var publish_from_email: js.UndefOr[String | Null] = js.undefined
  
  /** the default sender from name for the template, if provided */
  var publish_from_name: js.UndefOr[String | Null] = js.undefined
  
  /** the same as the template name - kept as a separate field for backwards compatibility */
  var publish_name: String
  
  /** the subject line of the template, if provided */
  var publish_subject: js.UndefOr[String | Null] = js.undefined
  
  /** the default text part of messages sent with the template, if provided */
  var publish_text: js.UndefOr[String | Null] = js.undefined
  
  /**
    * the date and time the template was last published as a UTC string in YYYY-MM-DD HH:MM:SS format,
    * or null if it has not been published
    */
  var published_at: js.UndefOr[String | Null] = js.undefined
  
  /** the immutable unique code name of the template */
  var slug: String
  
  /** the subject line of the template, if provided - draft version */
  var subject: js.UndefOr[String | Null] = js.undefined
  
  /** the default text part of messages sent with the template, if provided - draft version */
  var text: js.UndefOr[String | Null] = js.undefined
  
  /** the date and time the template was last modified as a UTC string in YYYY-MM-DD HH:MM:SS format */
  var updated_at: String
}
object TemplateResponse {
  
  inline def apply(
    code: String,
    created_at: String,
    labels: js.Array[String],
    name: String,
    publish_name: String,
    slug: String,
    updated_at: String
  ): TemplateResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publish_name = publish_name.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setFrom_email(value: String): Self = StObject.set(x, "from_email", value.asInstanceOf[js.Any])
    
    inline def setFrom_emailNull: Self = StObject.set(x, "from_email", null)
    
    inline def setFrom_emailUndefined: Self = StObject.set(x, "from_email", js.undefined)
    
    inline def setFrom_name(value: String): Self = StObject.set(x, "from_name", value.asInstanceOf[js.Any])
    
    inline def setFrom_nameNull: Self = StObject.set(x, "from_name", null)
    
    inline def setFrom_nameUndefined: Self = StObject.set(x, "from_name", js.undefined)
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublish_code(value: String): Self = StObject.set(x, "publish_code", value.asInstanceOf[js.Any])
    
    inline def setPublish_codeNull: Self = StObject.set(x, "publish_code", null)
    
    inline def setPublish_codeUndefined: Self = StObject.set(x, "publish_code", js.undefined)
    
    inline def setPublish_from_email(value: String): Self = StObject.set(x, "publish_from_email", value.asInstanceOf[js.Any])
    
    inline def setPublish_from_emailNull: Self = StObject.set(x, "publish_from_email", null)
    
    inline def setPublish_from_emailUndefined: Self = StObject.set(x, "publish_from_email", js.undefined)
    
    inline def setPublish_from_name(value: String): Self = StObject.set(x, "publish_from_name", value.asInstanceOf[js.Any])
    
    inline def setPublish_from_nameNull: Self = StObject.set(x, "publish_from_name", null)
    
    inline def setPublish_from_nameUndefined: Self = StObject.set(x, "publish_from_name", js.undefined)
    
    inline def setPublish_name(value: String): Self = StObject.set(x, "publish_name", value.asInstanceOf[js.Any])
    
    inline def setPublish_subject(value: String): Self = StObject.set(x, "publish_subject", value.asInstanceOf[js.Any])
    
    inline def setPublish_subjectNull: Self = StObject.set(x, "publish_subject", null)
    
    inline def setPublish_subjectUndefined: Self = StObject.set(x, "publish_subject", js.undefined)
    
    inline def setPublish_text(value: String): Self = StObject.set(x, "publish_text", value.asInstanceOf[js.Any])
    
    inline def setPublish_textNull: Self = StObject.set(x, "publish_text", null)
    
    inline def setPublish_textUndefined: Self = StObject.set(x, "publish_text", js.undefined)
    
    inline def setPublished_at(value: String): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
    
    inline def setPublished_atNull: Self = StObject.set(x, "published_at", null)
    
    inline def setPublished_atUndefined: Self = StObject.set(x, "published_at", js.undefined)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
