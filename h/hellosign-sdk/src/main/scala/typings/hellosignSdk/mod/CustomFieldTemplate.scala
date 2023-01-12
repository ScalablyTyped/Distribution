package typings.hellosignSdk.mod

import typings.hellosignSdk.anon.Numcharsperline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomFieldTemplate extends StObject {
  
  var api_id: String
  
  var avg_text_length: Numcharsperline
  
  var group: js.UndefOr[String] = js.undefined
  
  var height: Double
  
  var name: String
  
  /**
    * @deprecated Use `form_fields` under the `documents` array instead.
    */
  var named_form_fields: String
  
  var required: Boolean
  
  /**
    * @deprecated
    */
  var reusable_form_id: String
  
  var signer: js.UndefOr[String] = js.undefined
  
  var `type`: String
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object CustomFieldTemplate {
  
  inline def apply(
    api_id: String,
    avg_text_length: Numcharsperline,
    height: Double,
    name: String,
    named_form_fields: String,
    required: Boolean,
    reusable_form_id: String,
    `type`: String,
    width: Double,
    x: Double,
    y: Double
  ): CustomFieldTemplate = {
    val __obj = js.Dynamic.literal(api_id = api_id.asInstanceOf[js.Any], avg_text_length = avg_text_length.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], named_form_fields = named_form_fields.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], reusable_form_id = reusable_form_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFieldTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomFieldTemplate] (val x: Self) extends AnyVal {
    
    inline def setApi_id(value: String): Self = StObject.set(x, "api_id", value.asInstanceOf[js.Any])
    
    inline def setAvg_text_length(value: Numcharsperline): Self = StObject.set(x, "avg_text_length", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamed_form_fields(value: String): Self = StObject.set(x, "named_form_fields", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setReusable_form_id(value: String): Self = StObject.set(x, "reusable_form_id", value.asInstanceOf[js.Any])
    
    inline def setSigner(value: String): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
    
    inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
