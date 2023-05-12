package typings.mailchimpMailchimpMarketing.mod.lists

import typings.mailchimpMailchimpMarketing.anon.Choices
import typings.mailchimpMailchimpMarketing.mod.Link
import typings.mailchimpMailchimpMarketing.mod.MergeFieldType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeField extends StObject {
  
  var _links: js.Array[Link]
  
  var default_value: String
  
  var display_order: Double
  
  var help_text: String
  
  var list_id: String
  
  var merge_id: Double
  
  var name: String
  
  var options: Choices
  
  var public: Boolean
  
  var required: Boolean
  
  var tag: String
  
  var `type`: MergeFieldType
}
object MergeField {
  
  inline def apply(
    _links: js.Array[Link],
    default_value: String,
    display_order: Double,
    help_text: String,
    list_id: String,
    merge_id: Double,
    name: String,
    options: Choices,
    public: Boolean,
    required: Boolean,
    tag: String,
    `type`: MergeFieldType
  ): MergeField = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], default_value = default_value.asInstanceOf[js.Any], display_order = display_order.asInstanceOf[js.Any], help_text = help_text.asInstanceOf[js.Any], list_id = list_id.asInstanceOf[js.Any], merge_id = merge_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MergeField] (val x: Self) extends AnyVal {
    
    inline def setDefault_value(value: String): Self = StObject.set(x, "default_value", value.asInstanceOf[js.Any])
    
    inline def setDisplay_order(value: Double): Self = StObject.set(x, "display_order", value.asInstanceOf[js.Any])
    
    inline def setHelp_text(value: String): Self = StObject.set(x, "help_text", value.asInstanceOf[js.Any])
    
    inline def setList_id(value: String): Self = StObject.set(x, "list_id", value.asInstanceOf[js.Any])
    
    inline def setMerge_id(value: Double): Self = StObject.set(x, "merge_id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Choices): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setType(value: MergeFieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_links(value: js.Array[Link]): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
    
    inline def set_linksVarargs(value: Link*): Self = StObject.set(x, "_links", js.Array(value*))
  }
}
