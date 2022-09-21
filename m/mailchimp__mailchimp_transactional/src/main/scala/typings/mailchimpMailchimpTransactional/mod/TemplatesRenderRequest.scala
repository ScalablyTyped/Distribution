package typings.mailchimpMailchimpTransactional.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplatesRenderRequest
  extends StObject
     with BaseRequest {
  
  /**
    * optional merge variables to use for injecting merge field content. If this is not provided,
    * no merge fields will be replaced.
    */
  var merge_vars: js.UndefOr[js.Array[MergeVar]] = js.undefined
  
  /**
    * an array of template content to render. Each item in the array should be a struct with
    * two keys - name: the name of the content block to set the content for, and content: the actual
    * content to put into the block
    */
  var template_content: js.Array[TemplateContent]
  
  /** the immutable name of a template that exists in the user's account */
  var template_name: String
}
object TemplatesRenderRequest {
  
  inline def apply(template_content: js.Array[TemplateContent], template_name: String): TemplatesRenderRequest = {
    val __obj = js.Dynamic.literal(template_content = template_content.asInstanceOf[js.Any], template_name = template_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplatesRenderRequest]
  }
  
  extension [Self <: TemplatesRenderRequest](x: Self) {
    
    inline def setMerge_vars(value: js.Array[MergeVar]): Self = StObject.set(x, "merge_vars", value.asInstanceOf[js.Any])
    
    inline def setMerge_varsUndefined: Self = StObject.set(x, "merge_vars", js.undefined)
    
    inline def setMerge_varsVarargs(value: MergeVar*): Self = StObject.set(x, "merge_vars", js.Array(value*))
    
    inline def setTemplate_content(value: js.Array[TemplateContent]): Self = StObject.set(x, "template_content", value.asInstanceOf[js.Any])
    
    inline def setTemplate_contentVarargs(value: TemplateContent*): Self = StObject.set(x, "template_content", js.Array(value*))
    
    inline def setTemplate_name(value: String): Self = StObject.set(x, "template_name", value.asInstanceOf[js.Any])
  }
}
